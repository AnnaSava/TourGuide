package com.example.android.tourguide;

/**
 * Created by Sava on 18.06.2018.
 */

public class Museum {
    private String mName;

    private String mInfo;

    private String mAddress;

    public Museum(String name, String info, String address) {
        mName = name;
        mInfo = info;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public String getmAddress() {
        return mAddress;
    }
}
