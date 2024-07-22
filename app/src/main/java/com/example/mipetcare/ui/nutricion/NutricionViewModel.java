package com.example.mipetcare.ui.nutricion;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NutricionViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public NutricionViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is nutricion fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}