
public class Main {
    public static void main(String[] args) {
        Adresă adresaProfesor = new Adresă("Strada Principală", "Orasul Meu", "12345");
        Profesor profesor = new Profesor("John Doe", adresaProfesor, "Matematică");

        Adresă adresaStudent = new Adresă("Strada Secundară", "Orasul Meu", "54321");
        Student student = new Student("Alice Smith", adresaStudent, 2);

        Curs curs = new Curs("Matematică Avansată", profesor);
        curs.addStudent(student);

        System.out.println(curs.toString());
    }
}