package com.example.mymusicapplication.screens.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentSettingBinding;
import com.example.mymusicapplication.viewmodel.SettingViewModel;

public class FragmentSetting extends BaseFragment<FragmentSettingBinding, SettingViewModel> {
    @Override
    protected Class<SettingViewModel> getClassName() {
        return SettingViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_setting;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
