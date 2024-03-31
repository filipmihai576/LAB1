import java.util.List;
import java.util.ArrayList;

class Curs {
    private String numeCurs;
    private Profesor profesor;
    private List<Student> listaStudenti;

    public Curs(String numeCurs, Profesor profesor) {
        this.numeCurs = numeCurs;
        this.profesor = profesor;
        this.listaStudenti = new ArrayList<>();
    }

    public void addStudent(Student student) {
        listaStudenti.add(student);
    }

    public void removeStudent(Student student) {
        listaStudenti.remove(student);
    }

    public void addTeacher(Profesor profesor) {
        this.profesor = profesor;
    }

    public void removeTeacher() {
        this.profesor = null;
    }

    public void changeTeacherAddress(Adresă adresă) {
        this.profesor.adresă = adresă;
    }

    public void changeStudentAddress(Student student, Adresă adresă) {
        student.adresă = adresă;
    }

    public Curs createNewCourse(List<Student> listaStudenti, Profesor profesor) {
        Curs cursNou = new Curs(numeCurs, profesor);
        cursNou.listaStudenti.addAll(listaStudenti);
        return cursNou;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "numeCurs='" + numeCurs + '\'' +
                ", profesor=" + profesor +
                ", listaStudenti=" + listaStudenti +
                '}';
    }
}