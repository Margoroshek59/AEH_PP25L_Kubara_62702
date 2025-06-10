package wypozyczalnia;

public class TestWypozyczalni {
    public static void main(String[] args) {
        Osobowe auto = new Osobowe("PO123", "VIN001", "czarny", 100.0, 6.0, 20, 100000, 5, "benzyna");
        Ciezarowka tir = new Ciezarowka("LU456", "VIN002", "biały", 200.0, 15.0, 100, 300000, 8000, "diesel");
        Motocykl motor = new Motocykl("KR789", "VIN003", "niebieski", 50.0, 3.5, 10, 20000, true, "benzyna");
        SprzetBudowlany koparka = new SprzetBudowlany("GD321", "VIN004", "żółty", 300.0, 12.0, 80, 15000, 500, "diesel");

        auto.wyswietlInfo();
        auto.prowadz(100);
        auto.zatankuj(10);
        System.out.println();

        tir.wyswietlInfo();
        tir.prowadz(50);
        System.out.println();

        motor.wyswietlInfo();
        motor.prowadz(30);
        System.out.println();

        koparka.wyswietlInfo();
        koparka.prowadz(20);
    }
}
