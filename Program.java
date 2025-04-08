package pl.pp;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        int[] tablicaLosowa = new int[6];
        int[] tablicaUzytkownika = new int[6];
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        Set<Integer> zestaw = new HashSet<>();
        
        while (zestaw.size() < 6) {
            int liczba = rand.nextInt(49) + 1;
            zestaw.add(liczba);
        }

        int i = 0;
        for (int liczba : zestaw) {
            tablicaLosowa[i++] = liczba;
        }

        zestaw.clear();
        System.out.println("Podaj 6 różnych liczb z przedziału 1-49:");
        while (zestaw.size() < 6) {
            try {
                int liczba = scanner.nextInt();
                if (liczba < 1 || liczba > 49) {
                    System.out.println("Liczba poza zakresem. Podaj liczbę od 1 do 49.");
                } else if (!zestaw.add(liczba)) {
                    System.out.println("Liczba już była. Podaj inną.");
                }
            } catch (InputMismatchException e) {
                System.out.println("To nie liczba! Spróbuj ponownie.");
                scanner.next(); // wyczyść błędne dane
            }
        }

        i = 0;
        for (int liczba : zestaw) {
            tablicaUzytkownika[i++] = liczba;
        }

        // Porównywanie tablic i liczenie trafień
        int trafienia = 0;
        for (int los : tablicaLosowa) {
            for (int user : tablicaUzytkownika) {
                if (los == user) {
                    trafienia++;
                }
            }
        }

        System.out.println("Wylosowane liczby: " + Arrays.toString(tablicaLosowa));
        System.out.println("Twoje liczby:      " + Arrays.toString(tablicaUzytkownika));
        System.out.println("Trafienia: " + trafienia);
    }
}