package pl.pp;
import pl.pp.Konto;

public class mojaOsmaAplikacja {
    public static void main(String[] args) {
       /* Person person1 = new Person("Test", "Testowy", 25); //nowy obiekt klasy Person
        person1.hiToAll(); //wywołanie metody hiToAll() z obiektu person1 klasy Person

        person1.growOld(10); //wywołanie metody growOld( z obiektu person1 klasy Person
        person1.hiToAll();

        person1.setForename("ZmienionyTest"); //wywołanie metody tzw. "settera" do zmiany imienia
        person1.hiToAll();

        String personName = person1.getForename(); //wywołanie metody tzw. "gettera" do pobrania imienia
        int personAge = person1.getAge(); //wywołanie metody tzw. "gettera" do pobrania wieku
        System.out.println("Pobrane imię to " + personName + " z wiekiem = " + personAge);

        Circle circle1 = new Circle(1.2); //nowy obiekt klasy Circle
        circle1.getInfo(); //wywołanie metody getInfo() z obiektu circle1 klasy Circle
        circle1.setRadius(2.6); //wywołanie metody tzw. "settera" do zmiany promienia
        circle1.getInfo();

        */
            Konto mojeKonto = new Konto("1234567890", 1000.0, "Jan Owalski", "jan@kowalski.com", "123456789");

            mojeKonto.wyplac(900);
            mojeKonto.wplac(250);
            mojeKonto.wyplac(50);
            mojeKonto.wyplac(400);
        }
}