package lmsPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Programpage extends Basepage {
	public Programpage (WebDriver driver)
	{
		super(driver);
	}
	//Elements
	@FindBy(xpath = "//h2[text()='Manage Program']") // Manage Program Page heading
	WebElement msgHeading;
	@FindBy(xpath= "//div[@id='footer']") // Manage Program Footer Text
	WebElement FooterText;
	
	
	//Actions
	public boolean isManageProgramExists()   // Manage Program Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	
	public void footertext()   // Manage Program Page heading display status
	{
		String ActTitle = FooterText.getText();
		String ExpTitle="In total there are 9 programs.";
		if(ActTitle.contains(ExpTitle)) {
            System.out.println("Verified the title for ..."+ ExpTitle);
        }
        else
            System.out.println("Title verification went wrong...");
				
	}
	
	
	
	
	

}
