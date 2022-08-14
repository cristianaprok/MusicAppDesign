package com.example.mymusicapplication.screens.adapter.song;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseRecyclerViewAdapter;
import com.example.mymusicapplication.base.BaseViewHolder;
import com.example.mymusicapplication.databinding.LayoutItemAllsongBinding;
import com.example.mymusicapplication.model.Song;

public class RecyclerAllSongAdapter extends BaseRecyclerViewAdapter<Song, LayoutItemAllsongBinding> {
    @Override
    protected int getLayout() {
        return R.layout.layout_item_allsong;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<LayoutItemAllsongBinding> holder, int position) {
        holder.binding.setSong(mListItem.get(position));
    }
}
