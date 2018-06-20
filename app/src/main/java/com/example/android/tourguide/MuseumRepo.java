package com.example.android.tourguide;

import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by Sava on 20.06.2018.
 */

public class MuseumRepo {

    ArrayList<Museum> museums;

    public MuseumRepo(Resources res)
    {
        museums = new ArrayList<Museum>();
        museums.add(new Museum(res.getString(R.string.museum_unique_dolls),
                res.getString(R.string.museum_unique_dolls_info),
                res.getString(R.string.museum_unique_dolls_address)));
        museums.add(new Museum(res.getString(R.string.museum_dolls_lane),
                res.getString(R.string.museum_dolls_lane_info),
                res.getString(R.string.museum_dolls_lane_address)));
        museums.add(new Museum(res.getString(R.string.museum_zabawushka),
                res.getString(R.string.museum_zabawushka_info),
                res.getString(R.string.museum_zabawushka_address)));
        museums.add(new Museum(res.getString(R.string.museum_doll_theater),
                res.getString(R.string.museum_doll_theater_info),
                res.getString(R.string.museum_doll_theater_address)));
        museums.add(new Museum(res.getString(R.string.museum_childhood),
                res.getString(R.string.museum_childhood_info),
                res.getString(R.string.museum_childhood_address)));
    }

    public ArrayList<Museum> getMuseums()
    {
        return museums;
    }
}
