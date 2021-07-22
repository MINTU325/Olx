package com.example.olx.mobileSection;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.olx.MyAdsSection.LIkesModel;
import com.example.olx.MyAdsSection.MyadsAdaapter;
import com.example.olx.R;

import java.util.ArrayList;
import java.util.List;

import static com.example.olx.R.drawable.ic_heart_like_love_icon;
import static com.example.olx.R.drawable.ic_heartfilled;

public class MobileViewHolder extends RecyclerView.ViewHolder {
    List<LIkesModel> lIkesModelList = new ArrayList<>();
    LIkesModel card;
    private TextView mPrice;
    private TextView mProductName;
    private TextView mLocation;
    private ImageView mProductImage;
    private ImageButton imageButton;
    MyadsAdaapter myadsAdaapter;
    ItemClickListenerMObile itemClickListenerMObile;

    public MobileViewHolder(@NonNull View itemView, ItemClickListenerMObile itemClickListenerMObile) {
        super(itemView);
        this.itemClickListenerMObile = itemClickListenerMObile;
        initView(itemView);
    }

    private void initView(View itemView) {

        mPrice = itemView.findViewById(R.id.tvprice);
        mProductName = itemView.findViewById(R.id.tvProductName);
        mLocation = itemView.findViewById(R.id.tvPlace);
        mProductImage = itemView.findViewById(R.id.tvimage);
        imageButton = itemView.findViewById(R.id.tvheart);
    }

    public void SetData(Mobiles mobiles) {
        mPrice.setText(mobiles.getPrice() + "");
        mProductName.setText(mobiles.getProductName());
        mLocation.setText(mobiles.getPlace());
        Glide.with(mProductImage).load(mobiles.getImageUrl()).into(mProductImage);

        if (mobiles.isJsonMemberBoolean()) {
            imageButton.setImageResource(ic_heartfilled);

        } else {
            imageButton.setImageResource(ic_heart_like_love_icon);

        }

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListenerMObile.OnItemclickMobile(mobiles, getAdapterPosition());
            }
        });

        mProductImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListenerMObile.OnItemclickMobile(mobiles, getAdapterPosition());
            }
        });

    }


}
