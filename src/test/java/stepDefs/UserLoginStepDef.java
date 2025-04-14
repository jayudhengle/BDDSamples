package stepDefs;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeOptions;

public class UserLoginStepDef 
{
	WebDriver driver;
	ChromeOptions options;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {

		options = new ChromeOptions();
		options.addArguments("--incognito");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://the-internet.herokuapp.com/login");
	    
	}
	
//	@When("User enters credentials")
//	public void user_enters_credentials(DataTable userData) {
//		List<List<String>> data = userData.asLists();
//		
//		String stringUser = data.get(0).get(0);
//		String stringPass = data.get(0).get(1);
//		
//		driver.findElement(By.id("username")).sendKeys(stringUser);
//		driver.findElement(By.id("password")).sendKeys(stringPass);
//		driver.findElement(By.className("radius")).click();
//	}
	
	
	@When("User enters credentials")
	public void user_enters_credentials(DataTable userData) {
		List<Map<String, String>> data = userData.asMaps();
		
		String stringUser = data.get(0).get("username");
		String stringPass = data.get(0).get("password");
		
		driver.findElement(By.id("username")).sendKeys(stringUser);
		driver.findElement(By.id("password")).sendKeys(stringPass);
		driver.findElement(By.className("radius")).click();
	}
	
	@Then("should display sucess message")
	public void should_display_sucess_message(DataTable userData) {
		List<List<String>> msgList = userData.asLists();
		
		String strMsg = msgList.get(0).get(0);

		boolean isUserValid =driver.findElement(
				By.xpath("//div[contains(text(), '" + strMsg + "')]")).isDisplayed();
		assertTrue(isUserValid);
	    
	}
}
