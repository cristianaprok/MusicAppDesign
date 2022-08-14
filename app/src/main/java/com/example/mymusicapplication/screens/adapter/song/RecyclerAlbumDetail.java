package com.example.mymusicapplication.screens.adapter.song;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseRecyclerViewAdapter;
import com.example.mymusicapplication.base.BaseViewHolder;
import com.example.mymusicapplication.databinding.LayoutItemAlbumDetailBinding;
import com.example.mymusicapplication.databinding.LayoutItemAllsongBinding;
import com.example.mymusicapplication.model.Song;

public class RecyclerAlbumDetail extends BaseRecyclerViewAdapter<Song, LayoutItemAlbumDetailBinding> {
    @Override
    protected int getLayout() {
        return R.layout.layout_item_album_detail;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<LayoutItemAlbumDetailBinding> holder, int position) {
        holder.binding.setSong(mListItem.get(position));
    }
}
