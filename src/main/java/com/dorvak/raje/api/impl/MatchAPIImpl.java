package com.dorvak.raje.api.impl;

import com.dorvak.raje.api.GameRegion;
import com.dorvak.raje.api.MatchAPI;
import com.dorvak.raje.api.RAJEAPI;
import com.dorvak.raje.http.Endpoint;
import com.dorvak.raje.http.HttpRequestProcessor;
import com.dorvak.raje.model.games.tft.match.TFTMatch;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchAPIImpl implements MatchAPI {

    private final RAJEAPI RAJEAPI;
    private final HttpRequestProcessor requestProcessor;

    public MatchAPIImpl(RAJEAPIImpl riotAPI) {
        this.RAJEAPI = riotAPI;
        this.requestProcessor = new HttpRequestProcessor(riotAPI.getApiKey());
    }

    @Override
    public RAJEAPI getRAJEAPI() {
        return RAJEAPI;
    }

    @Override
    public List<String> getTFTMatches(GameRegion region, String puuid) {
        return this.getTFTMatches(region, puuid, null, null, null, null);
    }

    @Override
    public TFTMatch getTFTMatch(GameRegion gameRegion, String matchId) {
        Map<String, String> params = new HashMap<>();
        params.put("region", gameRegion.getMainRegion());
        params.put("version", "v1");
        params.put("matchId", matchId);
        return requestProcessor.processRequest(Endpoint.RIOT_TFT_MATCH, params);
    }

    @Override
    public List<String> getTFTMatches(GameRegion region, String puuid, Integer start, Instant startTime, Instant endTime, Integer count) {
        Map<String, String> params = new HashMap<>();
        params.put("region", region.getMainRegion());
        params.put("version", "v1");
        params.put("puuid", puuid);

        if (start != null)
            params.put("start", String.valueOf(Integer.max(0, start)));
        if (count != null)
            params.put("count", String.valueOf(Integer.max(0, count)));
        if (startTime != null)
            params.put("startTime", String.valueOf(startTime.toEpochMilli()));
        if (endTime != null)
            params.put("endTime", String.valueOf(endTime.toEpochMilli()));

        return Arrays.asList(requestProcessor.processRequest(Endpoint.RIOT_TFT_MATCHES, params));
    }
}
