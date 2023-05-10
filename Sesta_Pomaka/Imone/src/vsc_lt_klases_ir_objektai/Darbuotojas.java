package vsc_lt_klases_ir_objektai;

import java.util.Date;

public class Darbuotojas {
    private String vardaString;
    private String pavardeString;
    private String asmenKodasString;
    private int amziusInt;
    private String pareigosString;
    private byte patirtisInt;

    public Darbuotojas(String vardaString, String pavardeString, String asmenKodasString) {
        this.vardaString = vardaString;
        this.pavardeString = pavardeString;
        this.asmenKodasString = asmenKodasString;

        this.amziusInt = apskaicuokAmziu();
    }

    public String vardaString() {
        return this.vardaString;
    }

    public String pavardeString() {
        return this.pavardeString;
    }

    public String asmenKodasString() {
        return this.asmenKodasString;
    }

    public int amziusInt() {
        return this.amziusInt;
    }

    public String pareigosString() {
        return this.pareigosString;
    }

    public byte patirtisInt() {
        return this.patirtisInt;
    }

    public void setpareigosString() {
        this.pareigosString = pareigosString;
    }

    public void setpatirtisInt() {
        this.patirtisInt = patirtisInt;
    }

    private int apskaicuokAmziu() {
        int metai = Integer.parseInt(asmenKodasString.substring(1, 3));
        int metai2 = java.time.LocalDateTime.now().getYear();
        if (metai <= 23) {
            //java.time.LocalDateTime.now().getYear() = 2023
            metai = metai + 2000;
        } else {
            metai = metai + 1900;
        }
        System.out.println(java.time.LocalDateTime.now().getYear());
        return (metai2 - metai);
    }

    @Override
    public String toString() {
        return "Darbuotojas [vardaString=" + vardaString + ", pavardeString=" + pavardeString + ", asmenKodasString="
                + asmenKodasString + ", amziusInt=" + amziusInt + ", pareigosString=" + pareigosString
                + ", patirtisInt=" + patirtisInt + "]";
    }
}
