class Profesor extends Persoană {
    private String specializare;

    public Profesor(String nume, Adresă adresă, String specializare) {
        super(nume, adresă);
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nume='" + super.toString() + '\'' +
                ", specializare='" + specializare + '\'' +
                '}';
    }
}