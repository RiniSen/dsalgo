package Step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Alert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Register {
	
/*	public static void readExcelSheet() throws Exception {
		
		File src =  new File("C:\\Users\\NewUser\\eclipse-workspace\\DSAlgo\\src\\test\\resources\\Excel Files\\Data driven input excel.xlsx");
		FileInputStream fis = new FileInputStream (src);
		XSSFWorkbook xsf = new XSSFWorkbook (fis);
		XSSFSheet sheet = xsf.getSheetAt(0);
		String user = sheet.getRow(5).getCell(1).getStringCellValue();
		String pwd = sheet.getRow(5).getCell(1).getStringCellValue();
		String conpwd = sheet.getRow(5).getCell(1).getStringCellValue();

	} */
	
	public static WebDriver driver = new ChromeDriver();
	String URL = "https://dsportalapp.herokuapp.com/register";
	
	@FindBy (id = "id_username") WebElement username;
	@FindBy (id = "id_password1") WebElement password;
	@FindBy (id = "id_password2") WebElement confirmPassword;
	@FindBy (xpath = "//input[@value='Register']") WebElement regBtn;

	@Given("The user opens Register Page")
	public void the_user_opens_register_page() {
	
	    
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() throws Exception {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		driver.manage().window().maximize();
		System.out.println("after url");	    
		PageFactory.initElements(driver, this);
		System.out.println("after init");
		System.out.println("before send keys");
		username.sendKeys("");
		System.out.println("between send keys");
		password.sendKeys("");
		confirmPassword.sendKeys("");
		regBtn.click();
		System.out.println("after send keys");
	}

	@Then("It should display an error Please fill out this field below Username textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_username_textbox() throws InterruptedException {
	   

		 //Alert alert = driver.switchTo().alert();
		 //System.out.println(alert.getText());
		//WebElement username1 = driver.findElement(By.id("id_username"));
		//WebElement password1 = driver.findElement(By.id("id_password1"));
		//Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(password).perform();
		//Thread.sleep(3000);
		action.moveToElement(username).perform();
		//Thread.sleep(3000);
		String tooltip = username.getAttribute("id");
	      System.out.println("inside then");
	      System.out.println(tooltip);

	      
	      
		
	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {
	    
		username.sendKeys("rinisen.cob@outlook.com");
		password.sendKeys("");
		confirmPassword.sendKeys("");
		regBtn.click();
		
	}
	
	@Then("It should display an error Please fill out this field below Password textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_password_textbox() {

		
	}

	@When("The user clicks Register button after entering Username and password with Password Confirmation field empty")
	public void the_user_clicks_register_button_after_entering_username_and_password_with_password_confirmation_field_empty() throws Exception {

		username.sendKeys("rinisen.cob@outlook.com");
		password.sendKeys("dsalgoproject1");
		confirmPassword.sendKeys("");
		regBtn.click();
	}
	
	@Then("It should display an error Please fill out this field below Password Confirmation textbox")
	public void it_should_display_an_error_please_fill_out_this_field_below_password_confirmation_textbox() {
	    
	    
	}


	@When("The user enters a name with characters other than Letters, digits")
	public void the_user_enters_a_name_with_characters_other_than_letters_digits() throws InterruptedException {
		username.sendKeys("@#$%@outlook.com");
		Thread.sleep(2000);
		password.sendKeys("dsalgoproject1");
		Thread.sleep(2000);
		confirmPassword.sendKeys("dsalgoproject1");
		Thread.sleep(2000);
		regBtn.click();
		Thread.sleep(2000);
	}

	@Then("It should display an error message Please enter a valid username")
	public void it_should_display_an_error_message_please_enter_a_valid_username() {
	    
		 WebElement error_msg=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	      String msg=error_msg.getText();
	      System.out.println(msg);
	      
	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields() {
	    
		username.sendKeys("rinisen.cob@outlook.com");
		password.sendKeys("dsalgoproject1");
		confirmPassword.sendKeys("dsalgoproject123");
		regBtn.click();
	}

	@Then("It should display an error message password_mismatch:The two password fields didn’t match.")
	public void it_should_display_an_error_message_password_mismatch_the_two_password_fields_didn_t_match() {
	    
		 WebElement error_msg=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	      String msg=error_msg.getText();
	      System.out.println(msg);
	      
	}

	@When("The user enters a Password with characters less than eight")
	public void the_user_enters_a_password_with_characters_less_than_eight() {
	    
		username.sendKeys("rinisen.cob@outlook.com");
		password.sendKeys("dsalgo");
		confirmPassword.sendKeys("dsalgo");
		regBtn.click();
	}

	@Then("It should display an error Please fill out this field below Username textboxIt should display an error message Password should contain atleast eight characters")
	public void it_should_display_an_error_please_fill_out_this_field_below_username_textbox_it_should_display_an_error_message_password_should_contain_atleast_eight_characters() {
	    
		 WebElement error_msg=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	      String msg=error_msg.getText();
	      System.out.println(msg);
	      
	}

	@When("The user enters a Password with only numbers")
	public void the_user_enters_a_password_with_only_numbers() {
		
		username.sendKeys("rinisen.cob@outlook.com");
		password.sendKeys("12345");
		confirmPassword.sendKeys("12345");
		regBtn.click();
	    
	}

	@Then("It should display an error message Password cannot contain only numbers")
	public void it_should_display_an_error_message_password_cannot_contain_only_numbers() {
	    
		 WebElement error_msg=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	      String msg=error_msg.getText();
	      System.out.println(msg);
	      
	}

	@When("The user enters valid information")
	public void the_user_enters_valid_information() {
	    
		username.sendKeys("rinisen.cob@outlook.com");
		password.sendKeys("dsalgoproject1");
		confirmPassword.sendKeys("dsalgoproject1");
		regBtn.click();
	}

	@Then("The user should be redirected to Homepage with the message New Account Created")
	public void the_user_should_be_redirected_to_homepage_with_the_message_new_account_created() {
		WebElement error_msg=driver.findElement(By.xpath("//div[@class='alert alert-primary']"));
	      String msg=error_msg.getText();
	      System.out.println(msg);
		
	}
}
