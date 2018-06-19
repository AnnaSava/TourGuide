package com.example.android.tourguide;

/**
 * Created by Sava on 18.06.2018.
 */

public class Shop {

    private String mName;

    private String mAddress;

    public Shop(String name, String address) {
        mName = name;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public String getAddress() {
        return mAddress;
    }
}
