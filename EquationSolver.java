public class EquationSolver {
    public static EquationResult solveEquation(int a, int b) throws CustomEquationException {
        if (a == 0) {
            if (b == 0) {
                return new EquationResult(null, "Indeterminat: orice valoare de x este soluție.");
            } else {
                return new EquationResult(null, "Contradicție: ecuație imposibil de rezolvat.");
            }
        } else {
            double x = -b / (double) a;
            return new EquationResult(x, null);
        }
    }
}
