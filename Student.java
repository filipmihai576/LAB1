class Student implements Comparable<Student> {
    private String nume;
    private int nota;

    // Constructor
    public Student(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }


    // Metoda compareTo pentru a compara după nota
    @Override
    public int compareTo(Student student) {
        return Integer.compare(this.nota, student.nota);
    }

    // Metoda toString pentru a afișa detaliile studentului
    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", nota=" + nota +
                '}';
    }
}