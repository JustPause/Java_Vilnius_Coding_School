package vcs.lt.sasklaita;

public class Bankas {

    private String pavadiniasString;
    private String adresasString;

    public Bankas(String s1, String s2) {

        this.pavadiniasString = s1;
        this.adresasString = s2;

    }

    public String getPavadiniasString() {
        return pavadiniasString;
    }

    public String getAdresasString() {
        return adresasString;
    }

    @Override
    public String toString() {
        return "Bankas kurio pavadinias " + pavadiniasString + ", adresas " + adresasString;
    }

}
