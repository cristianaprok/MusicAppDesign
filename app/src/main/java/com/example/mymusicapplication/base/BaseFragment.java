package com.example.mymusicapplication.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.mymusicapplication.app.MyApplication;

public abstract class BaseFragment<VB extends ViewDataBinding,VM extends AndroidViewModel> extends Fragment {
    protected VB binding;
    protected VM viewModel;

    protected abstract Class<VM> getClassName();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,getLayout(),container,false);
        binding.setLifecycleOwner(getViewLifecycleOwner());

        viewModel = new ViewModelProvider(getViewModelStore(),MyApplication.factory).get(getClassName());
        return binding.getRoot();
    }

    protected abstract int getLayout();
}
