package com.dorvak.riotapi.api.impl;

import com.dorvak.riotapi.api.DataDragonAPI;
import com.dorvak.riotapi.api.RiotAPI;

public class RiotAPIImpl extends RiotAPI {

    private DataDragonAPI dataDragonAPI;
    private String apiKey;

    public RiotAPIImpl(Builder builder) {
        this.apiKey = builder.getApiKey();
        this.dataDragonAPI = new DataDragonAPIImpl(apiKey);
    }

    @Override
    public DataDragonAPI getDataDragonAPI() {
        return dataDragonAPI;
    }
}
