package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPaymentBindingImpl extends ActivityPaymentBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.iv_nfc_guide_d35, 23);
        sViewsWithIds.put(R.id.iv_card_guide_d35, 24);
        sViewsWithIds.put(R.id.txt_wait_insert_tap_card_d35, 25);
        sViewsWithIds.put(R.id.iv_nfc_guide_d50, 26);
        sViewsWithIds.put(R.id.iv_card_guide_d50, 27);
        sViewsWithIds.put(R.id.txt_wait_insert_tap_card_d50, 28);
        sViewsWithIds.put(R.id.totalLabel, 29);
        sViewsWithIds.put(R.id.pinpadEditText, 30);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @NonNull
    private final android.widget.LinearLayout mboundView13;
    @NonNull
    private final android.widget.TextView mboundView14;
    @NonNull
    private final android.widget.ImageView mboundView15;
    @NonNull
    private final com.airbnb.lottie.LottieAnimationView mboundView17;
    @NonNull
    private final android.widget.LinearLayout mboundView18;
    @NonNull
    private final android.widget.TextView mboundView19;
    @NonNull
    private final android.widget.LinearLayout mboundView2;
    @NonNull
    private final android.view.View mboundView20;
    @NonNull
    private final androidx.cardview.widget.CardView mboundView21;
    @NonNull
    private final android.widget.TextView mboundView22;
    @NonNull
    private final android.widget.TextView mboundView4;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPaymentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 31, sIncludes, sViewsWithIds));
    }
    private ActivityPaymentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 11
            , (com.airbnb.lottie.LottieAnimationView) bindings[9]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[23]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.EditText) bindings[30]
            , (android.widget.RelativeLayout) bindings[0]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[28]
            );
        this.animationView.setTag(null);
        this.d70ImageView.setTag(null);
        this.ivBtnCloseBlack.setTag(null);
        this.ivCloseBlack.setTag(null);
        this.ivCloseBlackD70.setTag(null);
        this.linCardbrand.setTag(null);
        this.llPaymentGuideD35.setTag(null);
        this.llPaymentGuideD50.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView13 = (android.widget.LinearLayout) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.TextView) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.ImageView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView17 = (com.airbnb.lottie.LottieAnimationView) bindings[17];
        this.mboundView17.setTag(null);
        this.mboundView18 = (android.widget.LinearLayout) bindings[18];
        this.mboundView18.setTag(null);
        this.mboundView19 = (android.widget.TextView) bindings[19];
        this.mboundView19.setTag(null);
        this.mboundView2 = (android.widget.LinearLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView20 = (android.view.View) bindings[20];
        this.mboundView20.setTag(null);
        this.mboundView21 = (androidx.cardview.widget.CardView) bindings[21];
        this.mboundView21.setTag(null);
        this.mboundView22 = (android.widget.TextView) bindings[22];
        this.mboundView22.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.relSaleDetails.setTag(null);
        this.txtTotal.setTag(null);
        this.txtWaitInsertTapCard.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1000L;
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
            setViewModel((com.neokred.pos.ui.payment.PaymentViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.payment.PaymentViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsPayMentGuideD50((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeViewModelIsPayMentGuideD35((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeViewModelShowPinpad((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeViewModelIsD70((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelIsLoading((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 5 :
                return onChangeViewModelShowResultStatus((androidx.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeViewModelCardsInsertedStatus((androidx.databinding.ObservableBoolean) object, fieldId);
            case 7 :
                return onChangeViewModelAmount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeViewModelLoadingText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeViewModelIsShowAnimationView((androidx.databinding.ObservableBoolean) object, fieldId);
            case 10 :
                return onChangeViewModelIsShowOtherCardTxt((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsPayMentGuideD50(androidx.databinding.ObservableBoolean ViewModelIsPayMentGuideD50, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsPayMentGuideD35(androidx.databinding.ObservableBoolean ViewModelIsPayMentGuideD35, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowPinpad(androidx.databinding.ObservableBoolean ViewModelShowPinpad, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsD70(androidx.databinding.ObservableBoolean ViewModelIsD70, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelShowResultStatus(androidx.databinding.ObservableBoolean ViewModelShowResultStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCardsInsertedStatus(androidx.databinding.ObservableBoolean ViewModelCardsInsertedStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAmount(androidx.databinding.ObservableField<java.lang.String> ViewModelAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelLoadingText(androidx.databinding.ObservableField<java.lang.String> ViewModelLoadingText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowAnimationView(androidx.databinding.ObservableBoolean ViewModelIsShowAnimationView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowOtherCardTxt(androidx.databinding.ObservableBoolean ViewModelIsShowOtherCardTxt, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
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
        int viewModelIsPayMentGuideD35ViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableBoolean viewModelIsPayMentGuideD50 = null;
        int viewModelShowPinpadViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableBoolean viewModelIsPayMentGuideD35 = null;
        int viewModelIsD70ViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableBoolean viewModelShowPinpad = null;
        boolean viewModelIsShowAnimationViewGet = false;
        java.lang.Boolean viewModelIsLoadingGet = null;
        int viewModelIsD70Int0AndroidIdIvCloseBlack = 0;
        java.lang.String viewModelLoadingTextGet = null;
        boolean viewModelCardsInsertedStatusGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet = false;
        androidx.databinding.ObservableBoolean viewModelIsD70 = null;
        int viewModelShowResultStatusBooleanTrueViewModelIsD70ViewGONEViewVISIBLE = 0;
        boolean viewModelIsD70Get = false;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        int viewModelCardsInsertedStatusViewVISIBLEViewGONE = 0;
        int viewModelIsShowOtherCardTxtViewVISIBLEViewGONE = 0;
        boolean viewModelIsPayMentGuideD35Get = false;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsLoading = null;
        java.lang.String viewModelAmountGet = null;
        int viewModelIsD70ViewVISIBLEViewGONE = 0;
        boolean viewModelShowPinpadGet = false;
        int viewModelIsShowAnimationViewViewGONEViewVISIBLE = 0;
        androidx.databinding.ObservableBoolean viewModelShowResultStatus = null;
        boolean viewModelShowResultStatusGet = false;
        androidx.databinding.ObservableBoolean viewModelCardsInsertedStatus = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelAmount = null;
        boolean viewModelShowResultStatusBooleanTrueViewModelIsD70 = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelLoadingText = null;
        int viewModelShowResultStatusViewGONEViewVISIBLE = 0;
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelCancleTxnsCommand = null;
        androidx.databinding.ObservableBoolean viewModelIsShowAnimationView = null;
        boolean viewModelIsPayMentGuideD50Get = false;
        boolean viewModelIsShowOtherCardTxtGet = false;
        int viewModelIsPayMentGuideD50ViewGONEViewVISIBLE = 0;
        com.neokred.pos.ui.payment.PaymentViewModel viewModel = mViewModel;
        androidx.databinding.ObservableBoolean viewModelIsShowOtherCardTxt = null;

        if ((dirtyFlags & 0x1fffL) != 0) {


            if ((dirtyFlags & 0x1801L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isPayMentGuideD50
                        viewModelIsPayMentGuideD50 = viewModel.isPayMentGuideD50;
                    }
                    updateRegistration(0, viewModelIsPayMentGuideD50);


                    if (viewModelIsPayMentGuideD50 != null) {
                        // read viewModel.isPayMentGuideD50.get()
                        viewModelIsPayMentGuideD50Get = viewModelIsPayMentGuideD50.get();
                    }
                if((dirtyFlags & 0x1801L) != 0) {
                    if(viewModelIsPayMentGuideD50Get) {
                            dirtyFlags |= 0x4000000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000000L;
                    }
                }


                    // read viewModel.isPayMentGuideD50.get() ? View.GONE : View.VISIBLE
                    viewModelIsPayMentGuideD50ViewGONEViewVISIBLE = ((viewModelIsPayMentGuideD50Get) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1802L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isPayMentGuideD35
                        viewModelIsPayMentGuideD35 = viewModel.isPayMentGuideD35;
                    }
                    updateRegistration(1, viewModelIsPayMentGuideD35);


                    if (viewModelIsPayMentGuideD35 != null) {
                        // read viewModel.isPayMentGuideD35.get()
                        viewModelIsPayMentGuideD35Get = viewModelIsPayMentGuideD35.get();
                    }
                if((dirtyFlags & 0x1802L) != 0) {
                    if(viewModelIsPayMentGuideD35Get) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read viewModel.isPayMentGuideD35.get() ? View.GONE : View.VISIBLE
                    viewModelIsPayMentGuideD35ViewGONEViewVISIBLE = ((viewModelIsPayMentGuideD35Get) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1804L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showPinpad
                        viewModelShowPinpad = viewModel.showPinpad;
                    }
                    updateRegistration(2, viewModelShowPinpad);


                    if (viewModelShowPinpad != null) {
                        // read viewModel.showPinpad.get()
                        viewModelShowPinpadGet = viewModelShowPinpad.get();
                    }
                if((dirtyFlags & 0x1804L) != 0) {
                    if(viewModelShowPinpadGet) {
                            dirtyFlags |= 0x10000L;
                    }
                    else {
                            dirtyFlags |= 0x8000L;
                    }
                }


                    // read viewModel.showPinpad.get() ? View.VISIBLE : View.GONE
                    viewModelShowPinpadViewVISIBLEViewGONE = ((viewModelShowPinpadGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1808L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isD70
                        viewModelIsD70 = viewModel.isD70;
                    }
                    updateRegistration(3, viewModelIsD70);


                    if (viewModelIsD70 != null) {
                        // read viewModel.isD70.get()
                        viewModelIsD70Get = viewModelIsD70.get();
                    }
                if((dirtyFlags & 0x1808L) != 0) {
                    if(viewModelIsD70Get) {
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x40000000L;
                    }
                    else {
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x20000000L;
                    }
                }


                    // read viewModel.isD70.get() ? View.GONE : View.VISIBLE
                    viewModelIsD70ViewGONEViewVISIBLE = ((viewModelIsD70Get) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                    // read viewModel.isD70.get() ? 0 : @android:id/iv_close_black
                    viewModelIsD70Int0AndroidIdIvCloseBlack = ((viewModelIsD70Get) ? (0) : (R.id.iv_close_black));
                    // read viewModel.isD70.get() ? View.VISIBLE : View.GONE
                    viewModelIsD70ViewVISIBLEViewGONE = ((viewModelIsD70Get) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1810L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading;
                    }
                    updateRegistration(4, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.get()
                        viewModelIsLoadingGet = viewModelIsLoading.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGet);
                if((dirtyFlags & 0x1810L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet) {
                            dirtyFlags |= 0x1000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1828L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.showResultStatus
                        viewModelShowResultStatus = viewModel.showResultStatus;
                    }
                    updateRegistration(5, viewModelShowResultStatus);


                    if (viewModelShowResultStatus != null) {
                        // read viewModel.showResultStatus.get()
                        viewModelShowResultStatusGet = viewModelShowResultStatus.get();
                    }
                if((dirtyFlags & 0x1828L) != 0) {
                    if(viewModelShowResultStatusGet) {
                            dirtyFlags |= 0x400000000L;
                    }
                    else {
                            dirtyFlags |= 0x200000000L;
                    }
                }
                if((dirtyFlags & 0x1820L) != 0) {
                    if(viewModelShowResultStatusGet) {
                            dirtyFlags |= 0x1000000000L;
                    }
                    else {
                            dirtyFlags |= 0x800000000L;
                    }
                }

                if ((dirtyFlags & 0x1820L) != 0) {

                        // read viewModel.showResultStatus.get() ? View.GONE : View.VISIBLE
                        viewModelShowResultStatusViewGONEViewVISIBLE = ((viewModelShowResultStatusGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                }
            }
            if ((dirtyFlags & 0x1840L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cardsInsertedStatus
                        viewModelCardsInsertedStatus = viewModel.cardsInsertedStatus;
                    }
                    updateRegistration(6, viewModelCardsInsertedStatus);


                    if (viewModelCardsInsertedStatus != null) {
                        // read viewModel.cardsInsertedStatus.get()
                        viewModelCardsInsertedStatusGet = viewModelCardsInsertedStatus.get();
                    }
                if((dirtyFlags & 0x1840L) != 0) {
                    if(viewModelCardsInsertedStatusGet) {
                            dirtyFlags |= 0x4000000L;
                    }
                    else {
                            dirtyFlags |= 0x2000000L;
                    }
                }


                    // read viewModel.cardsInsertedStatus.get() ? View.VISIBLE : View.GONE
                    viewModelCardsInsertedStatusViewVISIBLEViewGONE = ((viewModelCardsInsertedStatusGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1880L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.amount
                        viewModelAmount = viewModel.amount;
                    }
                    updateRegistration(7, viewModelAmount);


                    if (viewModelAmount != null) {
                        // read viewModel.amount.get()
                        viewModelAmountGet = viewModelAmount.get();
                    }
            }
            if ((dirtyFlags & 0x1900L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.loadingText
                        viewModelLoadingText = viewModel.loadingText;
                    }
                    updateRegistration(8, viewModelLoadingText);


                    if (viewModelLoadingText != null) {
                        // read viewModel.loadingText.get()
                        viewModelLoadingTextGet = viewModelLoadingText.get();
                    }
            }
            if ((dirtyFlags & 0x1800L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cancleTxnsCommand
                        viewModelCancleTxnsCommand = viewModel.cancleTxnsCommand;
                    }
            }
            if ((dirtyFlags & 0x1a00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowAnimationView
                        viewModelIsShowAnimationView = viewModel.isShowAnimationView;
                    }
                    updateRegistration(9, viewModelIsShowAnimationView);


                    if (viewModelIsShowAnimationView != null) {
                        // read viewModel.isShowAnimationView.get()
                        viewModelIsShowAnimationViewGet = viewModelIsShowAnimationView.get();
                    }
                if((dirtyFlags & 0x1a00L) != 0) {
                    if(viewModelIsShowAnimationViewGet) {
                            dirtyFlags |= 0x100000000L;
                    }
                    else {
                            dirtyFlags |= 0x80000000L;
                    }
                }


                    // read viewModel.isShowAnimationView.get() ? View.GONE : View.VISIBLE
                    viewModelIsShowAnimationViewViewGONEViewVISIBLE = ((viewModelIsShowAnimationViewGet) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
            }
            if ((dirtyFlags & 0x1c00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowOtherCardTxt
                        viewModelIsShowOtherCardTxt = viewModel.isShowOtherCardTxt;
                    }
                    updateRegistration(10, viewModelIsShowOtherCardTxt);


                    if (viewModelIsShowOtherCardTxt != null) {
                        // read viewModel.isShowOtherCardTxt.get()
                        viewModelIsShowOtherCardTxtGet = viewModelIsShowOtherCardTxt.get();
                    }
                if((dirtyFlags & 0x1c00L) != 0) {
                    if(viewModelIsShowOtherCardTxtGet) {
                            dirtyFlags |= 0x10000000L;
                    }
                    else {
                            dirtyFlags |= 0x8000000L;
                    }
                }


                    // read viewModel.isShowOtherCardTxt.get() ? View.VISIBLE : View.GONE
                    viewModelIsShowOtherCardTxtViewVISIBLEViewGONE = ((viewModelIsShowOtherCardTxtGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished

        if ((dirtyFlags & 0x200000000L) != 0) {

                if (viewModel != null) {
                    // read viewModel.isD70
                    viewModelIsD70 = viewModel.isD70;
                }
                updateRegistration(3, viewModelIsD70);


                if (viewModelIsD70 != null) {
                    // read viewModel.isD70.get()
                    viewModelIsD70Get = viewModelIsD70.get();
                }
            if((dirtyFlags & 0x1808L) != 0) {
                if(viewModelIsD70Get) {
                        dirtyFlags |= 0x40000L;
                        dirtyFlags |= 0x100000L;
                        dirtyFlags |= 0x40000000L;
                }
                else {
                        dirtyFlags |= 0x20000L;
                        dirtyFlags |= 0x80000L;
                        dirtyFlags |= 0x20000000L;
                }
            }
        }

        if ((dirtyFlags & 0x1828L) != 0) {

                // read viewModel.showResultStatus.get() ? true : viewModel.isD70.get()
                viewModelShowResultStatusBooleanTrueViewModelIsD70 = ((viewModelShowResultStatusGet) ? (true) : (viewModelIsD70Get));
            if((dirtyFlags & 0x1828L) != 0) {
                if(viewModelShowResultStatusBooleanTrueViewModelIsD70) {
                        dirtyFlags |= 0x400000L;
                }
                else {
                        dirtyFlags |= 0x200000L;
                }
            }


                // read viewModel.showResultStatus.get() ? true : viewModel.isD70.get() ? View.GONE : View.VISIBLE
                viewModelShowResultStatusBooleanTrueViewModelIsD70ViewGONEViewVISIBLE = ((viewModelShowResultStatusBooleanTrueViewModelIsD70) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
        }
        // batch finished
        if ((dirtyFlags & 0x1a00L) != 0) {
            // api target 1

            this.animationView.setVisibility(viewModelIsShowAnimationViewViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1808L) != 0) {
            // api target 1

            this.d70ImageView.setVisibility(viewModelIsD70ViewVISIBLEViewGONE);
            this.mboundView15.setVisibility(viewModelIsD70ViewVISIBLEViewGONE);
            this.mboundView17.setVisibility(viewModelIsD70ViewGONEViewVISIBLE);
            com.neokred.pos.view.BindingAdapters.setLayoutBelowIf(this.mboundView2, viewModelIsD70Int0AndroidIdIvCloseBlack);
            com.neokred.pos.view.BindingAdapters.setMarginTopConditional(this.txtTotal, viewModelIsD70Get);
        }
        if ((dirtyFlags & 0x1800L) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.ivBtnCloseBlack, viewModelCancleTxnsCommand, (boolean)false);
            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.ivCloseBlack, viewModelCancleTxnsCommand, (boolean)false);
            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.ivCloseBlackD70, viewModelCancleTxnsCommand, (boolean)false);
        }
        if ((dirtyFlags & 0x1828L) != 0) {
            // api target 1

            this.linCardbrand.setVisibility(viewModelShowResultStatusBooleanTrueViewModelIsD70ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1802L) != 0) {
            // api target 1

            this.llPaymentGuideD35.setVisibility(viewModelIsPayMentGuideD35ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1801L) != 0) {
            // api target 1

            this.llPaymentGuideD50.setVisibility(viewModelIsPayMentGuideD50ViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1820L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelShowResultStatusViewGONEViewVISIBLE);
        }
        if ((dirtyFlags & 0x1840L) != 0) {
            // api target 1

            this.mboundView13.setVisibility(viewModelCardsInsertedStatusViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1880L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView14, viewModelAmountGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView19, viewModelAmountGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, viewModelAmountGet);
        }
        if ((dirtyFlags & 0x1804L) != 0) {
            // api target 1

            this.mboundView18.setVisibility(viewModelShowPinpadViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1810L) != 0) {
            // api target 1

            this.mboundView20.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
            this.mboundView21.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1900L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView22, viewModelLoadingTextGet);
        }
        if ((dirtyFlags & 0x1c00L) != 0) {
            // api target 1

            this.txtWaitInsertTapCard.setVisibility(viewModelIsShowOtherCardTxtViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isPayMentGuideD50
        flag 1 (0x2L): viewModel.isPayMentGuideD35
        flag 2 (0x3L): viewModel.showPinpad
        flag 3 (0x4L): viewModel.isD70
        flag 4 (0x5L): viewModel.isLoading
        flag 5 (0x6L): viewModel.showResultStatus
        flag 6 (0x7L): viewModel.cardsInsertedStatus
        flag 7 (0x8L): viewModel.amount
        flag 8 (0x9L): viewModel.loadingText
        flag 9 (0xaL): viewModel.isShowAnimationView
        flag 10 (0xbL): viewModel.isShowOtherCardTxt
        flag 11 (0xcL): viewModel
        flag 12 (0xdL): null
        flag 13 (0xeL): viewModel.isPayMentGuideD35.get() ? View.GONE : View.VISIBLE
        flag 14 (0xfL): viewModel.isPayMentGuideD35.get() ? View.GONE : View.VISIBLE
        flag 15 (0x10L): viewModel.showPinpad.get() ? View.VISIBLE : View.GONE
        flag 16 (0x11L): viewModel.showPinpad.get() ? View.VISIBLE : View.GONE
        flag 17 (0x12L): viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 18 (0x13L): viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 19 (0x14L): viewModel.isD70.get() ? 0 : @android:id/iv_close_black
        flag 20 (0x15L): viewModel.isD70.get() ? 0 : @android:id/iv_close_black
        flag 21 (0x16L): viewModel.showResultStatus.get() ? true : viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 22 (0x17L): viewModel.showResultStatus.get() ? true : viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get()) ? View.VISIBLE : View.GONE
        flag 25 (0x1aL): viewModel.cardsInsertedStatus.get() ? View.VISIBLE : View.GONE
        flag 26 (0x1bL): viewModel.cardsInsertedStatus.get() ? View.VISIBLE : View.GONE
        flag 27 (0x1cL): viewModel.isShowOtherCardTxt.get() ? View.VISIBLE : View.GONE
        flag 28 (0x1dL): viewModel.isShowOtherCardTxt.get() ? View.VISIBLE : View.GONE
        flag 29 (0x1eL): viewModel.isD70.get() ? View.VISIBLE : View.GONE
        flag 30 (0x1fL): viewModel.isD70.get() ? View.VISIBLE : View.GONE
        flag 31 (0x20L): viewModel.isShowAnimationView.get() ? View.GONE : View.VISIBLE
        flag 32 (0x21L): viewModel.isShowAnimationView.get() ? View.GONE : View.VISIBLE
        flag 33 (0x22L): viewModel.showResultStatus.get() ? true : viewModel.isD70.get()
        flag 34 (0x23L): viewModel.showResultStatus.get() ? true : viewModel.isD70.get()
        flag 35 (0x24L): viewModel.showResultStatus.get() ? View.GONE : View.VISIBLE
        flag 36 (0x25L): viewModel.showResultStatus.get() ? View.GONE : View.VISIBLE
        flag 37 (0x26L): viewModel.isPayMentGuideD50.get() ? View.GONE : View.VISIBLE
        flag 38 (0x27L): viewModel.isPayMentGuideD50.get() ? View.GONE : View.VISIBLE
    flag mapping end*/
    //end
}