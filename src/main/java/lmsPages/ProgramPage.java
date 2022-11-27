package lmsPages;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgramPage extends BasePage {
	public ProgramPage(WebDriver driver) {
		super(driver);
	}

	// Elements
	@FindBy(xpath = "//h2[text()='Manage Program']") // Manage Program Page heading
	WebElement msgHeading;
	@FindBy(xpath = "//div[@id='footer']") // Manage Program Footer Text
	WebElement FooterText;
	// Searchbox
	@FindBy(xpath = "//input[@id='search']")
	WebElement txtsearch;
	// ascending arrow
	@FindBy(xpath = "//*[@id='asc']")
	WebElement ascending;
	@FindBy(xpath = "//*[@id='des']")
	WebElement descending;
	@FindBy(xpath = "//*[@id='addnew']")
	WebElement addnew;
	@FindBy(xpath = "//*[@id='name']")
	WebElement name;
	@FindBy(xpath = "//*[@id='description']")
	WebElement desc;
	@FindBy(xpath = "//*[@id='active']")
	WebElement active;
	@FindBy(xpath = "//*[@id='inactive']")
	WebElement inactive;
	@FindBy(xpath = "//*[@id='save']")
	WebElement save;
	@FindBy(xpath = "//*[@id='cancel']")
	WebElement cancel;
	@FindBy(xpath = "//h1[normalize-space()='New program has been created']")
	WebElement msgConfirmation;
	@FindBy(xpath = "//h2[normalize-space()='please enter name']")
	WebElement msgConfirmation1;
	@FindBy(xpath = "//h2[normalize-space()='please enter description']")
	WebElement msgConfirmation2;
	@FindBy(xpath = "//table[@class='table table-condensed table-hover event-list']/tbody/tr")
	List<WebElement> rows;
	@FindBy(xpath = "//*[@id='edit']")
	WebElement edit;
	@FindBy(xpath = "//h1[normalize-space()=' program has been successfully updated']")
	WebElement msgConfirmation3;
	@FindBy(xpath = "//*[@id='delete']")
	WebElement delete;
	WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
	boolean isSelected = checkBoxSelected.isSelected();
	@FindBy(xpath = "//*[@id='yes']")
	WebElement yes;
	@FindBy(xpath = "//*[@id='no']")
	WebElement no;
	@FindBy(xpath = "//h1[normalize-space()='program has been deleted']")
	WebElement msgConfirmation4;
	@FindBy(xpath = "//input[name=\"cb-element mr-10")
	List<WebElement> checkboxes;

	// Actions
	public boolean isManageProgramExists() // Manage Program Page heading display status
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void footertext() // Manage Program Page heading display status
	{
		String ActTitle = FooterText.getText();
		String ExpTitle = "In total there are 9 programs.";
		if (ActTitle.contains(ExpTitle)) {
			System.out.println("Verified the title for ..." + ExpTitle);
		} else
			System.out.println("Title verification went wrong...");

	}

	public void pagination() {

		List<WebElement> elements = driver.findElements(By.tagName("a"));
		for (int i = 0; i < elements.size(); i++) {
			String title = elements.get(i).getAttribute("title");
			if (title.equals("Next Page")) {
				elements.get(i).click();
				break;
			}
		}
	}

	public void search() {
		Actions act = new Actions(driver);
		txtsearch.sendKeys("Data science");
		act.sendKeys(Keys.ENTER);

		txtsearch.sendKeys("ygjhhio");
		act.sendKeys(Keys.ENTER);

		txtsearch.sendKeys("inactive");
		act.sendKeys(Keys.ENTER);

		txtsearch.sendKeys("active");
		act.sendKeys(Keys.ENTER);

	}

	public void ascending() {
		ascending.click();
		boolean flag = false;
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='paymentFormsTable']//tbody//tr"));
		int size = list.size();
		String[] actual = new String[size];
		String[] sorted = new String[size];

		for (int i = 0; i < size; i++) {
			actual[i] = sorted[i] = driver.findElement(By.xpath(".//[@id='paymentFormsTabl']//tbody//tr[" + i + "]]"))
					.getText();
		}

		// Sorting the array
		Arrays.sort(sorted);

		// Validating the existing with sorted array. shows no message if both are same
		for (int i = 0; i < size; i++) {
			if (!actual[i].equals(sorted[i])) {
				System.out.println("The elements the webpage are not sorted");
				System.out.println("expected " + sorted[i] + " but actual " + actual[i] + " at row " + i);
				flag = true;
			}
		}
	}

	public void descending() {
		descending.click();
		boolean flag = false;
		List<WebElement> list = driver.findElements(By.xpath(".//*[@id='paymentFormsTable']//tbody//tr"));
		int size = list.size();
		String[] actual = new String[size];
		String[] sorted = new String[size];

		for (int i = 0; i < size; i++) {
			actual[i] = sorted[i] = driver.findElement(By.xpath(".//[@id='paymentFormsTabl']//tbody//tr[" + i + "]]"))
					.getText();
		}

		// Sorting the array
		Arrays.sort(sorted);

		// Validating the existing with sorted array. shows no message if both are same
		for (int i = 0; i < size; i++) {
			if (!actual[i].equals(sorted[i])) {
				System.out.println("The elements the webpage are not sorted");
				System.out.println("expected " + sorted[i] + " but actual " + actual[i] + " at row " + i);
				flag = true;
			}

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

	public String getConfirmationMsg3() {
		try {
			return (msgConfirmation2.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public String getConfirmationMsg4() {
		try {
			return (msgConfirmation4.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public void addnewfuncion() {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();

		// Perform the click operation that opens new window
		addnew.click();

		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}

		// Perform the actions on new window
		name.sendKeys("selenium");
		desc.sendKeys("gkjjklji");
		active.click();
		save.click();
		getConfirmationMsg();

		if (name.getAttribute(" ") == null) {
			getConfirmationMsg1();
		} else if (desc.getAttribute(" ") == null) {
			getConfirmationMsg2();
		}
	

	driver.close();

	// Switch back to original browser (first window)
	driver.switchTo().window(winHandleBefore);

	}

	public int totalrows() {
		int count = rows.size();
		System.out.println("ROW COUNT : " + count);
		return count;
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
		name.sendKeys("java");
		desc.sendKeys("gkjjklji");
		active.click();
		save.click();
		getConfirmationMsg3();
		if (name.getAttribute(" ") == null) {
			getConfirmationMsg1();
		} else if (desc.getAttribute(" ") == null) {
			getConfirmationMsg2();
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
		getConfirmationMsg4();

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

	}

	public void deletemultiplerecords() {
		for (WebElement el : checkboxes) {
			if (!el.isSelected()) {
				el.click();
			}
		}
		delete.click();

	}
}
