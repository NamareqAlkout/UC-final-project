package com.example.myapplication;

import java.io.Serializable;

public class Places1 implements Serializable {
    private String placename;
    private String placeinfo;
    private String placelocation;
    private int placepicture;
    String itemDescrption;


    public Places1(String placename, String placeinfo, String placelocation, int placepicture, String itemDescrption) {
        this.placename = placename;
        this.placeinfo = placeinfo;
        this.placelocation = placelocation;
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

    public String getPlacelocation() {
        return placelocation;
    }

    public void setPlacelocation(String placelocation) {
        this.placelocation = placelocation;
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
