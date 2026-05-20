package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityReissueReceiptBindingImpl extends ActivityReissueReceiptBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 6);
        sViewsWithIds.put(R.id.receiptTitleText, 7);
        sViewsWithIds.put(R.id.amountText, 8);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.Button mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityReissueReceiptBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private ActivityReissueReceiptBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[8]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.Button) bindings[5]
            , (android.widget.Button) bindings[4]
            , (android.widget.Button) bindings[1]
            , (android.widget.TextView) bindings[7]
            , (androidx.appcompat.widget.Toolbar) bindings[6]
            );
        this.buttonsHorizontalContainer.setTag(null);
        this.doneButton.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.Button) bindings[3];
        this.mboundView3.setTag(null);
        this.moreOptionsButton.setTag(null);
        this.printButton.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((com.neokred.pos.ui.transaction.reissue.TransactionReissueReceipViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.transaction.reissue.TransactionReissueReceipViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsD70((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsD70(androidx.databinding.ObservableBoolean ViewModelIsD70, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        android.graphics.drawable.Drawable viewModelIsD70PrintButtonAndroidDrawablePrintButtonRectanglePrintButtonAndroidDrawablePrintButton = null;
        androidx.databinding.ObservableBoolean viewModelIsD70 = null;
        boolean viewModelIsD70Get = false;
        int viewModelIsD70ViewGONEViewVISIBLE = 0;
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelDoneCommand = null;
        com.neokred.pos.ui.transaction.reissue.TransactionReissueReceipViewModel viewModel = mViewModel;
        int viewModelIsD70ViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.isD70
                    viewModelIsD70 = viewModel.isD70;
                }
                updateRegistration(0, viewModelIsD70);


                if (viewModelIsD70 != null) {
                    // read viewModel.isD70.get()
                    viewModelIsD70Get = viewModelIsD70.get();
                }
            if((dirtyFlags & 0x7L) != 0) {
                if(viewModelIsD70Get) {
                        dirtyFlags |= 0x10L;
                        dirtyFlags |= 0x40L;
                        dirtyFlags |= 0x100L;
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                        dirtyFlags |= 0x80L;
                }
            }


                // read viewModel.isD70.get() ? @android:drawable/print_button_rectangle : @android:drawable/print_button
                viewModelIsD70PrintButtonAndroidDrawablePrintButtonRectanglePrintButtonAndroidDrawablePrintButton = ((viewModelIsD70Get) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(printButton.getContext(), R.drawable.print_button_rectangle)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(printButton.getContext(), R.drawable.print_button)));
                // read viewModel.isD70.get() ? View.GONE : View.VISIBLE
                viewModelIsD70ViewGONEViewVISIBLE = ((viewModelIsD70Get) ? (android.view.View.GONE) : (android.view.View.VISIBLE));
                // read viewModel.isD70.get() ? View.VISIBLE : View.GONE
                viewModelIsD70ViewVISIBLEViewGONE = ((viewModelIsD70Get) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            if ((dirtyFlags & 0x6L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.doneCommand
                        viewModelDoneCommand = viewModel.doneCommand;
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            this.buttonsHorizontalContainer.setVisibility(viewModelIsD70ViewVISIBLEViewGONE);
            this.doneButton.setVisibility(viewModelIsD70ViewGONEViewVISIBLE);
            this.moreOptionsButton.setVisibility(viewModelIsD70ViewGONEViewVISIBLE);
            androidx.databinding.adapters.ViewBindingAdapter.setBackground(this.printButton, viewModelIsD70PrintButtonAndroidDrawablePrintButtonRectanglePrintButtonAndroidDrawablePrintButton);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.doneButton, viewModelDoneCommand, (boolean)false);
            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.mboundView3, viewModelDoneCommand, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isD70
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
        flag 3 (0x4L): viewModel.isD70.get() ? @android:drawable/print_button_rectangle : @android:drawable/print_button
        flag 4 (0x5L): viewModel.isD70.get() ? @android:drawable/print_button_rectangle : @android:drawable/print_button
        flag 5 (0x6L): viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 6 (0x7L): viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 7 (0x8L): viewModel.isD70.get() ? View.VISIBLE : View.GONE
        flag 8 (0x9L): viewModel.isD70.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}