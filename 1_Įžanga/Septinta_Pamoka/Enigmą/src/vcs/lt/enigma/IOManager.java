package vcs.lt.enigma;

import java.util.Scanner;

public class IOManager {

    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);

    private String inputMessage;
    private int action;

    public void paklauskVeksmo() {
        System.out.println("Ar norite užkoduoti tekstą?");
        System.out.println("(spausk vienetą) jei taip, jei norite atkoduoti (spausk du)?");
        this.action = sc1.nextInt();
    }

    public void prasykZinutes() {
        System.out.print("Iveskite savaja zinute: ");
        this.inputMessage = sc2.nextLine();
        System.out.println();
    }

    public String getInputMessage() {
        return inputMessage;
    }

    public int getAction() {
        return action;
    }
}
