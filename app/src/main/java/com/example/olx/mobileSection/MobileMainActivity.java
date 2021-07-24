package com.example.olx.mobileSection;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;
import com.example.olx.ShowProductDetail.MobileDetails;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class MobileMainActivity extends AppCompatActivity implements ItemClickListenerMObile {
    private RecyclerView mRecyclerView;

    private MobileAdapter mobileAdapter;
    private List<Mobiles> mobilesList = new ArrayList<>();

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
        mobileAdapter = new MobileAdapter(mobilesList, this);
        mRecyclerView.setAdapter(mobileAdapter);


    }

    private void ReadJsonFromAssets() {

        InputStream inputStream = null;
        try {
            inputStream = getAssets().open("mobile.json");

            int data = inputStream.read();
            StringBuilder stringBuilder = new StringBuilder();
            while (data != -1) {
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
        Type type = new TypeToken<ResponseModelMobile>() {
        }.getType();
        ResponseModelMobile responseModelMobile = gson.fromJson(json, type);
        mobilesList = responseModelMobile.getMobiles();
        UpDateUI();

    }

    private void UpDateUI() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                mobileAdapter.updateData(mobilesList);
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

    @Override
    public void OnItemclickMobile(Mobiles mobiles, int position) {


        Intent intent = new Intent(MobileMainActivity.this, MobileDetails.class);
        intent.putExtra("price",mobiles.getPrice() );
        intent.putExtra("place" , mobiles.getPlace());
        intent.putExtra("mobile",mobiles.getProductName());
        intent.putExtra("image",mobiles.getImageUrl());

        startActivity(intent);

    }

    @Override
    public void OnLIkeClickMObille(Mobiles mobiles, int position) {
        Mobiles updateCard;
        if (mobiles.isJsonMemberBoolean()) {
            updateCard = new Mobiles(mobiles.getPrice(), mobiles.getProductName(), mobiles.getPlace(), false, mobiles.getImageUrl());
        } else {
            updateCard = new Mobiles(mobiles.getPrice(), mobiles.getProductName(), mobiles.getPlace(), true, mobiles.getImageUrl());
        }
        mobilesList.set(position, updateCard);
        mobileAdapter.notifyItemChanged(position);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        MenuItem menuItem = menu.findItem(R.id.svSearchView);
        SearchView searchView = (SearchView)menuItem.getActionView();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mobileAdapter.getFilterData().filter(newText.toString())    ;
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);
    }

}