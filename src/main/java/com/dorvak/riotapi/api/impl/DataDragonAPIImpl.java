package com.dorvak.riotapi.api.impl;

import com.dorvak.riotapi.api.DataDragonAPI;
import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.http.Endpoint;
import com.dorvak.riotapi.http.HttpRequestProcessor;
import com.dorvak.riotapi.model.games.tft.augment.TFTAugmentList;
import com.dorvak.riotapi.model.games.tft.augment.hero.TFTHeroAugmentList;
import com.dorvak.riotapi.model.games.tft.champion.TFTChampionList;
import com.dorvak.riotapi.model.games.tft.item.TFTItemList;
import com.dorvak.riotapi.model.games.tft.trait.TFTTraitList;

import java.util.Arrays;
import java.util.List;

public class DataDragonAPIImpl implements DataDragonAPI {
    private final HttpRequestProcessor requestProcessor;

    public DataDragonAPIImpl(RiotAPIImpl api) {
        this.requestProcessor = new HttpRequestProcessor(api.getApiKey());
    }

    @Override
    public TFTChampionList getTFTChampionList(String version, String locale) {
        return requestProcessor.processRequest(Endpoint.DATA_DRAGON_TFT_CHAMPIONS, version, locale);
    }

    @Override
    public List<String> getVersions() {
        return Arrays.asList(requestProcessor.processRequest(Endpoint.DATA_DRAGON_VERSIONS));
    }

    @Override
    public TFTTraitList getTFTTraitList(String version, String locale) {
        return requestProcessor.processRequest(Endpoint.DATA_DRAGON_TFT_TRAITS, version, locale);
    }

    @Override
    public TFTItemList getTFTItemList(String version, String locale) {
        return requestProcessor.processRequest(Endpoint.DATA_DRAGON_TFT_ITEMS, version, locale);
    }

    @Override
    public TFTAugmentList getTFTAugmentList(String version, String locale) {
        return requestProcessor.processRequest(Endpoint.DATA_DRAGON_TFT_AUGMENTS, version, locale);
    }

    @Override
    public TFTHeroAugmentList getTFTHeroAugmentList(String version, String locale) {
        return requestProcessor.processRequest(Endpoint.DATA_DRAGON_TFT_HERO_AUGMENTS, version, locale);
    }

    @Override
    public RiotAPI getRiotAPI() {
        return null;
    }
}
