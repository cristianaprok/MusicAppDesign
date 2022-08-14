package com.example.mymusicapplication.app;

import android.app.Application;

import androidx.lifecycle.ViewModelProvider;


public class MyApplication extends Application {
    public static ViewModelProvider.Factory factory;

    @Override
    public void onCreate() {
        super.onCreate();
        factory = (ViewModelProvider.Factory) new ViewModelProvider.AndroidViewModelFactory(this);
    }
}
