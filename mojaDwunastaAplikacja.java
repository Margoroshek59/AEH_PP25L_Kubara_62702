package pp.pl;
import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.nio.file.*;

public class mojaDwunastaAplikacja {
    public static void main(String[] args) {
       /* // Bardzo przydatne - wskazuje bieżący katalog, w którym pracujemy i z którego uruchomiono kod main()
        String userDirectory = System.getProperty("user.dir");
        System.out.println("Bieżący katalog to:");
        System.out.println(userDirectory);

        // Plik w bieżącym katalogu
        Path pathToFile = Paths.get("sample_text.txt");

        // składnia try - catch - finally (obsługa błędów: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/try...catch?retiredLocale=pl)
        try {

            byte[] bytes = Files.readAllBytes(pathToFile);
            String fileContent = new String(bytes, Charset.defaultCharset());

            System.out.println("Zawartość pliku to: ");
            System.out.println(fileContent);

            // można coś dopisać do pliku (za każdym uruchomieniem programu będzie dopisywane to, co niżej
            fileContent += " więcej tekstu ..."; // dopisujemy coś do pliku
            fileContent += " jeszcze więcej tekstu ..."; // dopisujemy coś do pliku

            Files.write(pathToFile, fileContent.getBytes(Charset.defaultCharset()));

            // Plik można też wczytać jako listę linii tekstu
            List<String> lines = Files.readAllLines(pathToFile);

            System.out.println("Aktualna zawartość pliku: ");
            System.out.println(lines);

            lines.add(" więcej tekstu dodane W LIŚCIE..."); // dopisujemy coś do pliku

            Files.write(pathToFile, lines);

            // POWYŻSZE METODY MAJĄ PODSTAWOWĄ WADĘ - WCZYTUJĄ CAŁY PLIK DO PAMIĘCI RAM (w skrócie - przy dużych plikach można zawiesić system)
            // DLATEGO KORZYSTA SIĘ Z NISKOPOZIOMOWYCH FUNKCJI ODCZYTU: FileInputStream, FileReader (odczytywanie bajtów, znak po znaku)
            // ORAZ BufferedReader, Scanner (odczytywanie całych linii lub słów)

            String path = "sample_text.txt";
            System.out.println("Przykład nr 1 - FileInputStream");
            try (FileInputStream inputStream = new FileInputStream(path)) {
                int character = inputStream.read();
                while (character != -1) {
                    System.out.print((char) character);
                    character = inputStream.read();
                }
                System.out.println(); // kończymy linię i zaczynamy nową
            } catch (IOException e) {
                System.out.println("Problem z odczytem pliku");
                e.printStackTrace();
            }

            System.out.println("Przykład nr 2 - FileReader");
            try (FileReader fileReader = new FileReader(path)) {
                int character = fileReader.read();
                while (character != -1) {
                    System.out.print((char) character);
                    character = fileReader.read();
                }
                System.out.println(); // kończymy linię i zaczynamy nową
            } catch (IOException io) {
                System.out.println("Problem z odczytem pliku");
                io.printStackTrace();
            }

            System.out.println("Przykład nr 3 - BufferedReader");
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
                String line = bufferedReader.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = bufferedReader.readLine();
                }
            } catch (IOException io) {
                System.out.println("Problem z odczytem pliku");
                io.printStackTrace();
            }

            System.out.println("Przykład nr 4 - Scanner");
            try (Scanner in = new Scanner(new FileReader(path))) {
                while (in.hasNext()) {
                    String next = in.next();
                    System.out.print(next + " ");
                }
            } catch (IOException io) {
                System.out.println("Problem z odczytem pliku");
                io.printStackTrace();
            }


        } catch (Exception e){
            // ten kod zadziała tylko gdy pojawi się wyjątek
            System.out.println("Dostaliśmy błąd obsługi pliku: " + e.getMessage());
        } finally {
            // tutaj robimy coś na koniec
        }

        */

        Scanner scanner = new Scanner(System.in);
        String userDirectory = System.getProperty("user.dir");
        System.out.println("Biezacy katalog to:");
        System.out.println(userDirectory);

        Path pathToFile = Paths.get("sample_text.txt");

        Path inputPath;
        while (true) {
            System.out.print("Podaj scieske do pliku wejsciowego: ");
            inputPath = Paths.get(scanner.nextLine());

            if (Files.exists(inputPath)) {
                break;
            } else {
                System.out.println("Plik nie istnieje. Podaj inną sciezkę.");
            }
        }

        System.out.print("Podaj sciezke do pliku wyjsciowego: ");
        Path outputPath = Paths.get(scanner.nextLine());

        try {
            String content = Files.readString(inputPath);
            String[] words = content.split("[^a-zA-ZąćęłńóśźżĄĆĘŁŃÓŚŹŻ0-9]+");

            int totalWords = 0;
            Map<String, Integer> wordCounts = new HashMap<>();

            for (String word : words) {
                if (!word.isEmpty()) {
                    totalWords++;
                    word = word.toLowerCase();
                    wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                }
            }

            System.out.println("Nazwa pliku wejsciowego: " + inputPath.getFileName());
            System.out.println("Liczba wszystkich slow: " + totalWords);
            System.out.println("Wystąapienia poszczegolnych slow:");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }


            try (BufferedWriter writer = Files.newBufferedWriter(outputPath)) {
                writer.write("Nazwa pliku: " + inputPath.getFileName());
                writer.newLine();
                writer.write("Liczba wszystkich slow: " + totalWords);
                writer.newLine();
                writer.write("Wystapienia poszczegolnych slow:");
                writer.newLine();
                for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }
            }

        } catch (IOException e) {
            System.out.println("Blad podczas odczytu lub zapisu pliku: " + e.getMessage());
        }
    }
}
