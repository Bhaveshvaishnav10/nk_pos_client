package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPaymentMetholdBindingImpl extends ActivityPaymentMetholdBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.payment_methods_layout, 7);
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
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPaymentMetholdBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private ActivityPaymentMetholdBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageButton) bindings[5]
            , (com.neokred.pos.view.PaymentMethodsLayout) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.closeButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.ImageButton) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.totalAmount.setTag(null);
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
            setViewModel((com.neokred.pos.ui.payment.PaymentMethodViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.payment.PaymentMethodViewModel ViewModel) {
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
                return onChangeViewModelTotalAmount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
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
    private boolean onChangeViewModelTotalAmount(androidx.databinding.ObservableField<java.lang.String> ViewModelTotalAmount, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet = false;
        java.lang.Boolean viewModelIsNormalScreenGet = null;
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelCloseButton = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNormalScreenGet = false;
        int viewModelIsSmallScreenViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsSmallScreen = null;
        java.lang.String viewModelTotalAmountGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsNormalScreen = null;
        int viewModelIsNormalScreenViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelTotalAmount = null;
        java.lang.Boolean viewModelIsSmallScreenGet = null;
        com.neokred.pos.ui.payment.PaymentMethodViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
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
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
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
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
                    viewModelIsNormalScreenViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsNormalScreenGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.totalAmount
                        viewModelTotalAmount = viewModel.totalAmount;
                    }
                    updateRegistration(2, viewModelTotalAmount);


                    if (viewModelTotalAmount != null) {
                        // read viewModel.totalAmount.get()
                        viewModelTotalAmountGet = viewModelTotalAmount.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.closeButton, viewModelCloseButton, (boolean)false);
            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.mboundView3, viewModelCloseButton, (boolean)false);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelIsSmallScreenViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelTotalAmountGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.totalAmount, viewModelTotalAmountGet);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.mboundView4.setVisibility(viewModelIsNormalScreenViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isSmallScreen
        flag 1 (0x2L): viewModel.isNormalScreen
        flag 2 (0x3L): viewModel.totalAmount
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}