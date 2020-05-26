package com.chunleedev.whatif.models;

public class FeedModels {

    private String imageUrl;
    private String title;
    private String date;
    private String profilePhoto;
    private String userText;

    public FeedModels(String imageUrl, String profilePhoto, String title, String userText, String date) {
        this.imageUrl = imageUrl;
        this.title = title;
        this.date = date;
        this.profilePhoto = profilePhoto;
        this.userText = userText;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public String getUserText() {
        return userText;
    }
}
