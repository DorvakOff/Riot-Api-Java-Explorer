package com.dorvak.raje.api;

import com.dorvak.raje.model.games.tft.augment.TFTAugmentList;
import com.dorvak.raje.model.games.tft.augment.hero.TFTHeroAugmentList;
import com.dorvak.raje.model.games.tft.champion.TFTChampionList;
import com.dorvak.raje.model.games.tft.item.TFTItemList;
import com.dorvak.raje.model.games.tft.trait.TFTTraitList;

import java.util.List;

public interface DataDragonAPI {

    TFTChampionList getTFTChampionList(String version, String locale);

    List<String> getVersions();

    TFTTraitList getTFTTraitList(String version, String locale);

    TFTItemList getTFTItemList(String version, String locale);

    TFTAugmentList getTFTAugmentList(String version, String locale);

    TFTHeroAugmentList getTFTHeroAugmentList(String version, String locale);

    RAJEAPI getRAJEAPI();
}
