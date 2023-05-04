package Antra_Pamoka;

class Katinas {
    String Varas;
    int Amius;
    boolean Skiepitas;

}

public class Naujas {

    public static void Sujunktas() {
        String Vardads = "Justinas";
        String Pavarde = "Stan";

        String Sudetis = Vardads + Pavarde;
        String Sutrumpimamia = Sudetis.substring(3, 7);
        System.out.println(Sutrumpimamia);
    }

    public static void koreja() {
        // String angl = "Hello";
        String kol = null;

        kol = "annyeonghaseyo";

        // boolean arStingas = kol instanceof String;

        System.out.println(kol.length());
        System.out.println(kol.indexOf('y'));
    }

    public static void katinas() {
        Katinas Pirmasis = new Katinas();

        Pirmasis.Varas = "Vytautas";
        Pirmasis.Amius = 7;
        Pirmasis.Skiepitas = false;

        System.out.printf("Vardas: %s\nAmžius: %d\nAr Skiepitas: %b\n", Pirmasis.Varas, Pirmasis.Amius,
                Pirmasis.Skiepitas);

        System.out.print(Pirmasis);
    }

    public static void namudarbai() {
        Katinas Didysys = new Katinas();
        Didysys.Varas = "Mikazelas";
        Didysys.Amius = 97;
        Didysys.Skiepitas = true;
    }

    public static void main(String[] args) {
        Sujunktas();
    }
}