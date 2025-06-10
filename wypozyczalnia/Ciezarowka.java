package wypozyczalnia;

public class Ciezarowka extends Pojazd implements TypPaliwa {
    private double ladownosc;
    private String typPaliwa;

    public Ciezarowka(String nr, String vin, String kolor, double cena,
                      double spalanie, double paliwo, double przebieg,
                      double ladownosc, String typPaliwa) {
        super(nr, vin, kolor, cena, spalanie, paliwo, przebieg);
        this.ladownosc = ladownosc;
        this.typPaliwa = typPaliwa;
    }

    public String getTypPaliwa() {
        return typPaliwa;
    }

    public void wyswietlInfo() {
        System.out.println("Ciężarówka: ładowność=" + ladownosc + " kg, paliwo=" + typPaliwa);
    }
}
