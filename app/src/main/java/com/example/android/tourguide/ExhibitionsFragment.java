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
public class ExhibitionsFragment extends Fragment {


    public ExhibitionsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_exhibitions, container, false);

        ArrayList<Exhibition> exhibitions = new ExhibitionRepo(getResources()).getExhibitions();

        ExhibitionAdapter adapter = new ExhibitionAdapter(getActivity(), exhibitions);

        ListView listView = (ListView) rootView.findViewById(R.id.exhibitions_list);

        listView.setAdapter(adapter);

        return rootView;
    }

}
