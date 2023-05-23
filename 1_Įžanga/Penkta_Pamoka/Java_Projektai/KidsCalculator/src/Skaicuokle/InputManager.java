package Skaicuokle;

import java.util.Scanner;

public class InputManager {

    Scanner myScanner = new Scanner(System.in);

    private boolean tikrintSkaiciu(int i) {
        return i >= 1 && i <= 9;
    }

    public int parasySk(){
        
        int ivestasSkaicus;
        boolean teisingasSkaicius;

        
        do{
            System.out.println("ivestkite sk nuo 1 iki 9");
            ivestasSkaicus = myScanner.nextInt();
            teisingasSkaicius = tikrintSkaiciu(ivestasSkaicus);
        }
        while(!teisingasSkaicius);

        System.out.println("Yvestas Skaicius " + ivestasSkaicus);

        return ivestasSkaicus;
    }

}
