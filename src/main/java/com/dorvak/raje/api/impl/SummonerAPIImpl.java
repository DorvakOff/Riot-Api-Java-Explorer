package com.dorvak.raje.api.impl;

import com.dorvak.raje.api.GameRegion;
import com.dorvak.raje.api.RAJEAPI;
import com.dorvak.raje.model.games.common.Summoner;
import com.dorvak.raje.api.SummonerAPI;
import com.dorvak.raje.http.Endpoint;
import com.dorvak.raje.http.HttpRequestProcessor;

import java.util.HashMap;
import java.util.Map;

public class SummonerAPIImpl implements SummonerAPI {
    private final HttpRequestProcessor requestProcessor;
    private final RAJEAPI RAJEAPI;

    public SummonerAPIImpl(RAJEAPI api) {
        this.RAJEAPI = api;
        requestProcessor = new HttpRequestProcessor(api.getApiKey());
    }

    @Override
    public Summoner getSummonerByName(GameRegion region, String name) {
        Map<String, String> params = new HashMap<>();
        params.put("region", region.toString());
        params.put("summonerName", name);
        params.put("version", "v1");
        SummonerImpl summoner = requestProcessor.processRequest(Endpoint.RIOT_TFT_SUMMONER, params);
        summoner.setRiotAPI(RAJEAPI);
        summoner.setGameRegion(region);
        return summoner;
    }

    @Override
    public RAJEAPI getRAJEAPI() {
        return RAJEAPI;
    }
}
