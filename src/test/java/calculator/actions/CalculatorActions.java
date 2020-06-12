package calculator.actions;

import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.WebElement;

public class CalculatorActions extends UIInteractionSteps {

    public void enter(String... keys) {
        for(String key: keys) {
            buttonNamed(key).click();
        }
    }

    public void openTheCalculator() {
        openUrl("https://calculator-n.herokuapp.com/");
    }

    public String displayedResult() {
        return $(".result").getText();
    }

    private final WebElement buttonNamed(String name) {
        return $("//button[@name='" + name + "']");
    }

}
