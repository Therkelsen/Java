package src.dato;

public class DatoMain {
    public static void main(String[] args) {
        Dato dc = new Dato(20201031);
        dc.print(new Dato(20200801));
        
        dc.setYear(2019);
        dc.setMonth(11);
        dc.setDay(30);
        
        dc.print(new Dato(20200801));

        dc.dateAddOne();
        dc.dateSubOne();

        dc.dateAddX(365);
        
        dc.print(new Dato(20200801));

        System.out.println("###################################");
        System.out.println();
    }
}