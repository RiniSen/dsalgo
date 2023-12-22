package Step_definition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

//import pages.P1_GetStarted;
//import pages.P2_Home1;
//import pages.P3_RegistrationPage;
import Page_object.SignIn_page;
//import pages.P5_Home;

public class SignIn {
	
//public ChromeOptions options = new ChromeOptions();
	SignIn_page login = new SignIn_page();
	
	/*public void driver() {
	Actions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
	options.setImplicitWaitTimeout(Duration.ofSeconds(5));
	}*/
	
	//P1_GetStarted p1 = new P1_GetStarted(driver);
	//P2_Home1 p2 = new P2_Home1(driver);
	//P3_RegistrationPage p3 = new P3_RegistrationPage(driver);
	//SignIn_page p4 = new SignIn_page();
	//P5_Home p5 = new P5_Home(driver);
	
	@Given("The user is in the Home page of ds-algo portal")
	public void the_user_is_in_the_home_page_of_ds_algo_portal() {
	    
		 //p2.loadHome();
  
	}

	@When("The user clicks on the Sign-In link")
	public void the_user_clicks_on_the_sign_in_link() {
	    
		 //p2.signIn1(); 
  
	}

	@Then("The user is taken to the Login page")
	public void the_user_is_taken_to_the_login_page() {
	    
		 login.loginAssert(); 

	}

	@When("The user enters  and  and clicks the login button")
	public void the_user_enters_and_and_clicks_the_login_button() {
	    
		 login.signIn("", "");

	}

	@Then("Verify the Please fill out this field, below username")
	public void verify_the_please_fill_out_this_field_below_username() {
	    
		 login.errorMessage();  

	}

	@When("The user enters Cera and  and clicks the login button")
	public void the_user_enters_cera_and_and_clicks_the_login_button() {
	    
		login.signIn("Cera", "");

	}

	@Then("Verify the Please fill out this field, below passord")
	public void verify_the_please_fill_out_this_field_below_passord() {
	    
		 login.errorMessage(); 
 
	}

	@When("The user enters  and ninja and clicks the login button")
	public void the_user_enters_and_ninja_and_clicks_the_login_button() {
	    
	     login.signIn("", "ninja"); 

	}

	@Then("Verify the Please fill out this field")
	public void verify_the_please_fill_out_this_field() {
		
		login.errorMessage(); 

	      
	}	


	@When("The user enters Payal and johanna and clicks the login button")
	public void the_user_enters_payal_and_johanna_and_clicks_the_login_button() {
	    
		 login.signIn("Payal","johanna"); 

	}

	@Then("Verify the Invalid Username and Password")
	public void verify_the_invalid_username_and_password() {
	    
		 login.invalidMessage();
 
	}

	@When("The user enters anjumjohn@gmail.com and shaunthesheep and clicks the login button")
	public void the_user_enters_anjumjohn_gmail_com_and_shaunthesheep_and_clicks_the_login_button() {
	    
		 login.signIn("arshsquashers@gmail.com","Welcome12#");
 
	}

	@Then("Verify the You are logged in, and with the user name on the top")
	public void verify_the_you_are_logged_in_and_with_the_user_name_on_the_top() {
	    
		login.loggedInVerify();
 
	}

	@Given("The user is logged in")
	public void the_user_is_logged_in() {
	    
		  login.getLoginPage();
	      login.signIn("arshsquashers@gmail.com","Welcome12#");
 
	}

	@When("The user clicks on Sign-Out link")
	public void the_user_clicks_on_sign_out_link() {
	    
	      login.signoutClick();

	}

	@Then("The user gets the message - Logged out successfully")
	public void the_user_gets_the_message_logged_out_successfully() {
	    
	      login.signoutAssert();
 
	}

}


