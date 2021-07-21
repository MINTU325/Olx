package com.example.olx.bikes;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.olx.R;

public class BikeViewHolder extends RecyclerView.ViewHolder {

    private TextView mPrice;
    private TextView mProductName;
    private TextView mLocation;
    private ImageView mProductImage;

    public BikeViewHolder(@NonNull View itemView) {
        super(itemView);
        initView(itemView);
    }

    private void initView(View itemView) {

        mPrice = itemView.findViewById(R.id.tvprice);
        mProductName = itemView.findViewById(R.id.tvProductName);
        mLocation = itemView.findViewById(R.id.tvPlace);
        mProductImage = itemView.findViewById(R.id.tvimage);
    }

    public void SetData(Bikes bikes){
        mPrice.setText(bikes.getPrice()+"");
        mProductName.setText(bikes.getProductName());
        mLocation.setText(bikes.getPlace());
        Glide.with(mProductImage).load(bikes.getImageUrl()).into(mProductImage);
    }


}
