package vcs.lt.sasklaita;

import java.math.BigDecimal;

public class Saskaita {
    private Bankas bankas;
    private String saskaitosNr;
    private BigDecimal likutis;

    public Bankas getBankas() {
        return bankas;
    }

    public String getSaskaitosNr() {
        return saskaitosNr;
    }

    public BigDecimal getLikutis() {
        return likutis;
    }

    public Saskaita(Bankas bankas, String saskaita) {
        this.bankas = bankas;
        this.saskaitosNr = saskaita;
        this.likutis = BigDecimal.ZERO;
    }

    public void papildyk(BigDecimal pinigai) {
        this.likutis = pinigai;
    }

    public void nuskaiciuok(BigDecimal pinigai) {
        this.likutis = this.likutis.subtract(pinigai);
    }

    @Override
    public String toString() {
        return "Saskaita nr " + saskaitosNr + " prikauso bankui " + bankas.toString() + ".";
    }
}