
package src.forbruger;

public class FjernvarmeMain {
    public static void main(String[] args) {
        Forbruger soeren = new Forbruger("Søren", 65, 200);
        Forbruger rikke = new Forbruger("Rikke", 70, 200);
        Distrikt jernbanegade = new Distrikt("Jernbanegade", (float) 30);
        
        soeren.aflaesMaaler(200);
        soeren.aflaesMaaler(50);

        rikke.aflaesMaaler(0);
        rikke.aflaesMaaler(190);

        jernbanegade.setForbruger(soeren);
        jernbanegade.setForbruger(rikke);

        System.out.println(soeren.getNavn() + "s forbrug: " + soeren.beregnForbrug());
        System.out.println(rikke.getNavn() + "s forbrug: " + rikke.beregnForbrug());
	
        float forbrug1 = jernbanegade.afregnForbruger(soeren.getMaalerNr());
        float forbrug2 = jernbanegade.afregnForbruger(rikke.getMaalerNr());
		
            System.out.println("Prisen for måler "+ soeren.getMaalerNr() +"'s forbrug:  DKK " + forbrug1);
            System.out.println("Prisen for måler "+ rikke.getMaalerNr() +"'s forbrug:  DKK " + forbrug2);
    }
}
