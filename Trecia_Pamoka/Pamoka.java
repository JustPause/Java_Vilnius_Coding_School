package Trecia_Pamoka;

import java.time.LocalTime;

public class Pamoka {

    LocalTime time = LocalTime.now();

    static int hour() {
        LocalTime time = LocalTime.now();
        return time.getHour();
    }

    public static void main(String[] a) {
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
}
