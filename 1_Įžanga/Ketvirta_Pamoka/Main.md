//1. Sukurkite Stringą su savo vardu ir Stringą su savo pavarde.
//patikrinkite ar jūsų pirma vardo raidė ir pirma pavardės raidė yra ta pati;
//patikrinkite ar raidžių skaičius varde yra toks pats kaip raidžių skaičius pavardėje. 
//sujunkite jūsų vardą ir pavardę į vieną kintamąjį  (nepamirškite tarpo tarp jų). Kokio ilgio yra //sujungtas Stringas?


//2. Didžioji kūdrinė varlė – beuodegis varliagyvis. Ji sveria m gramų (m -realusis skaičius). 
//Mokslininkai, tyrinėjantys didžiąsias kūdrines varles, nusprendė n varlių stebėti. 
//Jei stebimos varlės svers daugiau kaip 5 kilogramus, ekrane turi būti rodomas pranešimas
//"Varlių stebėjimui pakanka", jei mažiau – "Varlių stebėjimui per mažai".

int m = (int) random (50, 250);
int n = (int) random (50, 1000);

//3. Julius, grįžęs iš mokyklos namo, rado tokį mamos raštelį:
//Nueik į parduotuvę ir nupirk bandelių su varške.
//Jei viena bandelė kainuos ne daugiau kaip a Lt, nupirk n1 bandelių;
//Jei daugiau nei a, bet mažiau nei b, nupirk n2 bandelių;
//O jei kainuos b arba daugiau, negu b - n3 bandelių.
//Nuėjęs į parduotuvę, Julius pamatė, kad bandelė kainuoja k Lt.
//Parašykite programą, kuri apskaičiuotų, kiek pinigų už bandeles sumokės Julius.

float a = 1.50;
float b = 1.70;
byte n1 = 3;
byte n2 = 2;
byte n3 = 1;
float k = random(0.5, 2.99);

//4. Gamtininkas registruoja likusius žiemoti paukščius. Jo tikslas yra
//nustatyti, kurios iš trijų paukščių rūšių atstovų liko žiemoti daugiausia. 
//Yra trijų paukščių rūšių kiekiai - r1, r2 ir r3.
//Parašykite programą, kuri surikiuotų juos iš eilės nuo didžiausio iki
//mažiausio ir apskaičiuotų, kiek skiriasi didžiausias ir mažiausias kiekiai.

int r1 = (int)random(1500, 6500);
int r2 = (int)random(1500, 6500);
int r3 = (int)random(1500, 6500);

//5.Restorano “Skanu" vadybininkas sugalvojo surengti konkursą lankytojams, kurio
//metu galima laimėti marškinėlius su restorano logotipu. 
//Visi lankytojai kartu su sąskaita gauna po vieną kortelę, ant kurios parašytas 
//sveikasis teigiamas skaičius iš intervalo [nuo; iki]. 
//Laimi tie lankytojai, kurių kortelėse įrašytas skaičius dalijasi iš 6. 
//Parašykite programą, kuri apskaičiuotų, kiek marškinėlių reikia užsakyti restorano vadybininkui.

int nuo = (int)random(1, 50);
int iki = (int)random(70, 150);

//6. Per vasarą voverytė sukaupė R riešutėlių. 
//Prasidėjus žiemai voverytė kartu su savo V voveriukų sugraužia pusryčiams, 
//pietums ir vakarienei po vieną riešutą kiekvienas.
//Apskaičiuokite, kelioms dienoms D voverytei su voveriukais užteks sukauptų riešutų.
//Patikrinkite, ar riešutų užteks visai žiemai, jeigu žiema trunka 92 dienas.

int R = (int)random(200, 2000);
int V = (int)random(1, 5);

