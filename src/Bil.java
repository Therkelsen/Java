public class Bil {
    
    private String regNr;
    private int aargang;

    public Bil(String etN, int enA) {
        regNr = etN;
        aargang = enA;
    }

    public String getregnr(){
        return regNr;
    }

    public int getaargang() {
        return aargang;
    }
}