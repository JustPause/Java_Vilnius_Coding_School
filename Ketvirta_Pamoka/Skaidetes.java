import java.util.*;
import java.util.stream.Collectors;

public class Skaidetes {

    static void uz1() {
        int[] manoMasyvas;
        manoMasyvas = new int[10];
        int[] luckyNumbers = new int[] { 1, 17, 35, 49, 54, 34 };
        int[] Java_egzaminus = { 8, 5, 5, 3, 8, 7, 7, 8, 2, 5, 2, 3, 8, 9, 3, 7, 10, 4, 9, 6 };
        int Java_egzaminus_Masyvas[] = new int[2];
        double sum = 0;

        for (int i = 0; i < Java_egzaminus.length; i++) {
            if (Java_egzaminus[i] < 5) {
                // System.out.println("5 " + Java_egzaminus[i]);
                Java_egzaminus_Masyvas[0]++;

            } else if (Java_egzaminus[i] >= 7) {
                // System.out.println("7 " + Java_egzaminus[i]);
                Java_egzaminus_Masyvas[1]++;
            } else {
                // System.out.println("Neislaike");
            }
            sum = sum + Java_egzaminus[i];
        }
        sum = sum / Java_egzaminus.length;
        System.out.printf("perlaikyti egzaminą %d%ngaus pasiūlymą Java praktikai įmonėse %d%nAvrige %.02f%n",
                Java_egzaminus_Masyvas[0], Java_egzaminus_Masyvas[1], sum);
    }

    static void uz2() {
        String vardai = "Justinas,Vilius,Mindaugas,Rokas,Zodas,Engas";
        List<String> Vardai = new ArrayList<String>(Arrays.asList(vardai.split(",")));
    }

    static void uz3() {
        String stringus[] = { "Du", "gaideliai", "du", "gaideliai",
                "baltus", "žirnius", " kūlė" };
        Set<String> Stringus = new HashSet<String>();

        for (String Zodziai : stringus) {
            Stringus.add(Zodziai);
        }

        System.out.println(Stringus);
    }

    static void uz4() {
        String palenetos[] = { "Merkurijus", "Venera", "Žemė", "Marsas", "Jupiteris", "Saturnas", "Uranas",
                "Neptūnas" };
        Map<Integer, String> Palenetos = new HashMap<Integer, String>();
        for (int i = 0; i < palenetos.length; i++) {
            Palenetos.put(i, palenetos[i]);
        }
        Palenetos.put(null, "Plutonas");
        System.out.println(Palenetos.get(3));
    }

    static void uz5() {
        class Mokinys {
            String vardąPavardę;
            int pažymius[];
            float pažymių_vidurkį;
        }

        Mokinys mokinys1 = new Mokinys();
        mokinys1.vardąPavardę = "Vilius Viliauskas";
        mokinys1.pažymius = new int[] { 5, 4, 7 };
        for (int i = 0; i < mokinys1.pažymius.length; i++) {
            mokinys1.pažymių_vidurkį = mokinys1.pažymių_vidurkį + mokinys1.pažymius[i];
        }
        mokinys1.pažymių_vidurkį = mokinys1.pažymių_vidurkį /
                mokinys1.pažymius.length;

        Mokinys mokinys2 = new Mokinys();
        mokinys2.vardąPavardę = "Vilius Viliauskas";
        mokinys2.pažymius = new int[] { 1, 5, 8 };
        for (int i = 0; i < mokinys2.pažymius.length; i++) {
            mokinys2.pažymių_vidurkį = mokinys2.pažymių_vidurkį + mokinys2.pažymius[i];
        }
        mokinys2.pažymių_vidurkį = mokinys2.pažymių_vidurkį /
                mokinys2.pažymius.length;

        Mokinys mokinys3 = new Mokinys();
        mokinys3.vardąPavardę = "Vilius Viliauskas";
        mokinys3.pažymius = new int[] { 10, 9, 9 };
        for (int i = 0; i < mokinys3.pažymius.length; i++) {
            mokinys3.pažymių_vidurkį = mokinys3.pažymių_vidurkį + mokinys3.pažymius[i];
        }
        mokinys3.pažymių_vidurkį = mokinys3.pažymių_vidurkį /
                mokinys3.pažymius.length;

        List<Mokinys> žurnalą = new ArrayList<Mokinys>();
        žurnalą.add(mokinys1);
        žurnalą.add(mokinys2);
        žurnalą.add(mokinys3);

        žurnalą.get(0);

        int n = 3;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (žurnalą.get(j).pažymių_vidurkį > žurnalą.get(j + 1).pažymių_vidurkį) {
                    Mokinys temp = new Mokinys();
                    žurnalą.get(j) = žurnalą.get(j + 1);
                }
            }
        }

        System.out.println(žurnalą.get(0).pažymių_vidurkį + " " + žurnalą.get(1).pažymių_vidurkį + " "
                + žurnalą.get(2).pažymių_vidurkį);

    }

    static void uz6() {
        int intas[] = new int[8];
        boolean boolenas[] = new boolean[4];

        if (intas[0] == intas[1]) {
            boolenas[0] = true;
        }
        if (intas[2] == intas[3]) {
            boolenas[1] = true;
        }
        if (intas[4] == intas[5]) {
            boolenas[2] = true;
        }
        if (intas[6] == intas[7]) {
            boolenas[3] = true;
        }
    }

    static void uz7() {
    }

    public static void main(String[] args) {
        uz6();
    }
}
