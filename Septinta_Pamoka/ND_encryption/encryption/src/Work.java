import java.util.List;
import java.util.Random;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Work {

    public List<Character> charString = new ArrayList<>();
    public List<Character> charStringShuffle = new ArrayList<>();
    private String input;
    Scanner GetString = new Scanner(System.in);
    Scanner GetSeed = new Scanner(System.in);
    Scanner GetAnser = new Scanner(System.in);
    Random rn;
    int rnseed;

    public Work(int ofset) {

        for (int i = 32; i < 127; i++) {

            charString.add((char) i);
            //charStringShuffle.add((char) i);

        } // sugeneruoja charecterius kurie pakeis esamas raides


        for (int i = 32 + ofset; i < 127 + ofset; i++) {

            //charString.add((char) i);
            charStringShuffle.add((char) i);

        }
    }

    public String DeCodeWork(String input) {
        String outputString = "";
        Collections.shuffle(charStringShuffle, rn);

        for (char charChar : input.toCharArray()) {
            int replace = charStringShuffle.indexOf(charChar);
            outputString = outputString + charString.get(replace);
        }
        return outputString;
    }

    public String EnCodeWork(String input) {
        String outputString = "";

        // for (int i = 0; i < charString.size(); i++) {
        // System.out.printf("%d. |%c| - {%c}",i ,charString.get(i),
        // charStringShuffle.get(i));

        // }
        // System.out.println();

        Collections.shuffle(charStringShuffle, rn);

        for (char charChar : input.toCharArray()) {
            int replace = charString.indexOf(charChar);
            outputString = outputString + charStringShuffle.get(replace);
        }
        return outputString;
    }

    public void Select(String pasirinkimas) {
        switch (pasirinkimas.toLowerCase()) {
            case "kuodot":
            case "k":
            case "0":
                System.out.println(EnCodeWork(input));
                break;
            case "atkuodot":
            case "a":
            case "1":
                System.out.println(DeCodeWork(input));
                break;
            default:
                System.out.printf(
                        "Piremu tik \"kuodot\", \"k\", \"0\", kaip kuodavima\nPiremu tik \"antkuoduot\", \"a\", \"1\", kaip antkuodavima\n");
                break;
        }
    }

    public void input_metod() {

        System.out.println("kuodot ar Antkuoduot");
        String pasirinkimas = GetAnser.nextLine();

        System.out.println("Iveskite Savaji zody");
        input = GetString.nextLine();

        System.out.println("Iveskite sekla");
        rnseed = GetSeed.nextInt();

        rn = new Random(rnseed);

        Select(pasirinkimas);
    }

    public void print() {

    }

}
