package com.neokred.pos.databinding;
import com.neokred.pos.R;
import com.neokred.pos.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityPrinterBaseBindingImpl extends ActivityPrinterBaseBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 8);
        sViewsWithIds.put(R.id.print_scroll_view, 9);
        sViewsWithIds.put(R.id.black_cylinder, 10);
        sViewsWithIds.put(R.id.content_container, 11);
        sViewsWithIds.put(R.id.button_container, 12);
        sViewsWithIds.put(R.id.btn_cancel, 13);
        sViewsWithIds.put(R.id.btn_printTicket, 14);
        sViewsWithIds.put(R.id.iv_icon, 15);
        sViewsWithIds.put(R.id.tv_title, 16);
        sViewsWithIds.put(R.id.btn_small_cancel, 17);
        sViewsWithIds.put(R.id.btn_small_print, 18);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    @NonNull
    private final android.widget.TextView mboundView2;
    @NonNull
    private final android.widget.ProgressBar mboundView4;
    @NonNull
    private final android.widget.LinearLayout mboundView5;
    @NonNull
    private final android.widget.LinearLayout mboundView7;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityPrinterBaseBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 19, sIncludes, sViewsWithIds));
    }
    private ActivityPrinterBaseBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.view.View) bindings[10]
            , (com.google.android.material.button.MaterialButton) bindings[13]
            , (com.google.android.material.button.MaterialButton) bindings[3]
            , (com.google.android.material.button.MaterialButton) bindings[14]
            , (android.widget.Button) bindings[17]
            , (android.widget.Button) bindings[18]
            , (android.widget.LinearLayout) bindings[12]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.FrameLayout) bindings[9]
            , (com.google.android.material.appbar.MaterialToolbar) bindings[8]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[16]
            );
        this.btnPrint.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView2 = (android.widget.TextView) bindings[2];
        this.mboundView2.setTag(null);
        this.mboundView4 = (android.widget.ProgressBar) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.LinearLayout) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView7 = (android.widget.LinearLayout) bindings[7];
        this.mboundView7.setTag(null);
        this.tvFail.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setViewModel((com.neokred.pos.ui.printer.activities.base.BasePrinterViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.neokred.pos.ui.printer.activities.base.BasePrinterViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
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
                return onChangeViewModelIsSmallScreenButton((androidx.databinding.ObservableField<java.lang.Boolean>) object, fieldId);
            case 3 :
                return onChangeViewModelTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeViewModelIsLoading((androidx.databinding.ObservableBoolean) object, fieldId);
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
    private boolean onChangeViewModelIsSmallScreenButton(androidx.databinding.ObservableField<java.lang.Boolean> ViewModelIsSmallScreenButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelIsLoading(androidx.databinding.ObservableBoolean ViewModelIsLoading, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        java.lang.Boolean viewModelIsNormalScreenGet = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsSmallScreen = null;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsNormalScreen = null;
        int viewModelIsNormalScreenViewVISIBLEViewGONE = 0;
        boolean viewModelIsLoadingGet = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenButtonGet = false;
        androidx.databinding.ObservableField<java.lang.Boolean> viewModelIsSmallScreenButton = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet = false;
        java.lang.String viewModelTitleGet = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxViewModelIsNormalScreenGet = false;
        androidx.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        int viewModelIsLoadingViewVISIBLEViewGONE = 0;
        int viewModelIsSmallScreenViewVISIBLEViewGONE = 0;
        int viewModelIsSmallScreenButtonViewVISIBLEViewINVISIBLE = 0;
        java.lang.Boolean viewModelIsSmallScreenButtonGet = null;
        androidx.databinding.ObservableBoolean viewModelIsLoading = null;
        java.lang.Boolean viewModelIsSmallScreenGet = null;
        com.neokred.pos.ui.printer.activities.base.BasePrinterViewModel viewModel = mViewModel;
        boolean ViewModelIsLoading1 = false;

        if ((dirtyFlags & 0x7fL) != 0) {


            if ((dirtyFlags & 0x61L) != 0) {

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
                if((dirtyFlags & 0x61L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
                    viewModelIsSmallScreenViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
            }
            if ((dirtyFlags & 0x62L) != 0) {

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
                if((dirtyFlags & 0x62L) != 0) {
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
            if ((dirtyFlags & 0x64L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isSmallScreenButton
                        viewModelIsSmallScreenButton = viewModel.isSmallScreenButton;
                    }
                    updateRegistration(2, viewModelIsSmallScreenButton);


                    if (viewModelIsSmallScreenButton != null) {
                        // read viewModel.isSmallScreenButton.get()
                        viewModelIsSmallScreenButtonGet = viewModelIsSmallScreenButton.get();
                    }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreenButton.get())
                    androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenButtonGet = androidx.databinding.ViewDataBinding.safeUnbox(viewModelIsSmallScreenButtonGet);
                if((dirtyFlags & 0x64L) != 0) {
                    if(androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenButtonGet) {
                            dirtyFlags |= 0x4000L;
                    }
                    else {
                            dirtyFlags |= 0x2000L;
                    }
                }


                    // read androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreenButton.get()) ? View.VISIBLE : View.INVISIBLE
                    viewModelIsSmallScreenButtonViewVISIBLEViewINVISIBLE = ((androidxDatabindingViewDataBindingSafeUnboxViewModelIsSmallScreenButtonGet) ? (android.view.View.VISIBLE) : (android.view.View.INVISIBLE));
            }
            if ((dirtyFlags & 0x68L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.title;
                    }
                    updateRegistration(3, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.get()
                        viewModelTitleGet = viewModelTitle.get();
                    }
            }
            if ((dirtyFlags & 0x70L) != 0) {

                    if (viewModel != null) {
                        // read viewModel.isLoading
                        viewModelIsLoading = viewModel.isLoading;
                    }
                    updateRegistration(4, viewModelIsLoading);


                    if (viewModelIsLoading != null) {
                        // read viewModel.isLoading.get()
                        viewModelIsLoadingGet = viewModelIsLoading.get();
                    }
                if((dirtyFlags & 0x70L) != 0) {
                    if(viewModelIsLoadingGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read viewModel.isLoading.get() ? View.VISIBLE : View.GONE
                    viewModelIsLoadingViewVISIBLEViewGONE = ((viewModelIsLoadingGet) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                    // read !viewModel.isLoading.get()
                    ViewModelIsLoading1 = !viewModelIsLoadingGet;
            }
        }
        // batch finished
        if ((dirtyFlags & 0x70L) != 0) {
            // api target 1

            this.btnPrint.setEnabled(ViewModelIsLoading1);
            this.mboundView4.setVisibility(viewModelIsLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x62L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(viewModelIsNormalScreenViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x68L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView2, viewModelTitleGet);
        }
        if ((dirtyFlags & 0x61L) != 0) {
            // api target 1

            this.mboundView5.setVisibility(viewModelIsSmallScreenViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x64L) != 0) {
            // api target 1

            this.mboundView7.setVisibility(viewModelIsSmallScreenButtonViewVISIBLEViewINVISIBLE);
            this.tvFail.setVisibility(viewModelIsSmallScreenButtonViewVISIBLEViewINVISIBLE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.isSmallScreen
        flag 1 (0x2L): viewModel.isNormalScreen
        flag 2 (0x3L): viewModel.isSmallScreenButton
        flag 3 (0x4L): viewModel.title
        flag 4 (0x5L): viewModel.isLoading
        flag 5 (0x6L): viewModel
        flag 6 (0x7L): null
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
        flag 8 (0x9L): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isNormalScreen.get()) ? View.VISIBLE : View.GONE
        flag 9 (0xaL): viewModel.isLoading.get() ? View.VISIBLE : View.GONE
        flag 10 (0xbL): viewModel.isLoading.get() ? View.VISIBLE : View.GONE
        flag 11 (0xcL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
        flag 12 (0xdL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreen.get()) ? View.VISIBLE : View.GONE
        flag 13 (0xeL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreenButton.get()) ? View.VISIBLE : View.INVISIBLE
        flag 14 (0xfL): androidx.databinding.ViewDataBinding.safeUnbox(viewModel.isSmallScreenButton.get()) ? View.VISIBLE : View.INVISIBLE
    flag mapping end*/
    //end
}