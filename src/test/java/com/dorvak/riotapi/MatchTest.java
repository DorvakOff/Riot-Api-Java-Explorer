package com.dorvak.riotapi;

import com.dorvak.riotapi.api.GameRegion;
import com.dorvak.riotapi.model.tft.match.Participant;
import com.dorvak.riotapi.model.tft.match.TFTMatch;
import com.dorvak.riotapi.utils.MatchUtils;
import com.dorvak.riotapi.utils.PrintUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.dorvak.riotapi.utils.AssertUtils.assertNotEmpty;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MatchTest extends ApiTestClass {

    @Test
    @DisplayName("Get matches for a player")
    void getMatches() {
        List<String> matches = matchAPI.getTFTMatches(GameRegion.EUW1, TestSecrets.PUUID);

        assertNotEmpty(matches);

        PrintUtils.print(matches);
    }

    @Test
    @DisplayName("Get the latest player match")
    void getLatestMatch() {
        List<String> matches = matchAPI.getTFTMatches(GameRegion.EUW1, TestSecrets.PUUID, 0, null, null, 1);

        assertNotEmpty(matches);

        assertEquals(1, matches.size());

        PrintUtils.print(matches);
    }

    @Test
    @DisplayName("Get data about a match")
    void getMatch() {
        String matchId = "EUW1_6337759163";

        TFTMatch match = matchAPI.getTFTMatch(GameRegion.EUW1, matchId);

        assertNotNull(match);

        PrintUtils.print(match);
    }


    @Test
    @DisplayName("Get match data for a player")
    void getMatchData() {
        String matchId = "EUW1_6337759163";

        Participant participant = MatchUtils.findParticipant(matchAPI.getTFTMatch(GameRegion.EUW1, matchId), TestSecrets.PUUID);

        assertNotNull(participant);

        PrintUtils.print(participant);

        PrintUtils.print("Active traits:" + participant.getActiveTraits());
    }
}
