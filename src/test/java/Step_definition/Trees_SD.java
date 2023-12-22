package Step_definition;
import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;

import Page_object.Trees_Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilities.ExcelReader;
import utilities.LoggerLoad;
import utilities.configReader;

public class Trees_SD {
	
	Trees_Page treepage = new Trees_Page();
	String Excelpath = configReader.getexcelfilepath();
	static String username;
	static String password;
	static String message;
	static String pythoncode;
	static String pythonmessage;
	
	@Given("The user is on the Home page after login with cred {string} and {int}")
	public void the_user_is_on_the_home_page_after_login_with_cred_and(String sheetname, Integer rownumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(Excelpath, sheetname);
		username = testdata.get(rownumber).get("username");
		password = testdata.get(rownumber).get("password");
		message = testdata.get(rownumber).get("expectedmessage");

		LoggerLoad.info("User Enter username as \" " + username + " \"and Password as \" " + password + "\" ");
		if (username != null || password != null)
			treepage.getlogin(username, password);
	}
	
	@When("The user selects Tree item from the drop down menu")
	public void the_user_selects_tree_item_from_the_drop_down_menu() throws InterruptedException {
		treepage.clickOnGetStartInTreePage();
		Thread.sleep(1000);
	}

	@Then("The user should be directed to the {string} Page")
	public void the_user_should_be_directed_to_the_page(String string) {
	   
		LoggerLoad.info("User redirected to Tree Data Structure Page ");
		String Title = treepage.getTreePageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
		assertEquals(Title,"Tree", "Title do not match");
	}
	
	@Given("The user is on the {string} after logged in")
	public void the_user_is_on_the_after_logged_in(String string) {
		String Title = treepage.getTreePageTitle();
		LoggerLoad.info("Title of current page is : " + Title);

	}

	@When("The user clicks on the Overview of Trees link")
	public void the_user_clicks_on_the_overview_of_trees_link() {
		LoggerLoad.info("Rini before");
		treepage.clickOnoverviewOfTreesPage();
		LoggerLoad.info("Rini after");
	}

	@Then("The user should be directed to the {string} of tree Page")
	public void the_user_should_be_directed_to_the_of_tree_page(String string) {
	   
		String Title = treepage.getTreePageTitle();
		LoggerLoad.info("Title of current page is : " + Title);
;
	}

	@When("The user clicks {string} button in a {string} page")
	public void the_user_clicks_button_in_a_page(String string, String string2) {
	   
		treepage.clickTryHereLink();
		LoggerLoad.info("User clicks Try here Button");
	}

	@Then("The user should be redirected to a page having tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_try_editor_with_a_run_button_to_test() {
	   
		String Title = treepage.getTreePageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
	}

	@Given("The user is in trees page having an tryEditor with a Run button to test")
	public void the_user_is_in_trees_page_having_an_try_editor_with_a_run_button_to_test() {
	    
		String Title = treepage.getTreePageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
	}

	@When("The user gets input from sheet {string} and {int} in trees")
	public void the_user_gets_input_from_sheet_and_in_trees(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
	   
		ExcelReader reader1 = new ExcelReader();
		List<Map<String, String>> pythondata = reader1.getData(Excelpath,sheetname);
		String pythoncode = pythondata.get(rownumber).get("Code");
		String pythonmessage = pythondata.get(rownumber).get("Result");
		LoggerLoad.info("User types python code as :" + pythoncode);
		if (pythoncode != null)
		treepage.TryHereEditor(pythoncode);
	    
	}

	@When("The user clicks on Run button after Entering valid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_valid_python_code_in_trees_try_editor() {
	   
		treepage.NavigateBackToPreviousPage(); 
	}

	@Then("The user should be presented with Run output for trees")
	public void the_user_should_be_presented_with_run_output_for_trees() {
	    
		treepage.clickTryHereLink();
		LoggerLoad.info("User clicks Try here Button again");

	}

