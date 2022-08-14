package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAlbumsBinding;
import com.example.mymusicapplication.databinding.FragmentAllSongBinding;
import com.example.mymusicapplication.screens.adapter.song.RecyclerAlbum;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentAlbums extends BaseFragment<FragmentAlbumsBinding, SongViewModel> {
    private static FragmentAlbums _instance;
    private RecyclerAlbum _adapter;

    @Override
    protected Class<SongViewModel> getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_albums;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        _adapter = new RecyclerAlbum();
        _adapter.updateItems(DummyData.getListSong(),viewModel);

        binding.recyclerAlbum.setAdapter(_adapter);
    }

    public static synchronized FragmentAlbums getInstance(){
        if(_instance == null){
            _instance = new FragmentAlbums();
        }
        return _instance;
    }
}
