package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class addToCartSteps {
	
	@Given("User search the product the {string}")
	public void user_search_the_product_the(String string) {
	    System.out.println("User search the product the {string}");
	}

	@When("Add the Redmi Mobile product to the cart as it displays")
	public void add_the_redmi_mobile_product_to_the_cart_as_it_displays() {
		 System.out.println("Add the Redmi Mobile product to the cart as it displays");
	}

	@When("user clicks on the carts icon")
	public void user_clicks_on_the_carts_icon() {
		 System.out.println("user clicks on the carts icon");

	}

	@Then("user cart should display the added Redmi Mobile item")
	public void user_cart_should_display_the_added_redmi_mobile_item() {
		 System.out.println("user cart should display the added Redmi Mobile item");

	}



}
