package Step_definition;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import Page_object.Stack_page;


import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import utilities.configReader;
public class LoginReusable_SD {
	
	private static final String String = null;
	Stack_page page = new Stack_page();
	String Excelpath = configReader.getexcelfilepath();
	static String username;
	static String password;
	static String message;


	@Given("The user is on the Home page after login with credential {string} and {int}")
	public void the_user_is_on_the_home_page_after_login_with_credential_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		username = testdata.get(rownumber).get("username");
		password = testdata.get(rownumber).get("password");
		message = testdata.get(rownumber).get("expectedmessage");

		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
		if (username != null || password != null)
			page.getlogin(username, password);
	}
}