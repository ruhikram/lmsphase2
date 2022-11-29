package StepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import lmsPages.BatchPage;
import lmsPages.HomePage;
import lmsPages.Loginpage;

public class BatchStep {
	private  BatchPage Bp=new BatchPage(DriverFactory.getDriver());
	private  HomePage hp=new HomePage(DriverFactory.getDriver());
	private  Loginpage Lp=new Loginpage(DriverFactory.getDriver());
	@Given("User logged on to LMS website")
	public void user_logged_on_to_lms_website() {
	    Lp.validLogin();
	}

	@When("User navigates program page")
	public void user_navigates_program_page() {
		
	    hp.clickBatch();
	}

	@Then("User checks  Header Validation in Batch MOdule")
	public void user_checks_header_validation_in_batch_m_odule() {
		Bp.isBatchPageExists();
	    
	}

	@Then("User Checks   Footer Validation in Batch Module")
	public void user_checks_footer_validation_in_batch_module() {
	   Bp.footertext(); 
	}

	@Then("User checks  Paginator validation in Batch Module")
	public void user_checks_paginator_validation_in_batch_module() {
	    Bp.pagination();
	}

	@Then("User checks  Search box Functionality in Batch Module")
	public void user_checks_search_box_functionality_in_batch_module(String batch) {
	    Bp.isBatchExist(batch);
	}

	@Then("User checks  Ascending order Functionality in Batch Module")
	public void user_checks_ascending_order_functionality_in_batch_module() {
	    Bp.ascending();
	}

	@Then("User checks  Descending order Functionality in Batch Module")
	public void user_checks_descending_order_functionality_in_batch_module() {
		Bp.descending();
	    
	}

	@Then("User checks a new program Functionality in Batch module")
	public void user_checks_a_new_program_functionality_in_batch_module() {
	    Bp.addnewbatch();
	}

	@Then("User checks Number of rows in a table Functionality in Batch Module")
	public void user_checks_number_of_rows_in_a_table_functionality_in_batch_module() {
	    Bp.totalrows();
	}

	@Then("User checks Edit Functionality in Batch Module")
	public void user_checks_edit_functionality_in_batch_module() {
	   Bp.edit(); 
	}

	@Then("User checks Delete Functionality in Batch Module")
	public void user_checks_delete_functionality_in_batch_module() {
	    Bp.delete();
	}

	@Then("User checks Checkbox Functionality in Batch Module")
	public void user_checks_checkbox_functionality_in_batch_module() {
	    Bp.deletemultiplerecords();
	}



}
