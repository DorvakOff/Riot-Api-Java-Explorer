package com.dorvak.raje.api;

import com.dorvak.raje.model.games.common.Summoner;

public interface SummonerAPI {

    Summoner getSummonerByName(GameRegion region, String name);

    RAJEAPI getRAJEAPI();
}
