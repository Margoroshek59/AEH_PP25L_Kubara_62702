package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args) {

           //to jest komentarz liniowy
        Scanner scanner = new Scanner(System.in);

        /*
        To jest komentarz blokowy
         moze on miec wiele linii
         tak, jak tytaj
          */
        System.out.println("Prosze podaj swoj wiek:");
        double sekond = scanner.nextDouble();
        double s = 31557600;

        System.out.println("twoj wiek w sekondach: " + (s * sekond));

        /* double x = 10; //utworzenie zmiennej typu double i przypisanie jej wartosci 10
        double y = 2;


        Scanner scanner = new Scanner(System.in);

        var result = x ;
        System.out.println("x ");

        result = x * y;
        System.out.println("x * y = " + result);

        result = x * x;
        System.out.println("x * x = " + result);


        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter: ");

        double first = scanner.nextDouble(); //prosba o wpisanie wartosci typu double
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));

         */


    }
}


