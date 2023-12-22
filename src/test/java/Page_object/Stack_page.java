package Page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.DriverFactory;
import utilities.configReader;

public class Stack_page {
	
	public static WebDriver driver =DriverFactory.getdriver();
	String Homeurl=configReader.getHomePage() ;
	String loginURL=configReader.getLoginPage();



	@FindBy(xpath = "//a[@href='stack']")WebElement getstart_stack;
	@FindBy(xpath = "//*[@id='navbarCollapse']//a[contains(@href, '/stack')]")WebElement dropdown_stack;
	
	@FindBy(xpath = "//a[@href='operations-in-stack']")WebElement operationsInStackLink;
	
	@FindBy(xpath = "//a[@href=\"implementation\"]")WebElement implementationLink;
	
	@FindBy(xpath = "//a[@href='stack-applications']")WebElement applicationLink;
	
	@FindBy(xpath = "//a[@class='list-group-item list-group-item-light text-info']")WebElement practiceQuestionLink;

	
	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryhere_btn;
	
	@FindBy(xpath ="//div[@class='CodeMirror-scroll']")WebElement text_box;
	
	@FindBy(xpath = "//button[@type='button']")WebElement run_btn;
	
	@FindBy(id = "output")WebElement output;

	@FindBy(xpath = "//input[@id='id_username']")WebElement username_1;

	@FindBy(xpath = "//input[@id='id_password']")WebElement password_1;
	
	@FindBy(xpath = "//input[@type='submit']") WebElement login;
	
	@FindBy(xpath = "//a[text()='Sign out']") WebElement signout;
	
	
		public  Stack_page() {
			PageFactory.initElements(driver, this);
			
			
			}
		
		public void getlogin(String username, String password) {
			driver.get(loginURL);
			username_1.sendKeys(username);
			password_1.sendKeys(password);
			login.click();
		}
		
		public void signoutClick() {

			signout.click();
		}


		public void clickOnGetStartInStackPage() {
			System.out.println(dropdown_stack);
			System.out.println(driver);
			getstart_stack.click();
		}
		public void clickOnOperationsInstackpage() {
			 operationsInStackLink.click();
		}
			
		public void clickTryHereLink() {
			tryhere_btn.click();
		}	
		
		public void ClickimplementationLink(){
			implementationLink.click();
		}	
		public void ClickApplicationLink(){
			applicationLink.click();
		}	
		public void ClickPracticeQuestionLink(){
			practiceQuestionLink.click();
		}
		
		public void gethomePage() {
		   
				driver.get(Homeurl);
				
			}
		
		public void NavigateBackToPreviousPage(){
		        driver.navigate().back();
		   }
		
		public void TryHereEditor(String pythoncode) throws InterruptedException{
			Actions box = new Actions(driver);
			Thread.sleep(1000);
			box.moveToElement(text_box).click().sendKeys(pythoncode).build().perform();
			Thread.sleep(1000);
			
			try {
			text_box.sendKeys(pythoncode);
			}
			catch (Exception e) {
				System.out.println("something went wrong");	
			}
			
			box.moveToElement(run_btn).click().perform();
			Thread.sleep(1000);
	   }
		
		public void AcceptAlert() throws InterruptedException{
			driver.switchTo().alert().accept();
			Thread.sleep(1000);
			
	   }
		
		public String GetAlert() throws InterruptedException{

			String Alerttext =  driver.switchTo().alert().getText();
			Thread.sleep(1000);
			return Alerttext;
			
		}
		
		public String getStackPageTitle() {
			String title = driver.getTitle();
			return title;
		}
		

}