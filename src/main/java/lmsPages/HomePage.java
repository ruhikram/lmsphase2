package lmsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		}
	//Elements
	@FindBy(xpath = "//span[text()='Program']")
	WebElement lnkProgram;

	@FindBy(linkText = "Batch")
	WebElement lnkBatch;

	@FindBy(linkText = "User")   
	WebElement linkUser;
	
	@FindBy(linkText = "Assignment")  //For Search Product Test
	WebElement lnkAssignment;
	
	@FindBy(linkText = "Attendance") //For Search Product Test
	WebElement lnkAttendance;
	
	
		
	// Action Methods
	public void clickProgram() {
		lnkProgram.click();
	}

	public void clickBatch() {
		lnkBatch.click();
	}
	
	public void clickuser()    
	{
		linkUser.click();
	}
	
	public void clickAssignment()  
	{
		lnkAssignment.click();
	}
	
	public void clickAttendance()  
	{
		lnkAttendance.click();
	}
	
	
	

}
