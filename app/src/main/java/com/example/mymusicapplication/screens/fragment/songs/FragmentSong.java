package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentSongBinding;
import com.example.mymusicapplication.screens.adapter.song.PagerAdapter;
import com.example.mymusicapplication.viewmodel.SongViewModel;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class FragmentSong extends BaseFragment<FragmentSongBinding, SongViewModel> {
    private PagerAdapter mAdapter;

    @Override
    protected Class<SongViewModel> getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_song;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setupViewpagerAdapter();

        new TabLayoutMediator(binding.tabLayout, binding.viewPager,
                (tab, position) -> tab.setText(mAdapter.mListTitle.get(position))
        ).attach();
    }

    private void setupViewpagerAdapter() {
        mAdapter = new PagerAdapter(getActivity());
        binding.viewPager.setAdapter(mAdapter);
        binding.tabLayout.setSelectedTabIndicatorColor(ContextCompat.getColor(requireContext(),R.color.selected_color));
    }
}
