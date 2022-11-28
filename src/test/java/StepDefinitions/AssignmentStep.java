package StepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lmsPages.AssignmentPage;


public class AssignmentStep {
	private  AssignmentPage Ap = new AssignmentPage(DriverFactory.getDriver());

	
@Given("The User Successfully logins into home page")
	public void the_user_successfully_logins_into_home_page() {
		DriverFactory.getDriver().get("https://NumpyNinja/lms/");
}

@Given("The user clicks on Assignment")
public void the_user_clicks_on_assignment() {
	
    Ap.AddNewAssignmentButton();
}

@When("User tests the functionality of Assignment module")
public void user_tests_the_functionality_of_assignment_module() {
    
}

@Then("User tests the functionality of Search Text Box")
public void user_tests_the_functionality_of_search_text_box() {
    
}

@Then("User tests the functionality of Ascending order")
public void user_tests_the_functionality_of_ascending_order() {
   
}

@Then("User tests the functionality of Descending order")
public void user_tests_the_functionality_of_descending_order() {
    
}

@Then("User tests the functionality of New Assignment")
public void user_tests_the_functionality_of_new_assignment() {
    
}

@Then("User tests the functionality of Edit")
public void user_tests_the_functionality_of_edit() {
  
}

@Then("User tests the functionality of Assignment Google Form")
public void user_tests_the_functionality_of_assignment_google_form() {
   
}

@Then("User tests the functionality of Delete Assignment")
public void user_tests_the_functionality_of_delete_assignment() {
    
}

@Then("User tests the functionality of Delete Multiple Assignment")
public void user_tests_the_functionality_of_delete_multiple_assignment() {
    
}

@Then("User tests the functionality ofheckbox")
public void user_tests_the_functionality_ofheckbox() {
   
}

	
}
