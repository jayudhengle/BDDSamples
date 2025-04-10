package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {

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
