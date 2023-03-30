package com.dorvak.riotapi.model;

import java.util.Map;

public class RiotDataList<T> {
    private String type;
    private String version;
    private Map<String, T> data;

    public String getType() {
        return type;
    }

    public String getVersion() {
        return version;
    }

    public Map<String, T> getData() {
        return data;
    }

    @Override
    public String toString() {
        return "RiotDataList{" +
                "type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", data=" + data +
                '}';
    }
}