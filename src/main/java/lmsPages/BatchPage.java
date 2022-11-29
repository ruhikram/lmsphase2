package lmsPages;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import factory.DriverFactory;

public class BatchPage extends BasePage {
	
	private static final Duration TIME_TO_WAIT = null;

	public BatchPage(WebDriver driver) {
		super(driver);
	}
	//Elements
	
	@FindBy(xpath = "//h2[text()='Batch Program']") // Batch Program Page heading
	WebElement msgHeading;
	@FindBy(xpath = "//div[@id='footer']") // Batch Program Footer Text
	WebElement FooterText;
	// Searchbox
		@FindBy(xpath = "//input[@id='search']")
		WebElement txtsearch;
		@FindBy(xpath="//nav[@class='_1ypTlJ']/a")
		List<WebElement> elements;
		//pagination text
		@FindBy(xpath="//[@id='MainCol']/div[2]/div[1]")
		WebElement title;
		//Batchnames
		@FindBy(xpath="//*[@id='batches']/div[3]//img")
		List<WebElement> Batchnames;
		//sort symbol
		@FindBy(xpath = "//*[@id='sort']")
		WebElement sort;
		@FindBy(xpath="//div[contains(text(),'Success: You have added new batch')]")
		WebElement msgConfirmation ;
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
		@FindBy(xpath="//div[contains(text(),'Please enter name')]")
		WebElement msgConfirmation1;
		@FindBy(xpath="//div[contains(text(),'Please enter desc')]")
		WebElement msgConfirmation2;
		@FindBy(xpath = "//table[@class='table table-condensed table-hover event-list']/tbody/tr")
		List<WebElement> rows;
		@FindBy(xpath = "//*[@id='addnew']")
		WebElement addnew;
		@FindBy(xpath="//div[contains(text(),'you successfully updated batch')]")
		WebElement msgConfirmation3 ;
		@FindBy(xpath = "//*[@id='delete']")
		WebElement delete;
		WebElement checkBoxSelected = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
		boolean isSelected = checkBoxSelected.isSelected();
		@FindBy(xpath = "//*[@id='yes']")
		WebElement yes;
		@FindBy(xpath = "//*[@id='no']")
		WebElement no;
		@FindBy(xpath = "//*[@id='edit']")
		WebElement edit;
		@FindBy(xpath = "//h1[normalize-space()='Batch has been deleted']")
		WebElement msgConfirmation4;
		@FindBy(xpath = "//input[name=\"cb-element mr-10")
		List<WebElement> checkboxes;

		
		
		//Action Methods
		
		public boolean isBatchPageExists() // Batch Program Page heading display status
		{
			try {
				return (msgHeading.isDisplayed());
			} catch (Exception e) {
				return (false);
			}
		}
		public void footertext() // FooterText of Program Page display status
		{
			String ActTitle = FooterText.getText();
			String ExpTitle = "In total there are 21 batches";
			if (ActTitle.contains(ExpTitle)) {
				System.out.println("Verified the title for ..." + ExpTitle);
			} else
				System.out.println("Title verification went wrong...");

		}
		public void pagination()
		{
			new WebDriverWait(
		            driver, TIME_TO_WAIT).until(
		                    ExpectedConditions.presenceOfElementLocated(
		                            By.tagName("a")));
		
		for (int i = 0;i<elements.size(); i++) {
		    
		    if (title.equals("Showing 1 t0 5 of 21 entrries")) {
		        elements.get(i).click();
		        break;
		    }
		}
		
		
		}
		
		public boolean isBatchExist(String BName)
			{
				boolean flag=false;
				for(WebElement ele:Batchnames)
				{				
					if(ele.getAttribute("title").equals(BName))
					{
					flag=true;
					break;
					}
				}
				
				return flag;
			
			}
		
public void ascending() {
	sort.click();
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
	Actions actions = new Actions(driver);
	actions.doubleClick(sort).perform();
	
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
		return (msgConfirmation3.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}
}
public String getConfirmationMsg4() {
	try {
		return (msgConfirmation3.getText());
	} catch (Exception e) {
		return (e.getMessage());

	}
}


public void addnewbatch()
{
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
		
	
	


