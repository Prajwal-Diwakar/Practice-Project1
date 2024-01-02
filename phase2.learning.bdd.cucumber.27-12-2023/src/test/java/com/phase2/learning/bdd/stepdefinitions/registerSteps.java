package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class registerSteps {
	
	
	@Given("user on the homepage")
	public void user_on_the_homepage() {
	   System.out.println("Step: user on the homepage");
	}

	@Given("user follows register button")
	public void user_follows_button(String string) {
		 System.out.println("user follows register button");
	}

	@Given("user should be on the registration page")
	public void user_should_be_on_the_registration_page() {
		 System.out.println("user should be on the registration page");
	}

	@When("user fills the email with .@gmail.com")
	public void user_fills_the_email_with_gmail_com() {
		 System.out.println("user fills the email with .@gmail.com");
	}

	@When("user fills the email")
	public void user_fills_the_email() {
		 System.out.println("user fills the email");
	}

	@When("user fills the first and last name")
	public void user_fills_the_first_and_last_name() {
		System.out.println("user fills the first and last name");
	}

	@When("user enters the password.")
	public void user_enters_the_password() {
		System.out.println("user enters the password.");
	}

	@When("user enters the confirm password.")
	public void user_enters_the_confirm_password() {
		System.out.println("user enters the confirm password.");
	}

	@When("user clicks the register button.")
	public void user_clicks_the_register_button() {
		System.out.println("user clicks the register button.");
	}

	@Then("user is created the successfully.")
	public void user_is_created_the_successfully() {
		System.out.println("user is created the successfully.");
	}

	@Then("user return back on the registration page")
	public void user_return_back_on_the_registration_page() {
		System.out.println("user is created the successfully.");
	}

	@When("user inputs the invalid credentials")
	public void user_inputs_the_invalid_credentials() {
		System.out.println("user inputs the invalid credentials");
	}

	@Then("user got the error message")
	public void user_got_the_error_message() {
		System.out.println("user got the error message");
	}

	@Then("user went back to the register page")
	public void user_went_back_to_the_register_page() {
		System.out.println("user went back to the register page");
	}



}
