package utilities;

	import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.edge.EdgeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.PageFactory;

import Page_object.landing_page;
import io.cucumber.java.Scenario;
	//import io.github.bonigarcia.wdm.WebDriverManager;
	import utilities.configReader;
	public class DriverFactory {
	
		public static WebDriver driver = null;
		public  DriverFactory() {
			PageFactory.initElements(driver, this);
		}

		public static WebDriver getdriver() {
			configReader cf = new configReader();
			try {
				cf.configload();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			cf.getBrowserType();
			String browser = configReader.getBrowserType();
			System.out.println("tunu gave this browser");
			System.out.println(browser);
		if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();

		} else if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();

		} else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();

		} 
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.manage().window().maximize();
			System.out.println("DF");
			System.out.println(driver);
			return driver;

		}

		//public void closeallDriver() {
		//	driver.close();
		//}

	}

	
