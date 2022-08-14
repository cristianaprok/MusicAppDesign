package com.example.mymusicapplication.screens.adapter.home;//package com.example.mymusicapplication.screens.adapter.home;

import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseRecyclerViewAdapter;
import com.example.mymusicapplication.base.BaseViewHolder;
import com.example.mymusicapplication.databinding.LayoutItemRecentlyBinding;
import com.example.mymusicapplication.model.Song;

public class RecyclerRecently extends BaseRecyclerViewAdapter<Song, LayoutItemRecentlyBinding>{
    
    @Override
    protected int getLayout() {
        return R.layout.layout_item_recently;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<LayoutItemRecentlyBinding> holder, int position) {
        holder.binding.setSong(mListItem.get(position));
    }
}