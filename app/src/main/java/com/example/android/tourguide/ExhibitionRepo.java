package com.example.android.tourguide;

import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by Sava on 20.06.2018.
 */

public class ExhibitionRepo {
    ArrayList<Exhibition> exhibitions;

    public ExhibitionRepo(Resources res)
    {
        exhibitions = new ArrayList<Exhibition>();
        exhibitions.add(new Exhibition(res.getString(R.string.exh_spring_dolls),
                res.getString(R.string.exh_spring_dolls_info),
                res.getString(R.string.exh_spring_dolls_date),
                res.getString(R.string.exh_spring_dolls_address)));
        exhibitions.add(new Exhibition(res.getString(R.string.exh_moscow_fair),
                res.getString(R.string.exh_moscow_fair_info),
                res.getString(R.string.exh_moscow_fair_date),
                res.getString(R.string.exh_moscow_fair_address)));
        exhibitions.add(new Exhibition(res.getString(R.string.exh_dollscar),
                res.getString(R.string.exh_dollscar_info),
                res.getString(R.string.exh_dollscar_date),
                res.getString(R.string.exh_dollscar_address)));
        exhibitions.add(new Exhibition(res.getString(R.string.exh_dollsalon),
                res.getString(R.string.exh_dollsalon_info),
                res.getString(R.string.exh_dollsalon_date),
                res.getString(R.string.exh_dollsalon_address)));
        exhibitions.add(new Exhibition(res.getString(R.string.exh_dollart),
                res.getString(R.string.exh_dollart_info),
                res.getString(R.string.exh_dollart_date),
                res.getString(R.string.exh_dollart_address)));
    }

    public ArrayList<Exhibition> getExhibitions()
    {
        return exhibitions;
    }
}
