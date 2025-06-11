package rejestracjahotelowa;

public abstract class Pokoje {
    protected int numer;
    protected int liczbaLozek;
    protected boolean zarezerwowany;
    protected double cenaZaNoc;

    public Pokoje(int numer, int liczbaLozek, double cenaZaNoc) {
        this.numer = numer;
        this.liczbaLozek = liczbaLozek;
        this.zarezerwowany = false;
        this.cenaZaNoc = cenaZaNoc;

    }

    public abstract String typPokoju();

    public void rezerwuj(){
        this.zarezerwowany = true;
    }
    public void anuluj() {
        this.zarezerwowany = false;
    }

    public boolean czyZarezerwowany() {
        return zarezerwowany;
    }

    public double getCenaZaNoc() {
        return cenaZaNoc;
    }

    public String toString(){
        return "Pokoj nr " + numer + " (" + typPokoju() + "), lozka: " + liczbaLozek +
                ", cena: " + cenaZaNoc +", zarezerwowany: " + zarezerwowany;

    }
}
