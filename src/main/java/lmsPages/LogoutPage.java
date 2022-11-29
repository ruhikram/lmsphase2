package lmsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage extends BasePage {

	private By LogOutButton = By.xpath("//a[@id='list-groupitem']) ");

	static WebDriver driver;

	public LogoutPage(WebDriver driver) {

		super(driver);
	}

	public void ClickLogOutButton() {
		driver.findElement(LogOutButton).click();
	}

}
