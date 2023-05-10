import java.util.*;

public class Biblioteka {
    List<String> knygų_sąrašą = new ArrayList<>();

    Knyga knyga = new Knyga();
    Autorius autorius = new Autorius();

    public List<String> getKnygų_sąrašą() {
        return knygų_sąrašą;
    }

    public void pridėjimo_į_sąrašą_metodas(Knyga knyga, Autorius autorius) {
        
        this.knyga = knyga;
        this.autorius = autorius;
        this.knygų_sąrašą = knygų_sąrašą;
    }

}
