package com.example.mymusicapplication.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

public class Extension {
    @BindingAdapter("app:setUrlImage")
    public static void setUrlImage(ImageView imageView, int src) {
        imageView.setBackgroundResource(src);
    }
}


