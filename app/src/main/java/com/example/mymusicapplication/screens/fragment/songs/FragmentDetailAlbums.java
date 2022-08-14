package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAlbumsBinding;
import com.example.mymusicapplication.databinding.FragmentDetailsAlbumBinding;
import com.example.mymusicapplication.screens.adapter.song.RecyclerAlbum;
import com.example.mymusicapplication.screens.adapter.song.RecyclerAlbumDetail;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentDetailAlbums extends BaseFragment<FragmentDetailsAlbumBinding, SongViewModel> {
    private static FragmentDetailAlbums _instance;
    private RecyclerAlbumDetail _adapter;

    @Override
    protected Class<SongViewModel> getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_details_album;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        _adapter = new RecyclerAlbumDetail();
        _adapter.updateItems(DummyData.getListSong(),viewModel);

        binding.recyclerDetailAlbum.setAdapter(_adapter);
    }

    public static synchronized FragmentDetailAlbums getInstance(){
        if(_instance == null){
            _instance = new FragmentDetailAlbums();
        }
        return _instance;
    }
}
