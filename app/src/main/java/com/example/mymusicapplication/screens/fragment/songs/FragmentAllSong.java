package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAllSongBinding;
import com.example.mymusicapplication.screens.adapter.song.RecyclerAllSongAdapter;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentAllSong extends BaseFragment<FragmentAllSongBinding,SongViewModel> {
    private static FragmentAllSong _instance;
    private RecyclerAllSongAdapter _adapter;

    @Override
    protected Class getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_all_song;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        _adapter = new RecyclerAllSongAdapter();
        _adapter.updateItems(DummyData.getListSong(),viewModel);

        binding.recyclerAllSong.setAdapter(_adapter);
    }

    public static synchronized FragmentAllSong getInstance(){
        if(_instance == null){
            _instance = new FragmentAllSong();
        }
        return _instance;
    }
}
