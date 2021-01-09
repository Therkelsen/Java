
package src.kunstvaerk;

public class Maleri extends Kunstvaerk {

    protected int laengde;
    protected int bredde;
    protected Museum museum;

    public Maleri() {
    }

    public Maleri(String titel, int aar, int laengde, int bredde, Museum museum) {
        super(titel, aar);
        this.laengde = laengde;
        this.bredde = bredde;
        this.museum = museum;
    }

    public String getNavnPaaMuseum() {
        return this.museum.getNavn();
    }

    public int getLaengde() {
        return this.laengde;
    }

    public int getBredde() {
        return this.bredde;
    }
}
