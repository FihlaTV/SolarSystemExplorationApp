package com.example.android.planetspresentationv1;

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

public class UsualplanetsFragment extends Fragment {

    public UsualplanetsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.planets_list, container, false);

        // Create an ArrayList of Strings to create a list of planets.

        final ArrayList<Planet> planets = new ArrayList<Planet>();
        planets.add(new Planet(
                this.getString(R.string.mercury_facts),
                this.getString(R.string.mercury_overview),
                this.getString(R.string.mercury_discovery),
                this.getString(R.string.mercury_size),
                this.getString(R.string.mercury_moons),
                this.getString(R.string.mercury_rings),
                R.drawable.mercury
        ));

        planets.add(new Planet(
                this.getString(R.string.venus_facts),
                this.getString(R.string.venus_overview),
                this.getString(R.string.venus_discovery),
                this.getString(R.string.venus_size),
                this.getString(R.string.venus_moons),
                this.getString(R.string.venus_rings),
                R.drawable.venus
        ));

        planets.add(new Planet(
                this.getString(R.string.earth_facts),
                this.getString(R.string.earth_overview),
                this.getString(R.string.earth_discovery),
                this.getString(R.string.earth_size),
                this.getString(R.string.earth_moons),
                this.getString(R.string.earth_rings),
                R.drawable.earth
        ));

        planets.add(new Planet(
                this.getString(R.string.mars_facts),
                this.getString(R.string.mars_overview),
                this.getString(R.string.mars_discovery),
                this.getString(R.string.mars_size),
                this.getString(R.string.mars_moons),
                this.getString(R.string.mars_rings),
                R.drawable.mars
        ));

        planets.add(new Planet(
                this.getString(R.string.jupiter_facts),
                this.getString(R.string.jupiter_overview),
                this.getString(R.string.jupiter_discovery),
                this.getString(R.string.jupiter_size),
                this.getString(R.string.jupiter_moons),
                this.getString(R.string.jupiter_rings),
                R.drawable.jupiter
        ));

        planets.add(new Planet(
                this.getString(R.string.saturn_facts),
                this.getString(R.string.saturn_overview),
                this.getString(R.string.saturn_discovery),
                this.getString(R.string.saturn_size),
                this.getString(R.string.saturn_moons),
                this.getString(R.string.saturn_rings),
                R.drawable.saturn
        ));

        planets.add(new Planet(
                this.getString(R.string.uranus_facts),
                this.getString(R.string.uranus_overview),
                this.getString(R.string.uranus_discovery),
                this.getString(R.string.uranus_size),
                this.getString(R.string.uranus_moons),
                this.getString(R.string.uranus_rings),
                R.drawable.uranus
        ));

        planets.add(new Planet(
                this.getString(R.string.neptune_facts),
                this.getString(R.string.neptune_overview),
                this.getString(R.string.neptune_discovery),
                this.getString(R.string.neptune_size),
                this.getString(R.string.neptune_moons),
                this.getString(R.string.neptune_rings),
                R.drawable.neptune
        ));


        // Create an {@link PlanetAdapter}, whose data source is a list of {@link Planet}s. The
        // adapter knows how to create list items for each item in the list.
        PlanetAdapter adapter = new PlanetAdapter(getActivity(), planets, R.color.category_usualplanets);

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