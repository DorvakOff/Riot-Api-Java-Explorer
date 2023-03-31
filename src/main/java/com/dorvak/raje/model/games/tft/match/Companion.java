package com.dorvak.raje.model.games.tft.match;

import org.codehaus.jackson.annotate.JsonProperty;

public class Companion {

    @JsonProperty("content_ID")
    public String contentId;
    @JsonProperty("item_ID")
    public int itemId;
    @JsonProperty("skin_ID")
    public int skinId;
    public String species;

    public String getContentId() {
        return contentId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getSkinId() {
        return skinId;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Companion{" +
                "contentId='" + contentId + '\'' +
                ", itemId=" + itemId +
                ", skinId=" + skinId +
                ", species='" + species + '\'' +
                '}';
    }
}