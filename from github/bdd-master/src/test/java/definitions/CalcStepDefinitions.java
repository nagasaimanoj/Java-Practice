package definitions;

public class CalcStepDefinitions {

    @cucumber.api.java.en.Given("^I have entered 50$")
    public void i_have_entered_50() {
        System.out.println("a=50");
    }

    @cucumber.api.java.en.When("^I press add$")
    public void i_press_add() {
        System.out.println("Press add");
    }

    @cucumber.api.java.en.Then("^the result should be 120 on the screen$")
    public void the_result_should_be_120_on_the_screen() {
        System.out.println("result is 120");
        org.junit.Assert.fail("Failed by user");
    }

    @cucumber.api.java.en.And("^I have also entered 70$")
    public void i_have_also_entered_70() {
        System.out.println("b = 70");
    }
}