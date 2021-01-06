
package src.forbruger;

public class Distrikt {

    private String navn;
    private float prisPrM3;
    private Forbruger[] forbrugere;
    private int antalForbrugere;

    public Distrikt() {
    }

    public Distrikt(String etNavn, float enPrisPrM3) {
        navn = etNavn;
        prisPrM3 = enPrisPrM3;
        forbrugere = new Forbruger[200];
        antalForbrugere = 0;
    }

    void setForbruger(Forbruger enForbruger) {
        if (antalForbrugere < 200) {
            forbrugere[antalForbrugere] = enForbruger;
            antalForbrugere++;
        }
    }

    float afregnForbruger(int etMaalerNr) {
        if(etMaalerNr != 0) {
            return forbrugere[antalForbrugere-1].beregnForbrug() * prisPrM3;
        } else {
            return -1;
        }
    }

    void print() {
        for (int i = 0; i <= antalForbrugere; i++) {
            if (forbrugere[i] != null) {
                System.out.println("Forbruger " + i + " hedder " + forbrugere[i].getNavn() + " bor i distriktet " + navn + " og har måleren med nr.: " + forbrugere[i].getMaalerNr());
                System.out.println(forbrugere[i].getNavn() + "'s forbrug er på " + forbrugere[i].nyAflaesning + " M3 til en pris på " + prisPrM3 + " kr/M3, dvs. der skal betales " + afregnForbruger(forbrugere[i].maalerNr) + " kr");
                System.out.println();
            }
        }
    }

}
