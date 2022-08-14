package com.example.mymusicapplication.screens.fragment.home;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.LayoutHomeFragmentBinding;
import com.example.mymusicapplication.screens.adapter.home.RecyclerPlayList;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.HomeViewModel;

public class FragmentPlayList extends BaseFragment<LayoutHomeFragmentBinding,HomeViewModel>{
    private RecyclerPlayList adapter;

    @Override
    protected Class getClassName() {
        return HomeViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.layout_home_fragment;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        adapter = new RecyclerPlayList();
        adapter.updateItems(DummyData.getListSong(),viewModel);

        binding.txtTitle.setText(R.string.playlist);
        binding.recyclerHotRecommended1.setAdapter(adapter);
    }
}
