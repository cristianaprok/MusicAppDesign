package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentPlaylistBinding;
import com.example.mymusicapplication.screens.adapter.song.RecyclerPlaylistAdapter;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentPlayList extends BaseFragment<FragmentPlaylistBinding, SongViewModel> {
    private static FragmentPlayList _instance;
    private RecyclerPlaylistAdapter _adapter;

    @Override
    protected Class<SongViewModel> getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_playlist;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        _adapter = new RecyclerPlaylistAdapter();
        _adapter.updateItems(DummyData.getListSong(),viewModel);

        binding.recyclerPlayList.setAdapter(_adapter);
    }

    public static synchronized FragmentPlayList getInstance(){
        if(_instance == null){
            _instance = new FragmentPlayList();
        }
        return _instance;
    }
}
