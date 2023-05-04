import java.util.*;

public class Papildomus_Uzduotiys {

    private static Random rand = new Random();

    static private int random(int MIN, int MAX) {
        return rand.nextInt(MAX - MIN + 1) + MIN;
    }

    static public float random(float MIN, float MAX) {
        return (MIN + rand.nextFloat() * (MAX - MIN));
    }

    static public void Uz1() {
        // 1. Sukurkite Stringą su savo vardu ir Stringą su savo pavarde.
        // patikrinkite ar jūsų pirma vardo raidė ir pirma pavardės raidė yra ta pati;
        // patikrinkite ar raidžių skaičius varde yra toks pats kaip raidžių skaičius
        // pavardėje.
        // sujunkite jūsų vardą ir pavardę į vieną kintamąjį (nepamirškite tarpo tarp
        // jų). Kokio ilgio yra //sujungtas Stringas?

        String Name = "Justinas";
        String SureName = "Stankunas";

        System.out.println("Pirmaraide:");
        if (Name.substring(0, 1) == SureName.substring(0, 1)) {
            System.out.println("Sutampa");
        } else {
            System.out.println("Nesutampa");
        }

        System.out.println("Ilgis");
        if (Name.length() == SureName.length()) {
            System.out.println("Sutampa:");
        } else {
            System.out.println("Nesutampa");
        }

        System.out.println("Sujunktas Ilgis:");
        System.out.println((Name + " " + SureName).length());
    }

    static public void Uz2() {
        // 2. Didžioji kūdrinė varlė – beuodegis varliagyvis. Ji sveria m gramų (m
        // -realusis skaičius).
        // Mokslininkai, tyrinėjantys didžiąsias kūdrines varles, nusprendė n varlių
        // stebėti.
        // Jei stebimos varlės svers daugiau kaip 5 kilogramus, ekrane turi būti rodomas
        // pranešimas
        // "Varlių stebėjimui pakanka", jei mažiau – "Varlių stebėjimui per mažai".

        int n = (int) random(50, 1000);

        int temp = 0;

        for (int i = 0; i < n; i++) {
            int m = (int) random(50, 250);
            temp = temp + m;
        }

        if (temp < 5000) {
            System.out.println(temp + "Varlių stebėjimui pakanka");
        } else {
            System.out.println(temp + "Varlių stebėjimui per mažai");
        }
    }

    static public void Uz3() {
        // 3. Julius, grįžęs iš mokyklos namo, rado tokį mamos raštelį:
        // Nueik į parduotuvę ir nupirk bandelių su varške.
        // Jei viena bandelė kainuos ne daugiau kaip a Lt, nupirk n1 bandelių;
        // Jei daugiau nei a, bet mažiau nei b, nupirk n2 bandelių;
        // O jei kainuos b arba daugiau, negu b - n3 bandelių.
        // Nuėjęs į parduotuvę, Julius pamatė, kad bandelė kainuoja k Lt.
        // Parašykite programą, kuri apskaičiuotų, kiek pinigų už bandeles sumokės
        // Julius.

        float a = 1.50f;
        float b = 1.70f;
        byte n1 = 3;
        byte n2 = 2;
        byte n3 = 1;
        float k = random(0.5f, 2.99f);

        if (k < a) {
            System.out.println("Perku viena bandelia");
        }

        System.out.println((k < a) + " " + k);

    }

}
