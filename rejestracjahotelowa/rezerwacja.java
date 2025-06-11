package rejestracjahotelowa;

public class rezerwacja implements Platnosc {
    private Pokoje pokoj;
    private int liczbaNocy;

    public rezerwacja(Pokoje pokoj, int liczbaNocy) {
        this.pokoj = pokoj;
        this.liczbaNocy = liczbaNocy;
        this.pokoj.rezerwuj();
    }

    public void zaplac(double kwota) {
        double doZaplaty = pokoj.getCenaZaNoc() * liczbaNocy;
        if (kwota >= doZaplaty) {
            System.out.println("Platnosc przyjeta: " + kwota + " zl");
        } else {
            System.out.println("tranzakcja odrzucona. Wymagana kwota: " + doZaplaty + " zl");
        }
    }
    public String toString() {
        return "Rezerwacja: " + pokoj.toString() + " na " + liczbaNocy + " nocy.";
    }
}
