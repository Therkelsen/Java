
package src.forbruger;

public class Forbruger {

    String navn;
    int maalerNr;   // Mellem 000 og 1000
    int nyAflaesning;
    int forrigeLaesning;
    int maalerMax;

    public Forbruger() {
    }

    public Forbruger(String navn, int maalerNr, int maalerMax) {
        this.navn = navn;
        this.maalerNr = maalerNr;
        this.maalerMax = maalerMax;
    }

    public int getMaalerNr() {
        return maalerNr;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void aflaesMaaler(int aflaesning) {
        forrigeLaesning = nyAflaesning;
        nyAflaesning = aflaesning;
    }

    public int beregnForbrug() {
        if (nyAflaesning < forrigeLaesning) {
            return maalerMax + nyAflaesning - forrigeLaesning;
        } else {
            return nyAflaesning - forrigeLaesning;
        }
    }

}
