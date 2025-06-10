package wypozyczalnia;

public class Motocykl extends Pojazd implements TypPaliwa {
    private boolean posiadaDostawe;
    private String typPaliwa;

    public Motocykl(String nr, String vin, String kolor, double cena,
                    double spalanie, double paliwo, double przebieg,
                    boolean posiadaDostawe, String typPaliwa) {
        super(nr, vin, kolor, cena, spalanie, paliwo, przebieg);
        this.posiadaDostawe = posiadaDostawe;
        this.typPaliwa = typPaliwa;
    }

    public String getTypPaliwa() {
        return typPaliwa;
    }

    public void wyswietlInfo() {
        System.out.println("Motocykl: dostawka=" + (posiadaDostawe ? "tak" : "nie") + ", paliwo=" + typPaliwa);
    }
}
