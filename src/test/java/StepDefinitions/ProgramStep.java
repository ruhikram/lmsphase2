package StepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import lmsPages.HomePage;
import lmsPages.Loginpage;
import lmsPages.ProgramPage;

public class ProgramStep {
	private  ProgramPage prp=new ProgramPage(DriverFactory.getDriver());
	private  HomePage hp=new HomePage(DriverFactory.getDriver());
	private  Loginpage Lp=new Loginpage(DriverFactory.getDriver());
	
	@Given("User logged on to LMS page")
	public void user_logged_on_to_lms_page() {
	    Lp.validLogin();
	}

	@When("User is on program page")
	public void user_is_on_program_page() {
	    hp.clickProgram();
	}


	@Then("User checks Header Validation")
	public void user_checks_header_validation(String string) {
boolean targetpage=prp.isManageProgramExists();
		
        if(targetpage)
        {
            
            Assert.assertTrue(true);
        }
        else
        {
           
            Assert.assertTrue(false);
        }

	}

	@Then("User Checks Footer Validation")
	public void user_checks_footer_validation() {
		prp.footertext(); 
	}

	@Then("User checks Paginator validation")
	public void user_checks_paginator_validation() {
		prp.pagination();
	    
	}

	@Then("User checks Search box Functionality")
	public void user_checks_search_box_functionality(String program) {
	    
		prp.isBatchExist(program);
	}

	@Then("User checks Ascending order Functionality")
	public void user_checks_ascending_order_functionality() {
	    prp.ascending();
	}

	@Then("User checks Descending order Functionality")
	public void user_checks_descending_order_functionality() {
		
	    prp.descending();
	}

	@Then("User checks add a new program Functionality")
	public void user_checks_add_a_new_program_functionality() {
	    prp.addnewfuncion();
	}

	@Then("User checks Number of rows in a table Functionality")
	public void user_checks_number_of_rows_in_a_table_functionality() {
		
	    prp.totalrows();
	}

	@Then("User checks Edit Functionality")
	public void user_checks_edit_functionality() {
	   prp.edit();
	}

	@Then("User checks Delete Functionality")
	public void user_checks_delete_functionality() {
	   prp.delete();
	}

	@Then("User checks Checkbox Functionality")
	public void user_checks_checkbox_functionality() {
	    prp.deletemultiplerecords();
	}


}
