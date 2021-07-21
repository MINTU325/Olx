package com.example.olx;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeViewHolder_Horizontal extends RecyclerView.ViewHolder {

    private ImageView mIvProductImage_horizental_rv;
    private TextView mTvBrowseCategories;
    private TextView mTvProductName_horizental_rv;

    public HomeViewHolder_Horizontal(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View view) {
        mIvProductImage_horizental_rv = view.findViewById(R.id.ivProductImage_horizental_rv);
        mTvBrowseCategories = view.findViewById(R.id.tvBrowseCategories);
        mTvProductName_horizental_rv = view.findViewById(R.id.tvProductName_horizental_rv);
    }
}
