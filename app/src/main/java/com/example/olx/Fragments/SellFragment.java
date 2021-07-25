package com.example.olx.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.olx.Bikes;
import com.example.olx.IncludeSomeDetails;
import com.example.olx.MobilesSell;
import com.example.olx.Properties;
import com.example.olx.R;
import com.example.olx.mobileSection.Mobiles;


public class SellFragment extends Fragment {


    private ImageView mIvCar;
    private ImageView mIvPhone;
    private ImageView mIvProperty;
    private ImageView mIvBikes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sell, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViwes(view);
        mIvCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),IncludeSomeDetails.class);
                startActivity(intent);
            }
        });
    }


    private void initViwes(View view) {
        mIvCar = view.findViewById(R.id.ivCar_SellFragment);
        mIvProperty = view.findViewById(R.id.ivProperties_SellFragment);
        mIvPhone = view.findViewById(R.id.ivMobile_SellFragment);
        mIvBikes = view.findViewById(R.id.ivBikes_SellFragment);

        mIvProperty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Properties.class);
                startActivity(intent);
            }
        });

        mIvPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), MobilesSell.class);
                startActivity(intent);
            }
        });

        mIvBikes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), Bikes.class);
                startActivity(intent);
            }
        });

        mIvCar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}