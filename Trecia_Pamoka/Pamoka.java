package Trecia_Pamoka;

import java.time.LocalTime;
import java.util.Random;

public class Pamoka {

    private static Random rand = new Random();

    static private int random(int MIN, int MAX) {
        return rand.nextInt(MAX - MIN + 1) + MIN;
    }

    LocalTime time = LocalTime.now();

    static int hour() {
        LocalTime time = LocalTime.now();
        return time.getHour();
    }

    static void Likas() {
        System.out.println(hour());

        if (hour() >= 7 && hour() <= 12) {
            System.out.println("Labas rytas");
        } else if (hour() >= 12 && hour() <= 6 + 12) {
            System.out.println("Labas diena");
        } else if (hour() >= 6 + 12 && hour() <= 24) {
            System.out.println("Laikas miegoti");
        } else if (hour() >= 0 && hour() <= 7) {
            System.out.println("Laikas miegoti");
        } else {
            System.out.println("Laikas neveikia");
        }
    }

    static void Swichas(){
        int savDiena = random(1, 7);
        String dienosPav = "";
        switch (savDiena) {
            case 1:
                dienosPav += "Pirmadienis\n";
                break;
            case 2:
                dienosPav += "Antradienis\n";
                break;
            case 3:
                dienosPav += "Treciadiens\n";
                break;
            case 4:
                dienosPav += "Ketvirtadines\n";
                break;
            case 5:
                dienosPav += "Penkatdienis\n";
                break;
            case 6:
                dienosPav += "Sestadienis\n";
                break;
            case 7:
                dienosPav += "Sekamdioneis\n";
                break;
        }
        System.out.printf("Diena: %d\t Diena zodizu: %s", savDiena, dienosPav);
    }


    static void DvigubasShich(){
        int savDiena = random(1, 7);
        String dienosPav = "";
        switch (savDiena) {
            case 1:
                dienosPav += "Pirmadienis";
                break;
            case 2:
                dienosPav += "Antradienis";
                break;
            case 3:
                dienosPav += "Treciadiens";
                break;
            case 4:
                dienosPav += "Ketvirtadines";
                break;
            case 5:
                dienosPav += "Penkatdienis";
                break;
            case 6:
                dienosPav += "Sestadienis";
                break;
            case 7:
                dienosPav += "Sekamdioneis";
                break;
        }

        switch (savDiena) {
            case 1:
                dienosPav += ". Darbo";
            case 2:
                dienosPav += ". Darbo";
            case 3:
                dienosPav += ". Darbo";
            case 4:
                dienosPav += ". Darbo";
            case 5:
                dienosPav += ". Darbo";
                break;
            case 6:
                dienosPav += ". Ne Darbo";
            case 7:
                dienosPav += ". Ne Darbo";
                break;
        }

        System.out.printf("Diena: %d\t Diena zodizu: %s diena \n", savDiena, dienosPav);
    }

    public static void main(String[] a) {


        while (true){
            int r1 = random(1, 126);
            // int r2 = random(1, 126);
            // int r3 = random(1, 126);
            System.out.print((char)r1 + " ");
            
        }
    }
}
