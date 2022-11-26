package StepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lmsPages.UserPage;


public class UserStep {
	private  UserPage up=new UserPage(DriverFactory.getDriver());

@Given("The User Successfully logins into home page")
public void the_user_successfully_logins_into_home_page() {
	DriverFactory.getDriver().get("https://NumpyNinja/lms/");
	
}

@Given("User is on manage page")
public void user_is_on_manage_page() {
   up.UserTabClick();
}

@When("User tests the functionality of User module")
public void user_tests_the_functionality_of_user_module() {
    up.NextPageClick();
    up.PrevPageClick();
    up.FirstPageClick();
    up.LastPageClick();
    
}

@Then("User test add new funtionality")
public void user_test_add_new_funtionality() {
    up.AddNewUserClick();
    up.UserDetailsCancelButtonClick();
}

@Then("User checks table header functionality")
public void user_checks_table_header_functionality() {
   up.IDNumberRowClick();
   up.CheckAllButtonClick();
   up.CheckAllButtonClick();
   
}

@Then("User checks the functionality of delete button")
public void user_checks_the_functionality_of_delete_button() {
  up.CheckAllButtonClick();
  up.DeleteAllButtonClick();
  up.DeleteDialogBoxButtonNo();
  up.CheckAllButtonClick();
  up.DeleteDialogBoxButtonYes();
  up.DeleteDialogBoxButtonClose();
  up.RowDeleteIconClick();
 
}

@Then("User checks the functionality of Edit button")
public void user_checks_the_functionality_of_edit_button() {
	 up.RowEditIconClick();
}

@Then("User checks the functionality of Search button")
public void user_checks_the_functionality_of_search_button() {
    up.SearchTextBoxClick();
}

@Then("User checks the functionality of ID")
public void user_checks_the_functionality_of_id() {
    up.IDNumberRowClick();
}

@Then("User checks the functionality of User Details Window")
public void user_checks_the_functionality_of_user_details_window() {
    
}

@Then("User checks the functionality of Cancel button")
public void user_checks_the_functionality_of_cancel_button() {
    
}

@Then("User checks the functionality of Sbmit button")
public void user_checks_the_functionality_of_sbmit_button() {
    
}

@Then("User checks the functionality of  input feild in Label Text")
public void user_checks_the_functionality_of_input_feild_in_label_text() {
   
}

@Then("User checks the functionality of Drop down menu")
public void user_checks_the_functionality_of_drop_down_menu() {
   
}

@Then("User checks the functionality of Submit button")
public void user_checks_the_functionality_of_submit_button() {
   

}
}