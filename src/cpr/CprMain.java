package src.cpr;

public class CprMain {
    public static void main(String[] args) {
        CprNr cpr = new CprNr("0502201972"); //DD MM YY VXYZ

        cpr.print();
        cpr.setCprNr("1912005697");
        cpr.print();
    }
}