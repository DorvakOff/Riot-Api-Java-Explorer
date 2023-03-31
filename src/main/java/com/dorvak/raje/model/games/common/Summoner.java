package com.dorvak.raje.model.games.common;

import com.dorvak.raje.api.GameRegion;
import com.dorvak.raje.api.RAJEAPI;
import org.codehaus.jackson.annotate.JsonIgnore;

import java.util.List;

public abstract class Summoner {

    private String accountId;
    private int profileIconId;
    private long revisionDate;
    private String name;
    private String id;
    private String puuid;
    private long summonerLevel;
    @JsonIgnore
    protected RAJEAPI riotAPI;
    @JsonIgnore
    protected GameRegion region;

    public int getProfileIconId() {
        return profileIconId;
    }

    public String getAccountId() {
        return accountId;
    }

    public long getRevisionDate() {
        return revisionDate;
    }

    public long getSummonerLevel() {
        return summonerLevel;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPuuid() {
        return puuid;
    }

    public abstract List<String> getTFTMatches();

    public RAJEAPI getRiotAPI() {
        return riotAPI;
    }

    public GameRegion getRegion() {
        return region;
    }

    @Override
    public String toString() {
        return "Summoner{" +
                "accountId='" + accountId + '\'' +
                ", profileIconId=" + profileIconId +
                ", revisionDate=" + revisionDate +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", puuid='" + puuid + '\'' +
                ", summonerLevel=" + summonerLevel +
                '}';
    }
}
