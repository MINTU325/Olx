package com.example.olx.bikes;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.olx.R;

import java.util.List;

public class BikeAdapter extends RecyclerView.Adapter<BikeViewHolder> {
private List<Bikes> bikesList;
ItemClickListenerBike itemClickListenerBike;
    public BikeAdapter(List<Bikes> bikesList, ItemClickListenerBike itemClickListenerBike) {
        this.bikesList = bikesList;
        this.itemClickListenerBike= itemClickListenerBike;
    }

    @NonNull
    @Override
    public BikeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new BikeViewHolder(view,itemClickListenerBike);
    }

    @Override
    public void onBindViewHolder(@NonNull BikeViewHolder holder, int position) {
        Bikes bikes = bikesList.get(position);
        holder.SetData(bikes);

    }

    @Override
    public int getItemCount() {
        return  bikesList.size();
    }


    public  void updateData(List<Bikes> bikesList){
        this.bikesList = bikesList;
        notifyDataSetChanged();
    }
}
