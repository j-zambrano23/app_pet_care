package com.example.mipetcare.ui.vacunas;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class VacunasViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public VacunasViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is vacunas fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}