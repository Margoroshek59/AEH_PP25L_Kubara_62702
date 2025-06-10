package wypozyczalnia;

public class Osobowe extends Pojazd implements TypPaliwa {
    private int liczbaDrzwi;
    private String typPaliwa;

    public Osobowe(String nr, String vin, String kolor, double cena,
                   double spalanie, double paliwo, double przebieg,
                   int liczbaDrzwi, String typPaliwa) {
        super(nr, vin, kolor, cena, spalanie, paliwo, przebieg);
        this.liczbaDrzwi = liczbaDrzwi;
        this.typPaliwa = typPaliwa;
    }

    public String getTypPaliwa() {
        return typPaliwa;
    }

    public void wyswietlInfo() {
        System.out.println("Osobowy: drzwi=" + liczbaDrzwi + ", paliwo=" + typPaliwa);
    }
}
