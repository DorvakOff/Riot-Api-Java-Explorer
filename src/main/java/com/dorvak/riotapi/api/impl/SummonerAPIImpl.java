package com.dorvak.riotapi.api.impl;

import com.dorvak.riotapi.api.GameRegion;
import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.model.Summoner;
import com.dorvak.riotapi.api.SummonerAPI;
import com.dorvak.riotapi.http.Endpoint;
import com.dorvak.riotapi.http.HttpRequestProcessor;

import java.util.HashMap;
import java.util.Map;

public class SummonerAPIImpl implements SummonerAPI {
    private final HttpRequestProcessor requestProcessor;
    private final RiotAPI riotAPI;

    public SummonerAPIImpl(RiotAPI api) {
        this.riotAPI = api;
        requestProcessor = new HttpRequestProcessor(api.getApiKey());
    }

    @Override
    public Summoner getSummonerByName(GameRegion region, String name) {
        Map<String, String> params = new HashMap<>();
        params.put("region", region.toString());
        params.put("summonerName", name);
        params.put("version", "v1");
        SummonerImpl summoner = requestProcessor.processRequest(Endpoint.RIOT_TFT_SUMMONER, params);
        summoner.setRiotAPI(riotAPI);
        summoner.setGameRegion(region);
        return summoner;
    }

    @Override
    public RiotAPI getRiotAPI() {
        return riotAPI;
    }
}
