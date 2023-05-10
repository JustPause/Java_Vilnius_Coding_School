import java.util.*;

public class Biblioteka {
    ArrayList<Class> knygų_sąrašą = new ArrayList<>();

    Knyga knyga = new Knyga();
    Autorius autorius = new Autorius();

    public ArrayList<Class> getKnygų_sąrašą() {
        return knygų_sąrašą;
    }

    public void pridėjimo_į_sąrašą_metodas(Knyga knyga, Autorius autorius) {

        this.knyga.autorių = autorius;
        this.knyga.išleidimo_metus = knyga.išleidimo_metus;
        this.knyga.pavadinimą = knyga.pavadinimą;

        this.autorius.gimimo_metus = autorius.gimimo_metus;
        this.autorius.pavardę = autorius.pavardę;
        this.autorius.vardą = autorius.vardą;

        //knygų_sąrašą.add(knygų_sąrašą);
    }
}
