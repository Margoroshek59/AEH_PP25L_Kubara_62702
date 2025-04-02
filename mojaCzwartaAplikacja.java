package pl.pp;

import java.util.Scanner;

public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /* while (true) {
        System.out.println("Enter lower and upper integer limits: ");
        int lower = scanner.nextInt();
        int upper = scanner.nextInt();

         if (upper <= lower){
         System.out.println("Done");
         break;
         }

         int sum =0;
         for (int i = lower; i <= upper; i++) {
                sum += i * i;
         }
         System.out.println("The sum of the squares from " + (lower * lower) + " to " + (upper * upper) + " is " + sum);
       }
        scanner.close();

         */
        while (true) {
            System.out.print("Wybierz operację (+, -, *, /) lub q, aby wyjść: ");
            String choice = scanner.next();

            if (choice.equals("q")) {
                System.out.println("Koniec programu.");
                break;
            }

            System.out.print("Podaj pierwszą liczbę: ");
            double num1 = scanner.nextDouble();

            System.out.print("Podaj drugą liczbę: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case "+": result = num1 + num2; break;
                case "-": result = num1 - num2; break;
                case "*": result = num1 * num2; break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Błąd: Nie można dzielić przez zero!");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Błąd: Niepoprawna operacja!");
                    continue;
            }

            System.out.println("Wynik: " + result);
        }

        scanner.close();
    }
}