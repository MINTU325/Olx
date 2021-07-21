package com.example.olx.bikes;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ResponseModelBike implements Serializable {

	@SerializedName("bikes")
	private List<Bikes> bikes;

	public List<Bikes> getBikes(){
		return bikes;
	}
}