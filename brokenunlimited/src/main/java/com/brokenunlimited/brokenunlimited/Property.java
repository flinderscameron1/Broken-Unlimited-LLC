package com.brokenunlimited.brokenunlimited;

import java.util.*;

public class Property {
    private String address;
    private boolean rentable;
    private boolean airbnb;
    private List<String> images;

    public Property(String address, boolean rentable, boolean airbnb, List<String> images) {
        this.address = address;
        this.rentable = rentable;
        this.airbnb = airbnb;
        this.images = images;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAirbnb() {
        return airbnb;
    }

    public void setAirbnb(boolean airbnb) {
        this.airbnb = airbnb;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }
}
