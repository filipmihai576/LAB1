
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de studenți
        List<Student> studenti = new ArrayList<>();
        studenti.add(new Student("Alex", 8));
        studenti.add(new Student("Maria", 7));
        studenti.add(new Student("Ion", 9));
        studenti.add(new Student("Elena", 6));

        // Afisam lista inainte de sortare
        System.out.println("Lista inainte de sortare: " + studenti);

        // Sortăm lista folosind metoda sort din clasa Collections
        Collections.sort(studenti);

        // Afisam lista dupa sortare
        System.out.println("Lista sortată: " + studenti);
    }
}