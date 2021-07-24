package com.example.olx.bikes;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.olx.R;

import static com.example.olx.R.drawable.ic_heart_like_love_icon;
import static com.example.olx.R.drawable.ic_heartfilled;

public class BikeViewHolder extends RecyclerView.ViewHolder {

    private TextView mPrice;
    private TextView mProductName;
    private TextView mLocation;
    private ImageView mProductImage;
    private ImageButton mimageButton;

    ItemClickListenerBike itemClickListenerBike;
    public BikeViewHolder(@NonNull View itemView, ItemClickListenerBike itemClickListenerBike) {
        super(itemView);
        this.itemClickListenerBike= itemClickListenerBike;
        initView(itemView);
    }

    private void initView(View itemView) {

        mPrice = itemView.findViewById(R.id.tvprice);
        mProductName = itemView.findViewById(R.id.tvProductName);
        mLocation = itemView.findViewById(R.id.tvPlace);
        mProductImage = itemView.findViewById(R.id.tvimage);
        mimageButton = itemView.findViewById(R.id.tvheart);

    }

    public void SetData(Bikes bikes){
        mPrice.setText(bikes.getPrice()+"");
        mProductName.setText(bikes.getProductName());
        mLocation.setText(bikes.getPlace());
        Glide.with(mProductImage).load(bikes.getImageUrl()).into(mProductImage);
        if (bikes.isJsonMemberBoolean()) {
            mimageButton.setImageResource(ic_heartfilled);

        } else {
            mimageButton.setImageResource(ic_heart_like_love_icon);

        }
        mimageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListenerBike.OnLikeClickedBike(bikes, getAdapterPosition());
            }
        });
        mProductImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListenerBike.OnItemClickedBike(bikes,getAdapterPosition());
            }
        });


    }


}
