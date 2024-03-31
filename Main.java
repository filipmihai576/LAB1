public class Main {
    public static void main(String[] args) {
        // Creare și afișare unui patrat
        Patrat patrat = new Patrat(5);
        System.out.println("Aria patratului: " + patrat.getArie());

        // Creare și afișare unui cerc
        Cerc cerc = new Cerc(3);
        System.out.println("Aria cercului: " + cerc.getArie());

        // Creare și afișare unei sfere
        Sfera sfera = new Sfera(4);
        System.out.println("Volumul sferei: " + sfera.getVolum());

        // Creare și afișare unui cub
        Cub cub = new Cub(3);
        System.out.println("Volumul cubului: " + cub.getVolum());

        // Apelarea metodei care efectuează împărțirea și tratează excepția
        try {
            double result = divideByX(5);
            System.out.println("Rezultatul împărțirii: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Impartirea la 0 nu este permisa!");
        }
    }

    // Metoda care împarte 10 la x și tratează excepția
    public static double divideByX(int x) {
        return 10 / x;
    }
}
