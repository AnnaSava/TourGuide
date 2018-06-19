package com.example.android.tourguide;

import android.content.res.Resources;

import java.util.ArrayList;

/**
 * Created by Sava on 20.06.2018.
 */

public class ShopRepo {
    ArrayList<Shop> shops;

    public ShopRepo(Resources res) {
        shops = new ArrayList<Shop>();
        shops.add(new Shop(res.getString(R.string.shop_dm),
                res.getString(R.string.shop_dm_address)));
        shops.add(new Shop(res.getString(R.string.shop_cdm),
                res.getString(R.string.shop_cdm_address)));
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }
}
