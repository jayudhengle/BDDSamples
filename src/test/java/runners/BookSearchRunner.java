package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = ".//src//test//resources//features//UserLogin.feature",
		glue = {"stepDefs"},
		monochrome = true,
		dryRun = false,
		plugin = {"pretty",
				"html:target/Reports/HtmlReport.html",
//				"usage:target/Reports/UsageReport",
//				"json:target/Reports/JsonReport.json"
//				"rerun:target/FailedScenario.txt",
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}			
		)
public class BookSearchRunner extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel =true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
}
