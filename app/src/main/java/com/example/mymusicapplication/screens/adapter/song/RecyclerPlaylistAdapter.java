package com.example.mymusicapplication.screens.adapter.song;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseRecyclerViewAdapter;
import com.example.mymusicapplication.base.BaseViewHolder;
import com.example.mymusicapplication.databinding.LayoutItemPlaylistBottomBinding;
import com.example.mymusicapplication.model.Song;

public class RecyclerPlaylistAdapter extends BaseRecyclerViewAdapter<Song, LayoutItemPlaylistBottomBinding> {
    @Override
    protected int getLayout() {
        return R.layout.layout_item_playlist_bottom;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<LayoutItemPlaylistBottomBinding> holder, int position) {
        holder.binding.setSong(mListItem.get(position));
    }
}
