package com.dorvak.riotapi.api.impl;

import com.dorvak.riotapi.api.GameRegion;
import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.model.Summoner;

import java.util.List;

public class SummonerImpl extends Summoner {

    @Override
    public List<String> getTFTMatches() {
        return riotAPI.getMatchAPI().getTFTMatches(getRegion(), getPuuid());
    }

    public void setRiotAPI(RiotAPI riotAPI) {
        this.riotAPI = riotAPI;
    }

    public void setGameRegion(GameRegion region) {
        this.region = region;
    }
}
