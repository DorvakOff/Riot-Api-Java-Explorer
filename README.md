# Riot-API-Java-Explorer

```java
import com.dorvak.raje.api.GameRegion;
import com.dorvak.raje.api.RAJEAPI;
import com.dorvak.raje.api.RiotAPI;

class Test {
    public String apiKey = "RGAPI-xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx";

    public void test() {
        RAJEAPI api = new RAJEAPI(apiKey);

        // Get summoner by name
        Summoner summoner = api.getSummonerAPI().getSummonerByName(GameRegion.EUW1, "My ADC is Bard");
    }
}
```