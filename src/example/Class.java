
package src.example;

import src.dato.Dato;

public abstract class Class {

    private int x;


    public Class() {
    }

    public Class(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int cbv(int val) {
        return val*2;
    }

    public void cbr(Dato dat) {
        //dat.date *= 2;
    }
    
    public static void main(String[] arg) {
        System.out.println();
    }

}

