package Step_definition;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Page_object.landing_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class landing {

	public static WebDriver driver = new ChromeDriver();
	landing_page page = new landing_page(driver);
	
	
/*	@Given("The user opens DS Algo portal link")
	public void the_user_opens_ds_algo_portal_link() {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		page.openportalpage();
	    System.out.println("Rupak 1");
	}

	@When("not required")
	public void not_required() {

	}

	@Then("The user should land in DS Algo portal page")
	public void the_user_should_land_in_ds_algo_portal_page() {
		System.out.println("page loaded");}*/
	
	
	@Given("The user is in DS Algo portal page")
	public void the_user_is_in_ds_algo_portal_page() {

	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
    //WebElement get_started = driver.findElement(By.xpath("//button[@class='btn']"));
	//landing_page start = new landing_page(driver);	
    //page.Clickhomepagebutton();
    page.openportalpage();
    System.out.println("Rupak 2");
	}

	@Then("The user should be redirected to homepage")
	public void the_user_should_be_redirected_to_homepage() {

	}



}