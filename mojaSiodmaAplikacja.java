package pl.pp;
import pl.pp.Person;

public class mojaSiodmaAplikacja {
    public static void main(String[] args) {
        Person osoba = new Person(30, "Warszawa", 1995);

        System.out.println("Wiek początkowy: " + osoba.getWiek());
        osoba.growOld(10);
        System.out.println("Po growOld(10): " + osoba.getWiek());
        osoba.beYounger();
        System.out.println("Po beYounger(): " + osoba.getWiek());

    }
}