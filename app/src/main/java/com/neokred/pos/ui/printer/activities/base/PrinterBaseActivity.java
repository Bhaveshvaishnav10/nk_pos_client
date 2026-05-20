package com.neokred.pos.ui.printer.activities.base;

import android.app.Dialog;
import android.os.Bundle;

import com.neokred.pos.utils.DialogUtils;
import com.neokred.pos.utils.TRACE;
import com.neokred.pos.BR;
import com.neokred.pos.R;
import com.neokred.pos.databinding.ActivityPrinterBaseBinding;
import com.neokred.sdk.printer.NeokredPrinter;
import com.neokred.sdk.printer.callback.NKPrintCallback;
import com.neokred.sdk.printer.model.NKPrinterStatus;

import androidx.databinding.ViewDataBinding;
import me.goldze.mvvmhabit.base.BaseActivity;

public abstract class PrinterBaseActivity<V extends ViewDataBinding, VM extends BasePrinterViewModel> extends BaseActivity<ActivityPrinterBaseBinding, VM> {

    @Override
    public int initContentView(Bundle savedInstanceState) {
        return R.layout.activity_printer_base;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();
        NeokredPrinter printer = NeokredPrinter.getInstance();
        // Set callback before init so we receive the connection result
        printer.setCallback(new NKPrintCallback() {
            @Override
            public void onPrintResult(boolean success, NKPrinterStatus status) {
                TRACE.d("printResult: " + success + " status=" + status);
                if (!success && status == NKPrinterStatus.LOW_BATTERY) {
                    showLowBatteryDialog();
                }
                onReturnPrintResult(success, status.name(), status);
            }
            @Override
            public void onError(NKPrinterStatus status) {
                TRACE.d("printError: " + status);
                onReturnPrintResult(false, status.name(), status);
            }
        });
        printer.init(this, () -> {
            // connected — set footer once printer is ready
            viewModel.onPrinterReady(this);
        }, null);
        binding.toolbar.setNavigationOnClickListener(v -> finish());
    }

    protected abstract void onReturnPrintResult(boolean isSuccess, String status, NKPrinterStatus resultType);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        NeokredPrinter.getInstance().close();
        if (lowBatteryDialog != null && lowBatteryDialog.isShowing()) {
            lowBatteryDialog.dismiss();
        }
    }

    private Dialog lowBatteryDialog;

    private void showLowBatteryDialog() {
        lowBatteryDialog = DialogUtils.showLowBatteryDialog(this, R.layout.dialog_low_battery, R.id.okButton, false);
    }
}
