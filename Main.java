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

    }
}
