//import java.lang.reflect.Array;
import java.util.*;

public class Uzduotis_paskaitos_metu {

    private static Random rand = new Random();

    // static private int random(int MIN, int MAX) {
    //     return rand.nextInt(MAX - MIN + 1) + MIN;
    // }

    static public float random(float MIN, float MAX) {
        return (MIN + rand.nextFloat() * (MAX - MIN));
    }

    static public void UzPamoka1() {
        int[] pazimiai = { 8, 5, 5, 3, 8, 7, 7, 8, 2, 5, 2, 3, 8, 9, 3, 7, 10, 4, 9, 6 };
        // int[] Hmm1 = new int[pazimiai.length];
        // int[] Hmm2 = new int[pazimiai.length];
        // int[] temp = new int[1];
        // padaryti kad surasytu juos i naujas aibes
        int[] Studentai = new int[2];
        for (int i = 0; i < pazimiai.length; i++) {
            if (pazimiai[i] >= 7) {
                Studentai[0]++;
                // temp[0] = pazimiai[i];
                // Hmm1 = Hmm1.ad
            } else {
                Studentai[1]++;
            }

        }
        System.out.println(Studentai[0] + " " + Studentai[1]);
        System.out.println(Studentai[0] / pazimiai.length);
    }

    static public void UzPamoka2() {

        String[] Vardai = { "Justinas", "Vilius", "Mindaugas", "Rokas" };
        List<String> MokiniuVardai = Arrays.asList(Vardai);
        // List<String> MokiniuVardai2 = Arrays.asList(Vardai);

        System.out.println(MokiniuVardai);

        // Collection.sort(MokiniuVardai);

    }

    static public void UzPamoka3() {
        //String[] Data = { "Du", "gaideliai", "du", "gaideliai", "baltus", "žirnius", "kūlė" };
        // Set<String> dainele = Arrays.asList(Data);
        // int Data = dainele.size();
    }

    static public void UzPamoka4() {
        Map<Integer, String> planetos = new HashMap<Integer, String>();
        planetos.put(3, "Zeme");
        planetos.put(1, "Merkurijus");
        planetos.put(4, "Marsas");
        planetos.put(2, "Venera");
        planetos.put(null, "Plutonas");
        planetos.put(7, "Saturnas");
        planetos.put(6, "Menulis");

        System.out.println(planetos);
        System.out.println(planetos.get(8));

        boolean a = planetos.containsKey(6);
        // boolean b = planetos.containsKey("Merkurijus");

        if (a) {
            planetos.remove(6);
        }
        System.out.println(planetos);
    }

    static public void UzPamoka5() {
        List<String> pirmieji = new ArrayList<String>();

        String[] Vardai = { "Justinas", "Vilius", "Mindaugas", "Rokas" };
        List<String> MokiniuVardai = Arrays.asList(Vardai);

        Map<Integer, String> planetos = new HashMap<Integer, String>();
        planetos.put(3, "Zeme");
        planetos.put(1, "Merkurijus");
        planetos.put(4, "Marsas");
        planetos.put(2, "Venera");
        planetos.put(null, "Plutonas");
        planetos.put(7, "Saturnas");
        planetos.put(6, "Menulis");

        //String[] Data = { "Du", "gaideliai", "du", "gaideliai", "baltus", "žirnius", "kūlė" };

        pirmieji.add(MokiniuVardai.get(0));
        pirmieji.add(planetos.get(1));

        // List<String> LisISSeto = new ArrayList<String>(Data);
    }

    static public void UzPamoka6() {
        class Mokinys {
            String Varas;
            int pazinius[];
            float vidurkis;

        }
        Mokinys var1 = new Mokinys();
        var1.Varas = "Maryte Kavalyte";
        var1.pazinius = new int[] { 1, 3, 4 };
        var1.vidurkis = 0;

        for (int i = 0; i < var1.pazinius.length; i++) {
            var1.vidurkis += var1.pazinius[i];
        }

        var1.vidurkis = var1.vidurkis / var1.pazinius.length;

        Mokinys var2 = new Mokinys();
        var2.Varas = "Dede Zede";
        var2.pazinius = new int[] { 9, 8, 10 };
        var2.vidurkis = 0;

        for (int i = 0; i < var2.pazinius.length; i++) {
            var2.vidurkis += var2.pazinius[i];
        }

        var2.vidurkis = var2.vidurkis / var2.pazinius.length;

        Mokinys var3 = new Mokinys();
        var3.Varas = "Zozea Dose";
        var3.pazinius = new int[] { 2, 4, 9 };
        var3.vidurkis = 0;

        for (int i = 0; i < var3.pazinius.length; i++) {
            var3.vidurkis += var3.pazinius[i];
        }

        var3.vidurkis = var3.vidurkis / var3.pazinius.length;

        List<Mokinys> mokiniai = new ArrayList<Mokinys>();
        mokiniai.add(0, var1);
        mokiniai.add(1, var2);
        mokiniai.add(2, var3);

        Map<String, Float>zurnalas = new HashMap<String,Float>();
        
        for (Mokinys mok:mokiniai){
            zurnalas.put(mok.Varas,mok.vidurkis);
        }

        System.out.println(zurnalas);

        TreeSet<Float> vidurkis = new TreeSet<Float>();
        for(Mokinys Zo : mokiniai){
            vidurkis.add(Zo.vidurkis);
        }

        System.out.println(vidurkis);

        float skirtumas = vidurkis.last() - vidurkis.first();

        System.out.println(skirtumas);
    }

    public static void main(String[] args) {
        UzPamoka6();
    }
}
