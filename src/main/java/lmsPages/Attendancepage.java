package lmsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Attendancepage extends BasePage {
	public Attendancepage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//h2[text()='Attendance works']") // Manage Program Page heading
	WebElement msgHeading;
	@FindBy(xpath = "//*[@id='edit']")
	WebElement edit;
	@FindBy(xpath = "//*[@id='programname']")
	WebElement program_name;
	@FindBy(xpath = "//*[@id='username']")
	WebElement user_name;
	@FindBy(xpath = "//input[@id='present']")
	WebElement radio;
	@FindBy(xpath = "//input[@id='absent']")
	WebElement radio1;
	@FindBy(xpath = "//h1[normalize-space()='Attendance has been updated']")
	WebElement msgConfirmation;
	@FindBy(xpath = "//h1[normalize-space()='please enter program name']")
	WebElement msgConfirmation1;
	@FindBy(xpath = "//h1[normalize-space()='Record has been deleted']")
	WebElement msgConfirmation2;
	WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	boolean isSelected = checkBoxSelected.isSelected();
	@FindBy(xpath = "//*[@id='yes']")
	WebElement yes;
	@FindBy(xpath = "//*[@id='no']")
	WebElement no;
	@FindBy(xpath = "//*[@id='delete']")
	WebElement delete;
	@FindBy(xpath = "\"//*[@id='radio']")
	List<WebElement> radiobuttons;

	// Action methods
	public boolean isAttendancePageExists() // Manage Program Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public String getConfirmationMsg1() {
		try {
			return (msgConfirmation1.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public String getConfirmationMsg2() {
		try {
			return (msgConfirmation2.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public void edit() {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		edit.click();
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		program_name.sendKeys("java");
		user_name.sendKeys("gkjjklji");
		radio.click();

		getConfirmationMsg();
		if (program_name.getAttribute(" ") == null) {
			getConfirmationMsg();
		} else if (user_name.getAttribute(" ") == null) {
			getConfirmationMsg1();
		}

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)
	}

	public void delete() {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		checkBoxSelected.click();

		delete.click();
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		yes.click();
		getConfirmationMsg2();

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}

	public void prsentorAbsent() {

		boolean bval = false;
		bval = radiobuttons.get(0).isSelected();

		if (bval = true) {
			radiobuttons.get(1).click();
			System.out.println("Student is present");
		} else {
			radiobuttons.get(0).click();

		}
	}

}
