package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityScanBindingImpl extends ActivityScanBinding  {

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
    @NonNull
    private final androidx.cardview.widget.CardView mboundView2;
    @NonNull
    private final android.widget.TextView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityScanBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ActivityScanBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageButton) bindings[1]
            );
        this.closeButton.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.cardview.widget.CardView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setViewModel((com.neokred.pos.ui.scan.ScanViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.scan.ScanViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelScanResult((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelHasResult((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelScanResult(androidx.databinding.ObservableField<java.lang.String> ViewModelScanResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelHasResult(androidx.databinding.ObservableBoolean ViewModelHasResult, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        boolean viewModelHasResultGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelScanResult = null;
        int viewModelHasResultViewVISIBLEViewGONE = 0;
        me.goldze.mvvmhabit.binding.command.BindingCommand viewModelCloseButton = null;
        java.lang.String viewModelScanResultGet = null;
        com.neokred.pos.ui.scan.ScanViewModel viewModel = mViewModel;
        androidx.databinding.ObservableBoolean viewModelHasResult = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.scanResult
                        viewModelScanResult = viewModel.scanResult;
                    }
                    updateRegistration(0, viewModelScanResult);


                    if (viewModelScanResult != null) {
                        // read viewModel.scanResult.get()
                        viewModelScanResultGet = viewModelScanResult.get();
                    }
            }
            if ((dirtyFlags & 0xcL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.closeButton
                        viewModelCloseButton = viewModel.closeButton;
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.hasResult
                        viewModelHasResult = viewModel.hasResult;
                    }
                    updateRegistration(1, viewModelHasResult);


                    if (viewModelHasResult != null) {
                        // read viewModel.hasResult.get()
                        viewModelHasResultGet = viewModelHasResult.get();
                    }
                if((dirtyFlags & 0xeL) != 0) {
                    if(viewModelHasResultGet) {
                            dirtyFlags |= 0x20L;
                    }
                    else {
                            dirtyFlags |= 0x10L;
                    }
                }


                    // read viewModel.hasResult.get() ? View.VISIBLE : View.GONE
                    viewModelHasResultViewVISIBLEViewGONE = ((viewModelHasResultGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            me.goldze.mvvmhabit.binding.viewadapter.view.ViewAdapter.onClickCommand(this.closeButton, viewModelCloseButton, (boolean)false);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            this.mboundView2.setVisibility(viewModelHasResultViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelScanResultGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.scanResult
        flag 1 (0x2L): viewModel.hasResult
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
        flag 4 (0x5L): viewModel.hasResult.get() ? View.VISIBLE : View.GONE
        flag 5 (0x6L): viewModel.hasResult.get() ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}