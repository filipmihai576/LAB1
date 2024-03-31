import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduceți primul număr:");
            Integer numar1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Introduceți al doilea număr:");
            Integer numar2 = Integer.parseInt(scanner.nextLine());

            Integer suma = calculeazaSuma(numar1, numar2);
            System.out.println("Suma celor două numere este: " + suma);
        } catch (NumberFormatException e) {
            System.out.println("Eroare: Introduceți un număr valid.");
        }

        scanner.close();
    }

    public static Integer calculeazaSuma(Integer numar1, Integer numar2) {
        if (numar1 == null || numar2 == null) {
            throw new NullPointerException("Unul dintre numere este null.");
        }
        return numar1 + numar2;
    }
}
