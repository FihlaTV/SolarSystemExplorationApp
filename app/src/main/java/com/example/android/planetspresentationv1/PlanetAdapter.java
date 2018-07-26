package com.example.android.planetspresentationv1;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class PlanetAdapter extends ArrayAdapter<Planet> {

    private int mColorResourceId;

    public PlanetAdapter(Activity context, ArrayList<Planet> planets, int colorResourceId) {
        super(context, 0, planets);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Planet currentPlanet = getItem(position);

        TextView factsTextView = (TextView) listItemView.findViewById(R.id.factsTextView);
        factsTextView.setText(currentPlanet.getFactsPlanet());

        TextView overviewTextView = (TextView) listItemView.findViewById(R.id.overviewTextView);
        overviewTextView.setText(currentPlanet.getOverviewPlanet());

        TextView discoveryTextView = (TextView) listItemView.findViewById(R.id.discoveryTextView);
        discoveryTextView.setText(currentPlanet.getDiscoveryPlanet());

        TextView sizeTextView = (TextView) listItemView.findViewById(R.id.sizeTextView);
        sizeTextView.setText(currentPlanet.getSizePlanet());

        TextView moonsTextView = (TextView) listItemView.findViewById(R.id.moonsTextView);
        moonsTextView.setText(currentPlanet.getMoonsPlanet());

        TextView ringsTextView = (TextView) listItemView.findViewById(R.id.ringsTextView);
        ringsTextView.setText(currentPlanet.getRingsPlanet());

        ImageView photoImageView = (ImageView) listItemView.findViewById(R.id.photoImageView);
        photoImageView.setImageResource(currentPlanet.getImageResourceId());

        View textContainer = listItemView.findViewById(R.id.text_container);
        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        return listItemView;
    }
}