package StepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import lmsPages.Attendancepage;
import lmsPages.HomePage;
import lmsPages.Loginpage;
import lmsPages.ProgramPage;

public class AttendanceStep {
	private  Attendancepage Ap=new Attendancepage(DriverFactory.getDriver()); 
	private  HomePage hp=new HomePage(DriverFactory.getDriver());
	private  Loginpage Lp=new Loginpage(DriverFactory.getDriver());
	@Given("User logged on to the LMS page")
	public void user_logged_on_to_the_lms_page() {
	   Lp.validLogin();
	}

	@When("User is on Attendance page")
	public void user_is_on_attendance_page() {
	   hp.clickAttendance(); 
	}

	@Then("User checks Attendance page Header Validation")
	public void user_checks_attendance_page_header_validation() {
    boolean targetpage=Ap.isAttendancePageExists();
		
        if(targetpage)
        {
            
            Assert.assertTrue(true);
        }
        else
        {
           
            Assert.assertTrue(false);
        }
	}

	@Then("User checks Attendance page Edit Functionality")
	public void user_checks_attendance_page_edit_functionality() {
		Ap.edit();
	}

	@Then("User checks Attendance page Delete Functionality")
	public void user_checks_attendance_page_delete_functionality() {
	    Ap.delete();
	}

	@Then("User checks present Functionality")
	public void user_checks_present_functionality() {
		Ap.prsentorAbsent();
	    
	}

	@Then("User checks Absent Functionality")
	public void user_checks_absent_functionality() {
		Ap.prsentorAbsent();
	}
}
