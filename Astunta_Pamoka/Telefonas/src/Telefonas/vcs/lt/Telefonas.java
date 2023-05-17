package Telefonas.vcs.lt;

import java.math.BigDecimal;

public class Telefonas {
    private String numeris;
    private String skambutis;

    public String getNumeris() {
        return numeris;
    }

    public String getSkambutis() {
        return skambutis;
    }

    public void setSkambutis(String skambutis) {
        this.skambutis = skambutis;
    }

    // ----------------------------------------------

    public Telefonas(String nr) {
        this.numeris = nr;
    }

    public Telefonas(BigDecimal bigDecimal) {
    }

    public void paskambink(String tlfNr) {
        System.out.println("Abonimentas " + this.numeris + " skambina abonimentui " + tlfNr);
    }

    @Override
    public String toString() {
        return "Telefono nr yra " + numeris + ", telefono melodija yra " + skambutis;
    }

}
