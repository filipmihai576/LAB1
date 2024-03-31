import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creăm o listă de numere întregi
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(4);

        // Afisam lista inainte de sortare
        System.out.println("Lista inainte de sortare: " + numbers);

        // Sortăm lista folosind metoda sort din clasa Collections
        Collections.sort(numbers);

        // Afisam lista dupa sortare
        System.out.println("Lista sortată: " + numbers);
    }
}
