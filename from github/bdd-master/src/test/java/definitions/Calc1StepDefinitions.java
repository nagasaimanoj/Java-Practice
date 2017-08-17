package definitions;

public class Calc1StepDefinitions {

	int arg1, arg2;

	@cucumber.api.java.en.Given("^I am at calculator page$")
	public void i_am_at_calculator_page() {
		System.out.println("calculator page opens");
	}

	@cucumber.api.java.en.When("^I pass these values$")
	public void sumTest(cucumber.api.DataTable table) {

		System.out.println("Data Table");

		java.util.List<java.util.List<String>> data = table.raw();
		System.out.println("Total Rows " + data.size());

		for (int i = 1; i <= data.size() - 1; i++) {

			arg1 = Integer.parseInt(data.get(i).get(0));
			arg2 = Integer.parseInt(data.get(i).get(1));

			org.junit.Assert.assertEquals(arg1 + arg2, new calculator.Calc().sum(arg1, arg2));
		}
	}
}