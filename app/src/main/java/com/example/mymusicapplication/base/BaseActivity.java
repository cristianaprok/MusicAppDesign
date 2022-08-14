package com.example.mymusicapplication.base;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

import com.example.mymusicapplication.R;
import com.example.mymusicapplication.utils.Constants;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public abstract class BaseActivity<VB extends ViewDataBinding> extends AppCompatActivity {
    protected VB binding;

    protected final String TAG = this.getClass().getName();

    protected abstract int getLayout();

    @RequiresApi(api = Build.VERSION_CODES.N)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,getLayout());
        binding.setLifecycleOwner(this);
        checkPermission();
        onInit();
    }

    abstract protected void onInit();

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void checkPermission() {
        if (needsToRequestPermissions()) {
                requestPermission();
        } else {
            setUp();
        }
    }

    private void requestPermission() {
        Log.i(TAG, "Requesting permission");
        ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},
                Constants.MY_PERMISSION_REQUEST_READ_MEDIA);
    }

    private boolean needsToRequestPermissions() {
        boolean supportsDynamicPermissions = Build.VERSION.SDK_INT >= Build.VERSION_CODES.M;
        boolean result = supportsDynamicPermissions &&
                (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)
                        != PackageManager.PERMISSION_GRANTED);
        Log.i(TAG, "needsToRequestPermissions: "+result);
        return result;
    }


    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == Constants.MY_PERMISSION_REQUEST_READ_MEDIA){
            // If request is cancelled, the result arrays are empty
            if((grantResults.length>0) && (grantResults[0] == PackageManager.PERMISSION_GRANTED)){
               setUp();
            } else{
                    new MaterialAlertDialogBuilder(this)
                            .setTitle(R.string.app_name)
                            .setMessage(R.string.denied_permission_messsage)
                            .setPositiveButton(R.string.request_permission_button, (dialogInterface, i) -> finish())
                            .show();
                }
            }
            return;
        }

        //setup nen bo vao splash activity or customApplication
    private void setUp(){
//        PlayingStatus.initialize(this);
//        MyMediaCursor.initialize(this);
////        SongStatus.initialize(this);
//        MyMusicPlayer.initialize(this);
//        initNotificationChannel();
    }

    //setup nen bo vao splash activity or customApplication
    private void initNotificationChannel() {
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            NotificationChannel channel = new NotificationChannel(Constants.NOTIFICATION_CHANNEL_ID, Constants.NOTIFICATION_CHANNEL_NAME, NotificationManager.IMPORTANCE_DEFAULT);
//            NotificationManager notificationManager = getSystemService(NotificationManager.class);
//            notificationManager.createNotificationChannel(channel);
//        }
    }


}