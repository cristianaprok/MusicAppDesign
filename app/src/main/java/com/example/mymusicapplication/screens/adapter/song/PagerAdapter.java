package com.example.mymusicapplication.screens.adapter.song;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.screens.fragment.songs.FragmentAlbums;
import com.example.mymusicapplication.screens.fragment.songs.FragmentAllSong;
import com.example.mymusicapplication.screens.fragment.songs.FragmentArtists;
import com.example.mymusicapplication.screens.fragment.songs.FragmentGenres;
import com.example.mymusicapplication.screens.fragment.songs.FragmentPlayList;

import java.util.ArrayList;
import java.util.List;

public class PagerAdapter extends FragmentStateAdapter {
    private List<Fragment>mListFragment = new ArrayList<>();
    public List<Integer> mListTitle = new ArrayList();

    public PagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        mListFragment.add(FragmentAllSong.getInstance());
        mListFragment.add(FragmentPlayList.getInstance());
        mListFragment.add(FragmentAlbums.getInstance());
        mListFragment.add(FragmentArtists.getInstance());
        mListFragment.add(FragmentGenres.getInstance());

        mListTitle.add(R.string.all_song);
        mListTitle.add(R.string.Playlists);
        mListTitle.add(R.string.albums);
        mListTitle.add(R.string.artists);
        mListTitle.add(R.string.genres);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        return mListFragment.get(position);
    }

    @Override
    public int getItemCount() {
        return mListFragment.size();
    }
}
