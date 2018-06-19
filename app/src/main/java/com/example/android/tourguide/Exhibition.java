package com.example.android.tourguide;

/**
 * Created by Sava on 18.06.2018.
 */

public class Exhibition {

    private String mName;

    private String mInfo;

    private String mDate;

    private String mAddress;

    public Exhibition(String name, String info, String date, String address) {
        mName = name;
        mInfo = info;
        mDate = date;
        mAddress = address;
    }

    public String getName() {
        return mName;
    }

    public String getInfo() {
        return mInfo;
    }

    public String getDate() {
        return mDate;
    }

    public String getmAddress() {
        return mAddress;
    }
}
