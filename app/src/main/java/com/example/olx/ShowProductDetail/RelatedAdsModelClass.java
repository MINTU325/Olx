package com.example.olx.ShowProductDetail;

public class RelatedAdsModelClass {
    public int phoneImage;
    public  int phoneeprice;
    public  String phoneName;
    public  String  phonePlce;

    public int getPhoneImage() {
        return phoneImage;
    }

    public int getPhoneeprice() {
        return phoneeprice;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public String getPhonePlce() {
        return phonePlce;
    }

    public RelatedAdsModelClass(int phoneImage, int phoneeprice, String phoneName, String phonePlce) {
        this.phoneImage = phoneImage;
        this.phoneeprice = phoneeprice;
        this.phoneName = phoneName;
        this.phonePlce = phonePlce;






    }
}
