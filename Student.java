class Student extends Persoană {
    private int anStudiu;

    public Student(String nume, Adresă adresă, int anStudiu) {
        super(nume, adresă);
        this.anStudiu = anStudiu;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + super.toString() + '\'' +
                ", anStudiu=" + anStudiu +
                '}';
    }
}