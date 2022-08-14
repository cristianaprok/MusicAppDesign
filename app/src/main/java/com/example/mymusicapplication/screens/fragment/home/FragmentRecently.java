package com.example.mymusicapplication.screens.fragment.home;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.LayoutHomeFragmentBinding;
import com.example.mymusicapplication.screens.adapter.home.RecyclerRecently;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.HomeViewModel;

public class FragmentRecently extends BaseFragment<LayoutHomeFragmentBinding, HomeViewModel> {
    private RecyclerRecently adapter;

    @Override
    protected Class<HomeViewModel> getClassName() {
        return HomeViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.layout_home_fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new RecyclerRecently();
        adapter.updateItems(DummyData.getListSong(),viewModel);

        binding.txtTitle.setText(R.string.playlist);
        LinearLayoutManager layoutManager = new LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false);
        binding.recyclerHotRecommended1.setLayoutManager(layoutManager);
        binding.recyclerHotRecommended1.setAdapter(adapter);
    }
}
