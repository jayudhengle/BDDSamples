package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
//	@BeforeAll
//	public static void setUpBrowser()
//	{
//		System.out.println("Before ALL scenarios!!!");
//	}
//	
//	@AfterAll
//	public static void closeBrowser()
//	{
//		System.out.println("After ALL scenarios!!!");
//
//	}
	
//	@Before("@SmokeTest")
//	public static void setUpDataSmoke()
//	{
//		System.out.println("Before EACH smoke scenarios!!!");
//	}
//	
//	@After("@SmokeTest")
//	public static void closeDBSmoke()
//	{
//		System.out.println("After EACH smoke scenarios!!!");
//	}
//	
//	@Before("@RegressionTest")
//	public static void setUpDataReg()
//	{
//		System.out.println("Before EACH reg scenarios!!!");
//	}
//	
//	@After("@RegressionTest")
//	public static void closeDBReg()
//	{
//		System.out.println("After EACH reg scenarios!!!");
//	}
	
	@Before(value= "@SmokeTest", order=2)
	public void setupDataSomke()
	{
		System.out.println("Data Set Up Smoke");
	}
	
	
	@Before(value = "@SmokeTest", order=1)
	public void readFromPropertySmoke()
	{
		System.out.println("Read From Property Smoke");
	}
	
	@Before(value = "@RegressionTest" ,order=2)
	public void setupDataReg()
	{
		System.out.println("Data Set Up reg");
	}
	
	
	@Before(value = "@RegressionTest", order=1)
	public void readFromPropertyReg()
	{
		System.out.println("Read From Property Reg");
	}
	
	
//	@Before(order=3)
//	public void initBrowset()
//	{
//		System.out.println("init Browset");
//	}
	
	

	@Given("User is logged in")
	public void user_is_logged_in() {
		System.out.println("User is logged in");
	}

	@When("User delete a Contacts")
	public void user_delete_a_contacts() {
		System.out.println("User delete a Contacts");
	}

	@When("User creates a new Tasks")
	public void user_creates_a_new_tasks() {
		System.out.println("User creates a new Tasks");
	}

	@When("User delete a Tasks")
	public void user_delete_a_tasks() {
		System.out.println("User delete a Tasks");
	}

	@When("User view  Tasks details")
	public void user_view_tasks_details() {
		System.out.println("User view  Tasks details");
	}

	@When("User creates a new Deals")
	public void user_creates_a_new_deals() {
		System.out.println("User creates a new Deals");
	}

	@When("User creates a new Contacts")
	public void user_creates_a_new_contacts() {
		System.out.println("User creates a new Contacts");
	}

	@When("User delete a Deals")
	public void user_delete_a_deals() {
		System.out.println("User delete a Deals");
	}

	@When("User view  Deals details")
	public void user_view_deals_details() {
		System.out.println("User view  Deals details");
	}

	@When("User view  Contacts details")
	public void user_view_contacts_details() {
		System.out.println("User view  Contacts details");
	}
}
