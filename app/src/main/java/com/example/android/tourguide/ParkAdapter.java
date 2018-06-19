package com.example.android.tourguide;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Sava on 18.06.2018.
 */

public class ParkAdapter extends ArrayAdapter<Park> {

    public ParkAdapter(Activity context, ArrayList<Park> parks) {
        super(context, 0, parks);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.park_item, parent, false);
        }

        Park park = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.park_name);
        nameTextView.setText(park.getName());

        TextView infoTextView = (TextView) listItemView.findViewById(R.id.park_info);
        infoTextView.setText(park.getInfo());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.park_address);
        addressTextView.setText(park.getAddress());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.park_image);
        imageView.setImageResource(park.getImageResourceId());

        return listItemView;
    }
}
