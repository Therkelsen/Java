public class Person {
    private String navn;
    private Dato fDag;
    private Bil bilen;

    public Person(String etN, Dato enF) {
        navn = etN;
        fDag = enF;
    }


    //public int getAarFoedt() {
        //return fDag.getAar();
    //}
    public String getNavn() {
        return navn;
    }

    public void skrivNavn() {
        for (int i = 0; i < navn.length(); i++) {
            System.out.println(navn.charAt(i));
        }
    }
    public void skrivNavn2() {
        int i = 0;
        while (i < navn.length()) {
            System.out.println(navn.charAt(i));
            i++;
        }
    }

    public Bil getBilen() {
        return bilen;
    }

    public void addBil(Bil enB) {
        bilen = enB;
    }
}