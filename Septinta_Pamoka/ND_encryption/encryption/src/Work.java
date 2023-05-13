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

    public Work() {

        for (int i = 33; i < 127; i++) {

            charString.add((char) i);
            charStringShuffle.add((char) i);

        } // sugeneruoja charecterius kurie pakeis esamas raides
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
            // System.out.println(charStringShuffle.get(replace));
            outputString = outputString + charStringShuffle.get(replace);
        }
        return outputString;
    }

    public String DeCodeWork(String input) {
        String outputString = "";

        Collections.shuffle(charStringShuffle, rn);

        for (char charChar : input.toCharArray()) {
            int replace = charString.indexOf(charChar);
            // System.out.println(charStringShuffle.get(replace));
            outputString = outputString + charStringShuffle.get(replace);
        }
        return outputString;
    }

    public void Select(String pasirinkimas) {
        switch (pasirinkimas.toLowerCase()) {
            case "kuodot":
            case "k":
            case "0":
                EnCodeWork(input);
                break;
        }
    }

    public void input_metod() {

        System.out.println("Kuodot ar Ankuodok");
        String pasirinkimas = GetAnser.nextLine();

        System.out.println("Iveskite Savaji zody");
        input = GetString.nextLine();

        System.out.println("Iveskite sekla");
        rnseed = GetSeed.nextInt();

        rn = new Random(rnseed);

        Select(pasirinkimas);
    }

    public void print() {
        System.out.println(EnCodeWork(input));
    }

}
