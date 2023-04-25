import java.util.Random;

class Taupykle {
        private static Random rand = new Random();

        static private int random(int MIN, int MAX) {
                return rand.nextInt(MAX - MIN + 1) + MIN;
        }

        public int a_po_5_ct = random(0, 80);
        public int b_po_20_ct = random(0, 80);
        public int c_po_2_lt = random(0, 80);

        float is_viso() {
                return (((a_po_5_ct) * 0.05f) + ((b_po_20_ct) * 0.2f) + ((c_po_2_lt) * 2));
        }
}

public class Uzdaviniai {

        public static Random rand = new Random();
        // 1. Parašykite programą, kuri padėtų Petriukui suskaičiuoti,
        // kiek pamokų jis turi per savaitę ir kiek tai sudarys minučių.
        // Turime 5 skaičius, reiškiančius kiekvienos dienos pamokų skaičių:

        static public int random(int MIN, int MAX) {
                return rand.nextInt(MAX - MIN + 1) + MIN;
        }

        static public void Pirma() {

                int pirmadieniais = (int) random(3, 8);
                int antradieniais = (int) random(3, 8);
                int treciadieniais = (int) random(3, 8);
                int ketvirtadieniais = (int) random(3, 8);
                int penktadieniais = (int) random(3, 8);

                System.out.println("Pamoku skaicius sia savaite: "
                                + (pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais + penktadieniais)
                                + ". pir: "
                                + pirmadieniais + ", ant: " + antradieniais + ", tre: " + treciadieniais + " ,ket: "
                                + ketvirtadieniais
                                + " ,pen: " + penktadieniais);
                System.out.println("Tai sudaro "
                                + ((pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais + penktadieniais)
                                                * 45)
                                + " minuciu. Pertraukomis būtu "
                                + ((pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais + penktadieniais)
                                                * 15)
                                + ". Išviso Petriukas buvo mokykloje: "
                                + (((pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais + penktadieniais)
                                                * 45)
                                                + ((pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais
                                                                + penktadieniais) * 15))
                                + " minuciu. "
                                + ((((pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais
                                                + penktadieniais) * 45)
                                                + ((pirmadieniais + antradieniais + treciadieniais + ketvirtadieniais
                                                                + penktadieniais) * 15))
                                                / 60)
                                + " Valandas.");

        }

        static public void Antra() {
                // 2. Akvariume gyvena a žuvų.
                // Kiekvieną dieną Petriukas į akvariumą įdeda b žuvų.
                // Parašykite programą, kuri suskaičiuotų kiek iš viso bus žuvų po n dienų.
                // Rezultatą reikia išvesti su paaiškinamaisiais žodžiais.

                int a = (int) random(0, 10);
                int b = (int) random(1, 3);
                int n = (int) random(1, 30);

                int akvariumas = (a + b) * n;

                System.out.println("Po " + n + " dienų akvariumia bus " + akvariumas + " žuvinai, ir žuvinytės.");
        }

        static public void Trecia() {
                // 3. Automobilių tunelio po Nepriklausomybės aikštės Vilniuje ilgis lygus 264
                // m.
                // Parašykite programą, kuri apskaičiuotų, kelias sekundes s automobilis
                // važiuoja šiuo tuneliu,
                // jei jo greitis yra v km/h? Rezultatus atspausdinkite ekrane šimtųjų tikslumu
                // (formatavimui //naudokite metodą nf(laikas, 0, 2) ).

                int v = (int) random(20, 60);
                double metrai_per_sekunders = v * 0.27777777777778d;
                double padalijimas_is_atstumo = 264 / metrai_per_sekunders;
                System.out.printf("Greitis yra %d km/h, tai būtu %.1f m/s, ir užtruktu %.2f sekundės. \n", v,
                                metrai_per_sekunders, padalijimas_is_atstumo);

        }

        static public void Ketvirta() {
                // 4. Jonas turi kiaulę taupyklę, kurioje yra:
                // a monetų po 5 ct,
                // b monetų po 20 ct ir
                // c monetų po 2 Lt. Kitokios vertės monetų taupyklėje nėra.
                // Parašykite programą, kuri suskaičiuotų, kiek pinigų kiaulėje taupyklėje iš
                // viso turi Jonas.
                // Atsakymą pateikite litais, pvz.:
                // kai taupyklėje yra 12 monetų po 5 ct, 5 monetos po 20 ct ir 6 monetos po 2
                // Lt, tuomet ekrane
                // turi būti rodoma: Taupyklėje yra 13.60 Lt.
                // Sukurkite klasę Taupykle, kurioje būtų sąlygoje nurodyti kintamieji.
                // Sukurkite dvi taupykles (du klasės objektus) su atsitiktiniais monetų
                // kiekiais (( random(x, y); )
                // Sukurkite kintamąjį, atsakantį į klausimą ar pirmoje taupyklėje daugiau
                // pinigų nei antroje. Visas reikšmes su paaiškinamais žodžiais atspausdinkite
                // ekrane.

                // Klasie, jau?

                Taupykle Pirma_Taupykle = new Taupykle();
                Taupykle Antra_Taupykle = new Taupykle();

                System.out.println("Pirmoje taupyklėja yra " + Pirma_Taupykle.is_viso()
                                + " Lt. Ir antroje taupyklėja yra " + Antra_Taupykle.is_viso() + "Lt.");

                if (Pirma_Taupykle.is_viso() > Antra_Taupykle.is_viso()) {
                        System.out.println("Vadinasi pirmoje taupyklėja yra daugiau pinigų. O joje yra " + Pirma_Taupykle.is_viso() + " Lt.");
                }
                else if (Pirma_Taupykle.is_viso() < Antra_Taupykle.is_viso()) {
                        System.out.println("Vadinasi antroje taupyklėja yra daugiau pinigų. O joje yra " + Antra_Taupykle.is_viso() + " Lt.");
                }
                else {
                        System.out.println("Jos abi yra lygios");
                }

                //home work done
                //home work done 2

        }

        static public void main(String[] args) {
                // Pirma();
                // System.out.println();
                // Antra();
                // System.out.println();
                // Trecia();
                // System.out.println();
                Ketvirta();
        }
}