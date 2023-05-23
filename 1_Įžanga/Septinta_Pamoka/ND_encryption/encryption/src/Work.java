import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Work extends Code {

    static List<Character> charString = new ArrayList<>();
    static List<Character> charStringShuffle = new ArrayList<>();
    private String input;
    Scanner GetString = new Scanner(System.in);
    Scanner GetSeed = new Scanner(System.in);
    Scanner GetAnser = new Scanner(System.in);
    Random rn;
    int rnseed;

    public Work(int ofset) {

        for (int i = 32; i < 127; i++) {
            charString.add((char) i);
        } // sugeneruoja charecterius kurie pakeis esamas raides

        for (int i = 32 + ofset; i < 127 + ofset; i++) {
            charStringShuffle.add((char) i);
        }
    }

    

    public void select(String pasirinkimas) {
        switch (pasirinkimas.toLowerCase()) {
            case "kuodot":
            case "k":
            case "0":
                System.out.println(enCodeWork(input));
                break;
            case "atkuodot":
            case "a":
            case "1":
                System.out.println(deCodeWork(input));
                break;
            default:
                System.out.printf(
                        "Piremu tik \"kuodot\", \"k\", \"0\", kaip kuodavima\nPiremu tik \"antkuoduot\", \"a\", \"1\", kaip antkuodavima\n");
                break;
        }
    }

    public void input_from_user() {

        System.out.println("kuodot ar Antkuoduot");
        String pasirinkimas = GetAnser.nextLine();

        System.out.println("Iveskite Savaji zody");
        input = GetString.nextLine();

        System.out.println("Iveskite sekla");
        rnseed = GetSeed.nextInt();

        rn = new Random(rnseed);

        select(pasirinkimas);
    }

    public void print() {

    }
}
