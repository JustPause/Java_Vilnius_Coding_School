package VCS.exept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {
    public static int insertDiget() {


        Scanner scanner = new Scanner(System.in);
        int ivestasSkaicius = 0;
        boolean pass = false;

        do {
            try {
                System.out.println("Ivestkite sk: ");
                ivestasSkaicius = scanner.nextInt();
                pass = true;
            } catch (InputMismatchException e) {
                System.out.println("Ivesta bloga reiksme!");
                pass = false;
                scanner.nextLine();
            }
        } while (!pass);

        return ivestasSkaicius;
    }

    public static String[] askForInput() {
        return new String[]{
                String.valueOf(insertDiget()),
                String.valueOf(insertDiget())
        };
    }

}
