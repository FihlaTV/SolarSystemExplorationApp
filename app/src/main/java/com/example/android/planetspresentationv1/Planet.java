package com.example.android.planetspresentationv1;

public class Planet {

    /**
     * Quick facts about the planet
     */
    private String mFactsPlanet;

    /**
     * Overview of the planet
     */
    private String mOverviewPlanet;

    /**
     * Discovery of the planet
     */
    private String mDiscoveryPlanet;

    /**
     * Size and distance of the planet
     */
    private String mSizePlanet;

    /**
     * Moons of the planet
     */
    private String mMoonsPlanet;

    /**
     * Rings of the planet
     */
    private String mRingsPlanet;

    /**
     * Image resource ID for the planet
     */
    private int mImageResourceId;

    /**
     * Create a new planet object.
     *
     *
     * @param factsPlanet         is the about the facts of the planet
     * @param overviewPlanet      is an overview about the planet
     * @param discoveryPlanet     is about the discovery of the planet
     * @param sizePlanet          is about the size of the planet
     * @param moonsPlanet         is about the moons of the planet
     * @param ringsPlanet         is about the rings of the planet
     * @param imageResourceId     is the image associated with the planet.
     */

    public Planet(String factsPlanet, String overviewPlanet, String discoveryPlanet, String sizePlanet, String moonsPlanet, String ringsPlanet,int imageResourceId) {


    mFactsPlanet = factsPlanet;
    mOverviewPlanet = overviewPlanet;
    mDiscoveryPlanet = discoveryPlanet;
    mSizePlanet = sizePlanet;
    mMoonsPlanet =moonsPlanet;
    mRingsPlanet =ringsPlanet;
    mImageResourceId= imageResourceId;
}

    /**
     * Get the facts of the planet
     */
    public String getFactsPlanet() {
        return mFactsPlanet;
    }

    /**
     * Get the overview of the planet
     */
    public String getOverviewPlanet() {
        return mOverviewPlanet;
    }

    /**
     * Get the discovery of the planet
     */
    public String getDiscoveryPlanet() {
        return mDiscoveryPlanet;
    }

    /**
     * Get the size of the planet
     */
    public String getSizePlanet() {
        return mSizePlanet;
    }

    /**
     * Get the moons of the planet
     */
    public String getMoonsPlanet() {
        return mMoonsPlanet;
    }

    /**
     * Get the rings of the planet
     */
    public String getRingsPlanet() {
        return mRingsPlanet;
    }

    /**
     * Return the image resource ID of the planet.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }
}
