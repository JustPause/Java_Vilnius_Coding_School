package vcs.lt.enigma;

public class Decoder {
    private String plainString;
    private String cypher;
    private String atlipintaString = "";

    public Decoder(String cypher_String) {
        this.cypher = cypher_String;
    }

    public String getPlainString() {
        return plainString;
    }

    public void DecoderProces() {
        for (int i = 2; i < cypher.length() - 2; i = i + 2) {
            atlipintaString = atlipintaString + cypher.charAt(i);
            // System.out.println(cypher.charAt(i));
        }
        
        this.plainString = atlipintaString;
    }
}
