import java.util.Random;

public class Uzdaviniai {
        Random rand = new Random();
        // 1. Parašykite programą, kuri padėtų Petriukui suskaičiuoti,
        // kiek pamokų jis turi per savaitę ir kiek tai sudarys minučių.
        // Turime 5 skaičius, reiškiančius kiekvienos dienos pamokų skaičių:
        static public void Pirma() {
                

                int pirmadieniais = rand.nextInt(8 - 3 + 1) + 3;
                int antradieniais = rand.nextInt(8 - 3 + 1) + 3;
                int treciadieniais = rand.nextInt(8 - 3 + 1) + 3;
                int ketvirtadieniais = rand.nextInt(8 - 3 + 1) + 3;
                int penktadieniais = rand.nextInt(8 - 3 + 1) + 3;

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

        }

        static public void main(String[] args) {
                Pirma();
                System.out.println();

        }
}