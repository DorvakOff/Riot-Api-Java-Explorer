package com.dorvak.riotapi.api;

public enum GameRegion {

    EUW1("europe");


    private final String mainRegion;

    GameRegion(String mainRegion) {
        this.mainRegion = mainRegion;
    }

    public String getMainRegion() {
        return mainRegion;
    }

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
