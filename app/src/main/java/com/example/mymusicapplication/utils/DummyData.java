package com.example.mymusicapplication.utils;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.model.Song;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class DummyData {
    static final List<Song> mList = new ArrayList<>();

    public static List<Song> getListSong() {
        mList.clear();
        for (int i = 0; i <= 20; i++) {
            mList.add(new Song(i,
                    "Sound of Sky",
                    "Dilon Bruce",
                    new Random().nextLong(),
                    "album",
                    new Random().nextLong(),
                    null,
                    R.drawable.img_bg));
            }
        return mList;
    }
}