//7. Siuntų pervežimo įmonėje dirbantis kurjeris gavo užduotį parengti pervežimų statistiką:
//1. kiek įvykdė užsakymų, kurių suma viršijo 100 Lt;
//2. už kokią vidutinę sumą per dieną išvežiojo prekių;
//3. kiek iš viso užsakymų išvežiojo.
//Nežinoma, kiek užsakymų bus įvykdyta per dieną, todėl kai atsiras užsakymas kuriosuma yra nulis (0),
//tai reikš, kad darbo diena baigta ir reikia pateikti rezultatus. 
//Parenkite programą, kuri leistų nežinomą skaičių kartų kurjeriui vykdyti užsakymus 
//(skaičiavimai baigiami kai užsakymo suma yra nulis.
//Nulis skaičiuojant vidurkį ir kiekį nebus pridėtas) 
//ir pateiktų skaičiavimų rezultatus.

int kiekis = 1;
float uzsakymoSuma = 9.99;
int isVisoUzs = 0;
float bendraSuma = 0;
int virsSimto = 0;


do{
  
    uzsakymoSuma = random(9.99, 500.99);
    kiekis = (int)random(0, 5);

}
while(kiekis != 0);
//8. Moliūgai. Ūkininkas augina moliūgus ir pristato į supirkimo punktą. Supirkimo punkte
//priimami tik tie moliūgai, kurių svoris yra ne mažesnis už p1 kilogramų ir ne didesnis už p2
//kilogramų. Parašykite programą, kuri apskaičiuotų:
//vidutinį visų moliūgų svorį;
//keli moliūgai bus vežami į supirkimo punktą;
//atrinktų moliūgų vidutinį svorį ir pateiktų vežamų moliūgų svorių sąrašą.

int n = (int) random (1, 100);
float p1 = 2.5f; float p2 = 5.0f;
float[] moliuguSvoriai = new float[n];

for(int i = 0; i < n; i++){
  moliuguSvoriai[i] = random(0.5, 8.5);
}

Pvz:
Duomenys
Rezultatai
5   2.5   5.0 
2.00   4.75   3.50   5.80   3.00
Visų moliūgų vidutinis svoris: 3.810 kg
Į supirkimą atrinkta: 3
Vidutinis vieno atrinkto moliūgo svoris:
3.750 kg
Atrinktų moliūgų svorių sąrašas: 4.750  3.500
3.000


2   2.5   5.0 
2.00   6.40
Visų moliūgų vidutinis svoris: 4.200 kg 
Į supirkimo punktą atrinktų moliūgų nėra.


//Duomenys stulpelyje įrašyti 3 skaičiai. 
//Pirmas skaičius yra sveikasis ir parodo kiek moliūgų n (1 ≤ n ≤ 100) ūkininkas užaugino. 
//Tolesni du realieji skaičiai parodo svorio ribas p1 ir p2. 
//Antroje eilutėje yra surašyti kiekvieno moliūgo svoriai kilogramais (realieji skaičiai).

//Reikalavimai programai:
//1. duomenims saugoti naudokite masyvus;
//2. skaičiavimų rezultatus pateikite trijų skaičių po kablelio tikslumu;

//9.Avalynės parduotuvė. Parduotuvė prekiauja vyriška ir moteriška avalyne. 
//Kiekvieną dieną yra  vedama apskaita: užrašoma, kiek batų porų yra parduota ir 
//pasižymima informacija apie parduotą porą – vyriška ar moteriška bei poros kaina. 
//Parašyti programą, kuri rastų:
//už kokią pinigų sumą parduota avalynės per dieną;
//už kokią pinigų sumą parduota moteriškos ir vyriškos avalynės atskirai (duomenis pateiktų kolekcijoje); 
//kiek vidutiniškai kainavo moteriškų ir vyriškų batų pora; 


import java.util.*;
import java.math.BigDecimal;

class BatuPora {
  Random rd = new Random();
  boolean motBatai = rd.nextBoolean();
  BigDecimal kaina = new BigDecimal(random(29.99, 299.99));
}

int parduotaSiandien = (int)random(1, 100);
List<BatuPora> parduotiBatai = new ArrayList<BatuPora>();

for(int i = 0; i < parduotaSiandien; i++){
  BatuPora batai = new BatuPora();
  parduotiBatai.add(batai);
}



