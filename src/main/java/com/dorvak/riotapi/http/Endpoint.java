package com.dorvak.riotapi.http;

import com.dorvak.riotapi.api.DataDragonAPI;
import com.dorvak.riotapi.model.tft.augment.hero.TFTHeroAugmentList;
import com.dorvak.riotapi.model.tft.champion.TFTChampionList;
import com.dorvak.riotapi.model.tft.item.TFTItemList;
import com.dorvak.riotapi.model.tft.trait.TFTTraitList;
import com.dorvak.riotapi.model.tft.augment.TFTAugmentList;

import java.util.HashMap;
import java.util.Map;

public enum Endpoint {

    DATA_DRAGON_TFT_CHAMPIONS(DataDragonAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-champion", TFTChampionList.class, false),
    DATA_DRAGON_VERSIONS(DataDragonAPI.DATA_DRAGON_URL, "api/versions", String[].class, false),
    DATA_DRAGON_TFT_TRAITS(DataDragonAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-trait", TFTTraitList.class, false),
    DATA_DRAGON_TFT_ITEMS(DataDragonAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-item", TFTItemList.class, false),
    DATA_DRAGON_TFT_HERO_AUGMENTS(DataDragonAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-hero-augments", TFTHeroAugmentList.class, false),

    DATA_DRAGON_TFT_AUGMENTS(DataDragonAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-augments", TFTAugmentList.class, false)
    ,

    ;

    private final String url;
    private final String path;
    private final Class<?> type;
    private final boolean authRequired;

    Endpoint(String url, String path, Class<?> type, boolean authRequired) {
        this.url = url;
        this.path = path;
        this.type = type;
        this.authRequired = authRequired;
    }

    Endpoint(String url, String path, Class<?> type) {
        this(url, path, type, true);
    }

    public String getUrl() {
        return url;
    }

    public String getPath() {
        return path;
    }

    public Class<?> getType() {
        return type;
    }

    public String getFullUrl(String version, String locale, Map<String, String> params) {
        String fullUrl = url + (path.startsWith("/") ? path.substring(1) : path);
        if (!fullUrl.endsWith(".json")) {
            fullUrl += ".json";
        }
        params.put("version", version);
        params.put("locale", locale);
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            fullUrl = fullUrl.replace("{" + entry.getKey() + "}", entry.getValue());
        }
        return fullUrl;
    }

    public boolean isAuthRequired() {
        return authRequired;
    }

    public String getFullUrl(String version, String locale) {
        return getFullUrl(version, locale, new HashMap<>());
    }

}
