package com.example.olx;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class HomeViewHolder_Horizontal extends RecyclerView.ViewHolder {

    private ImageView mIvProductImage_horizental_rv;
    private TextView mTvProductName_horizental_rv;

    public HomeViewHolder_Horizontal(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View view) {
        mIvProductImage_horizental_rv = view.findViewById(R.id.ivProductImage_horizental_rv);
        mTvProductName_horizental_rv = view.findViewById(R.id.tvProductName_horizental_rv);
    }

    public void setData(Horizontal_rv_model horizontal_rv_model ) {
        mIvProductImage_horizental_rv.setImageResource(horizontal_rv_model.getImageId());
        mTvProductName_horizental_rv.setText(horizontal_rv_model.getProductName());
    }
}
