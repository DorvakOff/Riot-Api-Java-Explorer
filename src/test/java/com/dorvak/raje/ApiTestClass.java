package com.dorvak.raje;

import com.dorvak.raje.api.DataDragonAPI;
import com.dorvak.raje.api.MatchAPI;
import com.dorvak.raje.api.RAJEAPI;
import com.dorvak.raje.api.SummonerAPI;
import com.dorvak.raje.utils.PrintUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.TestInfo;

public abstract class ApiTestClass {

    static RAJEAPI api;
    static DataDragonAPI dataDragonAPI;
    static SummonerAPI summonerAPI;
    static MatchAPI matchAPI;
    public static String version;

    @BeforeAll
    static void setup() {
        api = RAJEAPI.builder(TestSecrets.API_KEY).build();
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
