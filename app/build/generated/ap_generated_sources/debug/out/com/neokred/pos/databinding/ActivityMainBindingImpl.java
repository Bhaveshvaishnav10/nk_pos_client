package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 3);
        sViewsWithIds.put(R.id.nav_host_fragment, 4);
    }
    // views
    @NonNull
    private final android.widget.ImageView mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.drawerlayout.widget.DrawerLayout) bindings[0]
            , (android.widget.FrameLayout) bindings[4]
            , (com.google.android.material.navigation.NavigationView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.drawerLayout.setTag(null);
        this.mboundView2 = (android.widget.ImageView) bindings[2];
        this.mboundView2.setTag(null);
        this.navView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.neokred.pos.ui.main.MainViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.main.MainViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsD70DisplayScreen((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsD70DisplayScreen(androidx.databinding.ObservableBoolean ViewModelIsD70DisplayScreen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        int viewModelIsD70DisplayScreenViewGONEViewVISIBLE = 0;
        me.goldze.mvvmhabit.binding.command.BindingCommand<java.lang.Integer> viewModelSwitchFragmentCommand = null;
        me.goldze.mvvmhabit.binding.command.BindingCommand<android.view.View> viewModelOnDrawerClosedCommand = null;
        me.goldze.mvvmhabit.binding.command.BindingCommand<android.view.View> viewModelOnDrawerOpenedCommand = null;
        androidx.databinding.ObservableBoolean viewModelIsD70DisplayScreen = null;
        boolean viewModelIsD70DisplayScreenGet = false;
        com.neokred.pos.ui.main.MainViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {


            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.switchFragmentCommand
                        viewModelSwitchFragmentCommand = viewModel.switchFragmentCommand;
                        // read viewModel.onDrawerClosedCommand
                        viewModelOnDrawerClosedCommand = viewModel.onDrawerClosedCommand;
                        // read viewModel.onDrawerOpenedCommand
                        viewModelOnDrawerOpenedCommand = viewModel.onDrawerOpenedCommand;
                    }
            }

                if (viewModel != null) {
                    // read viewModel.isD70DisplayScreen
                    viewModelIsD70DisplayScreen = viewModel.isD70DisplayScreen;
                }
                updateRegistration(0, viewModelIsD70DisplayScreen);


                if (viewModelIsD70DisplayScreen != null) {
                    // read viewModel.isD70DisplayScreen.get()
                    viewModelIsD70DisplayScreenGet = viewModelIsD70DisplayScreen.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelIsD70DisplayScreenGet) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }


                // read viewModel.isD70DisplayScreen.get() ? View.GONE : View.VISIBLE
                viewModelIsD70DisplayScreenViewGONEViewVISIBLE = ((viewModelIsD70DisplayScreenGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.navigationview.DrawerLayoutBindingAdapter.setDrawerListener(this.drawerLayout, viewModelOnDrawerOpenedCommand, viewModelOnDrawerClosedCommand);
            me.goldze.mvvmhabit.binding.viewadapter.navigationview.NavigationViewAdapter.setOnNavigationItemSelectedCommand(this.navView, viewModelSwitchFragmentCommand);
        }
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelIsD70DisplayScreenViewGONEViewVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isD70DisplayScreen
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.isD70DisplayScreen.get() ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.isD70DisplayScreen.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}