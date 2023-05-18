import java.util.Scanner;

public class Ivedamas {

    private static int naudotojoPasirinktaFigura;

    private static void inPutAntrasZinksis(int pasirinkimas) {
        switch (pasirinkimas) {
            case 1:
                Kvadratas.KeturkampisPradzia();
                break;

            case 2:
                Trikampis.TrikampisPradzia();
                break;

            case 3:
                System.out.println("Dar nemoku");
                break;
                
            default:
                System.out.println("Dar nemoku");
                break;
        }
    }

    static void inPut() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pasirinkite Figura");
        System.out.println("1. Keturnampis: 2. Trikampis, 3. Apskiritmas");

        naudotojoPasirinktaFigura = sc.nextInt();

        inPutAntrasZinksis(naudotojoPasirinktaFigura);
        sc.close();
    }

}
