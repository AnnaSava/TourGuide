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

public class ShopAdapter extends ArrayAdapter<Shop> {

    public ShopAdapter(Activity context, ArrayList<Shop> shops) {
        super(context, 0, shops);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.shop_item, parent, false);
        }

        Shop shop = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.shop_name);
        nameTextView.setText(shop.getName());

        TextView addressTextView = (TextView) listItemView.findViewById(R.id.shop_address);
        addressTextView.setText(shop.getAddress());

        return listItemView;
    }
}
