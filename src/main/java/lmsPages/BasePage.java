package lmsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	WebDriver driver;
	UserType LMSUserType;

	enum UserType {
		Admin, StaffOrUser
	};

	public BasePage(WebDriver driver) {
		this.driver = driver;
		this.LMSUserType = UserType.StaffOrUser;
		PageFactory.initElements(driver, this);
	}

}
