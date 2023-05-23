import java.util.Scanner;

public class Trikampis extends Figura {

    public Trikampis(float sk1, float sk2) {
        super(sk1, sk2);
    }

    // static void TrikampisPradzia() {

    // Scanner sc1 = new Scanner(System.in);
    // Scanner sc2 = new Scanner(System.in);

    // System.out.println("Duok dvi krastinas ");

    // setKraštinė1(sc1.nextFloat());
    // setKraštinė2(sc2.nextFloat());

    // skaiciuokPlota();

    // System.out.println("Jūsų figuros plotas yra " + getPlotas() + " kv.cm");
    // }

    @Override
    public void skaiciuokPlota() {
        super.skaiciuokPlota();
        Figura.setPlotas(Figura.getPlotas()/2);
    }
}
