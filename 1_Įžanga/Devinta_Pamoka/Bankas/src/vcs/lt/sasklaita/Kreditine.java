package vcs.lt.sasklaita;

import java.math.BigDecimal;

public class Kreditine extends Saskaita {

    public Kreditine(Bankas bankas, String saskaita) {
        super(bankas, saskaita);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void papildyk(BigDecimal pinigai) {
        if (getLikutis().compareTo(BigDecimal.ZERO) < 0) {
            super.papildyk(pinigai);
            System.out.println("Kreditine saskaita, papildita " + pinigai);

            System.out.println(this.toString());
        } else {
            System.out.println("Kredite sasskitoja nera tuscia");
            System.out.println(this.toString());
        }
    }
}
