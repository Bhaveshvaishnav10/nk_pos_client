package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPaymentGenerateBindingImpl extends ActivityPaymentGenerateBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.container, 9);
        sViewsWithIds.put(R.id.qrCodeImageView, 10);
        sViewsWithIds.put(R.id.paymentIconsLayout, 11);
        sViewsWithIds.put(R.id.visaIcon, 12);
        sViewsWithIds.put(R.id.mastercardIcon, 13);
        sViewsWithIds.put(R.id.amexIcon, 14);
        sViewsWithIds.put(R.id.discoverIcon, 15);
        sViewsWithIds.put(R.id.jcbIcon, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ImageButton mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPaymentGenerateBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityPaymentGenerateBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[14]
            , (android.widget.TextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatButton) bindings[8]
            , (android.widget.ImageButton) bindings[4]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[9]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.TextView) bindings[7]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[11]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[12]
            );
        this.amountValue.setTag(null);
        this.checkStatusButton.setTag(null);
        this.closeButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageButton) bindings[3];
        this.mboundView3.setTag(null);
        this.openAppText.setTag(null);
        this.totalLabel.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setViewModel((com.neokred.pos.ui.payment.PaymentGenerateViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.payment.PaymentGenerateViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsSmallScreen((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsNormalScreen((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelAmount((androidx.lifecycle.LiveData<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsSmallScreen(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsSmallScreen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsNormalScreen(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsNormalScreen, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAmount(androidx.lifecycle.LiveData<java.lang.String> ViewModelAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelCheckPayStatus = null;
        java.lang.String viewModelAmountGetValue = null;
        java.lang.Boolean viewModelIsNormalScreenGet = null;
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelCloseButton = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsSmallScreen = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsNormalScreen = null;
        int viewModelIsNormalScreenViewVISIBLEViewGONE = 0;
        androidx.lifecycle.LiveData<java.lang.String> viewModelAmount = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNormalScreenGet = false;
        int viewModelIsSmallScreenViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsSmallScreenGet = null;
        com.neokred.pos.ui.payment.PaymentGenerateViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.checkPayStatus
                        viewModelCheckPayStatus = viewModel.checkPayStatus;
                        // read viewModel.closeButton
                        viewModelCloseButton = viewModel.closeButton;
                    }
            }
            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSmallScreen
                        viewModelIsSmallScreen = viewModel.isSmallScreen;
                    }
                    updateRegistration(0, viewModelIsSmallScreen);


                    if (viewModelIsSmallScreen != null) {
                        // read viewModel.isSmallScreen.get()
                        viewModelIsSmallScreenGet = viewModelIsSmallScreen.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSmallScreenGet);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
                    viewModelIsSmallScreenViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isNormalScreen
                        viewModelIsNormalScreen = viewModel.isNormalScreen;
                    }
                    updateRegistration(1, viewModelIsNormalScreen);


                    if (viewModelIsNormalScreen != null) {
                        // read viewModel.isNormalScreen.get()
                        viewModelIsNormalScreenGet = viewModelIsNormalScreen.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsNormalScreenGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsNormalScreenGet);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsNormalScreenGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
                    viewModelIsNormalScreenViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsNormalScreenGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.amount
                        viewModelAmount = viewModel.getAmount();
                    }
                    updateLiveDataRegistration(2, viewModelAmount);


                    if (viewModelAmount != null) {
                        // read viewModel.amount.getValue()
                        viewModelAmountGetValue = viewModelAmount.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.amountValue, viewModelAmountGetValue);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelAmountGetValue);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.amountValue.setVisibility(viewModelIsNormalScreenViewVISIBLEViewGONE);
            this.checkStatusButton.setVisibility(viewModelIsNormalScreenViewVISIBLEViewGONE);
            this.closeButton.setVisibility(viewModelIsNormalScreenViewVISIBLEViewGONE);
            this.openAppText.setVisibility(viewModelIsNormalScreenViewVISIBLEViewGONE);
            this.totalLabel.setVisibility(viewModelIsNormalScreenViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.checkStatusButton, viewModelCheckPayStatus, (boolean)false);
            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.mboundView3, viewModelCloseButton, (boolean)false);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelIsSmallScreenViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isSmallScreen
        flag 1 (0x2L): viewModel.isNormalScreen
        flag 2 (0x3L): viewModel.amount
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}