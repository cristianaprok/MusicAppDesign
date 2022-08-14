package com.example.mymusicapplication.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.base.BaseViewModel;
import com.example.mymusicapplication.base.interfaces.IActionAdapterRecycler;
import com.example.mymusicapplication.model.Song;

public class HomeViewModel extends BaseViewModel implements IActionAdapterRecycler<Song> {

    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onClickListener(Song data) {

    }

    @Override
    public void onLongClickListener(Song data) {

    }

    @Override
    public void onNavigate(Song data) {

    }
}
