package com.example.mymusicapplication.viewmodel;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseViewModel;
import com.example.mymusicapplication.base.interfaces.IActionAdapterRecycler;
import com.example.mymusicapplication.model.Song;
import com.example.mymusicapplication.utils.Constant;

public class SongViewModel extends BaseViewModel implements IActionAdapterRecycler<Song> {
    public SongViewModel(@NonNull Application application) {
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
        Log.d(TAG, "onNavigate: "+data.getTitle());
        Bundle bundle = new Bundle();
        bundle.putSerializable(Constant.KEY_SONG,data);
        onNavigate(R.id.fragmentDetailAlbums,bundle);
    }
}
