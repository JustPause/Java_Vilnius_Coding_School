import java.util.Scanner;

public class Blynas extends Figura {

    public Blynas(float sk1) {
        super(sk1, sk1);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void skaiciuokPlota() {
        super.skaiciuokPlota();
        Figura.setPlotas((float)Math.PI * (float)super.getKraštinė1());
    }

    // @Override
    // public void skaiciuokPlota(){

    // }

    // static void ApskiritimasPradzia() {

    //     Scanner sc1 = new Scanner(System.in);

    //     System.out.println("Duok pilna apskititimo plota ");

    //     setKraštinė1(sc1.nextFloat());


    //     skaiciuokPlota();

    //     System.out.println("Jūsų figuros plotas yra " + getPlotas() + " kv.cm");
    // }
}
