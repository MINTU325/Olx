package com.example.olx.MyAdsSection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;
import com.example.olx.mobileSection.MobileViewHolder;

import java.util.List;

public class MyadsAdaapter extends RecyclerView.Adapter<MyadsViewHolder> {
    private List<LIkesModel> lIkesModelList;

    public MyadsAdaapter(List<LIkesModel> lIkesModelList) {
        this.lIkesModelList = lIkesModelList;
    }

    @NonNull
    @Override
    public MyadsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout_myads,parent,false);
        return new MyadsViewHolder(view);


    }

    @Override
    public void onBindViewHolder(@NonNull MyadsViewHolder holder, int position) {
        LIkesModel lIkesModel = lIkesModelList.get(position);
        holder.SetData(lIkesModel);


    }


    @Override
    public int getItemCount() {
        return lIkesModelList.size();
    }
}
