
package src.kunstvaerk;

public class Maleri extends Kunstvaerk {

    private int laengde;
    private int bredde;
    private Museum museum;

    public Maleri() {
    }

    public Maleri(String titel, int aar, int laengde, int bredde, Museum museum) {
        super(titel, aar);
        this.laengde = laengde;
        this.bredde = bredde;
        this.museum = museum;
    }
    
}
