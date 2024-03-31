import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSumCalculator {

    public static int calculateIntegersSum(String fileName) throws IOException {
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                try {
                    int number = Integer.parseInt(line);
                    sum += number;
                } catch (NumberFormatException ignored) {
                    // Ignoră linia care nu conține un număr întreg
                }
            }
        }

        return sum;
    }
}
