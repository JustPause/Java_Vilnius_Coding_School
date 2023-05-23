import java.math.BigDecimal;

import vcs.lt.sasklaita.Bankas;
import vcs.lt.sasklaita.Debetine;
import vcs.lt.sasklaita.Taupomoji;

public class Bankininkyste {
    public static void main(String[] args) throws Exception {
        Bankas bankas = new Bankas("Swebank", "Konstrukc");

        Debetine deb = new Debetine(bankas, "LT677777712");
        System.out.println(deb.getLikutis());

        deb.papildyk(BigDecimal.TEN);

        Taupomoji taup = new Taupomoji(bankas,"LT2123");

        taup.papildyk(BigDecimal.valueOf(100));
    }
}
