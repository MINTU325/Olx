package com.example.olx.mobileSection;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class Mobiles implements Serializable {

	@SerializedName("price")
	private int price;

	@SerializedName("productName")
	private String productName;

	@SerializedName("place")
	private String place;

	@SerializedName("boolean")
	private boolean jsonMemberBoolean;

	@SerializedName("imageUrl")
	private String imageUrl;

	public int getPrice(){
		return price;
	}

	public Mobiles(int price, String productName, String place, boolean jsonMemberBoolean, String imageUrl) {
		this.price = price;
		this.productName = productName;
		this.place = place;
		this.jsonMemberBoolean = jsonMemberBoolean;
		this.imageUrl = imageUrl;

	}

	public String getProductName(){
		return productName;
	}

	public String getPlace(){
		return place;
	}

	public boolean isJsonMemberBoolean(){
		return jsonMemberBoolean;
	}

	public String getImageUrl(){
		return imageUrl;
	}


}