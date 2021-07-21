package com.example.olx.mobileSection;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModelMobile implements Serializable {

	@SerializedName("mobiles")
	private List<Mobiles> mobiles;

	public List<Mobiles> getMobiles(){
		return mobiles;
	}
}