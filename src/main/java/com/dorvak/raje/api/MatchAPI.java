package com.dorvak.raje.api;

import com.dorvak.raje.model.games.tft.match.TFTMatch;

import java.time.Instant;
import java.util.List;

public interface MatchAPI {

    List<String> getTFTMatches(GameRegion region, String puuid);

    TFTMatch getTFTMatch(GameRegion region, String matchId);

    List<String> getTFTMatches(GameRegion region, String puuid, Integer start, Instant startTime, Instant endTime, Integer count);

    RAJEAPI getRAJEAPI();
}
