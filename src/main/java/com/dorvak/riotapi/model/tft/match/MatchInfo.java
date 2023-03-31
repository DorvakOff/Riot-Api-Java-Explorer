package com.dorvak.riotapi.model.tft.match;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class MatchInfo {
    @JsonProperty("game_datetime")
    public long gameDatetime;
    @JsonProperty("game_length")
    public double gameLength;
    @JsonProperty("game_version")
    public String gameVersion;
    public List<Participant> participants;
    @JsonProperty("queue_id")
    public int queueId;
    @JsonProperty("tft_game_type")
    public String tftGameType;
    @JsonProperty("tft_set_core_name")
    public String tftSetCoreName;
    @JsonProperty("tft_set_number")
    public int tftSetNumber;

    public long getGameDatetime() {
        return gameDatetime;
    }

    public double getGameLength() {
        return gameLength;
    }

    public String getGameVersion() {
        return gameVersion;
    }

    public List<Participant> getParticipants() {
        return participants;
    }

    public int getQueueId() {
        return queueId;
    }

    public String getTftGameType() {
        return tftGameType;
    }

    public String getTftSetCoreName() {
        return tftSetCoreName;
    }

    public int getTftSetNumber() {
        return tftSetNumber;
    }

    @Override
    public String toString() {
        return "MatchInfo{" +
                "gameDatetime=" + gameDatetime +
                ", gameLength=" + gameLength +
                ", gameVersion='" + gameVersion + '\'' +
                ", participants=" + participants +
                ", queueId=" + queueId +
                ", tftGameType='" + tftGameType + '\'' +
                ", tftSetCoreName='" + tftSetCoreName + '\'' +
                ", tftSetNumber=" + tftSetNumber +
                '}';
    }
}