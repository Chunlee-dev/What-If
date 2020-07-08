package com.chunleedev.whatif.models;

public class ServiceModel {

    private String imageUrl;
    private String price;

    public ServiceModel(String imageUrl, String price) {
        this.imageUrl = imageUrl;
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
