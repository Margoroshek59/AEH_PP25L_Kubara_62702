package rejestracjahotelowa;

public class Standart extends Pokoje {
    public Standart(int numer, int liczbaLozek,  double cenaZaNoc) {
        super(numer, liczbaLozek, cenaZaNoc);
    }

    @Override
    public String typPokoju() {
        return "Standardowy";
    }
}
