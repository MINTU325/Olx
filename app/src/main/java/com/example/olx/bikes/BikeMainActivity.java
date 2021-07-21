package com.example.olx.bikes;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class BikeMainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
//    Mobiles mobilesResponse;
    private BikeAdapter bikeAdapter;
    private List<Bikes> bikesList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobile_json);
        mRecyclerView = findViewById(R.id.mobileRecyclerView);
        setRecyclerAdapter();
        StartBackGroundThred();

    }

    private void setRecyclerAdapter() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(linearLayoutManager);
        bikeAdapter = new BikeAdapter(bikesList);
        mRecyclerView.setAdapter(bikeAdapter);



    }

    private void ReadJsonFromAssets() {

        InputStream inputStream = null;
        try {
            inputStream = getAssets().open("bike.json");

            int data = inputStream.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (data != -1){
                char ch = (char) data;
                stringBuilder.append(ch);
                data = inputStream.read();
            }

            Log.d("Mintu", stringBuilder.toString());
            buildPOJOfronJson(stringBuilder);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private void buildPOJOfronJson(StringBuilder stringBuilder) {
        String json = stringBuilder.toString();
        Gson gson = new Gson();
        Type type = new TypeToken<ResponseModelBike>(){
        }.getType();
        ResponseModelBike responseModelBike = gson.fromJson(json,type);
        bikesList = responseModelBike.getBikes();
        UpDateUI();

    }

    private void UpDateUI() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                bikeAdapter.updateData(bikesList);
            }
        });
    }

    private void StartBackGroundThred() {
        Thread thread = new Thread(runnable);
        thread.start();

    }

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            ReadJsonFromAssets();
        }
    };
}