	@When("The user gets invalid input from sheet {string} and {int} in trees")
	public void the_user_gets_invalid_input_from_sheet_and_in_trees(String sheetname, Integer rownumber) throws InvalidFormatException, IOException, InterruptedException {
	   
		ExcelReader reader1 = new ExcelReader();
		List<Map<String, String>> pythondata = reader1.getData(Excelpath,sheetname);
		pythoncode = pythondata.get(rownumber).get("Code");
		pythonmessage = pythondata.get(rownumber).get("Result");
		LoggerLoad.info("User types python code as :" + pythoncode);
		if (pythoncode != null)
		treepage.TryHereEditor(pythoncode);
		String Alerttext = treepage.GetAlert();
		treepage.AcceptAlert();
		LoggerLoad.info("Error message is  :" + Alerttext);
	}

	@When("The user clicks on Run button after Entering invalid python code in trees tryEditor")
	public void the_user_clicks_on_run_button_after_entering_invalid_python_code_in_trees_try_editor() {
		
	}

	@Then("The user should get the error message for trees")
	public void the_user_should_get_the_error_message_for_trees() {
	   
		treepage.NavigateBackToPreviousPage();
		treepage.NavigateBackToPreviousPage(); 
	}

	@When("The user clicks on the Terminologies button")
	public void the_user_clicks_on_the_terminologies_button() {
	   
		treepage.clickOnTerminologiesLink();
	}

	@Then("The user should be redirected to a page having an tryEditor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   
		
	}

	@When("The user clicks on the Types of Trees button")
	public void the_user_clicks_on_the_types_of_trees_button() {
	   
		treepage.clickOnTypesOfTreesPage();
	}

	@When("The user clicks on the Tree Traversals button")
	public void the_user_clicks_on_the_tree_traversals_button() {
	    
		treepage.clickOnTreeTraversalsLink();
	}

	@When("The user clicks on the Traversal illustration button")
	public void the_user_clicks_on_the_traversal_illustration_button() {
	  
		treepage.clickOnTrav_illus_Link();
	}

	@When("The user clicks on the binary trees button")
	public void the_user_clicks_on_the_binary_trees_button() {
	    
		treepage.clickOnBinaryTreesLink();
	}

	@When("The user clicks on the types of binary trees button")
	public void the_user_clicks_on_the_types_of_binary_trees_button() {
	   
		treepage.clickOnTypesOfBTLink();
	}

	@When("The user clicks on the Implementation in Python button")
	public void the_user_clicks_on_the_implementation_in_python_button() {
	   
		treepage.click_implementationinPython();
	}

	@When("The user clicks on the binary tree traversals button")
	public void the_user_clicks_on_the_binary_tree_traversals_button() {
	    
		treepage.click_binaryTreeTraversals();
	}

	@When("The user clicks on the Implementation of Binary Trees button")
	public void the_user_clicks_on_the_implementation_of_binary_trees_button() {
	   
		treepage.click_implementationOfBinaryTrees();
	}

	@When("The user clicks on the Applications of Binary Trees button")
	public void the_user_clicks_on_the_applications_of_binary_trees_button() {
	  
		treepage.click_applicationsOfBinaryTrees();
	}

	@When("The user clicks on the Binary Search Trees button")
	public void the_user_clicks_on_the_binary_search_trees_button() {
		
		treepage.click_binarySearchTrees();
	} 

	@When("The user clicks on the Implementation of BST button")
	public void the_user_clicks_on_the_implementation_of_bst_button() {
	   
		treepage.click_implementationOfBST();
	}

	@When("The user clicks on the Practice Questions in Overview of Trees")
	public void the_user_clicks_on_the_practice_questions_in_overview_of_trees() {
	   
		treepage.click_practiceQuestion();
	}

	@Then("The user should be directed to Practice Questions of tree page Page")
	public void the_user_should_be_directed_to_practice_questions_of_tree_page_page() {
	    
		String Title = treepage.getTreePageTitle();
		LoggerLoad.info("Title of current page is :" + Title);
		LoggerLoad.info("No questions found ");
	}



}
