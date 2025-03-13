package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {

           //to jest komentarz liniowy
       /* Scanner scanner = new Scanner(System.in);

        /*
        To jest komentarz blokowy
         moze on miec wiele linii
         tak, jak tytaj
          */
        /*System.out.println("Prosze podaj swoje imie:");
        // nie wiem czy musze podawac swoje imie
        String forename = scanner.nextLine();

        System.out.println("Prosze podaj swoje nazwisko:");
        String surname = scanner.nextLine();

        scanner.close();

        System.out.println("Witaj " + forename + " " + surname) ;

         */

        double x = 10; //utworzenie zmiennej typu double i przypisanie jej wartosci 10
        double y = 2;


        Scanner scanner = new Scanner(System.in);

        var result = x + y;
        System.out.println("x + y = "  + result);

        result = x - y;
        System.out.println("x - y = " + result);

        result = x * y;
        System.out.println("x * y = " + result);

        result = x / y;
        System.out.println("x / y = " + result);

        result = x % y;
        System.out.println("x % y = " + result);

        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter: ");

        double first = scanner.nextDouble(); //prosba o wpisanie wartosci typu double
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));


    }
}
