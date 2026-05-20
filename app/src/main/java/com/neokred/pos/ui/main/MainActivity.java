package com.neokred.pos.ui.main;

import android.content.pm.ActivityInfo;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.KeyEvent;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;

import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.neokred.pos.common.manager.FragmentCacheManager;
import com.neokred.sdk.payment.NeokredPOSService;
import com.neokred.pos.ui.home.HomeFragment;
import com.neokred.pos.utils.DevUtils;
import com.neokred.pos.utils.Mydialog;
import com.neokred.pos.utils.TRACE;
import com.neokred.pos.BR;
import com.neokred.pos.R;
import com.neokred.pos.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;
import com.tencent.upgrade.core.DefaultUpgradeStrategyRequestCallback;
import com.tencent.upgrade.core.UpgradeManager;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.utils.SPUtils;

public class MainActivity extends BaseActivity<ActivityMainBinding, MainViewModel> {
    public void setToolbarTitle(String title) {
        if (toolbar != null) {
            toolbar.setTitle(title);
        }
    }

    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    private TextView tvAppVersion;
    ActionBarDrawerToggle toggle;
    private HomeFragment homeFragment;
    @Override
    public void initParam() {
        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_main;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }
    @Override
    protected void onResume() {
        super.onResume();
    }
    @Override
    public void initData() {
        super.initData();
        drawerLayout = binding.drawerLayout;
        navigationView = binding.navView;
        // Icon tint is now handled by nav_item_icon_color state list in XML
        toolbar = binding.toolbar;

        // Set initial navigation item as checked (Sales/Payment)
        navigationView.setCheckedItem(R.id.nav_home);
        viewModel.handleNavigationItemClick(R.id.nav_home);

        View headerView = navigationView.getHeaderView(0);
//        tvAppVersion = headerView.findViewById(R.id.tv_appversion);

        ImageView closeImage = headerView.findViewById(R.id.image_black);
        closeImage.setOnClickListener(v -> viewModel.closeDrawer());
        setSupportActionBar(toolbar);
        navigationView.bringToFront();
        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        //shiply update app - COMMENTED OUT
        // UpgradeManager.getInstance().checkUpgrade(false, null, new DefaultUpgradeStrategyRequestCallback());
    }

    @Override
    public MainViewModel initViewModel() {
        MainViewModelFactory factory = new MainViewModelFactory(getApplication(), this);
        return new ViewModelProvider(this, factory).get(MainViewModel.class);
    }

    @Override
    public void initViewObservable() {
        super.initViewObservable();
        // observe Fragment have been changed
        viewModel.fragmentChangeEvent.observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(@Nullable Integer fragmentIndex) {
                drawerLayout.close();
            }
        });
        viewModel.changeDrawerLayout.observe(this, new Observer<View>() {
            @Override
            public void onChanged(View drawerView) {
//                String packageVersionName = DevUtils.getPackageVersionName(MainActivity.this, "com.dspread.pos_android_app");
//                tvAppVersion.setText(getString(R.string.app_version) + packageVersionName);
                // Shiply update check - COMMENTED OUT
                // checkUpdate();
            }
        });

        viewModel.closeDrawerCommand.observe(this, unused -> {
            drawerLayout.close();
        });

    }

    private void checkUpdate(){
        // Shiply update check - COMMENTED OUT
        // UpgradeManager.getInstance().checkUpgrade(true, null, new DefaultUpgradeStrategyRequestCallback());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        TRACE.i("main is onDestroy");
        NeokredPOSService.getInstance(this).disconnect();
        SPUtils.getInstance().put("isConnected", false);
        SPUtils.getInstance().put("device_type", "");
        SPUtils.getInstance().put("bluetoothName", "");
        SPUtils.getInstance().put("bluetoothAddress", "");
        SPUtils.getInstance().put("isSelectUartSuccess", false);
        SPUtils.getInstance().put("isSelectUsbSuccess", false);
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
        int action = event.getAction();
        int keyCode = event.getKeyCode();
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (action == KeyEvent.ACTION_UP) {
                toolbar.setTitle(getString(R.string.menu_payment));
                drawerLayout.close();
                viewModel.handleNavigationItemClick(R.id.nav_home);
                FragmentCacheManager.getInstance().clearCache();
                exit();
            }
            return true;
        }else {
            if (action == KeyEvent.ACTION_UP) {
                TRACE.i("---- = "+viewModel.homeFragment);
                return viewModel.onKeyDownInHome(keyCode,event);
            }

            return super.dispatchKeyEvent(event);
        }
    }


    private static boolean isExit = false;
    Handler mHandler = new Handler(Looper.myLooper()) {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            isExit = false;
        }
    };

    private void exit() {
        if (!isExit) {
            isExit = true;
            mHandler.sendEmptyMessageDelayed(0, 1500);
        } else {
            isExit = false;
            Mydialog.manualExitDialog(MainActivity.this, getString(R.string.msg_exit), new Mydialog.OnMyClickListener() {
                @Override
                public void onCancel() {
                    Mydialog.manualExitDialog.dismiss();
                }

                @Override
                public void onConfirm() {
                    finish();
                    Mydialog.manualExitDialog.dismiss();
                }
            });
        }
    }
}



