package com.example.revise;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.revise.databinding.FragmentMenuBinding;


public class MenuFragment extends Fragment {
    FragmentMenuBinding bind;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        bind = FragmentMenuBinding.inflate(inflater, container, false);
        return bind.getRoot();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind = FragmentMenuBinding.inflate(getLayoutInflater());
    }
}