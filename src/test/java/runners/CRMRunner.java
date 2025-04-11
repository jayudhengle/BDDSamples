package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = ".//src//test//resources//taggedFeatures", glue = { "stepDefs" }, monochrome = true,
//		tags = "@SmokeTest"
//		tags = "@SmokeTest and @RegressionTest"
//		tags = "@SmokeTest or @RegressionTest"
//		tags = "not @SmokeTest and not @RegressionTest"
//		tags = "@PhaseOne and @RegressionTest"  
//		tags = "@PhaseOne and not @RegressionTest or @PhaseTwo and not@RegressionTest"   
		tags = "@PhaseTwo and @RegressionTest or @PhaseTwo and @SmokeTest"    

)

public class CRMRunner extends AbstractTestNGCucumberTests {

}
