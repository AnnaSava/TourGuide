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
        shops.add(new Shop(res.getString(R.string.shop_hamleys),
                res.getString(R.string.shop_hamleys)));
        shops.add(new Shop(res.getString(R.string.shop_toyru),
                res.getString(R.string.shop_toyru_address)));
        shops.add(new Shop(res.getString(R.string.shop_gorod_igrushek),
                res.getString(R.string.shop_gorod_igrushek_address)));
        shops.add(new Shop(res.getString(R.string.shop_korablik),
                res.getString(R.string.shop_korablik_address)));
        shops.add(new Shop(res.getString(R.string.shop_dochkisinochki),
                res.getString(R.string.shop_dochkisinochki_address)));
        shops.add(new Shop(res.getString(R.string.shop_persey),
                res.getString(R.string.shop_persey_address)));
        shops.add(new Shop(res.getString(R.string.shop_kuklobaza),
                res.getString(R.string.shop_kuklobaza_address)));
    }

    public ArrayList<Shop> getShops() {
        return shops;
    }
}
