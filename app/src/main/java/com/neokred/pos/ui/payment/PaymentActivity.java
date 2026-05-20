package com.neokred.pos.ui.payment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.neokred.sdk.payment.NeokredPOSService;
import com.neokred.sdk.payment.callback.NKConnectionCallback;
import com.neokred.sdk.payment.callback.NKTransactionCallback;
import com.neokred.sdk.payment.model.NKCardData;
import com.neokred.sdk.payment.model.NKDisplayMessage;
import com.neokred.sdk.payment.model.NKTransactionResult;
import com.neokred.pos.ui.payment.pinkeyboard.KeyboardUtil;
import com.neokred.pos.ui.payment.pinkeyboard.MyKeyboardView;
import com.neokred.pos.ui.payment.pinkeyboard.PinPadDialog;
import com.neokred.pos.ui.payment.pinkeyboard.PinPadView;
import com.neokred.pos.utils.AdvancedBinDetector;
import com.neokred.pos.utils.DeviceUtils;
import com.neokred.pos.utils.HandleTxnsResultUtils;
import com.neokred.pos.utils.LogFileConfig;
import com.neokred.pos.utils.NKPOSUtil;
import com.neokred.pos.utils.TLV;
import com.neokred.pos.utils.TLVParser;
import com.neokred.pos.utils.TRACE;
import com.neokred.pos.BR;
import com.neokred.pos.R;
import com.neokred.pos.databinding.ActivityPaymentBinding;

import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.utils.ToastUtils;

public class PaymentActivity extends BaseActivity<ActivityPaymentBinding, PaymentViewModel> {

    private String amount;
    private String deviceAddress;
    private KeyboardUtil keyboardUtil;
    public PinPadDialog pinPadDialog;
    private boolean isPinBack = false;
    private NKTransactionCallback paymentServiceCallback;
    private String terminalTime;
    private String maskedPAN;
    private NKConnectionCallback connectionCallback;
    private Handler handler;
    private Runnable runnable;
    private int currentIndex = 0;
    private AtomicBoolean isStarting = new AtomicBoolean(false);
    private final int[] imageResources = {R.mipmap.ic_insert_new_d70, R.mipmap.ic_tap_new_d70, R.mipmap.ic_swipe_new_d70};
    private final String[] textResources = {"<span style='color:red'>Insert</span><span style='color:black'>, tap or swipe</span>", "<span style='color:black'>Insert, </span><span style='color:red'>tap</span> <span style='color:black'>or swipe</span>", "<span style='color:black'>Insert, tap or </span><span style='color:red'>swipe</span>"};

    @Override
    public int initContentView(Bundle savedInstanceState) {
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
//        getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        return R.layout.activity_payment;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    /**
     * Initialize payment activity data
     * Sets up initial UI state and starts transaction
     */
    @Override
    public void initData() {
        binding.setVariable(BR.viewModel, viewModel);
        binding.pinpadEditText.setText("");
        viewModel.titleText.set("Paymenting");

        paymentServiceCallback = new TransactionCallback();
        amount = getIntent().getStringExtra("amount");
        deviceAddress = getIntent().getStringExtra("deviceAddress");
        viewModel.displayAmount(DeviceUtils.convertAmountToCents(amount));//ui

        initConnectionCallback();
        TRACE.i("start Transaction -===");
        startTransaction();
        showCardImage();
    }

    @Override
    public void initViewObservable() {
        super.initViewObservable();
        viewModel.isOnlineSuccess.observe(this, aBoolean -> {
            if (aBoolean) {
                // IMPORTANT: Don't show success page if PIN pad is still active
                if (pinPadDialog != null && pinPadDialog.isShowing()) {
                    TRACE.w("⚠️ Online auth succeeded but PIN pad still showing - dismissing PIN pad first");
                    pinPadDialog.dismiss();
                    pinPadDialog = null;
                }
                viewModel.setTransactionSuccess();
                paymentStatus(amount, maskedPAN, terminalTime, "");
            } else {
                viewModel.setTransactionFailed("Transaction failed because of the network!");
                paymentStatus("", "", "", "Transaction failed because of the network!");
            }
        });
    }

    private void showCardImage() {
        if ("D70".equals(DeviceUtils.getPhoneModel())) {
            ViewGroup.LayoutParams params = binding.ivCloseBlackD70.getLayoutParams();
            params.width = 26;
            params.height = 26;
            binding.ivCloseBlackD70.setLayoutParams(params);
            binding.ivCloseBlackD70.setImageResource(R.mipmap.btn_close_black);
            binding.ivCloseBlackD70.setVisibility(View.VISIBLE);
            binding.ivCloseBlack.setVisibility(View.GONE);
            setupImageSwitcher();
        } else {
            setupAnimationBasedOnDeviceModel();
            binding.ivCloseBlackD70.setVisibility(View.GONE);
            binding.ivCloseBlack.setVisibility(View.VISIBLE);
        }
    }

    private void setupImageSwitcher() {
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                currentIndex = (currentIndex + 1) % imageResources.length;
                updateContent();
                handler.postDelayed(this, 2000);
            }
        };

