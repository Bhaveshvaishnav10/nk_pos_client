package com.neokred.pos.common.base;

import androidx.databinding.ViewDataBinding;


import com.neokred.pos.TitleProviderListener;
import com.neokred.pos.ui.main.MainActivity;

import me.goldze.mvvmhabit.base.BaseViewModel;

public abstract class BaseFragment<V extends ViewDataBinding, VM extends BaseViewModel>
        extends me.goldze.mvvmhabit.base.BaseFragment<V, VM> {
    
    @Override
    public void initData() {
        super.initData();
        // Unified initialization logic for handling fragment
        if (getActivity() instanceof MainActivity && this instanceof TitleProviderListener) {
            ((MainActivity) getActivity()).setToolbarTitle(((TitleProviderListener) this).getTitle());
        }
    }
}