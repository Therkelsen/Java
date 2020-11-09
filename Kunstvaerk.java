
package javalearning;

public abstract class Kunstvaerk {
    private String titel;
    private int aar;
    private Person[] ophavsmaend = new Person[5];

    public Kunstvaerk(){
    }

    public Kunstvaerk(String titel, int aar) {
        this.titel = titel;
        this.aar = aar;
    }

    public void addOphavsmand(Person ophavsmand) {
        this.ophavsmaend[ophavsmaend.length] = ophavsmand;
    }

}
