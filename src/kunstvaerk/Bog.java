
package src.kunstvaerk;

public class Bog extends Kunstvaerk {

    private String genre;
    private int antalSider;

    public Bog() {
    }

    public Bog(String titel, int aar, String genre, int antalSider) {
        super(titel, aar);
        this.genre = genre;
        this.antalSider = antalSider;
    }
    
    public String getGenre() {
        return this.genre;
    }

    public int getAntalSider() {
        return this.antalSider;
    }

}
