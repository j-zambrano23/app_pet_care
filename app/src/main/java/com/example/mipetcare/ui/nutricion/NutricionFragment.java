package com.example.mipetcare.ui.nutricion;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mipetcare.databinding.FragmentNutricionBinding;

public class NutricionFragment extends Fragment {

    private FragmentNutricionBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        NutricionViewModel nutricionViewModel =
                new ViewModelProvider(this).get(NutricionViewModel.class);

        binding = FragmentNutricionBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textNutricion;
        nutricionViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}