package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemCurrencyBindingImpl extends ItemCurrencyBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemCurrencyBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemCurrencyBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.ImageView) bindings[1]
            );
        this.checkIcon.setTag(null);
        this.currencyCode.setTag(null);
        this.currencyName.setTag(null);
        this.flagImage.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.currency == variableId) {
            setCurrency((com.neokred.pos.ui.setting.device_config.DeviceConfigItem) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setCurrency(@Nullable com.neokred.pos.ui.setting.device_config.DeviceConfigItem Currency) {
        this.mCurrency = Currency;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.currency);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        int currencyFlagResId = 0;
        java.lang.String CurrencyCode1 = null;
        int currencySelectedAndroidViewViewVISIBLEAndroidViewViewGONE = 0;
        java.lang.String CurrencyName1 = null;
        boolean currencySelected = false;
        com.neokred.pos.ui.setting.device_config.DeviceConfigItem currency = mCurrency;

        if ((dirtyFlags & 0x3L) != 0) {



                if (currency != null) {
                    // read currency.flagResId
                    currencyFlagResId = currency.getFlagResId();
                    // read currency.code
                    CurrencyCode1 = currency.getCode();
                    // read currency.name
                    CurrencyName1 = currency.getName();
                    // read currency.selected
                    currencySelected = currency.isSelected();
                }
            if((dirtyFlags & 0x3L) != 0) {
                if(currencySelected) {
                        dirtyFlags |= 0x8L;
                }
                else {
                        dirtyFlags |= 0x4L;
                }
            }


                // read currency.selected ? android.view.View.VISIBLE : android.view.View.GONE
                currencySelectedAndroidViewViewVISIBLEAndroidViewViewGONE = ((currencySelected) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.checkIcon.setVisibility(currencySelectedAndroidViewViewVISIBLEAndroidViewViewGONE);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.currencyCode, CurrencyCode1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.currencyName, CurrencyName1);
            me.goldze.mvvmhabit.binding.viewadapter.image.ViewBindingAdapter.setImageResource(this.flagImage, currencyFlagResId);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): currency
        flag 1 (0x2L): null
        flag 2 (0x3L): currency.selected ? android.view.View.VISIBLE : android.view.View.GONE
        flag 3 (0x4L): currency.selected ? android.view.View.VISIBLE : android.view.View.GONE
    flag mapping end*/
    //end
}