package com.dorvak.riotapi.model.tft.match;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class Participant {
    public List<String> augments;
    public Companion companion;
    @JsonProperty("gold_left")
    public int goldLeft;
    @JsonProperty("last_round")
    public int lastRound;
    public int level;
    public int placement;
    @JsonProperty("players_eliminated")
    public int playersEliminated;
    public String puuid;
    @JsonProperty("time_eliminated")
    public double timeEliminated;
    @JsonProperty("total_damage_to_players")
    public int totalDamageToPlayers;
    public List<Trait> traits;
    public List<Unit> units;

    public List<String> getAugments() {
        return augments;
    }

    public Companion getCompanion() {
        return companion;
    }

    public int getGoldLeft() {
        return goldLeft;
    }

    public int getLastRound() {
        return lastRound;
    }

    public int getLevel() {
        return level;
    }

    public int getPlacement() {
        return placement;
    }

    public int getPlayersEliminated() {
        return playersEliminated;
    }

    public String getPuuid() {
        return puuid;
    }

    public double getTimeEliminated() {
        return timeEliminated;
    }

    public int getTotalDamageToPlayers() {
        return totalDamageToPlayers;
    }

    public List<Trait> getTraits() {
        return traits;
    }

    public List<Unit> getUnits() {
        return units;
    }

    public List<Trait> getActiveTraits() {
        return getTraits().stream().filter(Trait::isActive).toList();
    }

    @Override
    public String toString() {
        return "Participant{" +
                "augments=" + augments +
                ", companion=" + companion +
                ", goldLeft=" + goldLeft +
                ", lastRound=" + lastRound +
                ", level=" + level +
                ", placement=" + placement +
                ", playersEliminated=" + playersEliminated +
                ", puuid='" + puuid + '\'' +
                ", timeEliminated=" + timeEliminated +
                ", totalDamageToPlayers=" + totalDamageToPlayers +
                ", traits=" + traits +
                ", activeTraits=" + getActiveTraits() +
                ", units=" + units +
                '}';
    }
}