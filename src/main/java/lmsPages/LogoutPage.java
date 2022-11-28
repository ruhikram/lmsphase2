package lmsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogoutPage {
	
	private By LogOutButton = By.xpath("//a[@id='list-groupitem']) ");
	
static WebDriver driver;
	
	
	public LogoutPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public void ClickLogOutButton() {
		driver.findElement(LogOutButton).click();
		}

}
