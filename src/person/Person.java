
package src.person;

import src.dato.Dato;

public class Person
{
    private Dato fDag;
    private String navn;
    private String nationalitet;
    private int foedtAar;
    private int doedAar;

    
    public Person(String etN, Dato enF) {
        navn = etN;
        fDag = enF;
    }

    public Person(String navn, String nationalitet, int foedtAar, int doedAar) {
        this.navn = navn;
        this.nationalitet = nationalitet;
        this.foedtAar = foedtAar;
        this.doedAar = doedAar;
    }

    public int getAarFoedt() {
        // prikoperator eller dotoperator
        return 0;//fDag.getAar();
    }

    public void skrivNavn() {
    //i kaldes for en indeksvariabel (generelt hvis der kun er 1 bogstav)
        for (int i = 0; i < navn.length(); i++) {
            System.out.println(navn.charAt(i));
        }
    }

}