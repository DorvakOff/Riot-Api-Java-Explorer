package com.dorvak.riotapi;

import com.dorvak.riotapi.api.GameRegion;
import com.dorvak.riotapi.http.Endpoint;
import com.dorvak.riotapi.model.Summoner;
import com.dorvak.riotapi.utils.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SummonerTest extends ApiTestClass {

    @Test
    @DisplayName("Get a player by name")
    void getPlayerByName() {
        PrintUtils.print(Endpoint.RIOT_TFT_SUMMONER);
        Summoner summoner = summonerAPI.getSummonerByName(GameRegion.EUW1, "My ADC is Bard");

        assertNotNull(summoner);

        PrintUtils.print(summoner);
    }
}
