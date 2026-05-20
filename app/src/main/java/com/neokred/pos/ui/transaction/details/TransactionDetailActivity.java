package com.neokred.pos.ui.transaction.details;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.neokred.pos.ui.transaction.Transaction;
import com.neokred.pos.ui.transaction.reissue.ReissueReceiptActivity;
import com.neokred.pos.utils.DeviceUtils;
import com.neokred.pos.BR;
import com.neokred.pos.R;
import com.neokred.pos.databinding.ActivityTransactionDetailsBinding;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import me.goldze.mvvmhabit.base.BaseActivity;
import me.goldze.mvvmhabit.utils.SPUtils;

public class TransactionDetailActivity extends BaseActivity<ActivityTransactionDetailsBinding, TransactionDetailsViewModel> {

    private Transaction transaction;

    @Override
    public int initContentView(Bundle bundle) {
        return R.layout.activity_transaction_details;
    }

    @Override
    public int initVariableId() {
        return BR.viewModel;
    }

    @Override
    public void initData() {
        super.initData();

        initCardImage();
        binding.setVariable(BR.viewModel, viewModel);
        transaction = (Transaction) getIntent().getSerializableExtra("transaction");
       // binding.transactionDate.setText(transaction.getTransactionDate().replace("-","/"));

        binding.transactionDate.setText(
                transaction.getTransactionDate() != null ?
                        transaction.getTransactionDate().replace("-", "/") :
                        ""
        );

        String amount = DeviceUtils.convertAmountToCents(new BigDecimal(transaction.getAmount()).toPlainString());
        binding.tvAmount.setText("₹" + amount);
        binding.tvPayType.setText(transaction.getPayType());
        binding.tvDeviceId.setText(SPUtils.getInstance().getString("posID", ""));
        binding.tvCardNumber.setText(transaction.getMaskPan().replaceAll("[fFXx]", "*"));

        String cardOrg = transaction.getCardOrg();
        if (cardOrg != null) {
            if (cardOrg.equalsIgnoreCase("visa")) {
                binding.ivCardOrganization.setImageResource(mipmapImageIds.get(0));
            } else if (cardOrg.equalsIgnoreCase("masterCard") || cardOrg.equalsIgnoreCase("mastercard")) {
                binding.ivCardOrganization.setImageResource(mipmapImageIds.get(1));
            } else if (cardOrg.equalsIgnoreCase("amex") || cardOrg.equalsIgnoreCase("american express")) {
                binding.ivCardOrganization.setImageResource(mipmapImageIds.get(2));
            } else if (cardOrg.equalsIgnoreCase("discover")) {
                binding.ivCardOrganization.setImageResource(mipmapImageIds.get(3));
            } else if (cardOrg.equalsIgnoreCase("jcb")) {
                binding.ivCardOrganization.setImageResource(mipmapImageIds.get(4));
            } else if (cardOrg.equalsIgnoreCase("unionpay")) {
                binding.ivCardOrganization.setImageResource(mipmapImageIds.get(5));
            } else if (cardOrg.equalsIgnoreCase("rupay")) {
                binding.ivCardOrganization.setImageResource(mipmapImageIds.get(6));
            }
        }


        binding.toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        binding.tvReissueReceipt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TransactionDetailActivity.this, ReissueReceiptActivity.class);
                intent.putExtra("amount", transaction.getAmount() + "");
                intent.putExtra("transaction", (Serializable) transaction);
                startActivity(intent);
            }
        });
    }

    private List<Integer> mipmapImageIds = new ArrayList<>();

    private void initCardImage() {
        mipmapImageIds.add(R.mipmap.ic_visa);        // Index 0: Visa
        mipmapImageIds.add(R.mipmap.ic_master);      // Index 1: MasterCard
        mipmapImageIds.add(R.mipmap.ic_amex);        // Index 2: Amex
        mipmapImageIds.add(R.mipmap.ic_discover);    // Index 3: Discover
        mipmapImageIds.add(R.mipmap.ic_jcb);         // Index 4: JCB
        mipmapImageIds.add(R.mipmap.ic_unionpay);    // Index 5: UnionPay
        mipmapImageIds.add(R.mipmap.ic_rupay);       // Index 6: RuPay
    }
}
