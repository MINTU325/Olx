package com.example.olx.bikes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Bikes implements Serializable {

	@SerializedName("price")
	private int price;

	@SerializedName("productName")
	private String productName;

	@SerializedName("place")
	private String place;

	@SerializedName("imageUrl")
	private String imageUrl;

	public int getPrice(){
		return price;
	}

	public String getProductName(){
		return productName;
	}

	public String getPlace(){
		return place;
	}

	public String getImageUrl(){
		return imageUrl;
	}
}