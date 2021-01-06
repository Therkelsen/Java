
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

    public int getOphavsmaend() {
        return antalOphavsmaend;
    }
}
