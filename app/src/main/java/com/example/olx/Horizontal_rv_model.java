package com.example.olx;

import android.widget.ImageView;

public class Horizontal_rv_model {

    private int imageId;
    private String productName;

    public Horizontal_rv_model(int imageId, String productName) {
        this.imageId = imageId;
        this.productName = productName;
    }

    public int getImageId() {
        return imageId;
    }

    public String getProductName() {
        return productName;
    }
}
