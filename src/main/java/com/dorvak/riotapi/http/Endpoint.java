package com.dorvak.riotapi.http;

import com.dorvak.riotapi.api.RiotAPI;
import com.dorvak.riotapi.api.impl.SummonerImpl;
import com.dorvak.riotapi.model.tft.augment.TFTAugmentList;
import com.dorvak.riotapi.model.tft.augment.hero.TFTHeroAugmentList;
import com.dorvak.riotapi.model.tft.champion.TFTChampionList;
import com.dorvak.riotapi.model.tft.item.TFTItemList;
import com.dorvak.riotapi.model.tft.match.TFTMatch;
import com.dorvak.riotapi.model.tft.trait.TFTTraitList;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Endpoint {

    DATA_DRAGON_TFT_CHAMPIONS(RiotAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-champion.json", TFTChampionList.class, false),
    DATA_DRAGON_VERSIONS(RiotAPI.DATA_DRAGON_URL, "api/versions.json", String[].class, false),
    DATA_DRAGON_TFT_TRAITS(RiotAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-trait.json", TFTTraitList.class, false),
    DATA_DRAGON_TFT_ITEMS(RiotAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-item.json", TFTItemList.class, false),
    DATA_DRAGON_TFT_HERO_AUGMENTS(RiotAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-hero-augments.json", TFTHeroAugmentList.class, false),
    DATA_DRAGON_TFT_AUGMENTS(RiotAPI.DATA_DRAGON_URL, "cdn/{version}/data/{locale}/tft-augments.json", TFTAugmentList.class, false),

    RIOT_TFT_SUMMONER(RiotAPI.RIOT_API_URL, "tft/summoner/{version}/summoners/by-name/{summonerName}", SummonerImpl.class),
    RIOT_TFT_MATCHES(RiotAPI.RIOT_API_URL, "tft/match/{version}/matches/by-puuid/{puuid}/ids", String[].class, "start", "endTime", "startTime", "count"),
    RIOT_TFT_MATCH(RiotAPI.RIOT_API_URL, "tft/match/{version}/matches/{matchId}", TFTMatch.class);



    private final String url;
    private final String path;
    private final Class<?> type;
    private final boolean authRequired;
    private final List<String> queryParams;

    Endpoint(String url, String path, Class<?> type, boolean authRequired, String... queryParams) {
        this.url = url;
        this.path = path;
        this.type = type;
        this.authRequired = authRequired;
        this.queryParams = Arrays.asList(queryParams);
    }

    Endpoint(String url, String path, Class<?> type) {
        this(url, path, type, true);
    }

    Endpoint(String url, String path, Class<?> type, String... queryParams) {
        this(url, path, type, true, queryParams);
    }

    public Class<?> getType() {
        return type;
    }

    public String getFullUrl(String version, String locale, Map<String, String> params) {
        String fullUrl = url + (path.startsWith("/") ? path.substring(1) : path);
        params.put("version", version);
        params.put("locale", locale);
        for (Map.Entry<String, String> entry : params.entrySet()) {
            if (entry.getValue() == null) {
                continue;
            }
            fullUrl = fullUrl.replace("{" + entry.getKey() + "}", URLEncoder.encode(entry.getValue(), StandardCharsets.UTF_8));
        }
        return fullUrl;
    }

    public List<String> getQueryParams() {
        return queryParams;
    }

    public boolean isAuthRequired() {
        return authRequired;
    }

    public String getFullUrl(String version, String locale) {
        return getFullUrl(version, locale, new HashMap<>());
    }

}
