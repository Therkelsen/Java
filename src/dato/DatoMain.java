package src.dato;

public class DatoMain {
    public static void main(String[] args) {
        Dato dc = new Dato(20201031);
        
        dc.print(new Dato(20200801));
        
        dc.setYear(2012);
        dc.setMonth(12);
        dc.setDay(19);

        dc.dateAddX(365);
        
        dc.print(new Dato(20200801));

        System.out.println("###################################");
        System.out.println();
    }
}