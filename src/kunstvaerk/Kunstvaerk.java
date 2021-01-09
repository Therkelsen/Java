
package src.kunstvaerk;

import src.person.Person;

public abstract class Kunstvaerk {
    protected String titel;
    protected int aar;
    protected Person[] ophavsmaend = new Person[5];
    protected int antalOphavsmaend;

    public Kunstvaerk(){
    }

    public Kunstvaerk(String titel, int aar) {
        this.titel = titel;
        this.aar = aar;
    }

    public void addOphavsmand(Person ophavsmand) {
        if (antalOphavsmaend < 5) {
            this.ophavsmaend[antalOphavsmaend] = ophavsmand;
            antalOphavsmaend++;
        }
    }

    public String getTitel() {
        return this.titel;
    }

    public int getAar() {
        return this.aar;
    }

    public Person[] getOphavsmaendObj() { // Objekt
        return this.ophavsmaend;
    }

    public int getOphavsmaend() { // Antal
        return this.antalOphavsmaend;
    }
}
