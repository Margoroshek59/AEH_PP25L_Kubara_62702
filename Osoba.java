package pl.pp;

public class Osoba {

    private String imie;
    private String nazwisko;
    private String pesel;

    public Osoba( String imie, String nazwisko, String pesel){
        if (!czyPoprawnyPesel(pesel)) {
            throw new IllegalArgumentException("Niepoprawny numer Pesel: " + pesel);
        }
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }


    public String getNazwisko(String nazwisko) {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getPesel (String pesel) {
        return pesel;
    }

    public void setPesel (String pesel) {
        if (!czyPoprawnyPesel(pesel)) {
            throw new IllegalArgumentException("Niepoprawny numer PESEL: ");
        }
        this.pesel = pesel;
    }

    private String getDataUrodzenia() {
        String rok = pesel.substring(0, 2);
        String miesiac = pesel.substring(2, 4);
        String dzien = pesel.substring(4, 6);

        int mies = Integer.parseInt(miesiac);
        int rokInt = Integer.parseInt(rok);

        if (mies > 20) {
            mies -= 20;
            rokInt += 2000;
        } else {
            rokInt += 1900;
        }

        return String.format("%02d/%02d/%d", Integer.parseInt(dzien), mies, rokInt);
    }

    @Override
    public String toString() {
        return "Imię i nazwisko: " + imie + " " + nazwisko + "; Data urodzenia: " + getDataUrodzenia();
    }

    private static boolean czyPoprawnyPesel(String pesel) {
        if (pesel == null || pesel.length() != 11 || !pesel.matches("\\d{11}")) {
            return false;
        }

        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};
        int suma = 0;

        for (int i = 0; i < 10; i++) {
            int cyfra = Character.getNumericValue(pesel.charAt(i));
            suma += cyfra * wagi[i];
        }

        int reszta = suma % 10;
        int sumaKontrolna = (reszta == 0) ? 0 : 10 - reszta;

        int ostatniaCyfra = Character.getNumericValue(pesel.charAt(10));
        return sumaKontrolna == ostatniaCyfra;
    }
}
