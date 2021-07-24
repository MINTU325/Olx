package com.example.olx.ShowProductDetail;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.olx.R;

public class RelatedAdsViewHolder extends RecyclerView.ViewHolder {

    private ImageView mImaageView;
    private TextView mPrice;
    private TextView mPhoneName;
    private TextView mPlace;


    public RelatedAdsViewHolder(@NonNull View itemView) {
        super(itemView);

        initView(itemView);
    }

    private void initView(View itemView) {
        mImaageView= itemView.findViewById(R.id.phoneimage);
        mPrice= itemView.findViewById(R.id.price);
        mPhoneName= itemView.findViewById(R.id.PhoneName);
        mPlace= itemView.findViewById(R.id.Phoneplace);
    }

    public void Setdata(RelatedAdsModelClass relatedAdsModelClass){
        mPrice.setText(relatedAdsModelClass.getPhoneeprice()+"");
        mPhoneName.setText(relatedAdsModelClass.getPhoneName());
        mPlace.setText(relatedAdsModelClass.getPhonePlce());
        mImaageView.setImageResource(relatedAdsModelClass.getPhoneImage());



    }



}
