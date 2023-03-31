package com.dorvak.raje.model.games.tft.augment;

import com.dorvak.raje.model.shared.RiotData;
import com.dorvak.raje.model.shared.RiotDataList;
import org.codehaus.jackson.annotate.JsonProperty;

public class TFTAugmentList extends RiotDataList<TFTAugment> {

    @JsonProperty("augment-container")
    private RiotData augmentContainer;

    public RiotData getAugmentContainer() {
        return augmentContainer;
    }

    @Override
    public String toString() {
        return "TFTAugmentList{" +
                "augmentContainer=" + augmentContainer +
                ", type='" + getType() + '\'' +
                ", version='" + getVersion() + '\'' +
                ", data=" + getData() +
                '}';
    }
}
