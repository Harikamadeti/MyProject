package com.example.win7.myproject;

public class Items {
    private String sitename;
    private String location;
    private String price;
    private String contact_num;
    private int thumbnail;
    public Items()
    {

    }

    public Items(String sitename, String location, String price, String contact_num,int thumbnail) {
        this.sitename = sitename;
        this.location = location;
        this.price = price;
        this.contact_num = contact_num;
        this.thumbnail=thumbnail;
    }

    public String getSitename() {
        return sitename;
    }

    public String getLocation() {
        return location;
    }

    public String getPrice() {
        return price;
    }

    public String getContact_num() {
        return contact_num;
    }

    public int getThumbnail() {
        return thumbnail;
    }

    public void setSitename(String sitename) {
        this.sitename = sitename;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setContact_num(String contact_num) {
        this.contact_num = contact_num;
    }

    public void setThumbnail(int thumbnail) {
        this.thumbnail = thumbnail;
    }
}
