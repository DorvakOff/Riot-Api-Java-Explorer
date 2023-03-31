package com.dorvak.raje.api.impl;

import com.dorvak.raje.api.GameRegion;
import com.dorvak.raje.api.RAJEAPI;
import com.dorvak.raje.model.games.common.Summoner;

import java.util.List;

public class SummonerImpl extends Summoner {

    @Override
    public List<String> getTFTMatches() {
        return riotAPI.getMatchAPI().getTFTMatches(getRegion(), getPuuid());
    }

    public void setRiotAPI(RAJEAPI RAJEAPI) {
        this.riotAPI = RAJEAPI;
    }

    public void setGameRegion(GameRegion region) {
        this.region = region;
    }
}
