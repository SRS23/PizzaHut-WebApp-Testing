package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\pizzahutFeaures\\pizzahutOrderPlacing.feature",
		glue = {"stepDefinitions"} , tags="@Smoke", 
		plugin = {"pretty", "html:target/htmlreports/pizzahutorder.html"
				}
		)
public class TestRunner {

	
}
