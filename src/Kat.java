
package javalearning;

public class Kat extends Husdyr{
    
    private int antalMusFanget;

    public Kat() {
    }

    public Kat(String etN, String enL) {
        super(etN, enL);
        antalMusFanget = 0;
    }

    public int getAntalMusFanget() {
        return antalMusFanget;
    }

    public String givLyd() {
        return "Miau";
    }
}
