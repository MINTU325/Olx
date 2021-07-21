package com.example.olx;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

public class HomeFragment extends Fragment {

    private TextView mTvLocation_Horizontal;
    private EditText mTvEditText;
    private RecyclerView mHorizontalRecyclerView;
    private RecyclerView mVerticalRecyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mTvLocation_Horizontal = view.findViewById(R.id.tvLocation_HomeFragment);
        mTvEditText = view.findViewById(R.id.etSearchView_HomeFragment);
        mHorizontalRecyclerView = view.findViewById(R.id.horizontalRecyclerView_HomeFragment);
        mVerticalRecyclerView = view.findViewById(R.id.verticalRecyclerView_HomeFragment);
    }
}