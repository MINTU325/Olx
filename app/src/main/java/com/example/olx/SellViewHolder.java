package com.example.olx;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SellViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvBrand;
    private TextView mTvYear;
    private TextView mTvPrice;
    private TextView mTvLocation;

    public SellViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvBrand = itemView.findViewById(R.id.tvBrand_sell);
        mTvYear = itemView.findViewById(R.id.tvYear_sell);
        mTvPrice = itemView.findViewById(R.id.tvPrice_sell);
        mTvLocation = itemView.findViewById(R.id.tvLocation_sell);
    }

    public void setData(SellModelClass sellModelClass) {
        mTvBrand.setText(sellModelClass.getBrand());
        mTvYear.setText(sellModelClass.getYear() + "");
        mTvPrice.setText(sellModelClass.getPrice() + "");
        mTvLocation.setText(sellModelClass.getLocation());
    }


}
