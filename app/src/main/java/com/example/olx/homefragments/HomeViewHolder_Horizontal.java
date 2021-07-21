package com.example.olx.homefragments;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.olx.R;

public class HomeViewHolder_Horizontal extends RecyclerView.ViewHolder {
        LinearLayout linearLayout;
    private ImageView mIvProductImage_horizental_rv;
    private TextView mTvProductName_horizental_rv;
ItemClickHorzontal itemClickHorzontal;
    public HomeViewHolder_Horizontal(@NonNull View itemView, ItemClickHorzontal itemClickHorzontal) {
        super(itemView);
        this.itemClickHorzontal = itemClickHorzontal;
        initViews(itemView);

    }
    private void initViews(View view) {
        mIvProductImage_horizental_rv = view.findViewById(R.id.ivProductImage_horizental_rv);
        mTvProductName_horizental_rv = view.findViewById(R.id.tvProductName_horizental_rv);
        linearLayout = view.findViewById(R.id.horizontalCArd);
    }

    public void setData(Horizontal_rv_model horizontal_rv_model ) {
        mIvProductImage_horizental_rv.setImageResource(horizontal_rv_model.getImageId());
        mTvProductName_horizental_rv.setText(horizontal_rv_model.getProductName());
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickHorzontal.OnItemClicked(horizontal_rv_model,getAdapterPosition());
            }
        });

    }
}
