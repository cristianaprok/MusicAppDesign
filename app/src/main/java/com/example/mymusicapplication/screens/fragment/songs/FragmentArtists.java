package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAllSongBinding;
import com.example.mymusicapplication.screens.adapter.song.RecyclerArtists;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentArtists extends BaseFragment<FragmentAllSongBinding, SongViewModel> {
    private static FragmentArtists _instance;
    private RecyclerArtists _adapter;
    @Override
    protected Class<SongViewModel> getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_all_song;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        _adapter = new RecyclerArtists();
        _adapter.updateItems(DummyData.getListSong(),viewModel);
        _adapter.onItemActionMenu((id,title)->{
            Log.d(TAG, "onViewCreated: id:= "+id +"  title:= "+title);
        });

        binding.recyclerAllSong.setAdapter(_adapter);
    }

    public static synchronized FragmentArtists getInstance(){
        if(_instance == null){
            _instance = new FragmentArtists();
        }
        return _instance;
    }
}
