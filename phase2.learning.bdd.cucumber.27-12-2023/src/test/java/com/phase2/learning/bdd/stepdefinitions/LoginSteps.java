package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	// steps of the loginSample feature
	
	@Given("user on the login page")
	public void user_on_the_login_page() {
	    System.out.println("This step: user on the login page");
	}

	@Given("user inputs the email")
	public void user_inputs_the_email() {
	    // Write code here that turns the phrase above into concrete actions
		
		System.out.println("user inputs the email");
	    
	}

	

	@Given("user clicks the login button")
	public void user_clicks_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user clicks the login button");
	}

	@Then("user navigate to  My account")
	public void user_navigate_to(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user navigate to  My account");
	}
	
	@Given("user want to enter input with the valid credentials")
	public void user_want_to_enter_input_with_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user want to enter input with the valid credentials");
	}
	
	@When("user check for the email and password fields")
	public void user_check_for_the_email_and_password_fields() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user check for the email and password fields");
	}
	
	@When("user enters the following the input details")
	public void user_enters_the_following_the_input_details(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("user enters the following the input details");
	}
	
	@Given("user inputs the password")
	public void user_inputs_the_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user inputs the password");
	}
	
	@Then("error message with the wrong credentials")
	public void error_message_with_the_wrong_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("error message with the wrong credentials.");
	}
	
	@Then("user returns back on the login page")
	public void user_returns_back_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user returns back on the login page");
	}
	

}
