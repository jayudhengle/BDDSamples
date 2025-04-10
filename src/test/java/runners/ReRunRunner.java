package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "@target/FailedScenario.txt",
		glue = {"stepDefs"},
		monochrome = true,
		plugin = {"pretty",
				"html:target/Reports/HtmlReport.html",
//				"usage:target/Reports/UsageReport",
//				"json:target/Reports/JsonReport.json"
				"rerun:target/FailedScenario.txt"
})


public class ReRunRunner extends AbstractTestNGCucumberTests {
	
}
