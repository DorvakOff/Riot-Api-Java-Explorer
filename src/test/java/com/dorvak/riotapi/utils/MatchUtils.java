package com.dorvak.riotapi.utils;

import com.dorvak.riotapi.model.tft.match.Participant;
import com.dorvak.riotapi.model.tft.match.TFTMatch;

public class MatchUtils {


    public static Participant findParticipant(TFTMatch match, String puuid) {
        if (!match.getMetadata().getParticipants().contains(puuid)) {
            throw new IllegalArgumentException("The given puuid is not in the match");
        }
        return match.getInfo().getParticipants().stream().filter(p -> p.getPuuid().equals(puuid)).findFirst().orElse(null);
    }
}
