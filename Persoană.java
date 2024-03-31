class Persoană {
    private String nume;
    protected Adresă adresă;

    public Persoană(String nume, Adresă adresă) {
        this.nume = nume;
        this.adresă = adresă;
    }

    @Override
    public String toString() {
        return "Persoană{" +
                "nume='" + nume + '\'' +
                ", adresă=" + adresă +
                '}';
    }
}
