package com.dorvak.riotapi.model.tft.match;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.List;

public class MatchMetadata {
    @JsonProperty("data_version")
    public String dataVersion;
    @JsonProperty("match_id")
    public String matchId;
    public List<String> participants;

    public String getDataVersion() {
        return dataVersion;
    }

    public String getMatchId() {
        return matchId;
    }

    public List<String> getParticipants() {
        return participants;
    }

    @Override
    public String toString() {
        return "MatchMetadata{" +
                "dataVersion='" + dataVersion + '\'' +
                ", matchId='" + matchId + '\'' +
                ", participants=" + participants +
                '}';
    }
}