package lmsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AssignmentPage extends Basepage {
	private WebDriver driver;
	
	private By AssignmentButton = By.xpath("//a[@id='list-groupitem']) ");
	private By NextPageLink = By.xpath("//a[@id='list-groupitem']) ");
    private By PreviousPageLink = By.xpath("//a[@id='list-groupitem']) ");		
    private By LastPageLink = By.xpath("//a[@id='list-groupitem']) ");	
    private By FirstPageLink = By.xpath("//a[@id='list-groupitem']) ");	
    private By SearchBar = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentNameArrow = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDesciptionArrow = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDueDateArrow = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentGradeArrow= By.xpath("//a[@id='list-groupitem']) ");	
    private By AddNewAssignmentButton = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDetailsSaveButton = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDetailsAssignmentName = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDetailsAssignmentDescription = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDetailsAssignmentGrade = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDetailsAssignmentDueDate = By.xpath("//a[@id='list-groupitem']) ");	
    private By AssignmentDetailsCancelButton = By.xpath("//a[@id='list-groupitem']) ");
    List<WebElement> ManageButtons = driver.findElements(By.xpath("//a[@id='list-groupitem'])"));
    private By EditAssignmentButton = By.xpath("//a[@id='list-groupitem']) ");
    private By EditAssignmentName= By.xpath("//a[@id='list-groupitem']) ");
    private By SaveButton = By.xpath("//a[@id='list-groupitem']) ");
    private By Cancelbutton= By.xpath("//a[@id='list-groupitem']) ");
    List<WebElement> EditButtons = driver.findElements(By.xpath("//a[@id='list-groupitem']) "));
    private By AssighnmentName = By.xpath("//a[@id='list-groupitem']) ");
    private By GoogleFormSubmitButton = By.xpath("//a[@id='list-groupitem']) ");
    List<WebElement> DeleteButtons = driver.findElements(By.xpath("//a[@id='list-groupitem']) "));
    private By DeleteYesButton = By.xpath("//a[@id='list-groupitem']) ");
    private By DeleteNoButton = By.xpath("//a[@id='list-groupitem']) ");
    private By LeftDeleteButton = By.xpath("//a[@id='list-groupitem']) ");
    private By LeftDeleteYesButton = By.xpath("//a[@id='list-groupitem']) ");
    private By LeftDeleteRightButton = By.xpath("//a[@id='list-groupitem']) ");
	private By ErrorSuccessMessage = By.xpath("//a[@id='list-groupitem']) ");
	
	public AssignmentPage(WebDriver driver) {
		super(driver);
	}
	
	public void AssignmentButtonClick() {
		driver.findElement(AssignmentButton).click();
		
	}
	
	public void NextPageLink() {
		driver.findElement(NextPageLink).click();
	}
	
	
	public void PreviousPageLink() {
		driver.findElement(PreviousPageLink).click();
	}
	public void LastPageLink() {
		driver.findElement(LastPageLink).click();
	}
	public void FirstPageLink() {
		driver.findElement(FirstPageLink).click();
	}
	public void SearchBar() {
		driver.findElement(SearchBar).click();
	}
	public void AssignmentNameArrow() {
		driver.findElement(AssignmentNameArrow).click();
	}
	public void AssignmentDesciptionArrow() {
		driver.findElement(AssignmentDesciptionArrow).click();
	}
	public void AssignmentDueDateArrow() {
		driver.findElement(AssignmentDueDateArrow).click();
	}
	public void AssignmentGradeArrow() {
		driver.findElement(AssignmentGradeArrow).click();
	}
	public void AddNewAssignmentButton() {
		driver.findElement(AddNewAssignmentButton).click();
		if (LMSUserType == UserType.Admin)
		{
			String error = "Staff only have access to add New Assignment";
			if (driver.findElement(ErrorSuccessMessage).getText() == error)
			{
				//Success
			}
		}
		else
		{
			//Staff or User will see New assignment window
		}
	}
	public void AssignmentDetailsSaveButton() {
		driver.findElement(AssignmentDetailsSaveButton).click();
		
		String assignmentName = driver.findElement(AssignmentDetailsAssignmentName).getText();
		String assignmentDesc = driver.findElement(AssignmentDetailsAssignmentName).getText();
		String assignmentGrade = driver.findElement(AssignmentDetailsAssignmentName).getText();
		String assignmentDueDate = driver.findElement(AssignmentDetailsAssignmentName).getText();
		
		if (assignmentName == "" && assignmentDesc == "" && assignmentGrade == "" && assignmentDueDate == "")
		{
			String error = "Name is required";
			if (driver.findElement(ErrorSuccessMessage).getText() == error)
			{
				//Success
			}
		}
		
		if (assignmentName != "" && assignmentDesc != "" && assignmentGrade != "" && assignmentDueDate != "")
		{
			String success = "New Assignment successfully added";
			if (driver.findElement(ErrorSuccessMessage).getText() == success)
			{
				//Success
			}
		}
	}
	public void AssignmentDetailsAssignmentName() {
		driver.findElement(AssignmentDetailsAssignmentName).sendKeys("name");
	}
	public void AssignmentDetailsAssignmentDescription() {
		driver.findElement(AssignmentDetailsAssignmentDescription).sendKeys("desc");
	}
	public void AssignmentDetailsAssignmentGrade() {
		driver.findElement(AssignmentDetailsAssignmentGrade).sendKeys("Grade");
	}
	public void AssignmentDetailsAssignmentDueDate() {
		driver.findElement(AssignmentDetailsAssignmentDueDate).sendKeys("date");
	}
	
	public void AssignmentDetailsCancelButton() {
		driver.findElement(AssignmentDetailsCancelButton).click();
	}
	public void ManageButton() {
		//Clicking 1st manage button
		ManageButtons.get(0).click();
		
		//should navigate to assignment grade window
	}
	public void EditAssignmentButton() {
		driver.findElement(EditAssignmentButton).click();
	}
	public void EditAssignmentName() {
		driver.findElement(EditAssignmentName).click();
	}
	public void SaveButton() {
		driver.findElement(SaveButton).click();
	}
	public void Cancelbutton() {
		driver.findElement(Cancelbutton).click();
	}
	public void EditButton() {
		EditButtons.get(0).click();
	}
	public void AssighnmentName() {
		driver.findElement(AssighnmentName).click();
	}
	public void GoogleFormSubmitButton() {
		driver.findElement(GoogleFormSubmitButton).click();
	}
	public void DeleteButton() {
		DeleteButtons.get(0).click();
	}
	
	public void DeleteYesButton() {
		driver.findElement(DeleteYesButton).click();
	}
	public void DeleteNoButton() {
		driver.findElement(DeleteNoButton).click();
	}
	public void LeftDeleteButton() {
		driver.findElement(LeftDeleteButton).click();
	}
	public void LeftDeleteYesButton() {
		driver.findElement(LeftDeleteYesButton).click();
	}
	public void LeftDeleteRightButton() {
		driver.findElement(LeftDeleteRightButton).click();
	}
	
	

}
