
package javalearning;

import java.util.ArrayList;

public class KunstvaerkSamling {

    private ArrayList<Kunstvaerk> kunstvaerker = new ArrayList<Kunstvaerk>();

    public KunstvaerkSamling() {
    }

    public KunstvaerkSamling(Kunstvaerk[] kunstvaerker) {
        for(int i = 0; i < kunstvaerker.length; i++) {
            this.kunstvaerker.add(kunstvaerker[i]);
        }
    }

    public void add(Kunstvaerk kunstvaerk) {
        this.kunstvaerker.add(kunstvaerk);
    }
    
    public void findSangeMedFlereKomponister() {

    }

}
