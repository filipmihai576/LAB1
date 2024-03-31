import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            int x = readNumberFromFile("input.txt"); // Citim numărul din fișier
            int result = calculateDouble(x); // Calculăm valoarea 2*x
            System.out.println("Valoarea calculată: " + result);
        } catch (IOException e) {
            //System.out.println("Eroare la citirea din fișier: " );
        }
    }

    // Metoda pentru citirea unui număr din fișier
    public static int readNumberFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            while (line != null) {
                try {
                    int number = Integer.parseInt(line);
                    return number;
                } catch (NumberFormatException e) {
                    System.out.println("Eroare: Linia citită nu conține un număr întreg. Introduceți o altă valoare:");
                    line = reader.readLine(); // Citim următoarea linie din fișier
                }
            }
            throw new IOException("Fișierul este gol."); // Aruncăm o excepție dacă fișierul este gol
        }
    }

    // Metoda pentru calcularea valorii 2*x
    public static int calculateDouble(int x) {
        return 2 * x;
    }
}
