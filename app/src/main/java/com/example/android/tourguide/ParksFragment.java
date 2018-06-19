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
public class ParksFragment extends Fragment {


    public ParksFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_parks, container, false);

        ArrayList<Park> parks = new ParkRepo(getResources()).getParks();

        ParkAdapter adapter = new ParkAdapter(getActivity(), parks);

        ListView listView = (ListView) rootView.findViewById(R.id.parks_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
