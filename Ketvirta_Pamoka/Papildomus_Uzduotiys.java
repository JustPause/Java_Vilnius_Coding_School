//import java.math.BigDecimal;
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

        if (k <= a) {
            System.out.print("Perku ");
            System.out.print(n1);
            System.out.println("bandelia");
        } else if (k >= a && k <= b) {
            System.out.print("Perku ");
            System.out.print(n2);
            System.out.println("bandelia");
        } else if (k >= b) {
            System.out.print("Perku ");
            System.out.print(n3);
            System.out.println("bandelia");
        }

        System.out.println((k < a) + " " + k);

    }

    static public void Uz4() {
        // 4. Gamtininkas registruoja likusius žiemoti paukščius. Jo tikslas yra
        // nustatyti, kurios iš trijų paukščių rūšių atstovų liko žiemoti daugiausia.
        // Yra trijų paukščių rūšių kiekiai - r1, r2 ir r3.
        // Parašykite programą, kuri surikiuotų juos iš eilės nuo didžiausio iki
        // mažiausio ir apskaičiuotų, kiek skiriasi didžiausias ir mažiausias kiekiai.

        int r1 = (int) random(1500, 6500);
        int r2 = (int) random(1500, 6500);
        int r3 = (int) random(1500, 6500);

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(r1);
        list.add(r2);
        list.add(r3);

        list.sort(null);

        System.out.println(list.get(2) - list.get(0));
    }

    static public void Uz5() {
        // 5.Restorano “Skanu" vadybininkas sugalvojo surengti konkursą lankytojams,
        // kurio
        // metu galima laimėti marškinėlius su restorano logotipu.
        // Visi lankytojai kartu su sąskaita gauna po vieną kortelę, ant kurios
        // parašytas
        // sveikasis teigiamas skaičius iš intervalo [nuo; iki].
        // Laimi tie lankytojai, kurių kortelėse įrašytas skaičius dalijasi iš 6.
        // Parašykite programą, kuri apskaičiuotų, kiek marškinėlių reikia užsakyti
        // restorano vadybininkui.

        int nuo = (int) random(1, 50);
        int iki = (int) random(70, 150);

        int intervalo[] = new int[iki - nuo];

        int sk = 0;

        for (int i = 0; i < intervalo.length; i++) {
            intervalo[i] = i + intervalo.length;

            if (intervalo[i] % 6 == 0) {
                sk++;
            }
        }

        System.out.println(sk);

    }

    static public void Uz6() {
        // 6. Per vasarą voverytė sukaupė R riešutėlių.
        // Prasidėjus žiemai voverytė kartu su savo V voveriukų sugraužia pusryčiams,
        // pietums ir vakarienei po vieną riešutą kiekvienas.
        // Apskaičiuokite, kelioms dienoms D voverytei su voveriukais užteks sukauptų
        // riešutų.
        // Patikrinkite, ar riešutų užteks visai žiemai, jeigu žiema trunka 92 dienas.

        int R = (int) random(200, 2000);
        int V = (int) random(1, 5);

        for (int i = 0; i < 92; i++) {
            R = R - (V + 1) * 3;
        }

        System.out.println(R);
        if (R >= 0) {
            System.out.println("Uzteks ziemai");
        } else {
            System.out.println("Neuzteks");
        }
    }

    static public void Uz7() {
        // 7. Siuntų pervežimo įmonėje dirbantis kurjeris gavo užduotį parengti
        // pervežimų statistiką:
        // 1. kiek įvykdė užsakymų, kurių suma viršijo 100 Lt;
        // 2. už kokią vidutinę sumą per dieną išvežiojo prekių;
        // 3. kiek iš viso užsakymų išvežiojo.
        // Nežinoma, kiek užsakymų bus įvykdyta per dieną, todėl kai atsiras užsakymas
        // kuriosuma yra nulis (0),
        // tai reikš, kad darbo diena baigta ir reikia pateikti rezultatus.
        // Parenkite programą, kuri leistų nežinomą skaičių kartų kurjeriui vykdyti
        // užsakymus
        // (skaičiavimai baigiami kai užsakymo suma yra nulis.
        // Nulis skaičiuojant vidurkį ir kiekį nebus pridėtas)
        // ir pateiktų skaičiavimų rezultatus.

        int kiekis = 1;
        float uzsakymoSuma = 9.99f;
        int isVisoUzs = 0;
        float bendraSuma = 0;
        int virsSimto = 0;

        do {

            uzsakymoSuma = random(9.99f, 500.99f);
            kiekis = (int) random(0, 5);

            uzsakymoSuma = uzsakymoSuma / kiekis;

            for (int i = 0; i < kiekis; i++) {
                if (uzsakymoSuma < 100) {
                    virsSimto++;
                }
                isVisoUzs++;

                bendraSuma += uzsakymoSuma;
                System.out.println(uzsakymoSuma + " " + (kiekis - i));
            }
        } while (kiekis != 0);

        bendraSuma /= isVisoUzs;

        System.out.println(virsSimto + " " + bendraSuma + " " + isVisoUzs);
    }

    static public void Uz8() {
        // 8. Moliūgai. Ūkininkas augina moliūgus ir pristato į supirkimo punktą.
        // Supirkimo punkte
        // priimami tik tie moliūgai, kurių svoris yra ne mažesnis už p1 kilogramų ir ne
        // didesnis už p2
        // kilogramų. Parašykite programą, kuri apskaičiuotų:
        // vidutinį visų moliūgų svorį;
        // keli moliūgai bus vežami į supirkimo punktą;
        // atrinktų moliūgų vidutinį svorį ir pateiktų vežamų moliūgų svorių sąrašą.

        // int n = (int) random (1, 100);
        // float p1 = 2.5f; float p2 = 5.0f;
        // float[] moliuguSvoriai = new float[n];

        // for(int i = 0; i < n; i++){
        // moliuguSvoriai[i] = random(0.5, 8.5);
        // }

        // Pvz:
        // Duomenys
        // Rezultatai
        // 5 2.5 5.0
        // 2.00 4.75 3.50 5.80 3.00
        // Visų moliūgų vidutinis svoris: 3.810 kg
        // Į supirkimą atrinkta: 3
        // Vidutinis vieno atrinkto moliūgo svoris:
        // 3.750 kg
        // Atrinktų moliūgų svorių sąrašas: 4.750 3.500
        // 3.000

        // 2 2.5 5.0
        // 2.00 6.40
        // Visų moliūgų vidutinis svoris: 4.200 kg
        // Į supirkimo punktą atrinktų moliūgų nėra.

        // Duomenys stulpelyje įrašyti 3 skaičiai.
        // Pirmas skaičius yra sveikasis ir parodo kiek moliūgų n (1 ≤ n ≤ 100)
        // ūkininkas užaugino.
        // Tolesni du realieji skaičiai parodo svorio ribas p1 ir p2.
        // Antroje eilutėje yra surašyti kiekvieno moliūgo svoriai kilogramais (realieji
        // skaičiai).

        // Reikalavimai programai:
        // 1. duomenims saugoti naudokite masyvus;
        // 2. skaičiavimų rezultatus pateikite trijų skaičių po kablelio tikslumu;

        int n = (int) random(1, 100);
        float p1 = 2.5f;
        float p2 = 5.0f;
        float[] moliuguSvoriai = new float[n];
        float VisuvidutinasSvoris = 0;
        float IsrinktuutinasSvoris = 0;
        int ĮSupirkimąAtrinkta = 0;

        for (int i = 0; i < n; i++) {
            moliuguSvoriai[i] = random(0.5f, 8.5f);
            VisuvidutinasSvoris = VisuvidutinasSvoris + moliuguSvoriai[i];
            if (moliuguSvoriai[i] >= p1 && moliuguSvoriai[i] <= p2) {
                IsrinktuutinasSvoris = IsrinktuutinasSvoris + moliuguSvoriai[i];
                ĮSupirkimąAtrinkta++;
            }
        }

        System.out.printf("Duomenys\nRezultatai\n%d\t%.1f\t%.1f\n", n, p1, p2);
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t", moliuguSvoriai[i]);
        }
        System.out.println();
        System.out.printf("Visų moliūgų vidutinis svoris: %.3f kg\n", VisuvidutinasSvoris / n);
        System.out.printf("Į supirkimą atrinkta: %d\n", ĮSupirkimąAtrinkta);
        System.out.printf("Vidutinis vieno atrinkto moliūgo svoris: %.3f kg\n",
                IsrinktuutinasSvoris / ĮSupirkimąAtrinkta);
        System.out.print("Atrinktų moliūgų svorių sąrašas: ");
        for (int i = 0; i < n; i++) {
            if (moliuguSvoriai[i] >= p1 && moliuguSvoriai[i] <= p2) {
                System.out.printf("%.3f\t", moliuguSvoriai[i]);
            }
        }
        System.out.println();

        // Pvz:
        // Duomenys
        // Rezultatai
        // 5 2.5 5.0
        // 2.00 4.75 3.50 5.80 3.00
        // Visų moliūgų vidutinis svoris: 3.810 kg
        // Į supirkimą atrinkta: 3
        // Vidutinis vieno atrinkto moliūgo svoris:
        // 3.750 kg
        // Atrinktų moliūgų svorių sąrašas: 4.750 3.500
        // 3.000
    }

    static public void Uz8Redo() {
        //9.Avalynės parduotuvė. Parduotuvė prekiauja vyriška ir moteriška avalyne. 
        //Kiekvieną dieną yra  vedama apskaita: užrašoma, kiek batų porų yra parduota ir 
        //pasižymima informacija apie parduotą porą – vyriška ar moteriška bei poros kaina. 
        //Parašyti programą, kuri rastų:
        //už kokią pinigų sumą parduota avalynės per dieną;
        //už kokią pinigų sumą parduota moteriškos ir vyriškos avalynės atskirai (duomenis pateiktų kolekcijoje); 
        //kiek vidutiniškai kainavo moteriškų ir vyriškų batų pora; 

        class BatuPora {
        //Random rd = new Random();
        //boolean motBatai = rd.nextBoolean();
        //BigDecimal kaina = new BigDecimal(random(29.99f, 299.99f));
        }

        int parduotaSiandien = (int)random(1, 100);
        List<BatuPora> parduotiBatai = new ArrayList<BatuPora>();

        for(int i = 0; i < parduotaSiandien; i++){
        BatuPora batai = new BatuPora();
        parduotiBatai.add(batai);
}
    }

    public static void main(String[] args) {
        Uz8();
    }
}
