package definitions;

import java.util.List;

import calculator.Calc;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class Calc1StepDefinitions {

	Calc calc=new Calc();
	int arg1,arg2;
	int actual;
	
	@Given("^I am at calculator page$")
    public void i_am_at_calculator_page(){
        System.out.println("calculator page opens");
    }

    @When("^I pass these values$")
    public void sumTest(DataTable table) {
    	
    	System.out.println("Data Table");
    	
    	List<List<String>> data =table.raw();
		System.out.println("Total Rows "+data.size());
		
		
		for (int i=1;i<=data.size()-1;i++)
		{
		//System.out.println(data.get(i).get(0));	
		//System.out.println(data.get(i).get(1));
		
		arg1= Integer.parseInt(data.get(i).get(0));	
		arg2= Integer.parseInt(data.get(i).get(1));
		
		System.out.println(arg1);
		System.out.println(arg2);
		
		actual=calc.sum(arg1, arg2);
		
		assertEquals(arg1+arg2,actual);
		}
    }
    
    }