package com.example.olx;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeViewHolder_Verticle extends RecyclerView.ViewHolder {

    private ImageView mIvProductImage_Verticle;
    private TextView mTvPrice_Vertical;
    private TextView mTvAddress_Vertical;
    private TextView mTvLocation_Vertical;

    public HomeViewHolder_Verticle(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvProductImage_Verticle = itemView.findViewById(R.id.ivProductImage_vertical_rv);
        mTvPrice_Vertical = itemView.findViewById(R.id.tvPrice_vertical_rv);
        mTvAddress_Vertical = itemView.findViewById(R.id.tvAddress_vertical_rv);
        mTvLocation_Vertical = itemView.findViewById(R.id.tvLocation_vertical_rv);
    }
}
