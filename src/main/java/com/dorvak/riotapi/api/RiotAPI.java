package com.dorvak.riotapi.api;

import com.dorvak.riotapi.api.impl.RiotAPIImpl;

public abstract class RiotAPI {

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(String apiKey) {
        return new Builder(apiKey);
    }

    public abstract DataDragonAPI getDataDragonAPI();

    public static class Builder {
        private String apiKey;

        public Builder() {
        }

        public Builder(String apiKey) {
            this.apiKey = apiKey;
        }

        public String getApiKey() {
            return apiKey;
        }

        public Builder setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }

        public RiotAPI build() {
            return new RiotAPIImpl(this);
        }
    }
}
