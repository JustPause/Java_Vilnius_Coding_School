# Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

---------------------------------------------------------------------------

## Uzduotis

Sukurkite bankomato programą:

Bankomate yra 500 pinigų, naudotojas paleidęs programą yra paprašomas įvesti pin
kodą.  

Jei įvestas pin kodas teisingas (teisingas kodas yra “testas”) naudotojas gauna pranešimą, kad sėkmingai prisijungė.  

Pin kodo įvedimas tikrinamas 3 kartus. Jeigu 3 kartus įvestas neteisingai, naudotojas gauna pranešimą, kad sąskaita blokuota ir programa sustoja.

Kai naudotojas teisingai įveda pin kodą ("testas"), sistema paklausia ką nori daryti: išgryninti pinigų ar baigti darbą.  

Jeigu pasirenkama “išgryninti”, tuomet paprašo įvesti pinigų kiekį, kurį nori išsigryninti. Kiekis negali būti didesnis nei bankomate yra pinigų, jei įveda daugiau, tuomet informuojamas, kad bankomate nėra tiek pinigų ir paprašo įvesti mažesnę sumą.

Įvedus tinkamą sumą, ji yra išgryninama (nuimta pinigų suma minusuojama iš buvusio bankomato likučio) ir parašoma, jog pinigai išgryninti. Tuomet programa vėl klausia ką nori daryti, tol, kol nesibaigia pinigai arba nenusprendžiama baigti darbo.

Pasirinkus baigti darbą, išeinama iš programos.

---------------------------------------------------------------------------

Turi būti sukurtos trys klasės ir implementuoti jų metodai:

public class Naudotojas {

    private final String teisingasPin = "testas";

    public int tikrinkPin() {
        
        while () {

            
        }
        return bandymuSkaicius;
    }

}

public class Bankomatas {

    private int likutisBankomate = 500;

    private void baikDarba() {
        System.out.println("Darbas baigtas");
    }

    private void isgryninkPinigus() {

        do {

        } while (!arIsgrynino);

        pasirinkVeiksma();

    }

    private void pasirinkVeiksma() {

        if (this.likutisBankomate > 0) {
            do {

            } while (!arVeikia);

        } else {
            System.out.println("Bankomate pinigu nera.");
            baikDarba();
        }

    }

    public void pradekDarba() {
        Naudotojas naudotojas = new Naudotojas();
        if (naudotojas.tikrinkPin() < 3) {
            pasirinkVeiksma();
        } else {
            System.out.println("Saskaita uzblokuota");
            baikDarba();
        }

    }

}

public class Paleidimas {

    public static void main(String[] args) {

        Bankomatas bnkmt = new Bankomatas();
        bnkmt.pradekDarba();

    }
}

---------------------------------------------------------------------------

PinCodas
    for (tikrinama 3 kartus)
        if false
            if neteisingas
                println (sąskaita blokuota) programa sustoja
        if true = println (sėkmingai prisijungė)

Saskaitoja
    println (sistema paklausia ką nori daryti)
    println (išgryninti pinigų ar baigti darbą)

if (“išgryninti”)
    input suma kuria nori isimti
    if paparaso daugiau pinigu negu turi sakaitoja
        print (nėra tiek pinigų)
    if tesinga suma
        bank suma - Input
programa vėl klausia ką nori daryti
