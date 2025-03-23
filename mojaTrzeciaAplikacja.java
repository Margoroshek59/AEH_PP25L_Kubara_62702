package pl.pp;

import java.util.Scanner;

public class mojaTrzeciaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* while (true) {
            System.out.println("Prozse o podanie liczby dni oraz liczbe niedodatnia dla wejscia:");
            int dni = scanner.nextInt();

            if (dni<= 0) {
                System.out.println("Zakonczenie programu...:");
                break;
            }
            int tygodni = dni / 7;
            int pozostalydni = dni % 7;

            System.out.println(dni + "dni = " + tygodni + "tygodni i " + pozostalydni + "dni");
        }


        scanner.close();

        */

        while (true) {
            System.out.println("Prosze o podanie temperature w Fahrenheitach:");
            int Fahrenheit = scanner.nextInt();

            if (Fahrenheit == -1) {
                System.out.println("Wyjsce...");
                        break;
            }
            double celsius = (Fahrenheit - 32) / 1.8;
            double kelvin = celsius + 273.16;

            System.out.println("Fahrenheit: " + Fahrenheit + " Celsius: " + celsius + " Kelvin: " + kelvin);
        }

        scanner.close();
    }
}


