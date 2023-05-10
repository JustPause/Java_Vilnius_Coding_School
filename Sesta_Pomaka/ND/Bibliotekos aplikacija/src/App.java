public class App {

    // Bibliotekos aplikacija:

    // Sukurti klasę Autorius. Autorius turi vardą, pavardę, gimimo metus.

    // Sukurti klasę Knyga, kuri turi išleidimo metus, autorių bei pavadinimą.

    // Sukurti klasę Biblioteka, kuri turi knygų sąrašą. Klasėje turi būti pridėjimo
    // į sąrašą metodas ir gražaus knygos iš sąrašo spausdinimo metodas.

    // Klasėje su main metodu pridėkite naujų knygų į biblioteką ir atspausdinkite
    // knygų sąrašą ekrane. (Darome prielaidą, kad vieną konkrečią knygą parašė
    // vienas autorius).

    // Pridėkite papildomą metodą, kuris atspausdins tas pačias knygas iš
    // bibliotekos sąrašo į tekstinį failą jūsų kompiuteryje.

    public static void main(String[] args) throws Exception {
        Biblioteka bigBiblioteka = new Biblioteka();
        bigBiblioteka.pridėjimo_į_sąrašą_metodas("Svetimas");
        System.out.println(bigBiblioteka.getKnygų_sąrašą());
    }
}
