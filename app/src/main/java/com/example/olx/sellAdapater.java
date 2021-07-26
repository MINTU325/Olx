package com.example.olx;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class sellAdapater extends RecyclerView.Adapter<SellViewHolder> {

    private ArrayList<SellModelClass> sellModelClasses;

    public sellAdapater(ArrayList<SellModelClass> sellModelClasses) {
        this.sellModelClasses = sellModelClasses;
    }

    @NonNull
    @Override
    public SellViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_sell,parent,false);
        return new SellViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SellViewHolder holder, int position) {
        SellModelClass sellModelClass = sellModelClasses.get(position);
        holder.setData(sellModelClass);
    }

    @Override
    public int getItemCount() {
        return sellModelClasses.size();
    }
}
