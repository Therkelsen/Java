
package javalearning;

public class Komposition extends Kunstvaerk {

    private String genre;
    private int spilletid;

    public Komposition() {
    }

    public Komposition(String titel, int aar, String genre, int spilletid) {
        super(titel, aar);
        this.genre = genre;
        this.spilletid = spilletid;
    }
}
