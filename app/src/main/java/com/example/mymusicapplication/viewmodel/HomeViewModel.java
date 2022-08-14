package com.example.mymusicapplication.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.mymusicapplication.base.IActionAdapterRecycler;
import com.example.mymusicapplication.model.Song;

public class HomeViewModel extends AndroidViewModel implements IActionAdapterRecycler<Song> {
    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    @Override
    public void onClickListener(Song data) {

    }
}
