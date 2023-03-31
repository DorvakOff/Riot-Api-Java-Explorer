package com.dorvak.riotapi.api;

import com.dorvak.riotapi.model.Summoner;

public interface SummonerAPI {

    Summoner getSummonerByName(GameRegion region, String name);

    RiotAPI getRiotAPI();
}
