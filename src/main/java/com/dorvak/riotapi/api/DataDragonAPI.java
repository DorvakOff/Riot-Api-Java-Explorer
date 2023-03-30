package com.dorvak.riotapi.api;

import com.dorvak.riotapi.model.tft.augment.TFTAugmentList;
import com.dorvak.riotapi.model.tft.augment.hero.TFTHeroAugmentList;
import com.dorvak.riotapi.model.tft.champion.TFTChampionList;
import com.dorvak.riotapi.model.tft.item.TFTItemList;
import com.dorvak.riotapi.model.tft.trait.TFTTraitList;

import java.util.List;

public interface DataDragonAPI {

    String DATA_DRAGON_URL = "https://ddragon.leagueoflegends.com/";

    TFTChampionList getTFTChampionList(String version, String locale);

    List<String> getVersions();

    TFTTraitList getTFTTraitList(String version, String locale);

    TFTItemList getTFTItemList(String version, String locale);

    TFTAugmentList getTFTAugmentList(String version, String locale);

    TFTHeroAugmentList getTFTHeroAugmentList(String version, String locale);
}
