package com.example.fragmentlearning.ui.test.two;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentlearning.R;
import com.example.fragmentlearning.databinding.FragmentTwoBinding;

public class TwoFragment extends Fragment {

    private TwoViewModel mViewModel;
FragmentTwoBinding binding;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        binding=FragmentTwoBinding.inflate(getLayoutInflater());
      mViewModel=new ViewModelProvider(this).get(TwoViewModel.class);


        binding.ButtonIncrement.setOnClickListener(mViewModel.ButtonIncrementonClickListener);
      binding.DuttonDecresment.setOnClickListener(mViewModel.DuttonDecresmentonClickListener);
      binding.ButtonReset.setOnClickListener(mViewModel.ButtonResetonClickListener);
        return binding.getRoot();
    }



}