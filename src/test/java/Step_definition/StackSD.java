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
public class StackSD {
	
	private static final String String = null;
	Stack_page page = new Stack_page();
	String Excelpath = configReader.getexcelfilepath();
	static String pythoncode;
	static String pythonmessage;


	@When("The user clicks on the Get Started button on Stack or select Stack item from the drop down menu")
	public void the_user_clicks_on_the_get_started_button_on_stack_or_select_stack_item_from_the_drop_down_menu() throws InterruptedException {
		page.clickOnGetStartInStackPage();
		Thread.sleep(1000);
	    
	}

	@Then("The user is redirected to the {string} page")
	public void the_user_is_redirected_to_the_page(String string) {
		String Title = page.getStackPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title,"Stack", "Title do not match");
	}
	

	@When("The user clicks on the Operations in Stack link on Stack page")
	public void the_user_clicks_on_the_operations_in_stack_link_on_stack_page() throws InterruptedException {
		page.clickOnOperationsInstackpage();
		Thread.sleep(1000);
	    
	}

	@Then("The user should be redirected to {string} page")
	public void the_user_should_be_redirected_to_page(String string) {
		String Title = page.getStackPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
	    
	}

	@When("The user clicks on {string} button on {string} page")
	public void the_user_clicks_on_button_on_page(String string, String string2) throws InterruptedException {
		Thread.sleep(1000);
		page.clickTryHereLink();
		LoggerLoad.info("User clicks Try here Button");
		Thread.sleep(1000);
	}

	@Then("The user should be redirected to tryEditor page with Run button")
	public void the_user_should_be_redirected_to_try_editor_page_with_run_button() {
	    
	}

	@Given("The user is in a page having an Editor with a Run button to test")
	public void the_user_is_in_a_page_having_an_editor_with_a_run_button_to_test() throws InterruptedException {

	    
	}

	@When("The user enters valid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_valid_python_code_in_editor_from_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader1 = new ExcelReader();
		List<Map<String, String>> pythondata = reader1.getData(Excelpath,sheetname);
		pythoncode = pythondata.get(rownumber).get("Code");
		pythonmessage = pythondata.get(rownumber).get("Result");
		LoggerLoad.info("User types python code as :" + pythoncode);
		if (pythoncode != null)
		page.TryHereEditor(pythoncode);
	    
	}

	@When("clicks run button")
	public void clicks_run_button() throws InterruptedException {
		Thread.sleep(1000);
		page.NavigateBackToPreviousPage(); 
		Thread.sleep(1000);
	    
	}

	@Then("The user is presented with the result after run button is clicked")
	public void the_user_is_presented_with_the_result_after_run_button_is_clicked() throws InterruptedException {
		Thread.sleep(1000);
		page.clickTryHereLink();
		LoggerLoad.info("User clicks Try here Button again");
		Thread.sleep(1000); 
	    
	}
	
	@When("The user enters invalid python code in Editor from sheet {string} and {int}")
	public void the_user_enters_invalid_python_code_in_editor_from_sheet_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
		ExcelReader reader1 = new ExcelReader();
		List<Map<String, String>> pythondata = reader1.getData(Excelpath,sheetname);
		pythoncode = pythondata.get(rownumber).get("Code");
		pythonmessage = pythondata.get(rownumber).get("Result");
		LoggerLoad.info("User types python code as :" + pythoncode);
		if (pythoncode != null)
		page.TryHereEditor(pythoncode);
		String Alerttext = page.GetAlert();
		page.AcceptAlert();
		LoggerLoad.info("Error message is  :" + Alerttext);
	    
	}

	@Then("The user gets an error message as {string}")
	public void the_user_gets_an_error_message_as(String string) throws InterruptedException {
	
	}

	@Given("The user in {string} page and navigates to get {string} page")
	public void the_user_in_page_and_navigates_to_get_page(String string, String string2) throws InterruptedException {
		Thread.sleep(1000);
		page.NavigateBackToPreviousPage();
		
	}

	@When("The user clicks on Stack Implementation link")
	public void the_user_clicks_on_stack_implementation_link() throws InterruptedException {
	    
		page.ClickimplementationLink();
		Thread.sleep(1000);
	}

	@Then("The user is navigated to {string} page")
	public void the_user_is_navigated_to_page(String string) {
		String Title = page.getStackPageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
	    
	}

	@Given("The user is in {string} page")
	public void the_user_is_in_page(String string) {
	    
	    
	}

	@When("The user clicks on Stack Applications link")
	public void the_user_clicks_on_stack_applications_link() throws InterruptedException {
	    
		page.ClickApplicationLink();
		Thread.sleep(1000);
	}

	@Given("The user is in {string} and navigates to get {string} page")
	public void the_user_is_in_and_navigates_to_get_page(String string, String string2) {
	    
	    
	}

	@When("the user clicks on Practice Questions link on Stack representations page")
	public void the_user_clicks_on_practice_questions_link_on_stack_representations_page() throws InterruptedException {
		Thread.sleep(1000);
		page.ClickPracticeQuestionLink();
		Thread.sleep(1000);
		
	}

	@Then("The user is directed to {string} page")
	public void the_user_is_directed_to_page(String string) {
	    
		LoggerLoad.info("The user is in Practice page");
	}
}
