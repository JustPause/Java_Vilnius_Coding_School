import java.util.Scanner;

class Naudotojas {
    static final int tikrasisPin = 672197;
    static Scanner sc = new Scanner(System.in);
    // private final String teisingasPin = "testas";

    static int bankas = 500;

    private static boolean tikrinkPin(int pin) {
        if (pin == tikrasisPin) {
            return true;
        }
        return false;
    }

    static void gautiPin() {

        for (int i = 0; i < 3; i++) {
            System.out.println("Yveskitia savaji koda");
            System.out.print(": ");

            int UserPin = sc.nextInt();

            if (tikrinkPin(UserPin)) {
                System.out.println("sėkmingai prisijungė");
                break;
            } else if (i == 2 && !tikrinkPin(UserPin)) {
                System.out.println("sąskaita blokuota");
                System.exit(0);
            } else {
                System.out.println("Kodas neteisingas");
            }
        }
    }

    static void apskaicuokite() {
        System.out.println("sistema paklausia ką nori daryti");
        System.out.println("1. išgryninti pinigų ar 2. baigti darbą");
        System.out.print(": ");

        int ats1 = sc.nextInt();

        if (ats1 == 2) {
            System.out.println("Viso gero");
            System.exit(0);
        } else if (ats1 == 1) {
            System.out.println("Kiek norite isimti");
            int ats = sc.nextInt();
            if (ats <= bankas) {
                bankas = bankas - ats;
                System.out.println("Pinigai paimti");
            } else {
                System.out.println("Perdauk pinigu norite pasimti");
            }
        } else {
            System.out.println("Ivestas neteisingas skaicius");
        }
        System.out.println("Jusms liko " + bankas);
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println("Tavo Kodas: 672197");

        Naudotojas.gautiPin();
        while (true) {
            Naudotojas.apskaicuokite();
        }
    }
}
