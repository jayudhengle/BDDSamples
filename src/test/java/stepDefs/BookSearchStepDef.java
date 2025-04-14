package stepDefs;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BookSearchStepDef {
	
	WebDriver driver;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   driver.manage().window().maximize();
	   driver.get("https://danube-webshop.herokuapp.com/");
	   
	}
	@When("User serach Novel & Stories")
	public void user_serach_novel_stories() {
		driver.findElement(By.xpath("//a[contains(text(), 'Novel')]")).click();
	    
	}
	@Then("Should display novel search result")
	public void should_display_novel_search_result() {
	    String url = driver.getCurrentUrl();
		assertTrue(url.contains("novel"));
	}
	
	@When("User serach Crime")
	public void user_serach_crime() {
		driver.findElement(By.xpath("//a[contains(text(), 'Crime')]")).click();
	}
	@Then("Should display crime search result")
	public void should_display_crime_search_result() {
		String url = driver.getCurrentUrl();
		assertTrue(url.contains("crime1"));
	}
	
	@After
	public void attchScreenshot(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			TakesScreenshot scr = (TakesScreenshot)driver;
			byte[] img = scr.getScreenshotAs(OutputType.BYTES);
			scenario.attach(img, "image/png", "FailedScenarioImage");
		}
	}
}
