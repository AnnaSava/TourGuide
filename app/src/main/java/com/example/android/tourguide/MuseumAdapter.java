package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sava on 18.06.2018.
 */

public class MuseumAdapter extends ArrayAdapter<Museum> {

    public MuseumAdapter(Activity context, ArrayList<Museum> museums) {
        super(context, 0, museums);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.museum_item, parent, false);
        }

        Museum museum = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.exhibition_name);
        nameTextView.setText(museum.getName());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.exhibition_info);
        infoTextView.setText(museum.getInfo());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.exhibition_address);
        addressTextView.setText(museum.getAddress());

        return listItemView;
    }
}
