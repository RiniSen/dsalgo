package Page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utilities.DriverFactory;
import utilities.configReader;

public class SignIn_page {

	//WebDriver driver;
	public  static WebDriver driver=DriverFactory.getdriver();
	String loginURL=configReader.getLoginPage();


	public SignIn_page() {
		//public  static WebDriver driver=DriverFactory.getdriver();
		System.out.println(driver);
		System.out.println(loginURL);
		PageFactory.initElements(driver, this);
		//this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='id_username']")
	WebElement username_1;

	@FindBy(xpath = "//input[@id='id_password']")
	WebElement password_1;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement login;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement InvalidNameandPassword;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement loggedInMessage;

	@FindBy(xpath = "//a[text()='Sign out']")
	WebElement signout;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	WebElement signoutMessage;

	//String loginUrl = "https://dsportalapp.herokuapp.com/login";

	public void getLoginPage() {
     System.out.println("rini bef configread ");
		driver.get(loginURL);
		System.out.println("rini aft configread ");
	}

	public void loginAssert() {
     System.out.println(driver.getCurrentUrl());
     System.out.println("rini inside loginassert");
		String loginAssert = driver.getCurrentUrl();
		Assert.assertEquals(loginAssert, loginURL);
	}

	public void signIn(String username, String password) {

		PageFactory.initElements(driver, this);
		username_1.sendKeys(username);
		password_1.sendKeys(password);
		login.click();
	}

	public void errorMessage() {

		WebElement activeElement = driver.switchTo().activeElement();
		String messageStr = activeElement.getAttribute("validationMessage");
		System.out.println("Actual message appeared on screen: " + messageStr);
		Assert.assertEquals(messageStr, "Please fill out this field.");

	}

	public void invalidMessage() {

		String getMesg = InvalidNameandPassword.getText();
		System.out.println(getMesg);
		Assert.assertEquals("Invalid Username and Password", getMesg);
	}

	public void loggedInVerify() {

		String validationMsg = loggedInMessage.getText();
		System.out.println(validationMsg);
		Assert.assertEquals("You are logged in", validationMsg);
	}

	public void signoutClick() {

		signout.click();
	}

	public void signoutAssert() {

		String signoutMsg = signoutMessage.getText();
		Assert.assertEquals(signoutMsg, "Logged out successfully");
	}

	public void erase() {

		username_1.clear();
		password_1.clear();

	}

}
