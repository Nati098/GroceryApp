package ru.sf.grocery.model.data;

import java.io.Serializable;

public class GoodsResponseData implements Serializable {

    private String imgUrl;
    private String name;
    private double price;
    private String countryCode;

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCOde) {
        this.countryCode = countryCode;
    }
}
