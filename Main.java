import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            double x = readNumberFromFile("input.txt"); // Citim numărul din fișier
            double result = calculateDouble(x); // Calculăm valoarea 2*x
            System.out.println("Valoarea calculată: " + result);
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fișier: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Fișierul conține un număr invalid.");
        }
    }

    // Metoda pentru citirea unui număr din fișier
    public static double readNumberFromFile(String filename) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line = reader.readLine();
            if (line != null) {
                return Double.parseDouble(line); // convertim linia citită ca un număr real
            } else {
                throw new IOException("Fișierul este gol."); // Aruncăm o excepție dacă fișierul este gol
            }
        }
    }

    // Metoda pentru calcularea valorii 2*x
    public static double calculateDouble(double x) {
        return 2 * x;
    }
}
