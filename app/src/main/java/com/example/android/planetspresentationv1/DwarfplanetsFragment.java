package com.example.android.planetspresentationv1;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class DwarfplanetsFragment extends Fragment {

    public DwarfplanetsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.planets_list, container, false);

        // Create an ArrayList of Strings to create a list of planets.

        final ArrayList<Planet> planets = new ArrayList<Planet>();
        planets.add(new Planet(
                this.getString(R.string.pluto_facts),
                this.getString(R.string.pluto_overview),
                this.getString(R.string.pluto_discovery),
                this.getString(R.string.pluto_size),
                this.getString(R.string.pluto_moons),
                this.getString(R.string.pluto_rings),
                R.drawable.pluto
        ));
        planets.add(new Planet(
                this.getString(R.string.ceres_facts),
                this.getString(R.string.ceres_overview),
                this.getString(R.string.ceres_discovery),
                this.getString(R.string.ceres_size),
                this.getString(R.string.ceres_moons),
                this.getString(R.string.ceres_rings),
                R.drawable.ceres
        ));

        planets.add(new Planet(
                this.getString(R.string.makemake_facts),
                this.getString(R.string.makemake_overview),
                this.getString(R.string.makemake_discovery),
                this.getString(R.string.makemake_size),
                this.getString(R.string.makemake_moons),
                this.getString(R.string.makemake_rings),
                R.drawable.makemake
        ));

        planets.add(new Planet(
                this.getString(R.string.haumea_facts),
                this.getString(R.string.haumea_overview),
                this.getString(R.string.haumea_discovery),
                this.getString(R.string.haumea_size),
                this.getString(R.string.haumea_moons),
                this.getString(R.string.haumea_rings),
                R.drawable.haumea
        ));

        planets.add(new Planet(
                this.getString(R.string.eris_facts),
                this.getString(R.string.eris_overview),
                this.getString(R.string.eris_discovery),
                this.getString(R.string.eris_size),
                this.getString(R.string.eris_moons),
                this.getString(R.string.eris_rings),
                R.drawable.eris
        ));

        // Create an {@link PlanetAdapter}, whose data source is a list of {@link Planet}s. The
        // adapter knows how to create list items for each item in the list.
        PlanetAdapter adapter = new PlanetAdapter(getActivity(), planets, R.color.category_dwarfplanets);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlanetAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Planet} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }
}