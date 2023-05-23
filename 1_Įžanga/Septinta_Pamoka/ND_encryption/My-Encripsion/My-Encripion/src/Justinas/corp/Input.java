package Justinas.corp;

import java.util.Random;
import java.util.Scanner;

public class Input extends Data {

    public static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello. Duokite man zodi kuodavimui");
        p_InputText = sc.nextLine();

        System.out.println("Give. Key. Palik tuscia del random key");
        p_Key = sc.nextLine();

        if (p_Key.isEmpty()) {
            genKey();
        }

        my_Switch();
    }

    private static void my_Switch() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Ka daryti: e, d");
        char selection = sc2.nextLine().toLowerCase().charAt(0);

        switch (selection) {
            case 'e':
                encryption();
                getP_Key();
                break;
            case 'd':
                decryption();
                break;
            default:
                System.out.println("Priemu tik e, d");
        }
    }

    private static void genKey() {
        Random forSeed = new Random();
        Long seed = Math.abs(forSeed.nextLong());
        p_Key = seed.toString();
        Random forText = new Random(Long.parseLong(p_Key));
        p_Key_For_Text = Math.abs(forText.nextLong());
    }

    public static void encryption() {
        for (char Letter : p_InputText.toCharArray()) {
            p_OutputText = p_OutputText + (char) ((int) Letter + p_Key_For_Text);
        }
        System.out.println(p_OutputText);
        System.out.println(p_Key);
    }

    public static void decryption() {
        genKey();
        for (char Letter : p_InputText.toCharArray()) {
            p_OutputText = p_OutputText + (char) ((int) Letter - p_Key_For_Text);
        }
        System.out.println(p_OutputText);
    }
}
