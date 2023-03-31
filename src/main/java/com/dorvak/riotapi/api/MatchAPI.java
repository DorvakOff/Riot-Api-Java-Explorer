package com.dorvak.riotapi.api;

import com.dorvak.riotapi.model.games.tft.match.TFTMatch;

import java.time.Instant;
import java.util.List;

public interface MatchAPI {

    List<String> getTFTMatches(GameRegion region, String puuid);

    TFTMatch getTFTMatch(GameRegion region, String matchId);

    List<String> getTFTMatches(GameRegion region, String puuid, Integer start, Instant startTime, Instant endTime, Integer count);

    RiotAPI getRiotAPI();
}
