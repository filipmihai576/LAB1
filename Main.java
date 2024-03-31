import java.io.IOException;



public class Main {

    public static void main(String[] args) {
        String fileName = "numere.txt"; // Numele fișierului de intrare

        try {
            int sum = FileSumCalculator.calculateIntegersSum(fileName);
            System.out.println("Suma numerelor întregi din fișierul " + fileName + " este: " + sum);
        } catch (IOException e) {
            System.out.println("Eroare la citirea din fișier: " + e.getMessage());
        }
    }
}
