package com.dorvak.riotapi;

import com.dorvak.riotapi.api.DataDragonAPI;
import com.dorvak.riotapi.api.MatchAPI;
import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.api.SummonerAPI;
import com.dorvak.riotapi.utils.PrintUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public abstract class ApiTestClass {

    static RiotAPI api;
    static DataDragonAPI dataDragonAPI;
    static SummonerAPI summonerAPI;
    static MatchAPI matchAPI;
    public static String version;

    @BeforeAll
    static void setup() {
        api = RiotAPI.builder(TestSecrets.API_KEY).build();
        dataDragonAPI = api.getDataDragonAPI();
        summonerAPI = api.getSummonerAPI();
        matchAPI = api.getMatchAPI();
        version = dataDragonAPI.getVersions().get(0);
    }

    @AfterEach
    void separator() {
        PrintUtils.separator();
    }

    @BeforeEach
    void printTestName(TestInfo testInfo) {
        PrintUtils.separator("Test: " + testInfo.getDisplayName());
    }
}
