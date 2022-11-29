package StepDefinitions;

import org.junit.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.*;
import lmsPages.Loginpage;


public class LoginStep {
	private  Loginpage Lp=new Loginpage(DriverFactory.getDriver());
	@Given("Admin\\/user\\/staff are on home page")
	public void admin_user_staff_are_on_home_page() {
	  Lp.openurl();
	}

	@When("User clicks login link")
	public void user_clicks_login_link() {
	    Lp.openLoginpage();
	}

	@Then("USer checks functionality of login button")
	public void u_ser_checks_functionality_of_login_button() {
	    Lp.openLoginpage();
boolean targetpage=Lp.isLoginPageExists();
		
        if(targetpage)
        {
            
            Assert.assertTrue(true);
        }
        else
        {
           
            Assert.assertTrue(false);
        }

	}

	@Then("User Checks Login feature with Valid Credentials")
	public void user_checks_login_feature_with_valid_credentials() {
	    Lp.validLogin();
	}

	@Then("User Checks Login feature with invalid Credentials")
	public void user_checks_login_feature_with_invalid_credentials() {
	    Lp.invalidLogin();
	}

	@Then("User Checks Login feature when user forgot password")
	public void user_checks_login_feature_when_user_forgot_password() {
	   Lp.clickforgotPassword();
	   boolean Verifypage=Lp.isVerificationCodeExists();
	   if(Verifypage)
       {
           
           Assert.assertTrue(true);
       }
       else
       {
          
           Assert.assertTrue(false);
       }
	}

	@Then("User Checks Reset password functionality of Login feature")
	public void user_checks_reset_password_functionality_of_login_feature() {
	    Lp.invalidpasswordreset();
	    Lp.invalidpasswordreset1();
	    Lp.invalidpasswordreset2();
	    Lp.invalidpasswordreset3();
	}

}
