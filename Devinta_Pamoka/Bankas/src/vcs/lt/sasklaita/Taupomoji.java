package vcs.lt.sasklaita;

import java.math.BigDecimal;

public class Taupomoji extends Saskaita {

    public Taupomoji(Bankas bankas, String saskaita) {
        super(bankas, saskaita);
    }

    boolean arPapildyti = false;

    @Override
    public void papildyk(BigDecimal pinigai) {
        if (!arPapildyti) {
            super.papildyk(pinigai);
            System.out.println("Taupomoji papildita ");
            arPapildyti = true;
            System.out.println(this.toString());
        }

        else {
            System.out.println("Taupomoji saskaita skitra taupimui, nepildyk!");
            System.out.println(this.toString());
        }
    }

}