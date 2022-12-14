package lmsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage extends BasePage {
	
	private WebDriver driver;
	
	private By UserHeaderButton = By.xpath("//a[@id='list-group-item'])");
	private By PreviousPageLink= By.xpath("//a[@id='list-group-item'])");
	private By NextPageLInk= By.xpath("//a[@id='list-group-item'])");
	private By FirstPageLink = By.xpath("//a[@id='list-group-item'])");
	private By LastPageLink = By.xpath("//a[@id='list-group-item'])");
	private By AddNewUserButton = By.xpath("//a[@id='list-group-item'])");
	private By HeaderID = By.xpath("//a[@id='list-group-item'])");
	private By HeaderName = By.xpath("//a[@id='list-group-item'])");
	private By HeaderEmailAddress = By.xpath("//a[@id='list-group-item'])");
	private By HeaderContactNumber = By.xpath("//a[@id='list-group-item'])");
	private By HeaderBatch = By.xpath("//a[@id='list-group-item'])");
	private By HeaderSkill = By.xpath("//a[@id='list-group-item'])");
	private By CheckAllButton = By.xpath("//a[@id='list-group-item'])");
	private By DeleteAllButton = By.xpath("//a[@id='list-group-item'])");
	private By DeleteDialogBoxButtonNo  = By.xpath("//a[@id='list-group-item'])");
	private By DeleteDialogBoxButtonYes = By.xpath("//a[@id='list-group-item'])");
	private By DeleteDialogBoxButtonClose = By.xpath("//a[@id='list-group-item'])");
	private By RowDeleteIcon = By.xpath("//a[@id='list-group-item'])");
	private By ConfirmUserDeleteYesButton = By.xpath("//a[@id='list-group-item'])");
	private By ConfirmUserDeleteNoButton = By.xpath("//a[@id='list-group-item'])");
	private By ConfirmUserDeleteMessageCloseIcon = By.xpath("//a[@id='list-group-item'])");
	private By RowEditicon = By.xpath("//a[@id='list-group-item'])");
	private By SearchTextBox = By.xpath("//a[@id='list-group-item'])");
	private By IDNumberRow = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsCancelButton = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsSubmitButton = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsPhoneNo = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsPostalCode = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsUGprogram = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsStateDropDownIcon = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsStateDropDownSelect = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsAddCoAptSuiteUnitButton = By.xpath("//a[@id='list-group-item'])");
	
	public UserPage(WebDriver driver) {
		super(driver);
	}
	
	public void UserTabClick() {
		driver.findElement(UserHeaderButton).click();
	}
	
	public void NextPageClick() {
		driver.findElement(NextPageLInk).click();
	}
	
    public void PrevPageClick() {
    	driver.findElement(PreviousPageLink).click();
	}
    
    public void FirstPageClick() {
    	driver.findElement(FirstPageLink).click();
	}
    
    public void LastPageClick() {
    	driver.findElement(LastPageLink).click();
	}
    
    public void AddNewUserClick() {
		driver.findElement(AddNewUserButton).click();
	}
    
    public void HeaderIDClick() {
		driver.findElement(HeaderID).click();
	}
    
    public void HeaderNameClick() {
		driver.findElement(HeaderName).click();
	}
	
    public void HeaderEmailAddClick() {
		driver.findElement(HeaderEmailAddress).click();
	}
    
    public void HeaderContactNumClick() {
		driver.findElement(HeaderContactNumber).click();
	}
    
    public void HeaderBatchClick() {
		driver.findElement(HeaderBatch).click();
	}
    
    public void HeaderSkillClick() {
		driver.findElement(HeaderSkill).click();
	}
	
    public void CheckAllButtonClick() {
		driver.findElement(CheckAllButton).click();
	}
    
    public void SearchTextBoxClick() {
		driver.findElement(SearchTextBox).click();
		driver.findElement(SearchTextBox).sendKeys("Name");
		driver.findElement(SearchTextBox).sendKeys();
		driver.findElement(SearchTextBox).sendKeys("NameTwo");
		
	}
	
    public void RowEditIconClick() {
		driver.findElement(RowEditicon).click();
	}
    
    public void RowDeleteIconClick() {
		driver.findElement(RowDeleteIcon).click();
	}
	
    public void UserDetailsSubmitButtonClick() {
		driver.findElement(UserDetailsSubmitButton).click();
	}
    
    public void UserDetailsCancelButtonClick() {
		driver.findElement(UserDetailsCancelButton).click();
	}
    
    public void ConfirmUserDeleteYesButtonClick() {
		driver.findElement(ConfirmUserDeleteYesButton).click();
	}
    
    public void ConfirmUserDeleteNoButtonClick() {
		driver.findElement(ConfirmUserDeleteNoButton).click();
	}
    
    public void ConfirmUserDeleteMessageCloseIconClick() {
		driver.findElement(ConfirmUserDeleteMessageCloseIcon).click();
	}
    
    public void IDNumberRowClick() {
		driver.findElement(IDNumberRow).click();
	}
    
    
    public void DeleteAllButtonClick() {
 		driver.findElement(DeleteAllButton).click();
 		
 		
 	}
    public void DeleteDialogBoxButtonNo() {
 		driver.findElement(DeleteDialogBoxButtonNo).click();
 		
 		
 	}
    public void DeleteDialogBoxButtonYes() {
		driver.findElement(DeleteDialogBoxButtonYes).click();
	}
    public void DeleteDialogBoxButtonClose() {
		driver.findElement(DeleteDialogBoxButtonClose).click();
	}
    public void UserDetailsStateDropDownIcon() {
 		driver.findElement(UserDetailsStateDropDownIcon).click();
 		
 		
 	}
    public void UserDetailsStateDropDownSelect() {
 		driver.findElement(UserDetailsStateDropDownSelect).click();
 		
 		
 	}
    public void UserDetailsPhoneNo() {
 		driver.findElement(UserDetailsPhoneNo).sendKeys("MoreThenTenDigitNumber");
 		
 		
 	}
    public void UserDetailsPostalCode() {
 		driver.findElement(UserDetailsPostalCode).sendKeys("fiveDigitNumber");
 		
 		
 	}
    public void UserDetailsUGprogram() {
 		driver.findElement(UserDetailsUGprogram).click();
 		
 		
 	}
    public void UserDetailsAddCoAptSuiteUnitButton() {
 		driver.findElement(UserDetailsAddCoAptSuiteUnitButton).click();
 		
 		
 	}
    
}
