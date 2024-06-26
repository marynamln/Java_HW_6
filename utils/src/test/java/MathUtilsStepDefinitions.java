import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.MathUtils;
import io.cucumber.java.en.Given;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilsStepDefinitions {
    private int num1;
    private int num2;
    private int result;

    @Given("I have numbers {int} and {int}")
    public void i_have_numbers_and(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @When("I add the numbers")
    public void i_add_the_numbers() {
        MathUtils mathUtils = new MathUtils();
        result = mathUtils.addTwoNumbers(num1, num2);
    }

    @Then("the result should be {int}")
    public void the_result_should_be(int expected) {
        assertEquals(expected, result);
    }
}
