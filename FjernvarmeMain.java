
package javalearning;

public class FjernvarmeMain {
    public static void main(String[] args) {
        Forbruger forbruger1 = new Forbruger("Søren", 69, 200);
        Forbruger forbruger2 = new Forbruger("Ikke Søren", 70, 200);
        Distrikt distrikt = new Distrikt("Rosengårdcentret", 6000);
        forbruger1.setNavn("Tonni");
        forbruger2.setNavn("Ikke Tonni");
        distrikt.setForbruger(forbruger1);
        distrikt.setForbruger(forbruger2);

        forbruger1.aflaesMaaler(0);
        forbruger1.aflaesMaaler(200);
        forbruger2.aflaesMaaler(0);
        forbruger2.aflaesMaaler(190);

        distrikt.print();
    }
}
