package com.dorvak.riotapi.model.tft.match;

import org.codehaus.jackson.annotate.JsonProperty;

public class Trait {
    public String name;
    @JsonProperty("num_units")
    public int numUnits;
    public int style;
    @JsonProperty("tier_current")
    public int tierCurrent;
    @JsonProperty("tier_total")
    public int tierTotal;

    public String getName() {
        return name;
    }

    public int getNumUnits() {
        return numUnits;
    }

    public int getStyle() {
        return style;
    }

    public int getTierCurrent() {
        return tierCurrent;
    }

    public int getTierTotal() {
        return tierTotal;
    }

    public boolean isActive() {
        return getTierCurrent() > 0;
    }

    @Override
    public String toString() {
        return "Trait{" +
                "name='" + name + '\'' +
                ", numUnits=" + numUnits +
                ", style=" + style +
                ", tierCurrent=" + tierCurrent +
                ", tierTotal=" + tierTotal +
                ", active=" + isActive() +
                '}';
    }
}

