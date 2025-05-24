package pp.pl;
import java.util.List;

public class Students {
    private String nrIndeks;
    private String Imie;
    private String nazwisko;
    private List<Integer> oceny;

    public Students(String nrIndeks, String Imie, String nazwisko,List<Integer> oceny) {
        this.nrIndeks = nrIndeks;
        this.Imie = Imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;

    }

    public String getNrIndeks(){
        return nrIndeks;
    }

    public String getImie (){
        return Imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public List<Integer> getOceny () {
        return oceny;
    }

    public double getSrednia() {
        return oceny.stream().mapToInt(Integer::intValue).average().orElse(0.0);

    }

    @Override
    public String toString() {
        return Imie + " " + nazwisko + " (" +nrIndeks + ")";
    }
}
