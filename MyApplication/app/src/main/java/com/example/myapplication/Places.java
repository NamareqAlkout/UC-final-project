package com.example.myapplication;

import java.io.Serializable;

public class Places implements Serializable {
    private String placename;
    private String placeinfo;
    private String location;
    private int placepicture;
    String itemDescrption;

    public Places(String placename, String placeinfo, String location, int placepicture, String itemDescrption) {
        this.placename = placename;
        this.placeinfo = placeinfo;
        this.location = location;
        this.placepicture = placepicture;
        this.itemDescrption = itemDescrption;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getPlaceinfo() {
        return placeinfo;
    }

    public void setPlaceinfo(String placeinfo) {
        this.placeinfo = placeinfo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getPlacepicture() {
        return placepicture;
    }

    public void setPlacepicture(int placepicture) {
        this.placepicture = placepicture;
    }

    public String getItemDescrption() {
        return itemDescrption;
    }

    public void setItemDescrption(String itemDescrption) {
        this.itemDescrption = itemDescrption;
    }
}
