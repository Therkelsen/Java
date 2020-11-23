package src.GUI;

import java.util.ArrayList;

public class PersonListe {
    private ArrayList<Person> aL = new ArrayList<Person>();

    public PersonListe() {
    }

    public void tilfoejPerson(Person p) {
        aL.add(p);
    }

    public void fjernPerson() {
        aL.remove(aL.size());
    }

    public ArrayList hentPersoner() {
        return aL;
    }
}
