package rejestracjahotelowa;

public class mojapietnastaAplikacja {
    public static void main(String[] args) {
        Pokoje pokoj1 = new Standart(101, 2, 208);
        Pokoje pokoj2 = new premium(201,4, 500,true);
        Pokoje pokoj3 = new apartament(302, 3,440, true, true);

        rezerwacja r1 = new rezerwacja(pokoj1,3);
        System.out.println(r1);
        r1.zaplac(624);

        rezerwacja r2 = new rezerwacja(pokoj2, 5);
        System.out.println(r2);
        r2.zaplac(2500);

        rezerwacja r3 = new rezerwacja(pokoj3, 7);
        System.out.println(r3);
        r3.zaplac(3080);
    }
}
