package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityTransactionFilterBindingImpl extends ActivityTransactionFilterBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 7);
        sViewsWithIds.put(R.id.rgDateFilter, 8);
        sViewsWithIds.put(R.id.rbToday, 9);
        sViewsWithIds.put(R.id.rb3days, 10);
        sViewsWithIds.put(R.id.rbAll, 11);
        sViewsWithIds.put(R.id.rgTypeFilter, 12);
        sViewsWithIds.put(R.id.rbPaid, 13);
        sViewsWithIds.put(R.id.rbVoided, 14);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityTransactionFilterBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 15, sIncludes, sViewsWithIds));
    }
    private ActivityTransactionFilterBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.Button) bindings[6]
            , (android.widget.RadioButton) bindings[10]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.RadioButton) bindings[9]
            , (android.widget.RadioButton) bindings[14]
            , (android.widget.RadioGroup) bindings[8]
            , (android.widget.RadioGroup) bindings[12]
            , (androidx.appcompat.widget.Toolbar) bindings[7]
            , (android.widget.TextView) bindings[3]
            );
        this.btnDone.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.tvDone.setTag(null);
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
            setViewModel((com.neokred.pos.ui.transaction.filter.TransactionFilterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.transaction.filter.TransactionFilterViewModel ViewModel) {
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
        androidx.databinding.ObservableBoolean viewModelIsD70 = null;
        boolean viewModelIsD70Get = false;
        int viewModelIsD70ViewGONEViewVISIBLE = 0;
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelDoneCommand = null;
        com.neokred.pos.ui.transaction.filter.TransactionFilterViewModel viewModel = mViewModel;
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
                }
                else {
                        dirtyFlags |= 0x8L;
                        dirtyFlags |= 0x20L;
                }
            }


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

            this.btnDone.setVisibility(viewModelIsD70ViewGONEViewVISIBLE);
            this.mboundView1.setVisibility(viewModelIsD70ViewGONEViewVISIBLE);
            this.mboundView2.setVisibility(viewModelIsD70ViewVISIBLEViewGONE);
            this.mboundView4.setVisibility(viewModelIsD70ViewVISIBLEViewGONE);
            this.mboundView5.setVisibility(viewModelIsD70ViewGONEViewVISIBLE);
            this.tvDone.setVisibility(viewModelIsD70ViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.btnDone, viewModelDoneCommand, (boolean)false);
            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.tvDone, viewModelDoneCommand, (boolean)false);
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
        flag 3 (0x4L): viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 4 (0x5L): viewModel.isD70.get() ? View.GONE : View.VISIBLE
        flag 5 (0x6L): viewModel.isD70.get() ? View.VISIBLE : View.GONE
        flag 6 (0x7L): viewModel.isD70.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}