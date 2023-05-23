package Telefonas.vcs.lt;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        Telefonas tlf = new Telefonas("8-5 12344123");

        tlf.setSkambutis("Brrrrrrr");

        System.out.println(tlf.toString());

        tlf.paskambink("123");

        Mobilus mob = new Mobilus("+370 12 423412", "simTelijaLT41765");

        mob.setSkambutis("ciuto tuto");

        System.out.println(mob.toString());

        mob.paskambink("292");

        System.out.println(mob.getNuotraukuSk());

        mob.fotogravuok();

        mob.fotogravuok();

        mob.fotogravuok();

        mob.fotogravuok();

        mob.fotogravuok();

        System.out.println(mob.getNuotraukuSk());

        Textefonas tksf = new Textefonas(new BigDecimal(1.50));

        tksf.setSkambutis("melodija");

        tksf.setSkambutis("teksafono");

        System.out.println(tksf.toString());

        tksf.paskambink("3213421");

        System.out.println(tksf.getPinguLikutis());

        Telefonas tlf2 = new Textefonas(BigDecimal.ZERO);
        tlf2.paskambink(null);
        System.out.println(tlf2.toString());

    }
}
