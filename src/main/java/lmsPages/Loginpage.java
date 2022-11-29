package lmsPages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage extends BasePage {
	public Loginpage(WebDriver driver) {
		super(driver);
	}


	//Elements
	//loginlink
	@FindBy(xpath = "//input[@id='Login']")
	WebElement lnkLogin;
	@FindBy(xpath = "//h2[text()='Login page']") //Login Page heading
	WebElement msgHeading;
	@FindBy(xpath = "//h2[text()='Enter Verification code']") //Login Page heading
	WebElement msgHeading1;

	@FindBy(xpath = "//input[@id='input-email']")
	WebElement txtuser;

	@FindBy(xpath = "//input[@id='input-password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@value='Login']")
	WebElement btnLogin;
	@FindBy(xpath = "//input[@id='forgot password']")
	WebElement lnkforgotPassword;
	@FindBy(xpath = "//input[@id='click here]")
	WebElement lnkclickhere;
	@FindBy(xpath = "//input[@id='new password']")
	WebElement txtnewPassword;
	@FindBy(xpath = "//input[@id='retypepassword']")
	WebElement txtPassword1;
	@FindBy(xpath = "//input[@id='submit']")
	WebElement btnsubmit;
	@FindBy(xpath = "//h1[normalize-space()='passwords mismatched']")
	WebElement errormsg;
	@FindBy(xpath = "//h2[normalize-space()='password should be more than 8 characters']")
	WebElement errormsg1;
	@FindBy(xpath = "//h3[normalize-space()='password should contain one special character']")
	WebElement errormsg2;
	@FindBy(xpath = "//h4[normalize-space()='password should contain one uppercase letter']")
	WebElement errormsg3;







	//Actions
	public void openurl()
	{
		driver.get("https://numpyninja/lms/");
	}
	public void openLoginpage()
	{
		lnkLogin.click();
	}
	public boolean isLoginPageExists() // Validates Login page
	{
		try {
			return (msgHeading.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}
	public boolean isVerificationCodeExists() // Validates Login page
	{
		try {
			return (msgHeading1.isDisplayed());
		} catch (Exception e) {
			return (false);
		}
	}

	public void setEmail(String email) {
		txtuser.sendKeys(email);
	}

	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);
	}

	public void clickLogin() {
		btnLogin.click();
	}
	public void validLogin()
	{
		setEmail("John");
		setPassword("password");
		clickLogin();

	}
	public void invalidLogin()
	{
		setEmail("John");
		setPassword("password1");
		clickLogin();
	}
	public void clickforgotPassword()
	{
		lnkforgotPassword.click();

	}
	public void setNewpassword(String newpassword) {
		txtnewPassword.sendKeys(newpassword);
	}
	public void setNewpassword1(String newpassword1) {
		txtPassword1.sendKeys(newpassword1);
	}
	public void clicksubmit()
	{
		btnsubmit.click();

	}

	public void validpasswordreset()
	{
		setNewpassword("Password2$");
		setNewpassword1("Password2$");
		clicksubmit();

	}
	public String errorMsg() {
		try {
			return (errormsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	public String errorMsg1() {
		try {
			return (errormsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	public String errorMsg2() {
		try {
			return (errormsg.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}
	public String errorMsg3() {
		try {
			return (errormsg3.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}
	}

	public void invalidpasswordreset()
	{
		setNewpassword("password");
		setNewpassword1("passwordd");
		clicksubmit();
		errorMsg();

	}
	public void invalidpasswordreset1()
	{
		setNewpassword("pass");
		setNewpassword1("pass");
		clicksubmit();
		errorMsg1();

	}
	public void invalidpasswordreset2()
	{
		setNewpassword("password2");
		setNewpassword1("passwordd");
		clicksubmit();
		errorMsg2();

	}
	public void invalidpasswordreset3()
	{
		setNewpassword("passwordE");
		setNewpassword1("passwordE");
		clicksubmit();
		errorMsg3();

	}




}