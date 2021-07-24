package com.example.olx.MyAdsSection;

public class LIkesModel {
    private int price;
    private String ProductName;
    private String place;
    private boolean aBoolean;
    private  String image;

    public LIkesModel(int price, String productName, String place, boolean aBoolean, String image) {
        this.price = price;
        ProductName = productName;
        this.place = place;
        this.aBoolean = aBoolean;
        this.image = image;
    }

    public int getPrice() {
        return price;
    }

    public String getProductName() {
        return ProductName;
    }

    public String getPlace() {
        return place;
    }

    public boolean isaBoolean() {
        return aBoolean;
    }

    public String getImage() {
        return image;
    }
}
