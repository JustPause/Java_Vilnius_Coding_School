package vsc_lt_klases_ir_objektai;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Imone {
    private ArrayList<Darbuotojas> darbuotojai;
    private String pavadinimas;
    private int ikurimoMetai;
    private String adresasString;

    public Imone(String pavadinimas, int ikurimoMetai, String adresasString) {
        this.pavadinimas = pavadinimas;
        this.ikurimoMetai = ikurimoMetai;
        this.adresasString = adresasString;
        this.darbuotojai = new ArrayList<>();
    }

    public ArrayList<Darbuotojas> darbuotojai() {
        return darbuotojai;
    } 

    public String pavadinimas() {
        return pavadinimas;
    }

    public int ikurimoMetai() {
        return ikurimoMetai;
    }

    public String adresasString() {
        return adresasString;
    }

    public void setdarbuotojai(ArrayList<Darbuotojas> darbuotojai) {
        this.darbuotojai=darbuotojai;
    }

    public void setpavadinimas( String pavadinimas) {
        this.pavadinimas=pavadinimas;
    }

    public void setikurimoMetai(int ikurimoMetai) {
        this.ikurimoMetai=ikurimoMetai;
    }

    public void setadresasString(String adresasString) {
         this.adresasString=adresasString;
    }

    public void addDarbuotjas(Darbuotojas darbuotjas, String pareigos, int patirtis){
        darbuotjas.setpareigosString(pareigos);
        darbuotjas.setpatirtisString(patirtis);
        this.darbuotojai.add(darbuotjas);
    }
}
