public class Persoana {
    private String nume;
    private int varsta;

    // Constructor
    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }
    @Override
    public String toString() {
        return "Persoana - " +
                "nume: '" + nume + '\'' +
                ", varsta: " + varsta +
                '.';
    }

    public static void main(String[] args) {
        // Creăm un obiect Persoana și afișăm reprezentarea sa sub formă de șir
        Persoana persoana = new Persoana("Filip", 18);
        System.out.println(persoana.toString());
    }
}
