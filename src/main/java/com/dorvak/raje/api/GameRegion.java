package com.dorvak.raje.api;

public enum GameRegion {

    BR1("americas"),
    EUN1("europe"),
    EUW1("europe"),
    JP1("asia"),
    KR("asia"),
    LA1("americas"),
    LA2("americas"),
    NA1("americas"),
    OC1("americas"),
    TR1("europe"),
    RU("europe"),
    PH2("asia"),
    SG2("asia"),
    TH2("asia"),
    TW2("asia"),
    VN2("asia");


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
