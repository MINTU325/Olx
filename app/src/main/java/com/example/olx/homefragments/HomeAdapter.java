package com.example.olx.homefragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.homefragments.HomeViewHolder_Horizontal;
import com.example.olx.homefragments.Horizontal_rv_model;
import com.example.olx.R;

import java.util.ArrayList;

public class HomeAdapter extends RecyclerView.Adapter<HomeViewHolder_Horizontal> {

    private ArrayList<Horizontal_rv_model> horizontal_rv_models;
    ItemClickHorzontal itemClickHorzontal;
    public HomeAdapter(ArrayList<Horizontal_rv_model> horizontal_rv_models, ItemClickHorzontal itemClickHorzontal) {
        this.horizontal_rv_models = horizontal_rv_models;
        this.itemClickHorzontal = itemClickHorzontal;
    }

    @NonNull
    @Override
    public HomeViewHolder_Horizontal onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_horizental_rv_homefragment
        ,parent,false);
        return new HomeViewHolder_Horizontal(view,itemClickHorzontal);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder_Horizontal holder, int position) {
        Horizontal_rv_model horizontal_rv_model= horizontal_rv_models.get(position);
        holder.setData(horizontal_rv_model);
    }

    @Override
    public int getItemCount() {
        return horizontal_rv_models.size();
    }
}