        updateContent();
        handler.postDelayed(runnable, 2000);
    }

    private void updateContent() {
        binding.d70ImageView.setImageResource(imageResources[currentIndex]);
        binding.txtWaitInsertTapCard.setText(Html.fromHtml(textResources[currentIndex], Html.FROM_HTML_MODE_COMPACT));
    }

    /**
     * Dynamically set Lottie animations according to the device model
     */
    private void setupAnimationBasedOnDeviceModel() {
        String deviceModel = DeviceUtils.getPhoneModel();
        TRACE.d("model:" + deviceModel);
        if ("D20".equals(deviceModel)) {
            binding.animationView.setAnimation("D20_checkCardImg.json");
            binding.animationView.setImageAssetsFolder("D20_images/");
        } else if ("D80".equals(deviceModel)) {
            binding.animationView.setAnimation("D80_checkCard.json");
            binding.animationView.setImageAssetsFolder("D80_images/");
        } else if ("D60".equals(deviceModel)) {
            binding.animationView.setAnimation("D60_checkCard.json");
            binding.animationView.setImageAssetsFolder("D60_images/");
        } else {//D30
            binding.animationView.setAnimation("D30_checkCard.json");
            binding.animationView.setImageAssetsFolder("D30_images/");
        }
        binding.animationView.loop(true);
        binding.animationView.playAnimation();
    }

    private void initConnectionCallback() {
        connectionCallback = new NKConnectionCallback() {
            @Override
            public void onDeviceNotFound() {
                ToastUtils.showLong("Device connected fail");
            }

            @Override
            public void onConnected() {
                ToastUtils.showLong("Device connected");
            }

            @Override
            public void onDisconnected() {
                ToastUtils.showLong("Device disconnected");
                finish();
            }
        };
    }

    /**
     * Start payment transaction in background thread
     * Handles device connection and transaction initialization
     */
    private void startTransaction() {
        TRACE.i("📍 startTransaction() method called");
        new Thread(() -> {
            TRACE.i("📍 Thread started in startTransaction()");
            TRACE.i("📍 Device address: " + deviceAddress);
            TRACE.i("📍 Transaction amount: " + amount);
            TRACE.i("📍 Checking if device is ready...");

            NeokredPOSService pos = NeokredPOSService.getInstance(PaymentActivity.this);
            boolean deviceReady = pos.isConnected();
            TRACE.i("📍 isConnected() returned: " + deviceReady);

            pos.addConnectionCallback(connectionCallback);
            pos.addTransactionCallback(paymentServiceCallback);

            if (!deviceReady) {
                TRACE.i("📍 Device NOT ready - connecting via UART...");
                try {
                    pos.openUart();
                    TRACE.i("📍 openUart() called");
                } catch (Exception e) {
                    TRACE.e("📍 ❌ Exception during openUart(): " + e.getMessage());
                    e.printStackTrace();
                }
            } else {
                TRACE.i("📍 Device already connected");
            }

            TRACE.i("📍 About to call getQposId()...");
            TRACE.i("start Transaction now===");

            try {
                pos.getQposId();
                TRACE.i("📍 getQposId() returned");
            } catch (Exception e) {
                TRACE.e("📍 ❌ Exception during getQposId(): " + e.getMessage());
                e.printStackTrace();
            }

            TRACE.i("📍 About to call doTrade()...");
            try {
                com.neokred.sdk.payment.model.NKTransactionRequest req =
                        new com.neokred.sdk.payment.model.NKTransactionRequest.Builder()
                                .amount(amount)
                                .build();
                pos.doTrade(req);
                TRACE.i("📍 doTrade() called");
            } catch (Exception e) {
                TRACE.e("📍 ❌ Exception during doTrade(): " + e.getMessage());
                e.printStackTrace();
            }
        }).start();
        TRACE.i("📍 Thread.start() called - thread is now running in background");
    }

    /**
     * Inner class to handle payment callbacks
     */
    private class TransactionCallback implements NKTransactionCallback {

        @Override
        public void onEmvAppSelectionRequired(List<String> appList) {
            TRACE.d("onEmvAppSelectionRequired():" + appList.toString());
            Dialog dialog = new Dialog(PaymentActivity.this);
            dialog.setContentView(R.layout.emv_app_dialog);
            dialog.setTitle(R.string.please_select_app);
            String[] appNameList = appList.toArray(new String[0]);
            ListView appListView = dialog.findViewById(R.id.appList);
            appListView.setAdapter(new ArrayAdapter<>(PaymentActivity.this, android.R.layout.simple_list_item_1, appNameList));
            appListView.setOnItemClickListener((parent, view, position, id) -> {
                NeokredPOSService.getInstance(PaymentActivity.this).selectEmvApp(position);
                TRACE.d("select emv app position = " + position);
                dialog.dismiss();
            });
            dialog.findViewById(R.id.cancelButton).setOnClickListener(v -> {
                NeokredPOSService.getInstance(PaymentActivity.this).cancelSelectEmvApp();
                dialog.dismiss();
            });
            dialog.show();
        }

        /**
         * Handle PIN input request
         */
        @Override
        public void onPinRequested(com.neokred.sdk.payment.model.NKPinRequest pinRequest) {
            List<String> dataList = pinRequest.getKeyPositionData();
            TRACE.i("========== PIN INPUT REQUEST ==========");
            TRACE.i("PIN Request Data: " + dataList);
            TRACE.i("PIN Type: Online PIN (Random Keyboard)");

            NeokredPOSService pos = NeokredPOSService.getInstance(PaymentActivity.this);
            if (pos.isConnected()) {
                viewModel.stopLoading();
                viewModel.clearErrorState();
                viewModel.showPinpad.set(true);
                if (keyboardUtil != null) {
                    keyboardUtil.hide();
                }
            }
            binding.pinpadEditText.setText("");

            final StringBuilder pinBuilder = new StringBuilder();

            MyKeyboardView.setKeyBoardListener(value -> {
                if (pos.isConnected()) {
                    TRACE.i("PIN Key Pressed: " + value);
                    if (value != null && !value.isEmpty()) {
                        if (value.equals("cancle")) {
                            pinBuilder.setLength(0);
                        } else if (value.equals("delete")) {
                            if (pinBuilder.length() > 0) pinBuilder.setLength(pinBuilder.length() - 1);
                        } else if (!value.equals("confirm")) {
                            pinBuilder.append(value);
                        }
                    }
                    pos.pinMapSync(value, 20);
                }
            });
            if (pos.isConnected()) {
                keyboardUtil = new KeyboardUtil(PaymentActivity.this, binding.relSaleDetails, dataList);
                keyboardUtil.initKeyboard(MyKeyboardView.KEYBOARDTYPE_Only_Num_Pwd, binding.pinpadEditText);
                TRACE.i("Random PIN keyboard initialized");
            }
            TRACE.i("=======================================");
        }

        @Override
        public void onOfflinePinRequested() {
            TRACE.i("========== OFFLINE PIN REQUEST (CR100) ==========");
            TRACE.i("PIN Type: Offline PIN - Device PINPad");

            runOnUiThread(() -> {
                isPinBack = true;
                viewModel.clearErrorState();
                viewModel.stopLoading();

                viewModel.titleText.set(getString(R.string.input_pin));

                NeokredPOSService pos = NeokredPOSService.getInstance(PaymentActivity.this);
                pinPadDialog = new PinPadDialog(PaymentActivity.this);
                pinPadDialog.getPayViewPass().setRandomNumber(true).setPayClickListener(pos, new PinPadView.OnPayClickListener() {

                    @Override
                    public void onCencel() {
                        TRACE.i("PIN Entry Cancelled");
                        pos.cancelPin();
                        pinPadDialog.dismiss();
                    }

                    @Override
                    public void onPaypass() {
                        TRACE.i("PIN Entry Bypassed");
                        pos.bypassPin();
                        pinPadDialog.dismiss();
                    }

                    @Override
                    public void onConfirm(String password) {
                        TRACE.i("PIN Entry Confirmed (length: " + password.length() + ")");
                        String pinBlock = NKPOSUtil.buildISO4PinBlock(pos.getIsoFormat4PinBlockParams(), password);
                        TRACE.i("ISO Format 4 PIN Block: " + pinBlock);
                        if (pinBlock != null && !pinBlock.isEmpty()) {
                            pos.sendCvmPin(pinBlock, true);
                            TRACE.i("Encrypted PIN block sent to device");
                        }
                        pinPadDialog.dismiss();
                    }
                });

                TRACE.i("PIN pad dialog created and shown");
            });

            TRACE.i("=================================================");
        }

        @Override
        public void onDisplayMessage(NKDisplayMessage displayMsg) {
            TRACE.i("========== onDisplayMessage CALLBACK ==========");
            TRACE.i("Display Message: " + displayMsg.toString());

            String msg = "";
            if (displayMsg == NKDisplayMessage.CARD_READ_OK) {
                TRACE.i("MSR Data Ready - Card swiped successfully");
                android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(PaymentActivity.this);
                builder.setTitle("Audio");
                builder.setMessage("Success,Contine ready");
                builder.setPositiveButton("Confirm", null);
                builder.show();
            } else if (displayMsg == NKDisplayMessage.PLEASE_WAIT) {
                TRACE.i("PIN ENTRY REQUESTED BY SDK");
                viewModel.stopLoading();
                viewModel.clearErrorState();
                viewModel.showPinpad.set(true);
                binding.animationView.pauseAnimation();
            } else {
                TRACE.i("Other Display Message: " + displayMsg.toString());
                msg = getDisplayMessageString(displayMsg);
                if (handler != null && runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                binding.animationView.pauseAnimation();
                viewModel.startLoading(msg);
            }
            TRACE.i("===============================================");
        }

        @Override
        public void onCardRead(NKCardData cardData) {
            TRACE.i("╔══════════════════════════════════════════════════════════════╗");
            TRACE.i("║              CARD READING RESULT                             ║");
            TRACE.i("╚══════════════════════════════════════════════════════════════╝");
            TRACE.i("Card Type: " + cardData.getCardType());

            NeokredPOSService pos = NeokredPOSService.getInstance(PaymentActivity.this);

            if (cardData.isICC()) {
                TRACE.i("---------- ICC CARD (INSERT/CHIP) ----------");
                TRACE.i("Masked PAN: " + cardData.getMaskedPan());
                viewModel.cardInsertedState();
                pos.doEmvApp();

            } else if (cardData.isNFC()) {
                TRACE.i("---------- NFC CARD (TAP/CONTACTLESS) ----------");
                Hashtable<String, String> batchData = pos.getNFCBatchData();
                TRACE.i("NFC TLV Data: " + batchData.get("tlv"));

                PaymentResult paymentResult = new PaymentResult();
                paymentResult.setAmount(amount);
                HandleTxnsResultUtils.handleDoTradeResult(paymentResult, cardData.getRawData(), viewModel);
                binding.animationView.pauseAnimation();
                maskedPAN = cardData.getMaskedPan();

            } else if (cardData.isSwipe()) {
                TRACE.i("---------- MCR CARD (SWIPE/MAGNETIC STRIPE) ----------");
                PaymentResult paymentResult = new PaymentResult();
                paymentResult.setAmount(amount);
                HandleTxnsResultUtils.handleDoTradeResult(paymentResult, cardData.getRawData(), viewModel);
                binding.animationView.pauseAnimation();
                maskedPAN = cardData.getMaskedPan();

            } else {
                TRACE.i("---------- CARD DECLINED (SEE PHONE) ----------");
                viewModel.showPinpad.set(false);
                if (keyboardUtil != null) keyboardUtil.hide();
                viewModel.titleText.set(getString(R.string.pls_see_phone));
            }

            TRACE.i("==========================================");
        }

        @Override
        public void onTransactionComplete(NKTransactionResult result) {
            TRACE.i("========== FINAL TRANSACTION RESULT ==========");
            TRACE.i("Transaction Status: " + result.getStatus());

            runOnUiThread(() -> {
                if (pinPadDialog != null && pinPadDialog.isShowing()) {
                    pinPadDialog.dismiss();
                    pinPadDialog = null;
                }
            });

            viewModel.startLoading("processing");

            if (result.isApproved()) {
                TRACE.i("✓ Transaction APPROVED");
                binding.animationView.pauseAnimation();

                String tlv = result.getTlv();
                if (tlv != null && !tlv.isEmpty()) {
                    TRACE.i("Final Transaction TLV: " + tlv);
                    String content = getString(R.string.batch_data) + tlv;
                    PaymentModel paymentModel = viewModel.setTransactionSuccess(content);

                    List<TLV> list = TLVParser.parse(tlv);
                    TLV tlvMaskedPan = TLVParser.searchTLV(list, "C4");
                    String finalCardNo = tlvMaskedPan == null ? paymentModel.getCardNo() : tlvMaskedPan.value;
                    paymentStatus(amount, finalCardNo, terminalTime, "");
                }
            } else {
                TRACE.i("✗ Transaction FAILED/DECLINED");
                viewModel.showPinpad.set(false);
                if (keyboardUtil != null) keyboardUtil.hide();
                String desc = result.getDescription();
                if (desc != null && !desc.isEmpty()) {
                    paymentStatus("", "", "", desc);
                    viewModel.setTransactionFailed(desc);
                }
            }
            TRACE.i("==============================================");
        }

        /**
         * Handle online process request
         * Sends transaction data to server for online authorization
         *
         * @param tlv TLV format transaction data
         */
        @Override
        public void onOnlineAuthRequested(String tlv, NKCardData cardData) {
            TRACE.i("========== ONLINE AUTHORIZATION REQUEST ==========");
            TRACE.i("Raw TLV Data: " + tlv);

            if (pinPadDialog != null && pinPadDialog.isShowing()) {
                runOnUiThread(() -> {
                    if (pinPadDialog != null) {
                        pinPadDialog.dismiss();
                        pinPadDialog = null;
                    }
                });
            }

            viewModel.showPinpad.set(false);
            viewModel.startLoading(getString(R.string.online_process_requested));

            Hashtable<String, String> decodeData = NeokredPOSService.getInstance(PaymentActivity.this).anlysEmvIccData(tlv);
            TRACE.i("Decoded EMV/ICC Data:");
            if (decodeData != null && !decodeData.isEmpty()) {
                for (String key : decodeData.keySet()) {
                    TRACE.i("  " + key + " = " + decodeData.get(key));
                }
            }

            // Parse TLV tags for detailed logging
            List<TLV> tlvList = TLVParser.parse(tlv);
            TRACE.i("Parsed TLV Tags:");
            for (TLV tag : tlvList) {
                TRACE.i("  Tag: " + tag.tag + ", Length: " + tag.length + ", Value: " + tag.value);
            }

            PaymentModel paymentModel = new PaymentModel();
            paymentModel.setAmount(amount);
            String cardNo = "";
            String cardOrg = "";

            if ("32".equals(decodeData.get("formatID"))) {
                TRACE.i("Format ID is 32 (MSR/Track Data)");
                cardNo = decodeData.get("maskedPAN");
            } else {
                TRACE.i("Format ID is EMV (searching for Tag C4 - Masked PAN)");
                TLV cardNoTlv = TLVParser.searchTLV(tlvList, "C4");
                cardNo = cardNoTlv == null ? "" : cardNoTlv.value;
                TRACE.i("Found Masked PAN (C4): " + cardNo);
                if (cardNo != null && !cardNo.isEmpty() && cardNo.length() > 0) {
                    cardNo = cardNo.substring(0, cardNo.length() - 1);
                }
            }

            cardOrg = AdvancedBinDetector.detectCardType(cardNo).getDisplayName();
            TRACE.i("Detected Card Organization: " + cardOrg);
            TRACE.i("Card Number (Masked): " + cardNo);

            paymentModel.setCardNo(cardNo);
            paymentModel.setCardOrg(cardOrg);

            TRACE.i("Sending online authorization request to server...");
            viewModel.requestOnlineAuth(true, paymentModel);
            TRACE.i("==================================================");
        }

        @Override
        public void onError(String message) {
            TRACE.e("Transaction error: " + message);
            viewModel.setTransactionFailed(message);
        }
    }

    @Override
    public void onBackPressed() {
        if (!isPinBack) {
            new Thread(() -> {
                NeokredPOSService.getInstance(this).cancelTrade();
                runOnUiThread(() -> finish());
            }).start();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        LogFileConfig.getInstance(this).readLog();
NeokredPOSService.getInstance(this).removeTransactionCallback(paymentServiceCallback);
        NeokredPOSService.getInstance(this).removeConnectionCallback(connectionCallback);
    }

    private String getDisplayMessageString(NKDisplayMessage msg) {
        switch (msg) {
            case PLEASE_WAIT:  return getString(R.string.wait);
            case REMOVE_CARD:  return getString(R.string.remove_card);
            case PROCESSING:   return getString(R.string.processing);
            case DECLINED:     return "transaction terminated";
            default:           return "";
        }
    }

    private void paymentStatus(String amount, String maskedPAN, String terminalTime, String errorMsg) {
        binding.d70ImageView.setVisibility(View.GONE);
        if (isStarting.compareAndSet(false, true)) {
            try {
                Intent intent = new Intent(PaymentActivity.this, PaymentStatusActivity.class);
                if (amount != null && !amount.isEmpty()) {
                    intent.putExtra("amount", amount);
                    intent.putExtra("maskedPAN", maskedPAN);
                    intent.putExtra("terminalTime", terminalTime);
                } else if (errorMsg != null && !errorMsg.isEmpty()) {
                    intent.putExtra("errorMsg", errorMsg);
                }
                getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                startActivity(intent);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                new Handler().postDelayed(() -> {
                    if (!isFinishing()) {
                        finish();
                        overridePendingTransition(0, 0);
                    }
                }, 400);
            } finally {
                new Handler().postDelayed(() -> isStarting.set(false), 500);
            }
        }
    }

}