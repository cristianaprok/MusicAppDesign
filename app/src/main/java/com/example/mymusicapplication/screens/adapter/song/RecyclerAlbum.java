package com.example.mymusicapplication.screens.adapter.song;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseRecyclerViewAdapter;
import com.example.mymusicapplication.base.BaseViewHolder;
import com.example.mymusicapplication.databinding.LayoutItemAlbumBinding;
import com.example.mymusicapplication.databinding.LayoutItemPlaylistBottomBinding;
import com.example.mymusicapplication.model.Song;

public class RecyclerAlbum extends BaseRecyclerViewAdapter<Song, LayoutItemAlbumBinding> {
    @Override
    protected int getLayout() {
        return R.layout.layout_item_album;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<LayoutItemAlbumBinding> holder, int position) {
        holder.binding.setSong(mListItem.get(position));
    }
}
