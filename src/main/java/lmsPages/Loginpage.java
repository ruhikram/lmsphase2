package lmsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;

public class Loginpage extends Basepage {
	
	public Loginpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	private WebDriver driver;
	
	//private By UserHeaderButton = By.xpath("//button//span[text()='Dismiss']");
	private By LoginButton = By.id("//button//span[text()='Dismiss']");
	private By Username = By.id("//button//span[text()='Dismiss']");
	private By Password = By.id("//button//span[text()='Dismiss']");
	private By code = By.id("//button//span[text()='Dismiss']");


	public void LoginButtonClick() {
		driver.findElement(LoginButton).click();
	}
		
	public void UsernameClick() {
		driver.findElement(Username).click();
		
		
	}
	public void PasswordClick() {
		driver.findElement(Password).click();
	}
				
	public void CodeClick() {
		driver.findElement(code).click();
	}
	
	
}
