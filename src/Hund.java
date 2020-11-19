
package javalearning;

public class Hund extends Husdyr{
    
    private Dato sidstKlippet;

    public Hund() {
    }

    public Hund(String etN, String enL, Dato sK) {
        super(etN, enL);
        sidstKlippet = sK;
    }

    public Dato getSidstKlippet() {
        return sidstKlippet;
    }

    public String givLyd() {
        return "Vov-vov";
    }

}
