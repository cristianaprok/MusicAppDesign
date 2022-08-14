package com.example.mymusicapplication.screens.fragment.songs;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAllSongBinding;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentGenres extends BaseFragment<FragmentAllSongBinding,SongViewModel> {
    private static FragmentGenres _instance;

    @Override
    protected Class getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_all_song;
    }

    public static synchronized FragmentGenres getInstance(){
        if(_instance == null){
            _instance = new FragmentGenres();
        }
        return _instance;
    }
}
