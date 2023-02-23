package com.example.olx.homefragments;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;
import com.example.olx.bikes.Bikes;

import java.util.ArrayList;
import java.util.List;

public class VerticalAdapter extends RecyclerView.Adapter<HomeViewHolder_Verticle> {

    private ArrayList<Vertical_rv_model> vertical_rv_modelArrayList;

    public VerticalAdapter(ArrayList<Vertical_rv_model> vertical_rv_modelArrayList) {
        this.vertical_rv_modelArrayList = vertical_rv_modelArrayList;
    }

    @NonNull
    @Override
    public HomeViewHolder_Verticle onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_vertical_rv_homefragment,parent,false);
        return new HomeViewHolder_Verticle(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HomeViewHolder_Verticle holder, int position) {
        Vertical_rv_model vertical_rv_model = vertical_rv_modelArrayList.get(position);
        holder.setData(vertical_rv_model);
    }

    @Override
    public int getItemCount() {
        return vertical_rv_modelArrayList.size();
    }
}
