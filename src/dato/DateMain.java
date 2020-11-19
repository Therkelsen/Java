package src.dato;

public class DateMain {
    public static void main(String[] args) {
        Dato dc = new Dato(20201031);
        dc.print();
        
        dc.setYear(2019);
        dc.setMonth(11);
        dc.setDay(30);
        dc.print();

        dc.dateAddOne();
        dc.dateSubOne();

        dc.dateAddX(365);

        dc.print();
    }
}