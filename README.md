# Riot-Test-Api-TFT

```java
import com.dorvak.riotapi.api.GameRegion;
import com.dorvak.riotapi.api.RiotAPI;

class Test {
    public String apiKey = "RGAPI-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx";

    public void test() {
        RiotAPI api = new RiotAPI(apiKey);

        // Get summoner by name
        Summoner summoner = api.getSummonerAPI().getSummonerByName(GameRegion.EUW1, "My ADC is Bard");
    }
}
```