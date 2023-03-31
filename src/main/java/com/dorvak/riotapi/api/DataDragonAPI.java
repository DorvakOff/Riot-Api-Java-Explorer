package com.dorvak.riotapi.api;

import com.dorvak.riotapi.model.games.tft.augment.TFTAugmentList;
import com.dorvak.riotapi.model.games.tft.augment.hero.TFTHeroAugmentList;
import com.dorvak.riotapi.model.games.tft.champion.TFTChampionList;
import com.dorvak.riotapi.model.games.tft.item.TFTItemList;
import com.dorvak.riotapi.model.games.tft.trait.TFTTraitList;

import java.util.List;

public interface DataDragonAPI {

    TFTChampionList getTFTChampionList(String version, String locale);

    List<String> getVersions();

    TFTTraitList getTFTTraitList(String version, String locale);

    TFTItemList getTFTItemList(String version, String locale);

    TFTAugmentList getTFTAugmentList(String version, String locale);

    TFTHeroAugmentList getTFTHeroAugmentList(String version, String locale);

    RiotAPI getRiotAPI();
}
