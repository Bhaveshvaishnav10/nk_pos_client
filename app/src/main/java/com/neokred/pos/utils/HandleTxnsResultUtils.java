package com.neokred.pos.utils;

import com.neokred.pos.ui.payment.PaymentResult;
import com.neokred.pos.ui.payment.PaymentModel;
import com.neokred.pos.ui.payment.PaymentViewModel;

import java.util.Hashtable;

public class HandleTxnsResultUtils {
    public static void handleDoTradeResult(PaymentResult paymentResult, Hashtable<String, String> decodeData, PaymentViewModel viewModel){
        paymentResult.setFormatID(decodeData.get("formatID") == null?"":decodeData.get("formatID"));
        paymentResult.setMaskedPAN(decodeData.get("maskedPAN") == null? "":decodeData.get("maskedPAN"));
        paymentResult.setExpiryDate(decodeData.get("expiryDate") == null? "":decodeData.get("expiryDate"));
        paymentResult.setCardHolderName(decodeData.get("cardholderName") == null? "":decodeData.get("cardholderName"));
        paymentResult.setServiceCode(decodeData.get("serviceCode") == null? "":decodeData.get("serviceCode"));
        paymentResult.setTrack1Length(decodeData.get("track1Length") == null? "":decodeData.get("track1Length"));
        paymentResult.setTrack2Length(decodeData.get("track2Length") == null? "":decodeData.get("track2Length"));
        paymentResult.setTrack3Length(decodeData.get("track3Length") == null? "":decodeData.get("track3Length"));
        paymentResult.setEncTracks(decodeData.get("encTracks") == null? "":decodeData.get("encTracks"));
        paymentResult.setEncTrack1(decodeData.get("encTrack1") == null? "":decodeData.get("encTrack1"));
        paymentResult.setEncTrack2(decodeData.get("encTrack2") == null? "":decodeData.get("encTrack2"));
        paymentResult.setEncTrack3(decodeData.get("encTrack3") == null? "":decodeData.get("encTrack3"));
        paymentResult.setPartialTrack(decodeData.get("partialTrack") == null? "":decodeData.get("partialTrack"));
        paymentResult.setPinKsn(decodeData.get("pinKsn") == null? "":decodeData.get("pinKsn"));
        paymentResult.setTrackksn(decodeData.get("trackksn") == null? "":decodeData.get("trackksn"));
        paymentResult.setPinBlock(decodeData.get("pinBlock") == null? "":decodeData.get("pinBlock"));
        paymentResult.setEncPAN(decodeData.get("encPAN") == null? "":decodeData.get("encPAN"));
        paymentResult.setTrackRandomNumber(decodeData.get("trackRandomNumber") == null? "":decodeData.get("trackRandomNumber"));
        paymentResult.setPinRandomNumber(decodeData.get("pinRandomNumber") == null? "":decodeData.get("pinRandomNumber"));

        PaymentModel model = new PaymentModel();
        model.setAmount(paymentResult.getAmount());
        model.setCardNo(paymentResult.getMaskedPAN());
        model.setCardOrg(AdvancedBinDetector.detectCardType(paymentResult.getMaskedPAN()).getDisplayName());
        viewModel.startLoading("processing...");
        viewModel.requestOnlineAuth(false, model);
    }

}
