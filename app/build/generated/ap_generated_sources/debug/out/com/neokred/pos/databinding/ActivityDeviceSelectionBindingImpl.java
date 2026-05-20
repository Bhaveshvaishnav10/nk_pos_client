package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityDeviceSelectionBindingImpl extends ActivityDeviceSelectionBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 4);
        sViewsWithIds.put(R.id.iv_bluetooth_selected, 5);
        sViewsWithIds.put(R.id.tv_bluetooth_selected_name, 6);
        sViewsWithIds.put(R.id.tv_bluetooth_address, 7);
        sViewsWithIds.put(R.id.recycler_bluetooth_devices, 8);
        sViewsWithIds.put(R.id.progress_bar, 9);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityDeviceSelectionBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private ActivityDeviceSelectionBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[5]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.ProgressBar) bindings[9]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[4]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            );
        this.llDeviceSelection.setTag(null);
        this.loadingLayout.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
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
            setViewModel((com.neokred.pos.ui.setting.device_selection.DeviceSelectionViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.setting.device_selection.DeviceSelectionViewModel ViewModel) {
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
                return onChangeViewModelIsConnecting((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelIsShowDeviceSelectionList((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 2 :
                return onChangeViewModelIsShowDeviceSelectedView((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsConnecting(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsConnecting, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowDeviceSelectionList(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowDeviceSelectionList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowDeviceSelectedView(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowDeviceSelectedView, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsConnecting = null;
        int viewModelIsShowDeviceSelectedViewViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectionListGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectedViewGet = false;
        java.lang.Boolean viewModelIsShowDeviceSelectionListGet = null;
        int viewModelIsShowDeviceSelectionListViewVISIBLEViewGONE = 0;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsConnectingGet = false;
        java.lang.Boolean viewModelIsShowDeviceSelectedViewGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowDeviceSelectionList = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowDeviceSelectedView = null;
        java.lang.Boolean viewModelIsConnectingGet = null;
        com.neokred.pos.ui.setting.device_selection.DeviceSelectionViewModel viewModel = mViewModel;
        int viewModelIsConnectingViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x1fL) != 0) {


            if ((dirtyFlags & 0x19L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isConnecting
                        viewModelIsConnecting = viewModel.isConnecting;
                    }
                    updateRegistration(0, viewModelIsConnecting);


                    if (viewModelIsConnecting != null) {
                        // read viewModel.isConnecting.get()
                        viewModelIsConnectingGet = viewModelIsConnecting.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isConnecting.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsConnectingGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsConnectingGet);
                if((dirtyFlags & 0x19L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsConnectingGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isConnecting.get()) ? View.VISIBLE : View.GONE
                    viewModelIsConnectingViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsConnectingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1aL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowDeviceSelectionList
                        viewModelIsShowDeviceSelectionList = viewModel.isShowDeviceSelectionList;
                    }
                    updateRegistration(1, viewModelIsShowDeviceSelectionList);


                    if (viewModelIsShowDeviceSelectionList != null) {
                        // read viewModel.isShowDeviceSelectionList.get()
                        viewModelIsShowDeviceSelectionListGet = viewModelIsShowDeviceSelectionList.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectionList.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectionListGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowDeviceSelectionListGet);
                if((dirtyFlags & 0x1aL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectionListGet) {
                            dirtyFlags |= 0x100L;
                    }
                    else {
                            dirtyFlags |= 0x80L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectionList.get()) ? View.VISIBLE : View.GONE
                    viewModelIsShowDeviceSelectionListViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectionListGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x1cL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowDeviceSelectedView
                        viewModelIsShowDeviceSelectedView = viewModel.isShowDeviceSelectedView;
                    }
                    updateRegistration(2, viewModelIsShowDeviceSelectedView);


                    if (viewModelIsShowDeviceSelectedView != null) {
                        // read viewModel.isShowDeviceSelectedView.get()
                        viewModelIsShowDeviceSelectedViewGet = viewModelIsShowDeviceSelectedView.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectedView.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectedViewGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowDeviceSelectedViewGet);
                if((dirtyFlags & 0x1cL) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectedViewGet) {
                            dirtyFlags |= 0x40L;
                    }
                    else {
                            dirtyFlags |= 0x20L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectedView.get()) ? View.VISIBLE : View.GONE
                    viewModelIsShowDeviceSelectedViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowDeviceSelectedViewGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x1aL) != 0) {
            // api target 1

            this.llDeviceSelection.setVisibility(viewModelIsShowDeviceSelectionListViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x19L) != 0) {
            // api target 1

            this.loadingLayout.setVisibility(viewModelIsConnectingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x1cL) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelIsShowDeviceSelectedViewViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isConnecting
        flag 1 (0x2L): viewModel.isShowDeviceSelectionList
        flag 2 (0x3L): viewModel.isShowDeviceSelectedView
        flag 3 (0x4L): viewModel
        flag 4 (0x5L): null
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectedView.get()) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectedView.get()) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectionList.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowDeviceSelectionList.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isConnecting.get()) ? View.VISIBLE : View.GONE
        flag 10 (0xbL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isConnecting.get()) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}