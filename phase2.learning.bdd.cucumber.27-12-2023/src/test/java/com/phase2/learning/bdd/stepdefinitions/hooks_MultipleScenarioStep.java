package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks_MultipleScenarioStep {
	
	@Given("user on the Homepage")
	public void user_on_the_homepage() {
	    System.out.println("This is the step 1");
	}

	@Given("user follows {string}")
	public void user_follows(String string) {
		System.out.println("This is the step 2");
	}

	@Given("user fills {string} with {string}")
	public void user_fills_with(String string, String string2) {
		System.out.println("This is the step 3");
	}

	@Given("user click {string}")
	public void user_click(String string) {
		System.out.println("This is the step 4");
	}

	@Then("user should see {string} heading line")
	public void user_should_see_heading_line(String string) {
		System.out.println("This is the step 5");
	}

	
	

	@Then("user clicks {string} icon")
	public void user_clicks_icon(String string) {
		System.out.println("This is the step 7");
	}

	@Then("user enter following details")
	public void user_enter_following_details(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("This is the step 8");
	}

	



}
