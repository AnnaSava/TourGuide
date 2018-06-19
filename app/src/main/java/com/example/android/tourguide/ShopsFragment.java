package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShopsFragment extends Fragment {


    public ShopsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_shops, container, false);

        ArrayList<Shop> shops = new ShopRepo(getResources()).getShops();

        ShopAdapter adapter = new ShopAdapter(getActivity(), shops);

        ListView listView = (ListView) rootView.findViewById(R.id.shops_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
