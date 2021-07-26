package com.example.olx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class IncludeSomeDetails extends AppCompatActivity {

    private EditText mEtCarBrand;
    private EditText mEtYear;
    private Button mBtnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_include_some_details);
        initViews();
    }

    private void initViews() {
        mEtCarBrand = findViewById(R.id.etCarBrand);
        mEtYear = findViewById(R.id.etYear);
        mBtnNext = findViewById(R.id.btnNext);
        mBtnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IncludeSomeDetails.this,SellRecycler.class);
                intent.putExtra("CarBrand" , mEtCarBrand.getText().toString());
                intent.putExtra("Year", mEtYear.getText().toString());
            }
        });
    }
}