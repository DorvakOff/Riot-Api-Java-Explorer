package com.dorvak.raje.api.impl;

import com.dorvak.raje.api.DataDragonAPI;
import com.dorvak.raje.api.MatchAPI;
import com.dorvak.raje.api.RAJEAPI;
import com.dorvak.raje.api.SummonerAPI;

public class RAJEAPIImpl extends RAJEAPI {

    private final DataDragonAPI dataDragonAPI;
    private final SummonerAPI summonerAPI;
    private final MatchAPI matchAPI;
    private final String apiKey;

    public RAJEAPIImpl(Builder builder) {
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
