package com.example.mymusicapplication.screens.fragment.home;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.app.MyApplication;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentHomeBinding;
import com.example.mymusicapplication.screens.activities.MainActivity;
import com.example.mymusicapplication.viewmodel.HomeViewModel;

public class FragmentHome extends BaseFragment<FragmentHomeBinding,HomeViewModel> {
    protected HomeViewModel viewModel;

    @Override
    protected Class<HomeViewModel> getClassName() {
        return HomeViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_home;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewModel = new ViewModelProvider(this, MyApplication.factory).get(HomeViewModel.class);
    }
}
