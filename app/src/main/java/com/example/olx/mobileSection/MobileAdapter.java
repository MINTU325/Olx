package com.example.olx.mobileSection;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;

import java.util.List;

public class MobileAdapter extends RecyclerView.Adapter<MobileViewHolder> {
private List<Mobiles> mobilesList;

    public MobileAdapter(List<Mobiles> mobilesList) {
        this.mobilesList = mobilesList;
    }

    @NonNull
    @Override
    public MobileViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        return new MobileViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull MobileViewHolder holder, int position) {
        Mobiles mobiles = mobilesList.get(position);
        holder.SetData(mobiles);

    }

    @Override
    public int getItemCount() {
        return mobilesList.size();
    }


    public  void updateData(List<Mobiles> mobilesList){
        this.mobilesList = mobilesList;
        notifyDataSetChanged();
    }
}
