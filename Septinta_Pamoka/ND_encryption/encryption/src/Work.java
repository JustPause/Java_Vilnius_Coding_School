import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class Work {

    public List<Character> charString = new ArrayList<>();
    public List<Character> charStringShuffle = new ArrayList<>();
    private String input_unhast;
    private String input_hast;
    Scanner sc = new Scanner(System.in);

    public Work() {

        for (int i = 33; i < 127; i++) {

            charString.add((char) i);
            charStringShuffle.add((char) i);

        } // sugeneruoja charecterius kurie pakeis esamas raides

        Collections.shuffle(charStringShuffle);
    }

    public void input_metod() {
        System.out.println("Iveskite Savaji zody");
        input_unhast = sc.nextLine();
    }

    public String Work() {
        String outputString = "";

        for (int i = 0; i < charString.size(); i++) {
            System.out.printf("%d. |%c| - {%c}",i ,charString.get(i), charStringShuffle.get(i));
            
        }
        System.out.println();
        for (int i = 0; i < input_unhast.length(); i++) {
            int replace = input_unhast.charAt(i);
            System.out.println(charString.get(i));
            // outpuString = outpuString + (char) replace;
        }
        return outputString;
    }

    public void print() {
        System.out.println(Work());
    }

    public void setInput_unhast(String input_unhast) {
        this.input_unhast = input_unhast;
    }

    public String getInput_hast() {
        return input_hast;
    }

}
