package com.dorvak.riotapi;

import com.dorvak.riotapi.api.DataDragonAPI;
import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.http.Endpoint;
import com.dorvak.riotapi.model.tft.augment.TFTAugmentList;
import com.dorvak.riotapi.model.tft.augment.hero.TFTHeroAugmentList;
import com.dorvak.riotapi.model.tft.champion.TFTChampionList;
import com.dorvak.riotapi.model.tft.item.TFTItemList;
import com.dorvak.riotapi.model.tft.trait.TFTTraitList;
import com.dorvak.riotapi.utils.PrintUtils;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static com.dorvak.riotapi.utils.AssertUtils.assertNotEmpty;
import static com.dorvak.riotapi.utils.PrintUtils.print;

public class DataDragonTest {

    static DataDragonAPI dataDragonAPI;
    public static String version;

    @BeforeAll
    static void setup() {
        RiotAPI riotAPI = RiotAPI.builder().build();
        dataDragonAPI = riotAPI.getDataDragonAPI();
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

    @Test
    @DisplayName("Get TFT Champions")
    void getTFTChampions() {
        print(Endpoint.DATA_DRAGON_TFT_CHAMPIONS);

        TFTChampionList tftChampionList = dataDragonAPI.getTFTChampionList(version, TestSecrets.LOCALE);

        assertNotEmpty(tftChampionList.getData());
        print(tftChampionList);

        print("Champion: " + tftChampionList.getData().values().iterator().next().getName());
    }

    @Test
    @DisplayName("Get TFT Traits")
    void getTFTTraits() {
        print(Endpoint.DATA_DRAGON_TFT_TRAITS);

        TFTTraitList tftTraitList = dataDragonAPI.getTFTTraitList(version, TestSecrets.LOCALE);

        assertNotEmpty(tftTraitList.getData());
        print(tftTraitList);

        print("Trait: " + tftTraitList.getData().values().iterator().next().getName());
    }

    @Test
    @DisplayName("Get TFT Items")
    void getTFTItems() {
        print(Endpoint.DATA_DRAGON_TFT_ITEMS);

        TFTItemList tftItemList = dataDragonAPI.getTFTItemList(version, TestSecrets.LOCALE);

        assertNotEmpty(tftItemList.getData());
        print(tftItemList);

        print("Item: " + tftItemList.getData().values().iterator().next().getName());
    }

    @Test
    @DisplayName("Get TFT Augments")
    void getTFTAugments() {
        print(Endpoint.DATA_DRAGON_TFT_AUGMENTS);

        TFTAugmentList tftAugmentList = dataDragonAPI.getTFTAugmentList(version, TestSecrets.LOCALE);

        assertNotEmpty(tftAugmentList.getData());
        print(tftAugmentList);

        print("Augment: " + tftAugmentList.getData().values().iterator().next().getName());
    }

    @Test
    @DisplayName("Get TFT Hero Augments")
    void getTFTHeroAugments() {
        print(Endpoint.DATA_DRAGON_TFT_HERO_AUGMENTS);

        TFTHeroAugmentList tftHeroAugmentList = dataDragonAPI.getTFTHeroAugmentList(version, TestSecrets.LOCALE);

        assertNotEmpty(tftHeroAugmentList.getData());
        print(tftHeroAugmentList);

        print("Hero Augment: " + tftHeroAugmentList.getData().values().iterator().next().getName());
    }

}
