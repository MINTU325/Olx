package com.example.olx.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;
import com.example.olx.bikes.BikeMainActivity;
import com.example.olx.homefragments.HomeAdapter;
import com.example.olx.homefragments.Horizontal_rv_model;
import com.example.olx.homefragments.ItemClickHorzontal;
import com.example.olx.mobileSection.MobileMainActivity;

import java.util.ArrayList;

public class HomeFragment extends Fragment implements ItemClickHorzontal {

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
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic_mobile, "MOBILES"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__cloth, "FASHION"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__car, "cars"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic__house, "PROPERTIES"));
        horizontal_rv_modelList.add(new Horizontal_rv_model(R.drawable.ic_jobs, "JOBS"));

    }

    private void setRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), RecyclerView.HORIZONTAL, false);
        mHorizontalRecyclerView.setLayoutManager(linearLayoutManager);
        homeAdapter = new HomeAdapter(horizontal_rv_modelList, this);
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

    @Override
    public void OnItemClicked(Horizontal_rv_model horizontal_rv_model, int position) {
        Toast.makeText(getContext(), "position is " + position, Toast.LENGTH_SHORT).show();
        if (position == 0) {
            Intent intent = new Intent(getContext(), MobileMainActivity.class);
            startActivity(intent);
        } else if (position == 2) {
            Intent intent = new Intent(getContext(), BikeMainActivity.class);
            startActivity(intent);
        }


    }
}