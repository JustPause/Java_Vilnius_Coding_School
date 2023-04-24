class Labas_Pasauli {
    public static void main(String[] args) {
        
        String Varas = "Justinas";

        int Viek_Vardo_Raidziu = Varas.length();

        String Pirma_Raide = Varas.substring(0, 1);

        char VarasRaide = Varas.charAt(0);
      
        System.out.println(Varas+"; ");
        System.out.println(VarasRaide+"; "); 

        float benzino_Kainos = 1.7f;
    
        float suma = benzino_Kainos + Viek_Vardo_Raidziu;

        // for (byte i = 0; true; i++){
        //     i = i++;
        //     System.out.print(i+" ");
        // }

        float sk = (Viek_Vardo_Raidziu - VarasRaide) + suma;

        boolean arSumaTeisinga = suma > 0;

        System.out.println(sk + "; ");

        System.out.println((int)VarasRaide + "; ");

        int numeris = (int) ((suma - (suma-(int) VarasRaide+ Viek_Vardo_Raidziu)) -(int) VarasRaide) * (-1);

        System.out.println((int) VarasRaide
        );

    }
}

/*
 * Character
 * Character.Subset Class
 * //System.out.printf("%%i is %i\n", 10000); 
 * //System.out.printf("%%u is %u", int_var);
 */