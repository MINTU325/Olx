package com.example.olx;

public class SellModelClass {
    private String  brand;
    private String  year;
    private int price;
    private String location;

    public SellModelClass(String brand, String year, int price, String location) {
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.location = location;
    }

    public String getBrand() {
        return brand;
    }

    public String getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public String getLocation() {
        return location;
    }
}
