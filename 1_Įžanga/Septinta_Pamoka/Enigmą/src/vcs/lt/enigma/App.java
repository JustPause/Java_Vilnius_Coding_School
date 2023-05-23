package vcs.lt.enigma;

public class App {
    public static void main(String[] args) throws Exception {
        IOManager C = new IOManager();

        // ---------------------------------------------------------------------
        // System.out.println("Idedamas : " + inPuString);
        // System.out.println();
        // System.out.println("Koduotas : " + A.getCypher());
        // System.out.println();
        // System.out.println("Dekooduotas : " + B.getPlainString());
        // --------------------------------------------------------------------

        C.paklauskVeksmo();
        switch (C.getAction()) 
        {
            case 1:
                C.prasykZinutes();
                Encoder A = new Encoder(C.getInputMessage());
                A.generuok();
                System.out.println(A.getCypher());
                break;

            case 2:
                C.prasykZinutes();
                Decoder B = new Decoder(C.getInputMessage());
                B.DecoderProces();
                System.out.println(B.getPlainString());
                break;

            default:
                System.out.println("Neteisingas veiksams");
        }

    }
}
