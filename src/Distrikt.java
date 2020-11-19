
package javalearning;

public class Distrikt {

    String navn;
    float prisPrM3;
    Forbruger[] forbrugere = new Forbruger[200];
    int antalForbrugere = 0;

    public Distrikt() {
    }

    public Distrikt(String etNavn, float enPrisPrM3) {
        navn = etNavn;
        prisPrM3 = enPrisPrM3;
    }

    void setForbruger(Forbruger enForbruger) {
        forbrugere[antalForbrugere] = enForbruger;
        antalForbrugere++;
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
