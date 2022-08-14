package com.example.mymusicapplication.screens.adapter.home;
import androidx.annotation.NonNull;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.base.BaseRecyclerViewAdapter;
import com.example.mymusicapplication.base.BaseViewHolder;
import com.example.mymusicapplication.databinding.LayoutItemHotRecommendedBindingImpl;
import com.example.mymusicapplication.model.Song;

public class RecyclerHotRecommended extends BaseRecyclerViewAdapter<Song, LayoutItemHotRecommendedBindingImpl> {
    
    @Override
    protected int getLayout() {
        return R.layout.layout_item_hot_recommended;
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder<LayoutItemHotRecommendedBindingImpl> holder, int position) {
        holder.binding.setSong(mListItem.get(position));
    }
}