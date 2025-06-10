package wypozyczalnia;

public class SprzetBudowlany extends Pojazd implements TypPaliwa {
    private int przepracowaneGodziny;
    private String typPaliwa;

    public SprzetBudowlany(String nr, String vin, String kolor, double cena,
                           double spalanie, double paliwo, double przebieg,
                           int godziny, String typPaliwa) {
        super(nr, vin, kolor, cena, spalanie, paliwo, przebieg);
        this.przepracowaneGodziny = godziny;
        this.typPaliwa = typPaliwa;
    }

    public String getTypPaliwa() {
        return typPaliwa;
    }

    public void wyswietlInfo() {
        System.out.println("Sprzęt budowlany: godziny=" + przepracowaneGodziny + ", paliwo=" + typPaliwa);
    }
}

