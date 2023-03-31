package com.dorvak.raje.utils;

import com.dorvak.raje.model.games.tft.match.Participant;
import com.dorvak.raje.model.games.tft.match.TFTMatch;

public class MatchUtils {


    public static Participant findParticipant(TFTMatch match, String puuid) {
        if (!match.getMetadata().getParticipants().contains(puuid)) {
            throw new IllegalArgumentException("The given puuid is not in the match");
        }
        return match.getInfo().getParticipants().stream().filter(p -> p.getPuuid().equals(puuid)).findFirst().orElse(null);
    }
}
