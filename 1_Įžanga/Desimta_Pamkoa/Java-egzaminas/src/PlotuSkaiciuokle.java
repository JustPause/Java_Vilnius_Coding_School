public class PlotuSkaiciuokle {
    public static void main(String[] args) throws Exception {
        IOtvarkykle.suzinokFigura();
        // IOtvarkykle.suzinokKrastines();
        // Ivedamas.inPut();
        if (IOtvarkykle.getPasirinkimas() == 1) {
            Kvadratas k = new Kvadratas(IOtvarkykle.getKrastine1());
            k.skaiciuokPlota();
            IOtvarkykle.pausdinkPlota(k.toString());
        } 
        if (IOtvarkykle.getPasirinkimas() == 2){
            Trikampis t = new Trikampis(IOtvarkykle.getKrastine1(),IOtvarkykle.getKrastine2());
            t.skaiciuokPlota();
            IOtvarkykle.pausdinkPlota(t.toString());
        }
        else{
            Blynas a = new Blynas(IOtvarkykle.getKrastine1());
            a.skaiciuokPlota();
            IOtvarkykle.pausdinkPlota(a.toString());
        }

    }
}
