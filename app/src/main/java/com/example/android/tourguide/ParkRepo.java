package com.example.android.tourguide;

import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by Sava on 20.06.2018.
 */

public class ParkRepo {
    ArrayList<Park> parks;

    public ParkRepo(Resources res)
    {
        parks = new ArrayList<Park>();
        parks.add(new Park(res.getString(R.string.park_tsaritsyno),
                res.getString(R.string.park_tsaritsyno_info),
                res.getString(R.string.park_tsaritsyno_address),
                R.drawable.tsaritsyno));
    }

    public ArrayList<Park> getParks()
    {
        return parks;
    }
}
