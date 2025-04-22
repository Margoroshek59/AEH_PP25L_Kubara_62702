package pl.pp;
/*public class Person {
    // pola (atrybuty) klasy określającej obiekt "Person" (jego parametry/cechy)
    public String forename; // pole przechowujące cechę imię
    public String surname; // pole przechowujące cechę nazwisko
    public int age; // pole przechowujące cechę wiek

    /**
     * Konstruktor domyślny - element inicjalizujący pola obiektu podczas jego tworzenia
     * (jeśli sami nie podamy żadnych parametrów)
     */
    /*public Person() {

    }

    /**
     * Konstruktor z trzema parametrami, które możemy podać przy jego tworzeniu
     */
    /*public Person(String initForename, String initSurname, int initAge) {
        forename = initForename;
        surname = initSurname;
        age = initAge;
    }

    // metody klasy określające akcje możliwe do wykonania przez obiekt
    public void hiToAll(){
        System.out.println("Nazywam się " + forename + " " + surname + ". " + "Mam " + age + " lat.");
    }

    // przykładowa metoda growOld, która zwiększa dany wiek obiektu o jeden za każdym jej wywołaniem
    public int growOld(){
        age = age + 1;
        return age;
    }

    // przykładowa metoda getName zwracająca wartość forename obiektu
    public String getName(){
        return forename;
    }

    // przykładowa metoda setName ustawiająca wartość forename obiektu
    public void setName(String nameToSet){
        forename = nameToSet;
    }
}

     */
public class Person {
    private int wiek;
    private String adres;
    private int rok_urodzenia;

    // Konstruktor
    public Person(int wiek, String adres, int rok_urodzenia) {
        this.wiek = wiek;
        this.adres = adres;
        this.rok_urodzenia = rok_urodzenia;
    }

    // Metoda growOld przyjmująca argument
    public void growOld(int lata) {
        this.wiek += lata;
    }

    // Metoda beYounger zmniejszająca wiek o 1
    public void beYounger() {
        this.wiek -= 1;
    }

    // Gettery do sprawdzenia stanu obiektu
    public int getWiek() {
        return wiek;
    }

    public String getAdres() {
        return adres;
    }

    public int getRokUrodzenia() {
        return rok_urodzenia;
    }
}
