package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks_LogicalAndOrSteps {
	

@Given("On the Homepage")
public void on_the_homepage() {
   System.out.println("On the Homepage");
}

@When("I fill {string} with {string}")
public void i_fill_with(String string, String string2) {
	 System.out.println("I fill {string} with {string}");
}

@Then("I click {string}")
public void i_click(String string) {
	System.out.println("I click {string}");
}

@Then("I follow {string} link")
public void i_follow_link(String string) {
	System.out.println("I follow {string} link");
}

@Then("She follow {string} link")
public void she_follow_link(String string) {
	System.out.println("She follow {string} link");
}

@Then("He follow {string} link")
public void he_follow_link(String string) {
	System.out.println("He follow {string} link");
}

@Then("User follow {string} link")
public void user_follow_link(String string) {
	System.out.println("User follow {string} link");
}

@Given("The date is {int}-{int}-01T06:{int}:{int}")
public void the_date_is_01t06(Integer int1, Integer int2, Integer int3, Integer int4) {
	System.out.println("The date is {int}-{int}-01T06:{int}:{int}");
}

}
