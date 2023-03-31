package com.dorvak.riotapi.api.impl;

import com.dorvak.riotapi.api.DataDragonAPI;
import com.dorvak.riotapi.api.MatchAPI;
import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.api.SummonerAPI;

public class RiotAPIImpl extends RiotAPI {

    private final DataDragonAPI dataDragonAPI;
    private final SummonerAPI summonerAPI;
    private final MatchAPI matchAPI;
    private final String apiKey;

    public RiotAPIImpl(Builder builder) {
        this.apiKey = builder.getApiKey();
        this.dataDragonAPI = new DataDragonAPIImpl(this);
        this.summonerAPI = new SummonerAPIImpl(this);
        this.matchAPI = new MatchAPIImpl(this);
    }

    @Override
    public DataDragonAPI getDataDragonAPI() {
        return dataDragonAPI;
    }

    @Override
    public SummonerAPI getSummonerAPI() {
        return summonerAPI;
    }

    @Override
    public MatchAPI getMatchAPI() {
        return matchAPI;
    }

    @Override
    public String getApiKey() {
        return apiKey;
    }
}
