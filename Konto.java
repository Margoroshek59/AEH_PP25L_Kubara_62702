package pl.pp;

public class Konto {

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

       private String numerKonta;
       private double saldo;
       private String nazwaWlasciciela;
       private String email;
       private String telefon;

       public Konto(String numerKonta, double saldo, String nazwaWlasciciela, String email, String telefon) {
           this.numerKonta = numerKonta;
           this.saldo = saldo;
           this.nazwaWlasciciela = nazwaWlasciciela;
           setEmail(email);  // używamy setterów z walidacją
           setTelefon(telefon);
       }

       // Gettery
       public String getNumerKonta() {
           return numerKonta;
       }

       public double getSaldo() {
           return saldo;
       }

       public String getNazwaWlasciciela() {
           return nazwaWlasciciela;
       }

       public String getEmail() {
           return email;
       }

       public String getTelefon() {
           return telefon;
       }

       // Settery
       public void setNazwaWlasciciela(String nazwa) {
           this.nazwaWlasciciela = nazwa;
       }

       public void setEmail(String email) {
           if (email.contains("@") && email.substring(email.indexOf("@")).contains(".")) {
               this.email = email;
           } else {
               throw new IllegalArgumentException("Nieprawidłowy adres e-mail.");
           }
       }

       public void setTelefon(String telefon) {
           if (telefon.matches("\\d{9}")) {
               this.telefon = telefon;
           } else {
               throw new IllegalArgumentException("Nieprawidłowy numer telefonu. Powinien zawierać 9 cyfr.");
           }
       }

       // Wpłata
       public void wplac(double kwota) {
           saldo += kwota;
           System.out.println("Wpłata PLN " + kwota + " została wykonana. Nowe saldo PLN " + saldo);
       }

       // Wypłata
       public void wyplac(double kwota) {
           if (kwota <= saldo) {
               saldo -= kwota;
               System.out.println("Pobrano PLN " + kwota + " z konta, Pozostałe saldo = PLN " + saldo);
           } else {
               System.out.println("Brak środków. Masz PLN " + saldo + " na koncie.");
           }
       }
}
