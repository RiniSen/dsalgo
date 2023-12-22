package Page_object;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class landing_page {

	static WebDriver driver;
	
	@FindBy (xpath = "//button[@class='btn']") WebElement btn;
	String URL = "https://dsportalapp.herokuapp.com";
	
	public landing_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		landing_page.driver = driver;
	}
	public void openportalpage() {
		//String URL = "https://dsportalapp.herokuapp.com";
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(URL);
		btn.click();
		System.out.println("inside openportalpage");
	}

	
	public void Clickhomepagebutton() {
		System.out.println("inside bef clickhomepagebutton");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		btn.click();
		//driver.close();
		System.out.println("inside aft clickhomepagebutton");
	}
}
