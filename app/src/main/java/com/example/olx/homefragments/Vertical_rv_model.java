package com.example.olx.homefragments;

public class Vertical_rv_model {
    private int imageId;
    private String price;
    private String address;
    private String location;

    public Vertical_rv_model(int imageId, String price, String address, String location) {
        this.imageId = imageId;
        this.price = price;
        this.address = address;
        this.location = location;
    }

    public int getImageId() {
        return imageId;
    }

    public String getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public String getLocation() {
        return location;
    }
}
