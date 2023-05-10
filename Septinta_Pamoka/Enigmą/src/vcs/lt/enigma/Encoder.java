package vcs.lt.enigma;

import java.util.Random;

public class Encoder {
    private String plainText;
    private String cypher;

    public String getCypher() {
        return cypher;
    }

    public Encoder(String žinutę) {
        this.plainText = žinutę;
        užkodavimo_metodą(this.plainText);
    }

    public char generuok() {
        int min = 33;// 33
        int max = 126;// 126
        Random random = new Random();
        // int randomNumber =(char) random.nextInt(max + 1 - min) + min;
        // System.out.println((char) (random.nextInt(max + 1 - min) + min));
        return (char) (random.nextInt(max + 1 - min) + min);
    }

    public void užkodavimo_metodą(String plainText_String) {
        String Zodis = "";

        Zodis = generuok() + Zodis;
        Zodis = generuok() + Zodis;

        // plainText = generuok() + plainText;
        // plainText.insert(i, generuok())
        // StringBuilder sb = new StringBuilder(plainText);

        for (int i = 0 + 2; i < plainText_String.length() + 2; i++) {
            Zodis = Zodis + plainText_String.charAt(i - 2) + generuok();
        }
        
        Zodis = Zodis + generuok();
        this.cypher = Zodis;
    }
}
