package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;

public class hooksSteps {
	
	@After
	@Given("After scenario")
	public void after_scenario() {
	    System.out.println(" After hook is executed");
	}
	
	@Before

	@Given("Before scenario")
	public void before_scenario() {
		 System.out.println(" Before hook is executed");
	}



}
