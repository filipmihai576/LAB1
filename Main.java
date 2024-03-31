import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Introduceți coeficientul a:");
            int a = scanner.nextInt();

            System.out.println("Introduceți coeficientul b:");
            int b = scanner.nextInt();

            EquationResult result = EquationSolver.solveEquation(a, b);
            System.out.println("Rezultatul ecuației " + a + "x + " + b + " = 0 este: " + result);
        } catch (CustomEquationException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Eroare: Introduceți coeficienți validați.");
        } finally {
            scanner.close();
        }
    }
}
