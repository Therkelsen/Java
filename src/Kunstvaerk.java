
package javalearning;

public abstract class Kunstvaerk {
    protected String titel;
    protected int aar;
    protected Person[] ophavsmaend = new Person[5];

    public Kunstvaerk(){
    }

    public Kunstvaerk(String titel, int aar) {
        this.titel = titel;
        this.aar = aar;
    }

    public void addOphavsmand(Person ophavsmand) {
        this.ophavsmaend[ophavsmaend.length - 1] = ophavsmand;
    }

}
