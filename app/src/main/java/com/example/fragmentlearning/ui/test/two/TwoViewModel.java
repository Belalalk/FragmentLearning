package com.example.fragmentlearning.ui.test.two;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class TwoViewModel extends ViewModel {
    private  int count = 0 ;
    private   void updateCountText(int newcount){
        mutableLiveData.setValue(String.valueOf(newcount));
    }
    private MutableLiveData<String> mutableLiveData=new MutableLiveData<>("0");



    public View.OnClickListener ButtonIncrementonClickListener = view->{
        count+=1;
        updateCountText(count);
    };
    public View.OnClickListener DuttonDecresmentonClickListener = view->{
        count-=1;
        updateCountText(count);
    };
    public View.OnClickListener ButtonResetonClickListener = view->{
        count=0;
        updateCountText(count);
    };
    public LiveData<String>getLiveCouunter(){
        return mutableLiveData;
    }


}