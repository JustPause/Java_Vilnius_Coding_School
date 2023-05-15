package Telefonas.vcs.lt;

public class Mobilus extends Telefonas {

    private String simNr;
    private int nuotraukuSk;

    public String getSimNr() {
        return simNr;
    }

    public int getNuotraukuSk() {
        return nuotraukuSk;
    }

    public Mobilus(String nr, String simNr) {
        super(nr);
        this.simNr = simNr;
        this.nuotraukuSk = 0;
        // TODO Auto-generated constructor stub
    }

    public void fotogravuok() {
        this.nuotraukuSk++;
    }

}
