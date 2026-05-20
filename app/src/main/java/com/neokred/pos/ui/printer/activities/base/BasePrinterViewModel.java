package com.neokred.pos.ui.printer.activities.base;

import android.app.Application;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;

import com.neokred.pos.common.base.BaseAppViewModel;

import me.goldze.mvvmhabit.binding.command.BindingCommand;

public abstract class BasePrinterViewModel extends BaseAppViewModel {

    /** Called by PrinterBaseActivity once the printer is connected and ready. */
    public void onPrinterReady(Context context) {
        // Subclasses may override if they need to do setup here
    }

    protected boolean isPrinterAvailable() {
        return true; // NeokredPrinter is always accessible via getInstance()
    }

    public ObservableField<String> title = new ObservableField<>();
    public ObservableBoolean isLoading = new ObservableBoolean(false);
    public ObservableField<String> resultText = new ObservableField<>();


    public ObservableField<Boolean> isSmallScreen = new ObservableField<>(true);

    public ObservableField<Boolean> isNormalScreen = new ObservableField<>(true);

    //isSmallScreenButton
    public ObservableField<Boolean> isSmallScreenButton = new ObservableField<>(true);

    public BasePrinterViewModel(@NonNull Application application) {
        super(application);
    }

    public BindingCommand printCommand = new BindingCommand(() -> {
        isLoading.set(true);
        doPrint();
    });

    protected abstract void doPrint();

    public void onPrintComplete(boolean success, String message) {
        isLoading.set(false);
        resultText.set(message);
    }
}