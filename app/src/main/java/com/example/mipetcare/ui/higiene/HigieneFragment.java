package com.example.mipetcare.ui.higiene;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.mipetcare.databinding.FragmentHigieneBinding;

public class HigieneFragment extends Fragment {

    private FragmentHigieneBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HigieneViewModel higieneViewModel =
                new ViewModelProvider(this).get(HigieneViewModel.class);

        binding = FragmentHigieneBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHigiene;
        higieneViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}