package StepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.qa.base.Base;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bookflightstepdefinition extends Base  {
         
	
	@Given("^user is already on login  page$")
    public void user_is_already_on_login_page() throws Throwable {
                  
    }

    @When("^user launch url$")
    public void user_launch_url()  {
    	  driverLauch();
    }

    @Then("^user select oneway raido button$")
    public void user_select_oneway_raido_button(DataTable table)  {
        // for practise purpose 
     // DataTable is class that we have get data .
    	      List<List<String>>  data=table.raw();
    	     System.out.println(data.get(0).toString());
    	     driver.findElement(By.id("username")).sendKeys(data.get(0).toString());
    	     driver.findElement(By.id("pass")).sendKeys(data.get(0).toString());
    	// other way map using  map key type and key value is string
    	   Map<String , String> data1=table.asMap(String.class, String.class);
    	                  // put for loop and get data previous type
    	
    }

    @Then("^user select economy optons$")
    public void user_select_economy_optons() {
       
    }

    @Then("^user click on flying form field$")
    public void user_click_on_flying_form_field()  {
       
    }

    @Then("^user click on destination textbox $")
    public void user_click_on_destination_textbox()  {
        
    }

    @Then("^user click on departure date$")
    public void user_click_on_departure_date()  {
       
    }

    @Then("^user click on passengers dropdown$")
    public void user_click_on_passengers_dropdown()  {
       
    }

    @Then("^user click on serach button$")
    public void user_click_on_serach_button()  {
       
    }

    @Then("^user close browser propertie$")
    public void user_close_browser_propertie() {
       
    }
}
