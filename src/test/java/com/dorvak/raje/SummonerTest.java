package com.dorvak.raje;

import com.dorvak.raje.api.GameRegion;
import com.dorvak.raje.http.Endpoint;
import com.dorvak.raje.model.games.common.Summoner;
import com.dorvak.raje.utils.PrintUtils;
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
