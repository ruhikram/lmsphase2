package StepDefinitions;

import java.time.Duration;



import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep {

	lmsPages.RegistrationPage rp = new lmsPages.RegistrationPage(DriverFactory.getDriver());

	@Given("Admin\\/User\\/Staff Logged on to LMS website")
	public void admin_user_staff_logged_on_to_lms_website() {
		DriverFactory.getDriver().get("https://NumpyNinja/lms/");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//throw new io.cucumber.java.PendingException();
		
	}

	@When("Admin\\/User\\/Staff lands on Registration page")
	public void admin_user_staff_lands_on_registration_page() {
		System.out.println("lands on Registration page");
	}

	@Then("Admin\\/User\\/Staff check Login button")
	public void admin_user_staff_check_login_button() {
		rp.Loginbutton1();
	}

	@Then("Admin\\/User\\/Staff comes back on Registration Page")
	public void admin_user_staff_comes_back_on_registration_page() {
		rp.navigateRegistrationPage();
	}

	@Then("Admin\\/User\\/Staff fill the Registration Form with invalid Credentials")
	public void admin_user_staff_fill_the_registration_form_with_invalid_credentials() {
       rp.RegistrationPageInvalidCreds();
	}

	@Then("Admin\\/User\\/Staff fill the Registration Form with valid Credentials")
	public void admin_user_staff_fill_the_registration_form_with_valid_credentials() {
         rp.navigateRegistrationPageValidCreds();
	}

}