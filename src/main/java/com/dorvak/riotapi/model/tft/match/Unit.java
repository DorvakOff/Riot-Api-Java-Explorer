package com.dorvak.riotapi.model.tft.match;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class Unit{
    @JsonProperty("character_id")
    public String characterId;
    public List<String> itemNames;
    public String name;
    public int rarity;
    public int tier;

    public String getCharacterId() {
        return characterId;
    }

    public void setCharacterId(String characterId) {
        this.characterId = characterId;
    }

    public List<String> getItemNames() {
        return itemNames;
    }

    public void setItemNames(List<String> itemNames) {
        this.itemNames = itemNames;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "characterId='" + characterId + '\'' +
                ", itemNames=" + itemNames +
                ", name='" + name + '\'' +
                ", rarity=" + rarity +
                ", tier=" + tier +
                '}';
    }
}