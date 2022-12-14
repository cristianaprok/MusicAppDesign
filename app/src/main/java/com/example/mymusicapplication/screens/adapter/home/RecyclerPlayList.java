package com.example.mymusicapplication.screens.adapter.home;//package com.example.mymusicapplication.screens.adapter.home;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseRecyclerViewAdapter;
import com.example.mymusicapplication.base.BaseViewHolder;
import com.example.mymusicapplication.databinding.LayoutItemPlayListBinding;
import com.example.mymusicapplication.model.Song;

public class RecyclerPlayList extends BaseRecyclerViewAdapter<Song, LayoutItemPlayListBinding>{
    
    @Override
    protected int getLayout() {
        return R.layout.layout_item_play_list;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<LayoutItemPlayListBinding> holder, int position) {
        holder.binding.setSong(mListItem.get(position));
    }
}