package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "src/test/resources/features",
		glue = {"Stepdefinition"},
		plugin = {"pretty", "html:target/cucmbber-reports.html"},
		monochrome = true
		)

public class Runners extends AbstractTestNGCucumberTests {

}
