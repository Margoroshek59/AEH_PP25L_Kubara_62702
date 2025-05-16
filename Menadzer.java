package pl.pp;

public class Menadzer extends Pracownik {
    private int liczbaPodwladnych;
    private double dodatekDoPensji;

    public Menadzer(String imie, String nazwisko, String pesel,
                    String stanowisko, double pensja,
                    int liczbaPodwladnych, double dodatekDoPensji) {
        super(imie, nazwisko, pesel, stanowisko, pensja);
        this.liczbaPodwladnych = liczbaPodwladnych;
        this.dodatekDoPensji = dodatekDoPensji;
    }

    public int getLiczbaPodwladnych() {
        return liczbaPodwladnych;
    }

    public void setLiczbaPodwladnych(int liczbaPodwladnych) {
        this.liczbaPodwladnych = liczbaPodwladnych;
    }

    public double getDodatekDoPensji() {
        return dodatekDoPensji;
    }

    public void setDodatekDoPensji(double dodatekDoPensji) {
        this.dodatekDoPensji = dodatekDoPensji;
    }

    @Override
    public double obliczRoczneWynagrodzenie() {
        return (getPensja() + dodatekDoPensji) * 12;
    }

    @Override
    public String toString() {
        return super.toString() +
                "; Liczba podwładnych: " + liczbaPodwladnych +
                "; Dodatek do pensji: " + dodatekDoPensji;
    }
}
