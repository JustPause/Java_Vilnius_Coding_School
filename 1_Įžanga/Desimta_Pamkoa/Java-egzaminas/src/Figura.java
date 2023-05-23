public class Figura {
    private static float plotas;
    private static float kraštinė1;
    private static float kraštinė2;

    public Figura(float sk1, float sk2) {
        kraštinė1 = sk1;
        kraštinė2 = sk2;
    }

    public void skaiciuokPlota() {
        plotas = kraštinė1 * kraštinė2;
    }

    @Override
    public String toString() {
        return "Jūsų figuros plotas yra " + plotas + " kv.cm";
    }

    public static float getPlotas() {
        return plotas;
    }

    public static void setPlotas(float plotas) {
        Figura.plotas = plotas;
    }

    public static float getKraštinė1() {
        return kraštinė1;
    }

    public static float getKraštinė2() {
        return kraštinė2;
    }

}
