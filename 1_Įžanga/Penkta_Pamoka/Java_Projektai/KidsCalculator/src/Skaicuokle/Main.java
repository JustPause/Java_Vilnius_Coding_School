package Skaicuokle;

import java.util.Scanner;

public class Main {
    public static void A() {
        System.out.println("Jei norite suderi: Spausk 1");
        System.out.println("Jei norite atimti: Spausk 2");
        System.out.println("Jei norite iseiti: Spausk 3");
        System.out.println("Jei norite rasdi diziausia: Spausk 4");

        Scanner scn = new Scanner(System.in);

        int pasirinkimas = scn.nextInt();

        InputManager man = new InputManager();
        int pirmasSk;
        int antrasSk;

        Skaicuokle Sk = new Skaicuokle();

        switch (pasirinkimas) {
            case 1:
                pirmasSk = man.parasySk();
                antrasSk = man.parasySk();

                Sk.Sum(pirmasSk, antrasSk);

                break;
            case 2:
                pirmasSk = man.parasySk();
                antrasSk = man.parasySk();

                Sk.atimk(pirmasSk, antrasSk);

                break;
            case 3:
                Sk.Iki();
                break;

            case 4:
                pirmasSk = man.parasySk();
                antrasSk = man.parasySk();

                Sk.Diz(pirmasSk, antrasSk);
                break;
            default:
                System.out.println("Neteisingas Sk");
                scn.close();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        while (true) {
            A();
        }
    }
}
