
package Runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)

@CucumberOptions(
features = { "src/test/resources/Features" }, // location of feature files
glue = { "Step_definition" }) // location of step definition files
public class TestRunner extends AbstractTestNGCucumberTests {
	
	
}	

