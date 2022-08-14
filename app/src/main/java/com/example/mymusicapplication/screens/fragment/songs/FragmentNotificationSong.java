package com.example.mymusicapplication.screens.fragment.songs;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseFragment;
import com.example.mymusicapplication.databinding.FragmentAlbumsBinding;
import com.example.mymusicapplication.databinding.FragmentNotificationSongBinding;
import com.example.mymusicapplication.screens.adapter.song.RecyclerAlbum;
import com.example.mymusicapplication.utils.DummyData;
import com.example.mymusicapplication.viewmodel.SongViewModel;

public class FragmentNotificationSong extends BaseFragment<FragmentNotificationSongBinding, SongViewModel> {
    private static FragmentNotificationSong _instance;

    @Override
    protected Class<SongViewModel> getClassName() {
        return SongViewModel.class;
    }

    @Override
    protected int getLayout() {
        return R.layout.fragment_notification_song;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    public static synchronized FragmentNotificationSong getInstance(){
        if(_instance == null){
            _instance = new FragmentNotificationSong();
        }
        return _instance;
    }
}
