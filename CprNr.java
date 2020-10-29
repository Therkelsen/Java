
public class CprNr {

    String nummeret;
    
    public CprNr() {
    }

    public CprNr(String etCprNr) {
        nummeret = etCprNr;
    }

    public String getCprNr() {
        return nummeret;
    }

    public void setCprNr(String etCprNr) {
        nummeret = etCprNr;
    }

    public int getDag() {
        return GetSectionFromString(nummeret, 0, 2);
    }

    public int getMaaned() {
        return GetSectionFromString(nummeret, 2, 2);
    }
    
    public int getAar() {
        int x = GetSectionFromString(nummeret, 4, 2);
        int y = GetSectionFromString(nummeret, 6, 1);
        int z = 0;
        
        if (y >= 0 && y <= 3) {
            z = 1900;
        } else if (y >= 4 && y <= 5) {
            z = 1800;
        } else if (y >= 6 && y <= 9) {
            z = 2000;
        }

        return (x + z);
    }
    
    public Dato getDato() {
        return new Dato(getAar(),getMaaned(),getDag());
    }

    public int getAlder() { // Antager at det nuværende år er 2020
        return 2020 - getAar();
    }

    public boolean erMand() {
        return GetSectionFromString(nummeret, 9, 1) % 2 != 0;
    }

    public boolean erKvinde() {
        return GetSectionFromString(nummeret, 9, 1) % 2 == 0;
    }

    public boolean erValid() {
        int a = 0;

        if (nummeret.length() == 10) { //   Er 10 ciffere lang
            try {
                Long.parseLong(nummeret);   //  Prøv at parse, hvis det er muligt er tallet numerisk
            } catch (NumberFormatException e) {
                return false;
            }

            for (int i = 0; i > 10; i++) {  //  Gange alle ciffere med sin respektive vægt
                int b = GetSectionFromString(nummeret, i+1, 1);

                switch (b) {
                    case 1:
                    b *= 4;
                    break;

                    case 2:
                    b *= 3;
                    break;
                    
                    case 3:
                    b *= 2;
                    break;

                    case 4:
                    b *= 7;
                    break;

                    case 5:
                    b *= 6;
                    break;

                    case 6:
                    b *= 5;
                    break;

                    case 7:
                    b *= 4;
                    break;

                    case 8:
                    b *= 3;
                    break;

                    case 9:
                    b *= 2;
                    break;

                    case 10:
                    b *= 1;
                    break;

                    default:
                    break;
                }

                a += b;
            }

            if (a % 11 == 0) {  //  Lav modulus 11 tjek
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }
    }

    // Ekstra metoder som ikke er en del af opgaven, men som gør koden mere overskuelig
    private int GetSectionFromString(String input, int index, int take) {
        // Deler en String op i små bidder ud fra String, ens index og hvor mange ciffere man vil have
        return Integer.parseInt(input.substring(index, index + take));
    }

    public void print() {
        System.out.println("======================");
        if (erValid()) {
            System.out.println("Valid input");
            System.out.println("CPR Nummer: " + getCprNr());
            System.out.println("Dag: " + getDag());
            System.out.println("Månede: " + getMaaned());
            System.out.println("År: " + getAar());
            System.out.println("Dato: " + getDato().getDato());
            System.out.println("Alder: " + getAlder());
            System.out.println("Er mand: " + erMand());
            System.out.println("Er kvinde: " + erKvinde());
        } else {
            System.out.println("Ugyldigt input");
        }
    }
}
