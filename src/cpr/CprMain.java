package src.cpr;

import src.cpr.CprNr;

public class CprMain {
    public static void main(String[] args) {
        CprNr cpr = new CprNr("0502201972"); //DD MM YY VXYZ
        cpr.print();
        cpr.setCprNr("3010661659");
        cpr.print();
    }
}