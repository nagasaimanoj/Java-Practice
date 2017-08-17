package definitions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class CalcStepDefinitions {

    @Given("^I have entered 50$")
    public void i_have_entered_50() {
        System.out.println("a=50");
    }

    @When("^I press add$")
    public void i_press_add() {
        System.out.println("Press add");
    }

    @Then("^the result should be 120 on the screen$")
    public void the_result_should_be_120_on_the_screen() {
        System.out.println("result is 120");
        fail("Failed by user");
    }

    @And("^I have also entered 70$")
    public void i_have_also_entered_70() {
        System.out.println("b=70");
    }

}