package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentConnectionSettingsBindingImpl extends FragmentConnectionSettingsBinding implements com.neokred.pos.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_app_version, 16);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final android.widget.TextView mboundView13;
    @NonNull
    private final android.widget.LinearLayout mboundView14;
    @NonNull
    private final android.widget.TextView mboundView15;
    @NonNull
    private final android.widget.TextView mboundView3;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentConnectionSettingsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private FragmentConnectionSettingsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (android.widget.LinearLayout) bindings[1]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[4]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.TextView) bindings[16]
            );
        this.itemBluetooth.setTag(null);
        this.itemUSB.setTag(null);
        this.itemUart.setTag(null);
        this.ivBluetooth.setTag(null);
        this.ivUart.setTag(null);
        this.ivUsb.setTag(null);
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.LinearLayout) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView13 = (android.widget.TextView) bindings[13];
        this.mboundView13.setTag(null);
        this.mboundView14 = (android.widget.LinearLayout) bindings[14];
        this.mboundView14.setTag(null);
        this.mboundView15 = (android.widget.TextView) bindings[15];
        this.mboundView15.setTag(null);
        this.mboundView3 = (android.widget.TextView) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.neokred.pos.generated.callback.OnClickListener(this, 6);
        mCallback2 = new com.neokred.pos.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.neokred.pos.generated.callback.OnClickListener(this, 5);
        mCallback1 = new com.neokred.pos.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.neokred.pos.generated.callback.OnClickListener(this, 4);
        mCallback3 = new com.neokred.pos.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x800L;
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
            setViewModel((com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelIsShowBluetoothTextView((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 1 :
                return onChangeViewModelCardMode((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeViewModelIsShowUSBImageView((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelDeviceConnected((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeViewModelTransactionType((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeViewModelIsShowUartTextView((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 6 :
                return onChangeViewModelIsShowUsbTextView((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 7 :
                return onChangeViewModelIsShowBluetoothImageView((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 8 :
                return onChangeViewModelIsShowUartImageView((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 9 :
                return onChangeViewModelCurrencyCode((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelIsShowBluetoothTextView(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowBluetoothTextView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCardMode(androidx.databinding.ObservableField<java.lang.String> ViewModelCardMode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowUSBImageView(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowUSBImageView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelDeviceConnected(androidx.databinding.ObservableBoolean ViewModelDeviceConnected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTransactionType(androidx.databinding.ObservableField<java.lang.String> ViewModelTransactionType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowUartTextView(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowUartTextView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowUsbTextView(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowUsbTextView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowBluetoothImageView(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowBluetoothImageView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsShowUartImageView(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsShowUartImageView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCurrencyCode(androidx.databinding.ObservableField<java.lang.String> ViewModelCurrencyCode, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String viewModelDeviceConnectedMboundView9AndroidStringStrConnectedMboundView9AndroidStringStrDisconnect = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartTextViewGet = false;
        java.lang.Boolean viewModelIsShowUSBImageViewGet = null;
        java.lang.String viewModelDeviceConnectedMboundView6AndroidStringStrConnectedMboundView6AndroidStringStrDisconnect = null;
        java.lang.String viewModelCurrencyCodeGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothImageViewGet = false;
        int viewModelIsShowBluetoothTextViewViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowBluetoothTextView = null;
        java.lang.Boolean viewModelIsShowBluetoothImageViewGet = null;
        java.lang.String viewModelCardModeGet = null;
        int viewModelDeviceConnectedMboundView6AndroidColorConnectedMboundView6AndroidColorDarkerGray = 0;
        androidx.databinding.ObservableField<java.lang.String> viewModelCardMode = null;
        java.lang.Boolean viewModelIsShowBluetoothTextViewGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartImageViewGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUSBImageViewGet = false;
        java.lang.String viewModelDeviceConnectedMboundView3AndroidStringStrSelectedMboundView3AndroidStringStrDisconnect = null;
        int viewModelIsShowUartTextViewViewVISIBLEViewGONE = 0;
        java.lang.Boolean viewModelIsShowUartTextViewGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowUSBImageView = null;
        int viewModelDeviceConnectedMboundView9AndroidColorConnectedMboundView9AndroidColorDarkerGray = 0;
        int viewModelDeviceConnectedMboundView3AndroidColorConnectedMboundView3AndroidColorDarkerGray = 0;
        androidx.databinding.ObservableBoolean viewModelDeviceConnected = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelTransactionType = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowUartTextView = null;
        int viewModelIsShowUartImageViewViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean viewModelIsShowUsbTextViewGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothTextViewGet = false;
        int viewModelIsShowUSBImageViewViewVISIBLEViewINVISIBLE = 0;
        int viewModelIsShowUsbTextViewViewVISIBLEViewGONE = 0;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowUsbTextView = null;
        java.lang.String viewModelTransactionTypeGet = null;
        boolean viewModelDeviceConnectedGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUsbTextViewGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowBluetoothImageView = null;
        java.lang.Boolean viewModelIsShowUartImageViewGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsShowUartImageView = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelCurrencyCode = null;
        com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel viewModel = mViewModel;
        int viewModelIsShowBluetoothImageViewViewVISIBLEViewINVISIBLE = 0;

        if ((dirtyFlags & 0xfffL) != 0) {


            if ((dirtyFlags & 0xc01L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowBluetoothTextView
                        viewModelIsShowBluetoothTextView = viewModel.isShowBluetoothTextView;
                    }
                    updateRegistration(0, viewModelIsShowBluetoothTextView);


                    if (viewModelIsShowBluetoothTextView != null) {
                        // read viewModel.isShowBluetoothTextView.get()
                        viewModelIsShowBluetoothTextViewGet = viewModelIsShowBluetoothTextView.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothTextView.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothTextViewGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowBluetoothTextViewGet);
                if((dirtyFlags & 0xc01L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothTextViewGet) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothTextView.get()) ? View.VISIBLE : View.GONE
                    viewModelIsShowBluetoothTextViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothTextViewGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc02L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.cardMode
                        viewModelCardMode = viewModel.cardMode;
                    }
                    updateRegistration(1, viewModelCardMode);


                    if (viewModelCardMode != null) {
                        // read viewModel.cardMode.get()
                        viewModelCardModeGet = viewModelCardMode.get();
                    }
            }
            if ((dirtyFlags & 0xc04L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowUSBImageView
                        viewModelIsShowUSBImageView = viewModel.isShowUSBImageView;
                    }
                    updateRegistration(2, viewModelIsShowUSBImageView);


                    if (viewModelIsShowUSBImageView != null) {
                        // read viewModel.isShowUSBImageView.get()
                        viewModelIsShowUSBImageViewGet = viewModelIsShowUSBImageView.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUSBImageView.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUSBImageViewGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowUSBImageViewGet);
                if((dirtyFlags & 0xc04L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUSBImageViewGet) {
                            dirtyFlags |= 0x80000000L;
                    }
                    else {
                            dirtyFlags |= 0x40000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUSBImageView.get()) ? View.VISIBLE : View.INVISIBLE
                    viewModelIsShowUSBImageViewViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUSBImageViewGet) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0xc08L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.deviceConnected
                        viewModelDeviceConnected = viewModel.deviceConnected;
                    }
                    updateRegistration(3, viewModelDeviceConnected);


                    if (viewModelDeviceConnected != null) {
                        // read viewModel.deviceConnected.get()
                        viewModelDeviceConnectedGet = viewModelDeviceConnected.get();
                    }
                if((dirtyFlags & 0xc08L) != 0) {
                    if(viewModelDeviceConnectedGet) {
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x200000L;
                            dirtyFlags |= 0x2000000L;
                            dirtyFlags |= 0x8000000L;
                    }
                    else {
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x1000000L;
                            dirtyFlags |= 0x4000000L;
                    }
                }


                    // read viewModel.deviceConnected.get() ? @android:string/str_connected : @android:string/str_disconnect
                    viewModelDeviceConnectedMboundView9AndroidStringStrConnectedMboundView9AndroidStringStrDisconnect = ((viewModelDeviceConnectedGet) ? (mboundView9.getResources().getString(R.string.str_connected)) : (mboundView9.getResources().getString(R.string.str_disconnect)));
                    // read viewModel.deviceConnected.get() ? @android:string/str_connected : @android:string/str_disconnect
                    viewModelDeviceConnectedMboundView6AndroidStringStrConnectedMboundView6AndroidStringStrDisconnect = ((viewModelDeviceConnectedGet) ? (mboundView6.getResources().getString(R.string.str_connected)) : (mboundView6.getResources().getString(R.string.str_disconnect)));
                    // read viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
                    viewModelDeviceConnectedMboundView6AndroidColorConnectedMboundView6AndroidColorDarkerGray = ((viewModelDeviceConnectedGet) ? (getColorFromResource(mboundView6, R.color.connected)) : (getColorFromResource(mboundView6, android.R.color.darker_gray)));
                    // read viewModel.deviceConnected.get() ? @android:string/str_selected : @android:string/str_disconnect
                    viewModelDeviceConnectedMboundView3AndroidStringStrSelectedMboundView3AndroidStringStrDisconnect = ((viewModelDeviceConnectedGet) ? (mboundView3.getResources().getString(R.string.str_selected)) : (mboundView3.getResources().getString(R.string.str_disconnect)));
                    // read viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
                    viewModelDeviceConnectedMboundView9AndroidColorConnectedMboundView9AndroidColorDarkerGray = ((viewModelDeviceConnectedGet) ? (getColorFromResource(mboundView9, R.color.connected)) : (getColorFromResource(mboundView9, android.R.color.darker_gray)));
                    // read viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
                    viewModelDeviceConnectedMboundView3AndroidColorConnectedMboundView3AndroidColorDarkerGray = ((viewModelDeviceConnectedGet) ? (getColorFromResource(mboundView3, R.color.connected)) : (getColorFromResource(mboundView3, android.R.color.darker_gray)));
            }
            if ((dirtyFlags & 0xc10L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.transactionType
                        viewModelTransactionType = viewModel.transactionType;
                    }
                    updateRegistration(4, viewModelTransactionType);


                    if (viewModelTransactionType != null) {
                        // read viewModel.transactionType.get()
                        viewModelTransactionTypeGet = viewModelTransactionType.get();
                    }
            }
            if ((dirtyFlags & 0xc20L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowUartTextView
                        viewModelIsShowUartTextView = viewModel.isShowUartTextView;
                    }
                    updateRegistration(5, viewModelIsShowUartTextView);


                    if (viewModelIsShowUartTextView != null) {
                        // read viewModel.isShowUartTextView.get()
                        viewModelIsShowUartTextViewGet = viewModelIsShowUartTextView.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartTextView.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartTextViewGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowUartTextViewGet);
                if((dirtyFlags & 0xc20L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartTextViewGet) {
                            dirtyFlags |= 0x800000L;
                    }
                    else {
                            dirtyFlags |= 0x400000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartTextView.get()) ? View.VISIBLE : View.GONE
                    viewModelIsShowUartTextViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartTextViewGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc40L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowUsbTextView
                        viewModelIsShowUsbTextView = viewModel.isShowUsbTextView;
                    }
                    updateRegistration(6, viewModelIsShowUsbTextView);


                    if (viewModelIsShowUsbTextView != null) {
                        // read viewModel.isShowUsbTextView.get()
                        viewModelIsShowUsbTextViewGet = viewModelIsShowUsbTextView.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUsbTextView.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUsbTextViewGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowUsbTextViewGet);
                if((dirtyFlags & 0xc40L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUsbTextViewGet) {
                            dirtyFlags |= 0x200000000L;
                    }
                    else {
                            dirtyFlags |= 0x100000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUsbTextView.get()) ? View.VISIBLE : View.GONE
                    viewModelIsShowUsbTextViewViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUsbTextViewGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0xc80L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowBluetoothImageView
                        viewModelIsShowBluetoothImageView = viewModel.isShowBluetoothImageView;
                    }
                    updateRegistration(7, viewModelIsShowBluetoothImageView);


                    if (viewModelIsShowBluetoothImageView != null) {
                        // read viewModel.isShowBluetoothImageView.get()
                        viewModelIsShowBluetoothImageViewGet = viewModelIsShowBluetoothImageView.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothImageView.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothImageViewGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowBluetoothImageViewGet);
                if((dirtyFlags & 0xc80L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothImageViewGet) {
                            dirtyFlags |= 0x800000000L;
                    }
                    else {
                            dirtyFlags |= 0x400000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothImageView.get()) ? View.VISIBLE : View.INVISIBLE
                    viewModelIsShowBluetoothImageViewViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowBluetoothImageViewGet) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0xd00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isShowUartImageView
                        viewModelIsShowUartImageView = viewModel.isShowUartImageView;
                    }
                    updateRegistration(8, viewModelIsShowUartImageView);


                    if (viewModelIsShowUartImageView != null) {
                        // read viewModel.isShowUartImageView.get()
                        viewModelIsShowUartImageViewGet = viewModelIsShowUartImageView.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartImageView.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartImageViewGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsShowUartImageViewGet);
                if((dirtyFlags & 0xd00L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartImageViewGet) {
                            dirtyFlags |= 0x20000000L;
                    }
                    else {
                            dirtyFlags |= 0x10000000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartImageView.get()) ? View.VISIBLE : View.INVISIBLE
                    viewModelIsShowUartImageViewViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsShowUartImageViewGet) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0xe00L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.currencyCode
                        viewModelCurrencyCode = viewModel.currencyCode;
                    }
                    updateRegistration(9, viewModelCurrencyCode);


                    if (viewModelCurrencyCode != null) {
                        // read viewModel.currencyCode.get()
                        viewModelCurrencyCodeGet = viewModelCurrencyCode.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x800L) != 0) {
            // api target 1

            this.itemBluetooth.setOnClickListener(mCallback1);
            this.itemUSB.setOnClickListener(mCallback3);
            this.itemUart.setOnClickListener(mCallback2);
            this.mboundView10.setOnClickListener(mCallback4);
            this.mboundView12.setOnClickListener(mCallback5);
            this.mboundView14.setOnClickListener(mCallback6);
        }
        if ((dirtyFlags & 0xc80L) != 0) {
            // api target 1

            this.ivBluetooth.setVisibility(viewModelIsShowBluetoothImageViewViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0xd00L) != 0) {
            // api target 1

            this.ivUart.setVisibility(viewModelIsShowUartImageViewViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0xc04L) != 0) {
            // api target 1

            this.ivUsb.setVisibility(viewModelIsShowUSBImageViewViewVISIBLEViewINVISIBLE);
        }
        if ((dirtyFlags & 0xc10L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, viewModelTransactionTypeGet);
        }
        if ((dirtyFlags & 0xc02L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView13, viewModelCardModeGet);
        }
        if ((dirtyFlags & 0xe00L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView15, viewModelCurrencyCodeGet);
        }
        if ((dirtyFlags & 0xc08L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView3, viewModelDeviceConnectedMboundView3AndroidStringStrSelectedMboundView3AndroidStringStrDisconnect);
            this.mboundView3.setTextColor(viewModelDeviceConnectedMboundView3AndroidColorConnectedMboundView3AndroidColorDarkerGray);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, viewModelDeviceConnectedMboundView6AndroidStringStrConnectedMboundView6AndroidStringStrDisconnect);
            this.mboundView6.setTextColor(viewModelDeviceConnectedMboundView6AndroidColorConnectedMboundView6AndroidColorDarkerGray);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, viewModelDeviceConnectedMboundView9AndroidStringStrConnectedMboundView9AndroidStringStrDisconnect);
            this.mboundView9.setTextColor(viewModelDeviceConnectedMboundView9AndroidColorConnectedMboundView9AndroidColorDarkerGray);
        }
        if ((dirtyFlags & 0xc01L) != 0) {
            // api target 1

            this.mboundView3.setVisibility(viewModelIsShowBluetoothTextViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc20L) != 0) {
            // api target 1

            this.mboundView6.setVisibility(viewModelIsShowUartTextViewViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xc40L) != 0) {
            // api target 1

            this.mboundView9.setVisibility(viewModelIsShowUsbTextViewViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 6: {
                // localize variables for thread safety
                // viewModel.currencyCodeCommand
                me.goldze.mvvmhabit.binding.command.BindingCommand viewModelCurrencyCodeCommand = null;
                // viewModel.currencyCodeCommand != null
                boolean viewModelCurrencyCodeCommandJavaLangObjectNull = false;
                // viewModel
                com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelCurrencyCodeCommand = viewModel.currencyCodeCommand;

                    viewModelCurrencyCodeCommandJavaLangObjectNull = (viewModelCurrencyCodeCommand) != (null);
                    if (viewModelCurrencyCodeCommandJavaLangObjectNull) {


                        viewModelCurrencyCodeCommand.execute();
                    }
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel.selectUartCommand
                me.goldze.mvvmhabit.binding.command.BindingCommand viewModelSelectUartCommand = null;
                // viewModel.selectUartCommand != null
                boolean viewModelSelectUartCommandJavaLangObjectNull = false;
                // viewModel
                com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelSelectUartCommand = viewModel.selectUartCommand;

                    viewModelSelectUartCommandJavaLangObjectNull = (viewModelSelectUartCommand) != (null);
                    if (viewModelSelectUartCommandJavaLangObjectNull) {


                        viewModelSelectUartCommand.execute();
                    }
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // viewModel.cardModeCommand
                me.goldze.mvvmhabit.binding.command.BindingCommand viewModelCardModeCommand = null;
                // viewModel.cardModeCommand != null
                boolean viewModelCardModeCommandJavaLangObjectNull = false;
                // viewModel
                com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelCardModeCommand = viewModel.cardModeCommand;

                    viewModelCardModeCommandJavaLangObjectNull = (viewModelCardModeCommand) != (null);
                    if (viewModelCardModeCommandJavaLangObjectNull) {


                        viewModelCardModeCommand.execute();
                    }
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel.selectBluetoothCommand
                me.goldze.mvvmhabit.binding.command.BindingCommand viewModelSelectBluetoothCommand = null;
                // viewModel
                com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;
                // viewModel.selectBluetoothCommand != null
                boolean viewModelSelectBluetoothCommandJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelSelectBluetoothCommand = viewModel.selectBluetoothCommand;

                    viewModelSelectBluetoothCommandJavaLangObjectNull = (viewModelSelectBluetoothCommand) != (null);
                    if (viewModelSelectBluetoothCommandJavaLangObjectNull) {


                        viewModelSelectBluetoothCommand.execute();
                    }
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // viewModel.transactionTypeCommand != null
                boolean viewModelTransactionTypeCommandJavaLangObjectNull = false;
                // viewModel.transactionTypeCommand
                me.goldze.mvvmhabit.binding.command.BindingCommand viewModelTransactionTypeCommand = null;
                // viewModel
                com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelTransactionTypeCommand = viewModel.transactionTypeCommand;

                    viewModelTransactionTypeCommandJavaLangObjectNull = (viewModelTransactionTypeCommand) != (null);
                    if (viewModelTransactionTypeCommandJavaLangObjectNull) {


                        viewModelTransactionTypeCommand.execute();
                    }
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // viewModel.selectUSBCommand
                me.goldze.mvvmhabit.binding.command.BindingCommand viewModelSelectUSBCommand = null;
                // viewModel.selectUSBCommand != null
                boolean viewModelSelectUSBCommandJavaLangObjectNull = false;
                // viewModel
                com.neokred.pos.ui.setting.connection_settings.ConnectionSettingsViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModelSelectUSBCommand = viewModel.selectUSBCommand;

                    viewModelSelectUSBCommandJavaLangObjectNull = (viewModelSelectUSBCommand) != (null);
                    if (viewModelSelectUSBCommandJavaLangObjectNull) {


                        viewModelSelectUSBCommand.execute();
                    }
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isShowBluetoothTextView
        flag 1 (0x2L): viewModel.cardMode
        flag 2 (0x3L): viewModel.isShowUSBImageView
        flag 3 (0x4L): viewModel.deviceConnected
        flag 4 (0x5L): viewModel.transactionType
        flag 5 (0x6L): viewModel.isShowUartTextView
        flag 6 (0x7L): viewModel.isShowUsbTextView
        flag 7 (0x8L): viewModel.isShowBluetoothImageView
        flag 8 (0x9L): viewModel.isShowUartImageView
        flag 9 (0xaL): viewModel.currencyCode
        flag 10 (0xbL): viewModel
        flag 11 (0xcL): null
        flag 12 (0xdL): viewModel.deviceConnected.get() ? @android:string/str_connected : @android:string/str_disconnect
        flag 13 (0xeL): viewModel.deviceConnected.get() ? @android:string/str_connected : @android:string/str_disconnect
        flag 14 (0xfL): viewModel.deviceConnected.get() ? @android:string/str_connected : @android:string/str_disconnect
        flag 15 (0x10L): viewModel.deviceConnected.get() ? @android:string/str_connected : @android:string/str_disconnect
        flag 16 (0x11L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothTextView.get()) ? View.VISIBLE : View.GONE
        flag 17 (0x12L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothTextView.get()) ? View.VISIBLE : View.GONE
        flag 18 (0x13L): viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
        flag 19 (0x14L): viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
        flag 20 (0x15L): viewModel.deviceConnected.get() ? @android:string/str_selected : @android:string/str_disconnect
        flag 21 (0x16L): viewModel.deviceConnected.get() ? @android:string/str_selected : @android:string/str_disconnect
        flag 22 (0x17L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartTextView.get()) ? View.VISIBLE : View.GONE
        flag 23 (0x18L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartTextView.get()) ? View.VISIBLE : View.GONE
        flag 24 (0x19L): viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
        flag 25 (0x1aL): viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
        flag 26 (0x1bL): viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
        flag 27 (0x1cL): viewModel.deviceConnected.get() ? @android:color/connected : @android:color/darker_gray
        flag 28 (0x1dL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartImageView.get()) ? View.VISIBLE : View.INVISIBLE
        flag 29 (0x1eL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUartImageView.get()) ? View.VISIBLE : View.INVISIBLE
        flag 30 (0x1fL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUSBImageView.get()) ? View.VISIBLE : View.INVISIBLE
        flag 31 (0x20L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUSBImageView.get()) ? View.VISIBLE : View.INVISIBLE
        flag 32 (0x21L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUsbTextView.get()) ? View.VISIBLE : View.GONE
        flag 33 (0x22L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowUsbTextView.get()) ? View.VISIBLE : View.GONE
        flag 34 (0x23L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothImageView.get()) ? View.VISIBLE : View.INVISIBLE
        flag 35 (0x24L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isShowBluetoothImageView.get()) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}