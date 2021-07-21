package com.example.olx;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private TextView mTvFreshRecommendation;
    private TextView mTvBrowseCategories;
    private TextView mTvLocation_Horizontal;
    private EditText mTvEditText;
    private RecyclerView mHorizontalRecyclerView;
    private RecyclerView mVerticalRecyclerView;
    private HomeAdapter homeAdapter;
    private ArrayList<Horizontal_rv_model> horizontal_rv_modelList = new ArrayList<>();

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
        buildData();
        setRecyclerView();
    }

    private void buildData() {
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__car, "CARS"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__house, "PROPERTIES"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic_mobile, "MOBILES"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic_jobs, "JOBS"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__cloth, "FASHION"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__house, "PROPERTIES"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic_mobile, "MOBILES"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic_jobs, "JOBS"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__car, "cars"));
    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        mHorizontalRecyclerView.setLayoutManager(linearLayoutManager);
        homeAdapter = new HomeAdapter(horizontal_rv_modelList);
        mHorizontalRecyclerView.setAdapter(homeAdapter);

    }

    private void initViews(View view) {
        mTvLocation_Horizontal = view.findViewById(R.id.tvLocation_HomeFragment);
        mTvBrowseCategories = view.findViewById(R.id.tvBrowseCategories);
        mTvFreshRecommendation = view.findViewById(R.id.tvFreshRecommendation);
        mTvEditText = view.findViewById(R.id.etSearchView_HomeFragment);
        mHorizontalRecyclerView = view.findViewById(R.id.horizontalRecyclerView_HomeFragment);
        mVerticalRecyclerView = view.findViewById(R.id.verticalRecyclerView_HomeFragment);
    }
}