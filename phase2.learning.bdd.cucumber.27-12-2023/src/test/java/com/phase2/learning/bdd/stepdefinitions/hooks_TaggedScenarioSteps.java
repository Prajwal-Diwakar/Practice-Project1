package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks_TaggedScenarioSteps {
	
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		 System.out.println("This is steps 1");;
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		 System.out.println("This is steps 2");;
	}

	@When("I complete action")
	public void i_complete_action() {
		 System.out.println("This is steps 3");;
	}

	@When("some other action")
	public void some_other_action() {
		 System.out.println("This is steps 4");;
	}

	@When("yet another action")
	public void yet_another_action() {
		 System.out.println("This is steps 5");;
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
		 System.out.println("This is steps 6");;
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
		 System.out.println("This is steps 7");;
	}

}
