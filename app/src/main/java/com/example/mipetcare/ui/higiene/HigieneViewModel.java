package com.example.mipetcare.ui.higiene;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HigieneViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public HigieneViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is higiene fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}