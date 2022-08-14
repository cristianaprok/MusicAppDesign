package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAllSongBinding;
import com.example.mymusicapplication.databinding.FragmentGenresBinding;
import com.example.mymusicapplication.screens.adapter.song.RecyclerGenres;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentGenres extends BaseFragment<FragmentGenresBinding,SongViewModel> {
    private static FragmentGenres _instance;
    private RecyclerGenres _adapter;

    @Override
    protected Class getClassName() {
        return SongViewModel.class;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        _adapter = new RecyclerGenres();
        _adapter.updateItems(DummyData.getListSong(),viewModel);

        binding.recyclerGenres.setAdapter(_adapter);
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_genres;
    }

    public static synchronized FragmentGenres getInstance(){
        if(_instance == null){
            _instance = new FragmentGenres();
        }
        return _instance;
    }
}
