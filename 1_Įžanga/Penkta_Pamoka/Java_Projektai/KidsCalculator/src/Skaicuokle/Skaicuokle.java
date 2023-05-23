package Skaicuokle;

public class Skaicuokle {
    public void Sum(int a, int b) {
        int suma = a + b;
        System.out.println(a + " " + b + " " + suma);
    }

    public void atimk(int a, int b) {
        int rez = a - b;
        System.out.println(a + " " + b + " " + rez);
    }

    public void Diz(int a, int b) {
        if (a > b) {
            System.out.println(a + " Yra Diziausiais");
        } else if (a < b) {
            System.out.println(b + " Yra Diziausiais");
        } else {
            System.out.println("didžiausio nėra");
        }
    }

    public void Iki() {
        System.out.println("Viso Gero");
        System.console();
        System.exit(0);
    }
}
