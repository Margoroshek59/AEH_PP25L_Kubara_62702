package pl.pp;

public class Magazyn {

   /* // pola (atrybuty) klasy określającej obiekt "Person" (jego parametry/cechy)
    private String forename; // pole przechowujące cechę imię
    private String surname; // pole przechowujące cechę nazwisko
    private int age; // pole przechowujące cechę wiek

    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
   /* public Person() {

    }

    /**
     * Konstruktor z trzema parametrami, które możemy podać przy jego tworzeniu,
     * wykorzystanie "this" pozwala m.in. na skorzystanie z tych samych nazw
     * pól i zmiennych
     */
   /* public Person(String forename, String surname, int age) {
        this.forename = forename;
        this.surname = surname;
        this.age = age;
    }

    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat.");
    }

    // przykładowa metoda growOld, która zwiększa dany wiek obiektu o jeden za każdym jej wywołaniem
    public int growOld(int age){
        this.age += age;
        return age;
    }

    //tzw. "gettery" i "settery" pól prywatnych
    public String getForename(){
        return forename;
    }
    public void setForename(String forename){
        this.forename = forename;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }

    */

    private int numerMagazynu;
    private int dostepnaPrzestrzen;
    private String email;
    private String telefon;

    public Magazyn( int numerMagazynu, int dostepnaPrzestrzen, String email, String telefon){
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
        this.email = email;
        this.numerMagazynu = numerMagazynu;
        this.telefon = telefon;
    }

    public int getNumerMagazynu() {
        return numerMagazynu;
    }

    public void setDostepnaPrzestrzen(int dostepnaPrzestrzen) {
        this.dostepnaPrzestrzen = dostepnaPrzestrzen;
    }


    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public void dodajTowar(int ilosc){
        if (ilosc > dostepnaPrzestrzen){
            System.out.println("Za malo miejsca w magazynie. Pozostala przesrzen magaynowa: " + dostepnaPrzestrzen + " jednostek");
        } else {
            dostepnaPrzestrzen -= ilosc;
            System.out.println("Dodano" + ilosc + "jednostek towaru. Pozostala przestrzen magazynowa: " + dostepnaPrzestrzen + " jednostek");
        }
    }

    public void usunTowar(int ilosc){
        int zajetaPrzestrzen = 7000 - dostepnaPrzestrzen;

        if (ilosc > zajetaPrzestrzen) {
            System.out.println("Nie mozna usunac wiecej towaru niz znajduje sie w magazynie.");
        } else {
            dostepnaPrzestrzen += ilosc;
            System.out.println("Usunieto " + ilosc + " jednostek towaru. Pozostala przestrzen magazynowa: " + dostepnaPrzestrzen + " jednostek.");
        }
    }

    public void sprawdzZajentosc(){
        int zajetaPrzestrzen = 5000 - dostepnaPrzestrzen;
        System.out.println("Zajeta przestrzen magazynowa: " + zajetaPrzestrzen + " jednostek.");
        System.out.println("Dostepna przestrzen magazynowa: " + dostepnaPrzestrzen + " jednostek.");
    }

    public void aktualizujKontakt(String nowyEmai, String nowyTelefon){
        this.email = nowyEmai;
        this.telefon = nowyTelefon;
        System.out.println("Zaktualizowano dane kontowe wlascicile.");
        System.out.println("Nowy email: " + email);
        System.out.println("Nowy telefon: " + telefon);
    }


}
