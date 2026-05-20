package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentTransactionBindingImpl extends FragmentTransactionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.search_container, 5);
        sViewsWithIds.put(R.id.search_edit_text, 6);
        sViewsWithIds.put(R.id.filter_button, 7);
        sViewsWithIds.put(R.id.payments_count, 8);
        sViewsWithIds.put(R.id.payments_amount, 9);
        sViewsWithIds.put(R.id.view_all_text, 10);
        sViewsWithIds.put(R.id.swipe_refresh_layout, 11);
        sViewsWithIds.put(R.id.payments_recycler, 12);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentTransactionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentTransactionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.ImageButton) bindings[7]
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[12]
            , (com.google.android.material.textfield.TextInputLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatEditText) bindings[6]
            , (androidx.swiperefreshlayout.widget.SwipeRefreshLayout) bindings[11]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ProgressBar) bindings[4]
            , (android.widget.TextView) bindings[10]
            );
        this.llTransactionHeader.setTag(null);
        this.llTransactionViewAll.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.transactionIvEmpty.setTag(null);
        this.transactionPb.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setViewModel((com.neokred.pos.ui.transaction.TransactionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.transaction.TransactionViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsEmpty((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsTransactionViewAll((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelIsTransactionHeader((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelIsLoading((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsEmpty(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsEmpty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsTransactionViewAll(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsTransactionViewAll, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsTransactionHeader(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsTransactionHeader, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        int viewModelIsTransactionHeaderViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsTransactionHeaderGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsEmpty = null;
        java.lang.Boolean viewModelIsEmptyGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsTransactionViewAll = null;
        java.lang.Boolean viewModelIsLoadingGet = null;
        int viewModelIsTransactionViewAllViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsTransactionHeader = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionHeaderGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionViewAllGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsLoading = null;
        com.neokred.pos.ui.transaction.TransactionViewModel viewModel = mViewModel;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGet = false;
        int viewModelIsEmptyViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsTransactionViewAllGet = null;

        if ((dirtyFlags & 0x3fL) != 0) {


            if ((dirtyFlags & 0x31L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isEmpty
                        viewModelIsEmpty = viewModel.isEmpty;
                    }
                    updateRegistration(0, viewModelIsEmpty);


                    if (viewModelIsEmpty != null) {
                        // read viewModel.isEmpty.get()
                        viewModelIsEmptyGet = viewModelIsEmpty.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsEmptyGet);
                if((dirtyFlags & 0x31L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGet) {
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.get()) ? View.VISIBLE : View.GONE
                    viewModelIsEmptyViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsEmptyGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x32L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isTransactionViewAll
                        viewModelIsTransactionViewAll = viewModel.isTransactionViewAll;
                    }
                    updateRegistration(1, viewModelIsTransactionViewAll);


                    if (viewModelIsTransactionViewAll != null) {
                        // read viewModel.isTransactionViewAll.get()
                        viewModelIsTransactionViewAllGet = viewModelIsTransactionViewAll.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionViewAll.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionViewAllGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsTransactionViewAllGet);
                if((dirtyFlags & 0x32L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionViewAllGet) {
                            dirtyFlags |= 0x200L;
                    }
                    else {
                            dirtyFlags |= 0x100L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionViewAll.get()) ? View.VISIBLE : View.GONE
                    viewModelIsTransactionViewAllViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionViewAllGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x34L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isTransactionHeader
                        viewModelIsTransactionHeader = viewModel.isTransactionHeader;
                    }
                    updateRegistration(2, viewModelIsTransactionHeader);


                    if (viewModelIsTransactionHeader != null) {
                        // read viewModel.isTransactionHeader.get()
                        viewModelIsTransactionHeaderGet = viewModelIsTransactionHeader.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionHeader.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionHeaderGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsTransactionHeaderGet);
                if((dirtyFlags & 0x34L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionHeaderGet) {
                            dirtyFlags |= 0x80L;
                    }
                    else {
                            dirtyFlags |= 0x40L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionHeader.get()) ? View.VISIBLE : View.GONE
                    viewModelIsTransactionHeaderViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsTransactionHeaderGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x38L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading;
                    }
                    updateRegistration(3, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.get()
                        viewModelIsLoadingGet = viewModelIsLoading.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsLoadingGet);
                if((dirtyFlags & 0x38L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet) {
                            dirtyFlags |= 0x800L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get()) ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsLoadingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x34L) != 0) {
            // api target 1

            this.llTransactionHeader.setVisibility(viewModelIsTransactionHeaderViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x32L) != 0) {
            // api target 1

            this.llTransactionViewAll.setVisibility(viewModelIsTransactionViewAllViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x31L) != 0) {
            // api target 1

            this.transactionIvEmpty.setVisibility(viewModelIsEmptyViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x38L) != 0) {
            // api target 1

            this.transactionPb.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isEmpty
        flag 1 (0x2L): viewModel.isTransactionViewAll
        flag 2 (0x3L): viewModel.isTransactionHeader
        flag 3 (0x4L): viewModel.isLoading
        flag 4 (0x5L): viewModel
        flag 5 (0x6L): null
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionHeader.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionHeader.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionViewAll.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isTransactionViewAll.get()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get()) ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isLoading.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isEmpty.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}