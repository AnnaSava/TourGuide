package com.example.android.tourguide;

/**
 * Created by Sava on 18.06.2018.
 */

public class Park {

    private String mName;

    private String mInfo;

    private String mAddress;

    private int mImageResourceId;

    public Park(String name, String info, String address, int imageResourceId) {
        mName = name;
        mInfo = info;
        mAddress = address;
        mImageResourceId = imageResourceId;
    }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public String getAddress() {
        return mAddress;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
}
