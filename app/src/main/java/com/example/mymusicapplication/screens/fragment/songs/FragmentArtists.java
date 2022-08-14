package com.example.mymusicapplication.screens.fragment.songs;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAllSongBinding;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentArtists extends BaseFragment<FragmentAllSongBinding, SongViewModel> {
    private static FragmentArtists _instance;

    @Override
    protected Class<SongViewModel> getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_all_song;
    }

    public static synchronized FragmentArtists getInstance(){
        if(_instance == null){
            _instance = new FragmentArtists();
        }
        return _instance;
    }
}
