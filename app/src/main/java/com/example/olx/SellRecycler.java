package com.example.olx;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class SellRecycler extends AppCompatActivity {

    private ArrayList<SellModelClass> sellModelClasses = new ArrayList<>();
    private sellAdapater sellAdapater;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_recycler);
        recyclerView = findViewById(R.id.rvRecyclerView_sell);
        buildData();
        buildReycler();
    }

    private void buildReycler() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SellRecycler.this);
        recyclerView.setLayoutManager(linearLayoutManager);
        sellAdapater = new sellAdapater(sellModelClasses);
        recyclerView.setAdapter(sellAdapater);
    }

    private void buildData() {
        Intent intent = getIntent();
        String carBrand = intent.getStringExtra("CarBrand");
        String year = intent.getStringExtra("Year");
        sellModelClasses.add(new SellModelClass(carBrand, year, 20000, "jaipur"));
       // sellAdapater.notifyDataSetChanged();
    }
}