package calculator.actions;

public class MathActions {

    CalculatorActions onTheCalclator;

    public void opensTheCalculator() {
        onTheCalclator.openTheCalculator();
    }

    public void calculates(String leftOperand, String operator, String rightOperand) {
        onTheCalclator.enter(leftOperand, operator, rightOperand, "=");
    }

    public String seesAResult() {
        return onTheCalclator.displayedResult();
    }
}
