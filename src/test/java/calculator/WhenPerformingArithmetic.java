package calculator;

import calculator.actions.MathActions;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenPerformingArithmetic {

    @Steps
    MathActions matt;

    @Managed
    WebDriver driver;

    @Test
    // Matt calculates “2 * 2”
    public void should_work_for_basic_multiplication() {
        matt.opensTheCalculator();

        matt.calculates("2", "*", "2");

        assertThat(matt.seesAResult()).isEqualTo("4");
    }
}
