
package src.forbruger;

public class Distrikt {

    private String navn;
    private float prisPrM3;
    private Forbruger[] forbrugere;
    private int antalForbrugere;

    public Distrikt() {
    }

    public Distrikt(String navn, float prisPrM3) {
        this.navn = navn;
        this.prisPrM3 = prisPrM3;
        forbrugere = new Forbruger[200];
        antalForbrugere = 0;
    }

    public void setForbruger(Forbruger forbruger) {
        if (antalForbrugere < 200) {
            forbrugere[antalForbrugere] = forbruger;
            antalForbrugere++;
        }
    }

    public float afregnForbruger(int etMaalerNr) {
        for (int i = 0; i < antalForbrugere; i++) {
            if (etMaalerNr == forbrugere[i].getMaalerNr()) {
                return (forbrugere[i].beregnForbrug()) * prisPrM3;
            }
        }
        return -1;
    }
}
