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
public class MuseumsFragment extends Fragment {


    public MuseumsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_museums, container, false);

        ArrayList<Museum> museums = new MuseumRepo(getResources()).getMuseums();

        MuseumAdapter adapter = new MuseumAdapter(getActivity(), museums);

        ListView listView = (ListView) rootView.findViewById(R.id.museums_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
