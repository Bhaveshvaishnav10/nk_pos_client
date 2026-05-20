package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding implements com.neokred.pos.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.txt_title, 15);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    @Nullable
    private final android.view.View.OnClickListener mCallback13;
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 16, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.Button) bindings[12]
            , (android.widget.Button) bindings[11]
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.Button) bindings[8]
            , (android.widget.Button) bindings[9]
            , (android.widget.Button) bindings[10]
            , (android.widget.ImageButton) bindings[13]
            , (android.widget.Button) bindings[14]
            , (com.neokred.pos.view.AutoShrinkEditText) bindings[1]
            , (android.widget.TextView) bindings[15]
            );
        this.btn0.setTag(null);
        this.btn00.setTag(null);
        this.btn1.setTag(null);
        this.btn2.setTag(null);
        this.btn3.setTag(null);
        this.btn4.setTag(null);
        this.btn5.setTag(null);
        this.btn6.setTag(null);
        this.btn7.setTag(null);
        this.btn8.setTag(null);
        this.btn9.setTag(null);
        this.btnBackspace.setTag(null);
        this.btnNext.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.txtAmount.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.neokred.pos.generated.callback.OnClickListener(this, 10);
        mCallback15 = new com.neokred.pos.generated.callback.OnClickListener(this, 8);
        mCallback13 = new com.neokred.pos.generated.callback.OnClickListener(this, 6);
        mCallback11 = new com.neokred.pos.generated.callback.OnClickListener(this, 4);
        mCallback19 = new com.neokred.pos.generated.callback.OnClickListener(this, 12);
        mCallback8 = new com.neokred.pos.generated.callback.OnClickListener(this, 1);
        mCallback16 = new com.neokred.pos.generated.callback.OnClickListener(this, 9);
        mCallback14 = new com.neokred.pos.generated.callback.OnClickListener(this, 7);
        mCallback12 = new com.neokred.pos.generated.callback.OnClickListener(this, 5);
        mCallback10 = new com.neokred.pos.generated.callback.OnClickListener(this, 3);
        mCallback9 = new com.neokred.pos.generated.callback.OnClickListener(this, 2);
        mCallback18 = new com.neokred.pos.generated.callback.OnClickListener(this, 11);
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
            setViewModel((com.neokred.pos.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.home.HomeViewModel ViewModel) {
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
                return onChangeViewModelAmount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelAmountValid((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelIsD70((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelAmount(androidx.databinding.ObservableField<java.lang.String> ViewModelAmount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelAmountValid(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelAmountValid, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsD70(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsD70, int fieldId) {
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
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelAmountValidGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelAmount = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelAmountValid = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsD70 = null;
        java.lang.Boolean viewModelIsD70Get = null;
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelOnConfirmClickCommand = null;
        java.lang.Boolean viewModelAmountValidGet = null;
        java.lang.String viewModelAmountGet = null;
        com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.amount
                        viewModelAmount = viewModel.amount;
                    }
                    updateRegistration(0, viewModelAmount);


                    if (viewModelAmount != null) {
                        // read viewModel.amount.get()
                        viewModelAmountGet = viewModelAmount.get();
                    }
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.amountValid
                        viewModelAmountValid = viewModel.amountValid;
                    }
                    updateRegistration(1, viewModelAmountValid);


                    if (viewModelAmountValid != null) {
                        // read viewModel.amountValid.get()
                        viewModelAmountValidGet = viewModelAmountValid.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.amountValid.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelAmountValidGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelAmountValidGet);
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isD70
                        viewModelIsD70 = viewModel.isD70;
                    }
                    updateRegistration(2, viewModelIsD70);


                    if (viewModelIsD70 != null) {
                        // read viewModel.isD70.get()
                        viewModelIsD70Get = viewModelIsD70.get();
                    }
            }
            if ((dirtyFlags & 0x18L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.onConfirmClickCommand
                        viewModelOnConfirmClickCommand = viewModel.onConfirmClickCommand;
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x10L) != 0) {
            // api target 1

            this.btn0.setOnClickListener(mCallback18);
            this.btn00.setOnClickListener(mCallback17);
            this.btn1.setOnClickListener(mCallback8);
            this.btn2.setOnClickListener(mCallback9);
            this.btn3.setOnClickListener(mCallback10);
            this.btn4.setOnClickListener(mCallback11);
            this.btn5.setOnClickListener(mCallback12);
            this.btn6.setOnClickListener(mCallback13);
            this.btn7.setOnClickListener(mCallback14);
            this.btn8.setOnClickListener(mCallback15);
            this.btn9.setOnClickListener(mCallback16);
            this.btnBackspace.setOnClickListener(mCallback19);
        }
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.btnNext.setEnabled(androidxDatabindingViewDataBindingSafeUnboxViewModelAmountValidGet);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            com.neokred.pos.view.BindingAdapters.setDynamicBackground(this.btnNext, viewModelIsD70Get);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.btnNext, viewModelOnConfirmClickCommand, (boolean)false);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.txtAmount, viewModelAmountGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 10: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("00");
                }
                break;
            }
            case 8: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("8");
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("6");
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("4");
                }
                break;
            }
            case 12: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.onClearClickCommand();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("1");
                }
                break;
            }
            case 9: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("9");
                }
                break;
            }
            case 7: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("7");
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("5");
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("3");
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("2");
                }
                break;
            }
            case 11: {
                // localize variables for thread safety
                // viewModel
                com.neokred.pos.ui.home.HomeViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {



                    viewModel.onNumberClick("0");
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.amount
        flag 1 (0x2L): viewModel.amountValid
        flag 2 (0x3L): viewModel.isD70
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}