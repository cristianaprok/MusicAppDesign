package com.example.mymusicapplication.base;

import android.app.Application;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.example.mymusicapplication.model.DataAction;
import com.example.mymusicapplication.utils.SingleLiveEvent;

public abstract class BaseViewModel extends AndroidViewModel {
    private DataAction _dataAction = new DataAction();

    protected final String TAG = this.getClass().getName();
    protected final SingleLiveEvent<DataAction> eventSender = new SingleLiveEvent<>();

    public BaseViewModel(@NonNull Application application) {
        super(application);
    }

    protected void onNavigate(int actionId, Bundle argument){
        _dataAction.setActionId(actionId);
        _dataAction.setBundle(argument);
        _dataAction.setEventSender(DataAction.EventSender.ON_NAVIGATE);
        eventSender.postValue(_dataAction);
    }

    protected void showToast(String message){
        _dataAction.setMessage(message);
        _dataAction.setEventSender(DataAction.EventSender.SHOW_TOAST);
        eventSender.postValue(_dataAction);
    }

    protected void onClose(){
        _dataAction.setEventSender(DataAction.EventSender.ON_CLOSE);
        eventSender.postValue(_dataAction);
    }
}
