package pl.pp;

public class Pracownik extends Osoba {
    private String stanowisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, String pesel, String stanowisko, double pensja) {
        super(imie, nazwisko, pesel); // виклик конструктора з Osoba
        this.stanowisko = stanowisko;
        this.pensja = pensja;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public double obliczRoczneWynagrodzenie() {
        return pensja * 12;
    }

    @Override
    public String toString() {
        return super.toString() + "; Stanowisko: " + stanowisko + "; Pensja: " + pensja;
    }
}