package com.example.olx.MyAdsSection;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.olx.R;
import com.example.olx.mobileSection.Mobiles;

import static com.example.olx.R.drawable.ic_heart_like_love_icon;
import static com.example.olx.R.drawable.ic_heartfilled;

public class MyadsViewHolder extends RecyclerView.ViewHolder {

    private TextView mPrice;
    private TextView mProductName;
    private TextView mLocation;
    private ImageView mProductImage;
    private ImageButton imageButton;



    public MyadsViewHolder(@NonNull View itemView) {
        super(itemView);
        mPrice = itemView.findViewById(R.id.myadstvprice);
        mProductName = itemView.findViewById(R.id.myadstvProductName);
        mLocation = itemView.findViewById(R.id.myadstvPlace);
        mProductImage = itemView.findViewById(R.id.myadstvimage);
        imageButton = itemView.findViewById(R.id.myadstvheart);

    }
    public void SetData(LIkesModel lIkesModel){
        mPrice.setText(lIkesModel.getPrice()+"");
        mProductName.setText(lIkesModel.getProductName());
        mLocation.setText(lIkesModel.getPlace());
        Glide.with(mProductImage).load(lIkesModel.getImage()).into(mProductImage);




    }



}
