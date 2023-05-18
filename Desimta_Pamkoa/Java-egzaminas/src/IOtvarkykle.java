import java.util.Scanner;

public class IOtvarkykle {
    private static float krastine1;
    private static float krastine2;
    private static int pasirinkimas;

    public static float getPasirinkimas() {
        return pasirinkimas;
    }

    public static float getKrastine1() {
        return krastine1;
    }

    public static float getKrastine2() {
        return krastine2;
    }

    // private static void inPutAntrasZinksis(int pasirinkimas1) {
    // switch (pasirinkimas1) {
    // case 1:
    // Kvadratas.KeturkampisPradzia();
    // break;

    // case 2:
    // Trikampis.TrikampisPradzia();
    // break;

    // case 3:
    // System.out.println("Dar nemoku");
    // break;

    // default:
    // System.out.println("Dar nemoku");
    // break;
    // }
    // }

    private static void suzinokKrastines(int pasirinkimas1) {
        Scanner sc5 = new Scanner(System.in);
        Scanner sc6 = new Scanner(System.in);
        switch (pasirinkimas) {
            case 1:
                // Kvadratas.KeturkampisPradzia();
                System.out.println("Iveskite kvadrato krastinia ");
                krastine1 = sc5.nextFloat();
                break;

            case 2:
                // Trikampis.TrikampisPradzia();
                System.out.println("Iveskite trikampio vieno statinio ilgi ");
                krastine1 = sc5.nextFloat();
                System.out.println("Iveskite trikampio antro statinio ilgi ");
                krastine2 = sc6.nextFloat();
                break;

            case 3:
                System.out.println("Iveskite apskitimo spinduli ilgi ");
                krastine1 = sc5.nextFloat();
                break;

            default:
                System.out.println("Tokios figuros nera");
                break;
        }
    }

    static void suzinokFigura() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pasirinkite Figura");
        System.out.println("1. Keturnampis: 2. Trikampis: 3. Apskiritmas");

        pasirinkimas = sc.nextInt();

        suzinokKrastines(pasirinkimas);
        sc.close();
    }

    static void pausdinkPlota(String text) {

        System.out.println(text);

    }
}
