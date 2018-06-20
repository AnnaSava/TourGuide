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
        parks.add(new Park(res.getString(R.string.park_vdnh),
                res.getString(R.string.park_vdnh_info),
                res.getString(R.string.park_vdnh_address),
                R.drawable.vdnh));
        parks.add(new Park(res.getString(R.string.park_tsaritsyno),
                res.getString(R.string.park_tsaritsyno_info),
                res.getString(R.string.park_tsaritsyno_address),
                R.drawable.tsaritsyno));
        parks.add(new Park(res.getString(R.string.park_aptekar),
                res.getString(R.string.park_aptekar_info),
                res.getString(R.string.park_aptekar_address),
                R.drawable.aptekar));
        parks.add(new Park(res.getString(R.string.park_sokolniki),
                res.getString(R.string.park_sokolniki_info),
                res.getString(R.string.park_sokolniki_address),
                R.drawable.sokolniki));
        parks.add(new Park(res.getString(R.string.park_kolomenskoe),
                res.getString(R.string.park_kolomenskoe_info),
                res.getString(R.string.park_kolomenskoe_address),
                R.drawable.kolomenskoe));
        parks.add(new Park(res.getString(R.string.park_kuzminki),
                res.getString(R.string.park_kuzminki_info),
                res.getString(R.string.park_kuzminki_address),
                R.drawable.kuzminki));
    }

    public ArrayList<Park> getParks()
    {
        return parks;
    }
}
