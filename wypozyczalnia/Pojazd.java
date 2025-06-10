package wypozyczalnia;

public abstract class Pojazd {
    protected String nrRejestracyjny;
    protected String numerVin;
    protected String kolor;
    protected double cena;
    protected double spalanie;
    protected double poziomPaliwa;
    protected double przebieg;

    public Pojazd(String nrRejestracyjny, String numerVin, String kolor,
                  double cena, double spalanie, double poziomPaliwa, double przebieg) {
        this.nrRejestracyjny = nrRejestracyjny;
        this.numerVin = numerVin;
        this.kolor = kolor;
        this.cena = cena;
        this.spalanie = spalanie;
        this.poziomPaliwa = poziomPaliwa;
        this.przebieg = przebieg;
    }

    public void prowadz(double km) {
        double zuzycie = (spalanie / 100) * km;
        if (zuzycie <= poziomPaliwa) {
            poziomPaliwa -= zuzycie;
            przebieg += km;
            System.out.println("Przejechano " + km + " km.");
        } else {
            System.out.println("Za mało paliwa!");
        }
    }

    public void zatankuj(double litry) {
        poziomPaliwa += litry;
        System.out.println("Zatankowano " + litry + " litrów.");
    }

    public abstract void wyswietlInfo();
}