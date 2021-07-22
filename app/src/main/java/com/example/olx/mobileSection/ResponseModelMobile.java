package com.example.olx.mobileSection;

import com.example.olx.mobileSection.Mobiles;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class ResponseModelMobile implements Serializable {

	@SerializedName("mobiles")
	private List<Mobiles> mobiles;

	public List<Mobiles> getMobiles(){
		return mobiles;
	}
}