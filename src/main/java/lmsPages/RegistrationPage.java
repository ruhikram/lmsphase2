package lmsPages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import factory.DriverFactory;

public class RegistrationPage extends Basepage {

	   WebDriver driver;
	   
	    By header=By.xpath("//div[@class='_9bp-']");
	    By Login=By.id("login");
	    By SignupButton=By.name("signup");
	    By FirstName=By.name("firstname");
	    By LastName=By.name("lastname");
	    By Address=By.xpath("//div[@class='address']");
	    By StreetName=By.xpath("//div[@class='streetname']");
	    By City=By.id("city");
	    By State=By.name("state");
	    By Zip=By.xpath("//div[@class='zip']");
	    By BirthDate=By.xpath("//div[@class='birthdate']");
	    By UserName=By.name("username");
	    By PhoneNumber=By.xpath("//div[@class='phonenumber']");
	    By Email=By.xpath("//div[@class='email']");
	    By Password=By.id("password");
	    
	    
	    public RegistrationPage(WebDriver driver)
	    {
	    	super(driver);
	    
	    }
	    public String validateHeader() {
	        String actualheader=driver.findElement(header).getText();
	        return actualheader;
	    }
	    public boolean Loginbutton()
	    {
	        return driver.findElement(Login).isDisplayed();
	        
	    }
	    public void Loginbutton1()
	    {
	        driver.findElement(Login).click();
	    }
	    public void SignUp()
	    {
	        driver.findElement(SignupButton).isDisplayed();
	    }
	    
	    public void SignUpClick()
	    {
	        driver.findElement(SignupButton).click();
	    }
	    
	    public void Enterfirstname(String firstname) {
	    
	        driver.findElement(FirstName).sendKeys(firstname);
	    }
	    public String GetFirstNameText()
	    {
	        String getfname= driver.findElement(FirstName).getText();
	        return getfname;
	        
	    }
	    public void Enterlastname(String lastname) {
	        
	        driver.findElement(LastName).sendKeys(lastname);
	    }
	    public String GetLastNameText()
	    {
	        String getlname= driver.findElement(LastName).getText();
	        return getlname;
	    }
	    public void EnterAddress(String address)
	    {
	        driver.findElement(Address).sendKeys(address);
	    }
	    public String GetAddressText()
	    {
	        String getaddress=driver.findElement(Address).getText();
	        return getaddress;
	    }
	    public void EnterStreetName(String streetname)
	    {
	        driver.findElement(StreetName).sendKeys(streetname);
	    }
	    public String GetStreetText()
	    {
	       String getstreet=driver.findElement(StreetName).getText();    
	       return getstreet;
	    }
	    public void EnterZipCode(String zipcode)
	    {
	       driver.findElement(Zip).sendKeys(zipcode);    
	    }
	    public String GetZipCode()
	    {
	        String getzip=driver.findElement(Zip).getText();
	        return getzip;
	    }
	    public void EnterCityName(String cityname)
	    {
	        driver.findElement(City).sendKeys(cityname);
	    }
	    public void EnterStatName(String state)
	    {
	        driver.findElement(State).sendKeys(state);
	    }
	    public String GetCityName()
	    {
	        String getcity=driver.findElement(City).getText();
	        return getcity;
	    }
	    
	    public void SelectStateName(String statename)
	    {
	         // click on drop down button
	        WebElement DropdownButton = driver.findElement(State);
	        DropdownButton.click();
	       
	    }
	    public void GetStateName()
	    {
	         // select a drop down option
	         WebElement DropdownOption= driver.findElement(State);
	         DropdownOption.click();
	         System.out.println("The State name is displayed"+DropdownOption.getText());
	    }
	    public void EnterMobileNumber(String phonenumber)
	    {
	        driver.findElement(PhoneNumber).sendKeys(phonenumber);
	    }
	    public String GetMobileNumber()
	    {
	        String getmobilenumber=driver.findElement(PhoneNumber).getText();
	        return getmobilenumber;
	    }
	    public void SelectDate()
	    {
	        driver.findElement(By.id("datepicker")).click();
	        
	    }
	    public void datebox()
	    {
	        WebElement dateBox = driver.findElement(By.xpath("//form//input[@name='bdaytime']"));
	        //Fill date as mm/dd/yyyy as 09/25/2013
	        dateBox.sendKeys("09252013");
	        System.out.println("The date is displayed" +dateBox.getText());
	    }
	    
	    public void EnterUserName(String username)
	    {
	    	driver.findElement(UserName).sendKeys(username);
	    }
	    
	    public void EnterUserPassword(String pwd)
	    {
	    	driver.findElement(Password).sendKeys(pwd);
	    }
	    
	    public void EnterUserEmail(String email)
	    {
	    	driver.findElement(Email).sendKeys(email);
	    }
	    
	    public void navigateRegistrationPage()
	    {
	    	driver.navigate().back();
	    	DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    }
	    
	    
	    public void RegistrationPageInvalidCreds() {
	    	
			
	    	Enterfirstname("");
			Enterlastname("");
			EnterAddress("");
			EnterStreetName("");
			EnterCityName("");
			EnterStatName("");
			EnterZipCode("");
			EnterUserName("");
			EnterUserPassword("");
			EnterUserEmail("");
			
			SignUpClick();
			System.out.println("Enter all feilds");
			
			
			Enterfirstname("");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter valid first name");
			
			Enterfirstname("first");
			Enterlastname("");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid LastName");
			
			Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid Address");
			
			
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("  ");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid StreetName");
			
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName(" ");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid CityName");
			
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName(" ");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid StateName");
			
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode(" ");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid ZipCode");
			
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName(" ");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid UserName");
			
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword(" ");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
			System.out.println("Enter Valid Password");
			
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("  ");
			
			SignUpClick();
			System.out.println("Enter Valid Email");
	    }
	    
	    public void navigateRegistrationPageValidCreds() {
	    	Enterfirstname("first");
			Enterlastname("last");
			EnterAddress("123");
			EnterStreetName("ABC");
			EnterCityName("NY");
			EnterStatName("CO");
			EnterZipCode("80500");
			EnterUserName("username");
			EnterUserPassword("password123");
			EnterUserEmail("user@gmail.com");
			
			SignUpClick();
	    }
}