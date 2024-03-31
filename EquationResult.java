public class EquationResult {
    private Double solution;
    private String message;

    public EquationResult(Double solution, String message) {
        this.solution = solution;
        this.message = message;
    }

    @Override
    public String toString() {
        if (solution != null) {
            return "x = " + solution;
        } else {
            return message;
        }
    }
}
