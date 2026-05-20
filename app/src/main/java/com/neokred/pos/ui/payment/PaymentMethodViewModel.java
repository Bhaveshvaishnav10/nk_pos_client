package com.neokred.pos.ui.payment;

import android.app.Application;
import android.util.Log;

import com.neokred.pos.common.base.BaseAppViewModel;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import me.goldze.mvvmhabit.binding.command.BindingAction;
import me.goldze.mvvmhabit.binding.command.BindingCommand;

public class PaymentMethodViewModel extends BaseAppViewModel {

    public final ObservableField<String> totalAmount = new ObservableField<>("₹0.00");
    // Selected payment method
    private final MutableLiveData<Integer> selectedPaymentMethod = new MutableLiveData<>();

    public ObservableField<Boolean> isNormalScreen = new ObservableField<>(true);
    public ObservableField<Boolean> isSmallScreen = new ObservableField<>(false);

    public PaymentMethodViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand closeButton = new BindingCommand(new BindingAction() {
        @Override
        public void call() {
            Log.d("Payment", "close button");
            finish();
        }
    });


    // Payment method click event
    public void onPaymentMethodSelected(int methodIndex) {
        selectedPaymentMethod.setValue(methodIndex);
        // Execute corresponding operation based on selected payment method
        switch (methodIndex) {
            case 0: // Card
                processCardPayment();
                break;
            case 1: // Scan Code
                processScanCodePayment();
                break;
            case 2: // Generate
                processGeneratePayment();
                break;
            case 3: // Cash
                processCashPayment();
                break;
        }
    }

    private void processCardPayment() {
        // Handle card payment logic
        Log.d("Payment", "Card payment selected");
    }

    private void processScanCodePayment() {
        // Handle scan code payment logic
        Log.d("Payment", "Scan code payment selected");
    }

    private void processGeneratePayment() {
        // Handle generate payment code logic
        Log.d("Payment", "Generate payment code selected");
    }

    private void processCashPayment() {
        // Handle cash payment logic
        Log.d("Payment", "Cash payment selected");
    }

    // Get selected payment method
    public LiveData<Integer> getSelectedPaymentMethod() {
        return selectedPaymentMethod;
    }

    // Set total amount
    public void setTotalAmount(String amount) {
        totalAmount.set(amount);
    }
}
