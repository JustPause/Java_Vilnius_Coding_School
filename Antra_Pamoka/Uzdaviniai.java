package Antra_Pamoka;

import java.math.BigDecimal;
import java.util.Random;

public class Uzdaviniai {

    public static Random rand = new Random();

    static public Double random(Double MIN, Double MAX) {
        return (MIN + rand.nextFloat() * (MAX - MIN));
    }

    static public int random(int MIN, int MAX) {
        return (MIN + rand.nextInt() * (MAX - MIN));
    }

    static void pinigais_piniginėje_ir_degalais(){

        final float A95 = 1.450f;
        final float A98 = 1.450f;
        final float D = 1.300f;
        final float Dujos = 0.530f;

        Double pinigaiPinigineje;
        pinigaiPinigineje = random(12.56,30.43);

        Double Ar_užteks_piniginėje_esančių_pinigų = pinigaiPinigineje / A95;

        Ar_užteks_piniginėje_esančių_pinigų = Math.floor(Ar_užteks_piniginėje_esančių_pinigų * 100) / 100;

        // Double Ar_užteks_piniginėje_esančių_pinigų =  Math.floor((pinigaiPinigineje / A95) * 100) / 100;

        System.out.println(Ar_užteks_piniginėje_esančių_pinigų);

        if(Ar_užteks_piniginėje_esančių_pinigų < 20){
            System.out.println("pinigai Pinigineje Neuzteks");
            System.out.println((Math.floor( (20 - Ar_užteks_piniginėje_esančių_pinigų) * 100) / 100) + " dar truksta");
        }

        else{
            System.out.println("pinigai Pinigineje Užteks");
        }

    }


    public static void main(String[] args) {

        pinigais_piniginėje_ir_degalais();
        

    }
}
