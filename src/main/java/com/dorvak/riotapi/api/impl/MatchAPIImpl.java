package com.dorvak.riotapi.api.impl;

import com.dorvak.riotapi.api.GameRegion;
import com.dorvak.riotapi.api.MatchAPI;
import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.http.Endpoint;
import com.dorvak.riotapi.http.HttpRequestProcessor;
import com.dorvak.riotapi.model.tft.match.TFTMatch;

import java.time.Instant;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MatchAPIImpl implements MatchAPI {

    private final RiotAPI riotAPI;
    private final HttpRequestProcessor requestProcessor;

    public MatchAPIImpl(RiotAPIImpl riotAPI) {
        this.riotAPI = riotAPI;
        this.requestProcessor = new HttpRequestProcessor(riotAPI.getApiKey());
    }

    @Override
    public RiotAPI getRiotAPI() {
        return riotAPI;
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
