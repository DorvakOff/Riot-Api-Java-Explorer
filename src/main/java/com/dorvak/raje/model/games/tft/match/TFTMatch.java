package com.dorvak.raje.model.games.tft.match;

public class TFTMatch {
    private MatchMetadata metadata;
    private MatchInfo info;

    public MatchMetadata getMetadata() {
        return metadata;
    }

    public MatchInfo getInfo() {
        return info;
    }

    @Override
    public String toString() {
        return "TFTMatch{" +
                "metadata=" + metadata +
                ", info=" + info +
                '}';
    }
}