
package src.arv;

import src.dato.Dato;

public class ArvMain {
    public static void main(String[] args) {
        Husdyr[] husdyr = new Husdyr[3];

        Kat miver = new Kat("Miver", "Mus");

        Dato msk = new Dato(20201022);
        Hund mimse = new Hund("Mimi", "Kødben", msk);
        
        Dato fsk = new Dato(20201022);
        Raev roev = new Raev("Røv", "Mad", fsk);

        husdyr [0] = miver;
        husdyr[1] = mimse;
        husdyr[2] = roev;

        for (int i = 0; i < husdyr.length; i++) {
            System.out.println(husdyr[i].getNavn() + " " + husdyr[i].givLyd());
        }
    }
}
