package com.neokred.pos.ui.printer.activities;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import com.neokred.pos.R;
import com.neokred.pos.ui.printer.activities.base.BasePrinterViewModel;
import com.neokred.sdk.printer.NeokredPrinter;
import com.neokred.sdk.printer.model.NKTextStyle;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;

import java.util.Map;


public class PrintTicketViewModel extends BasePrinterViewModel {

    private MutableLiveData<Bitmap> receiptBitmap = new MutableLiveData<>();

    public PrintTicketViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    protected void doPrint() {
        // doPrint() called from printCommand; actual print is done via printTicket(Bitmap)
    }

    public void printTicket(Bitmap mBitmap) {
        // Use immediate printBitmap — bypasses the add/print buffer entirely
        // so there's no risk of stale buffered content printing twice.
        NeokredPrinter printer = NeokredPrinter.getInstance();
        printer.printBitmap(getApplication(), mBitmap);
    }

    public MutableLiveData<Bitmap> getReceiptBitmap() {
        return receiptBitmap;
    }

    public void generateReceiptBitmap(Map<String, String> map) {
        Context ctx = getApplication();
        NeokredPrinter printer = NeokredPrinter.getInstance();

        Bitmap logo = BitmapFactory.decodeResource(ctx.getResources(), R.drawable.nk_logo);
        printer.addBitmap(logo, NKTextStyle.Align.CENTER);
        printer.feedLines(5);
        printer.addStyle(NKTextStyle.bold(NKTextStyle.Align.CENTER, 10));
        printer.addText("SALES RECEIPT");
        printer.addStyle(NKTextStyle.normal(NKTextStyle.Align.CENTER, 10));
        printer.addText("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
        printer.addStyle(NKTextStyle.normal(NKTextStyle.Align.LEFT, 10));
        printer.addText(" CARD NUMBER.");
        String pan = map.get("maskedPAN");
        printer.addText(pan != null && !pan.isEmpty() ? " " + pan.replace("f", "*") : "6228 48******8 116  S");
        printer.addStyle(NKTextStyle.normal(NKTextStyle.Align.CENTER, 10));
        printer.addText("- - - - - - - - - - - - - - - - - - - - - - - - - - ");
        printer.addMultiColumnText(
                new String[]{"DATE/TIME", map.get("terminalTime") != null ? map.get("terminalTime") : ""},
                new int[]{5, 5},
                new NKTextStyle.Align[]{NKTextStyle.Align.LEFT, NKTextStyle.Align.CENTER},
                new int[]{0, 0}, 10);
        printer.addStyle(NKTextStyle.bold(NKTextStyle.Align.CENTER, 12));
        printer.addText("₹: " + (map.get("terAmount") != null ? map.get("terAmount") : ""));
        printer.feedLines(110);
        Bitmap bitmap = printer.getReceiptBitmap();
        receiptBitmap.postValue(bitmap);
    }

    @Override
    public void onPrintComplete(boolean isSuccess, String status) {
        super.onPrintComplete(isSuccess, status);
    }
}