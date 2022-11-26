package lmsPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserPage {
	
	private WebDriver driver;
	
	private By UserHeaderButton = By.xpath("//a[@id='list-group-item'])");
	private By Manageaprogram = By.xpath("//a[@id='list-group-item']) ");
	private By FooterTotalProgram = By.xpath("//a[@id='list-group-item']) ");
	private By PreviousPageLink= By.xpath("//a[@id='list-group-item'])");
	private By NextPageLInk= By.xpath("//a[@id='list-group-item'])");
	private By FirstPageLink = By.xpath("//a[@id='list-group-item'])");
	private By LastPageLink = By.xpath("//a[@id='list-group-item'])");
	private By NavigationLabelEntries = By.xpath("//a[@id='list-group-item'])");
	private By FooterTotalLabel = By.xpath("//a[@id='list-group-item'])");
	private By AddNewUserButton = By.xpath("//a[@id='list-group-item'])");
	private By UserDetails  = By.xpath("//a[@id='list-group-item'])");
	private By HeaderID = By.xpath("//a[@id='list-group-item'])");
	private By HeaderName = By.xpath("//a[@id='list-group-item'])");
	private By HeaderEmailAddress = By.xpath("//a[@id='list-group-item'])");
	private By HeaderContactNumber = By.xpath("//a[@id='list-group-item'])");
	private By HeaderBatch = By.xpath("//a[@id='list-group-item'])");
	private By HeaderSkill = By.xpath("//a[@id='list-group-item'])");
	private By HeaderEditDelete = By.xpath("//a[@id='list-group-item'])");
	private By CheckAllButton = By.xpath("//a[@id='list-group-item'])");
	private By DeleteAllButton = By.xpath("//a[@id='list-group-item'])");
	private By DeleteDialogBoxButtonNo  = By.xpath("//a[@id='list-group-item'])");
	private By DeleteDialogBoxButtonYes = By.xpath("//a[@id='list-group-item'])");
	private By DeleteDialogBoxButtonClose = By.xpath("//a[@id='list-group-item'])");
	private By UserRowCheckBox = By.xpath("//a[@id='list-group-item'])");
	private By UserDeletedSuccessMsg = By.xpath("//a[@id='list-group-item'])");
	private By RowDeleteIcon = By.xpath("//a[@id='list-group-item'])");
	private By ConfirmUserDeleteMessage = By.xpath("//a[@id='list-group-item'])");
	private By ConfirmUserDeleteYesButton = By.xpath("//a[@id='list-group-item'])");
	private By ConfirmUserDeleteNoButton = By.xpath("//a[@id='list-group-item'])");
	private By ConfirmUserDeleteMessageCloseIcon = By.xpath("//a[@id='list-group-item'])");
	private By RowEditicon = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailDialogBox = By.xpath("//a[@id='list-group-item'])");
	private By SearchTextBox = By.xpath("//a[@id='list-group-item'])");
	private By IDNumberRow = By.xpath("//a[@id='list-group-item'])");
	private By IDNumberRowDialogbox = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsText = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsCancelButton = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsCancelIcon = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsSubmitButton = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsFirstName = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsMiddleName = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsLastName = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsEmailAddress = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsPhoneNo = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsAddress = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsCity = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsState = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsPostalCode = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsProgram = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsUGprogram = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsPGprogram = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsSkill = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsExperience = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsUserRole = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsVisaStatus = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsBatch = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsComments = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsStateDropDownIcon = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsStateDropDownSelect = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsUserRoleDropDownIcon = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsUserRoleSelect = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsSubmitErrorMessage = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsSubmitSuccessMessage = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsAddCoAptSuiteUnitButton = By.xpath("//a[@id='list-group-item'])");
	private By UserDetailsInputFeildLabel = By.xpath("//a[@id='list-group-item'])");
	
	public UserPage(WebDriver driver) {
		this.driver = driver;
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
}
