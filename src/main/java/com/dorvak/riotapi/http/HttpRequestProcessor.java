package com.dorvak.riotapi.http;

import org.codehaus.jackson.map.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;

public class HttpRequestProcessor {

    public static final String X_RIOT_TOKEN = "X-Riot-Token";
    private final String apiKey;
    private final ObjectMapper objectMapper = new ObjectMapper();

    public HttpRequestProcessor(String apiKey) {
        this.apiKey = apiKey;
    }

    public <T> T processRequest(Endpoint endpoint, String version, String locale, Map<String, String> params) {
        try {
            HttpClient client = HttpClient.newHttpClient();

            if (params == null) {
                params = new HashMap<>();
            }

            HttpRequest.Builder builder = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint.getFullUrl(version, locale, params)));

            if (endpoint.isAuthRequired()) {
                builder.header(X_RIOT_TOKEN, apiKey);
            }

            HttpRequest request = builder.build();

            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return (T) objectMapper.readValue(response.body(), endpoint.getType());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public <T> T processRequest(Endpoint endpoint, String version, String locale) {
        return processRequest(endpoint, version, locale, new HashMap<>());
    }

    public <T> T processRequest(Endpoint endpoint) {
        return processRequest(endpoint, null, null, new HashMap<>());
    }
}
