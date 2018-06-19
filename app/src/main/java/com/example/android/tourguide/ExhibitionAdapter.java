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

public class ExhibitionAdapter extends ArrayAdapter<Exhibition> {

    public ExhibitionAdapter(Activity context, ArrayList<Exhibition> exhibitions) {
        super(context, 0, exhibitions);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.exhibition_item, parent, false);
        }

        Exhibition exhibition = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.exhibition_name);
        nameTextView.setText(exhibition.getName());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.exhibition_info);
        infoTextView.setText(exhibition.getInfo());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.exhibition_date);
        dateTextView.setText(exhibition.getDate());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.exhibition_address);
        addressTextView.setText(exhibition.getAddress());

        return listItemView;
    }
}
