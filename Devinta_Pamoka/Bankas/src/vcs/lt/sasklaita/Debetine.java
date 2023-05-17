package vcs.lt.sasklaita;

import java.math.BigDecimal;

public class Debetine extends Saskaita {

    public Debetine(Bankas bankas, String saskaita) {
        super(bankas, saskaita);
        // TODO Auto-generated constructor stub
    }

    @Override
    public void nuskaiciuok(BigDecimal pinigai) {
        if (getLikutis().compareTo(pinigai) < 0) {
            System.out.println("Nebera pinigu saskaitoja");
            System.out.println(this.toString());
        } else {
            super.nuskaiciuok(pinigai);
            System.out.println("nuskaicuoti pinigai");
            System.out.println("Likutis yra" + getLikutis());
            System.out.println(this.toString());
        }
    }

}
