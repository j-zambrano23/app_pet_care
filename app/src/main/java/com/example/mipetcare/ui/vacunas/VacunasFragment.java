package com.example.mipetcare.ui.vacunas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.example.mipetcare.databinding.FragmentVacunasBinding;

public class VacunasFragment extends Fragment {

    private FragmentVacunasBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        VacunasViewModel vacunasViewModel =
                new ViewModelProvider(this).get(VacunasViewModel.class);

        binding = FragmentVacunasBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textVacuna;
        vacunasViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}