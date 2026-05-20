package com.neokred.pos.ui.payment;


import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;

import com.neokred.pos.utils.DeviceUtils;
import com.neokred.pos.BR;
import com.neokred.pos.R;
import com.neokred.pos.databinding.ActivityPaymentstatusBinding;


import java.util.HashMap;
import java.util.Map;

import me.goldze.mvvmhabit.base.BaseActivity;

public class PaymentStatusActivity extends BaseActivity<ActivityPaymentstatusBinding, PaymentStatusViewModel> {
    private String amount;
    private String maskedPAN;
    private String terminalTime;
    private String errorMsg;
    private static final String KEY_AMOUNT = "amount";
    private static final String KEY_MASKED_PAN = "maskedPAN";
    private static final String KEY_TERMINAL_TIME = "terminalTime";
    private static final String KEY_ERROR_MSG = "errorMsg";
    private static final String MODEL_D70 = "D70";

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_paymentstatus;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }


    public void initData() {
        Intent intent = getIntent();
        amount = getStringExtraSafely(intent, KEY_AMOUNT);
        maskedPAN = getStringExtraSafely(intent, KEY_MASKED_PAN);
        terminalTime = getStringExtraSafely(intent, KEY_TERMINAL_TIME);
        errorMsg = getStringExtraSafely(intent, KEY_ERROR_MSG);


        viewModel.isD70DisplayScreen.set(MODEL_D70.equals(Build.MODEL));


        if (isValidAmount(amount)) {
            handleTransactionSuccess();
        } else {
            handleTransactionFailure();
        }


        viewModel.isShouwPrinting.set(DeviceUtils.isPrinterDevices());
    }

    /**
     * Safely get String type Extra
     */
    private String getStringExtraSafely(Intent intent, String key) {
        if (intent != null && intent.hasExtra(key)) {
            return intent.getStringExtra(key);
        }
        return "";
    }

    /**
     * Check if amount is valid
     */
    private boolean isValidAmount(String amount) {
        return !TextUtils.isEmpty(amount);
    }

    /**
     * Handle transaction success logic
     */
    private void handleTransactionSuccess() {
        String amountInCents = DeviceUtils.convertAmountToCents(amount);

        viewModel.displayAmount(amountInCents);
        viewModel.setTransactionSuccess();

        Map<String, String> receiptData = createReceiptData(amountInCents, maskedPAN, terminalTime);
        viewModel.sendTranReceipt(receiptData);
    }

    /**
     * Create receipt data
     */
    private Map<String, String> createReceiptData(String amountInCents, String maskedPAN, String terminalTime) {
        Map<String, String> map = new HashMap<>();
        map.put("terAmount", amountInCents);
        map.put("maskedPAN", maskedPAN != null ? maskedPAN : "");
        map.put("terminalTime", terminalTime != null ? terminalTime : "");
        return map;
    }

    /**
     * Handle transaction failure logic
     */
    private void handleTransactionFailure() {
        String errorMessage = !TextUtils.isEmpty(errorMsg) ? errorMsg : "";
        viewModel.setTransactionFailed(errorMessage);
    }
}