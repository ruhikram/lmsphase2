package StepDefinitions;

import org.openqa.selenium.WebDriver;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import lmsPages.BasePage;

public class Logout extends BasePage {

	private WebDriver driver;
	
	public Logout(WebDriver driver) {
		super(driver);
	}
	
	lmsPages.LogoutPage ObjLogout = new lmsPages.LogoutPage(driver);

	@Given("Admin or User or Staff Logged on to LMS website")
	public void admin_or_user_or_staff_logged_on_to_lms_website() {
		DriverFactory.getDriver().get("https://NumpyNinja/lms/");
	}

	@When("Admin or User or Staff Clicks on LogOut button")
	public void admin_or_user_or_staff_clicks_on_log_out_button() {
		ObjLogout.ClickLogOutButton();
	}

}
