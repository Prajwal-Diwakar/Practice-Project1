package com.phase2.learning.bdd.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooks_TagsSteps {
	
	@Given("Open the chrome browser")
	public void open_the_chrome_browser() {
	    System.out.println("Open the chrome browser");
	}
	
	@When("user on the home page of the amazonPage")
	public void user_on_the_home_page_of_the_amazonPage() {
		System.out.println("user on the home page of the amazon");
	}

	

	@When("user on the home page of the flipkart")
	public void user_on_the_home_page_of_the_flipkart() {
		System.out.println("validating the current page url");
	}

	@When("user on the home page of the facebook")
	public void user_on_the_home_page_of_the_facebook() {
		System.out.println("user on the home page of the facebook");
	}

	@When("user on the home page of the simplilearn")
	public void user_on_the_home_page_of_the_simplilearn() {
		System.out.println("user on the home page of the simplilearn");

	}
    
	@Then("validating the current page url")
	public void validating_the_current_page_url() {
		 System.out.println("validating the current page url");
	}
	
	
	@Before
    public void beforeScenario(){
        System.out.println("This will run before the every Scenario");
    }
 
@After
    public void afterScenario(){
        System.out.println("This will run after the every Scenario");
    }
 
@Before("@FirstTag")
    public void beforeFirst(){
        System.out.println("This will run only before the First Scenario");
    }
 
@Before("@SecondTag")
    public void beforeSecond(){
        System.out.println("This will run only before the Second Scenario");
    }
 
@Before("@ThirdTag")
    public void beforeThird(){
        System.out.println("This will run only before the Third Scenario");
        
    }

@Before("@FourthTag")
public void beforeFourth(){
    System.out.println("This will run only before the Third Scenario");
    
}
 
@After("@FirstTag")
    public void afterFirst(){
        System.out.println("This will run only after the First Scenario");  
    }
 
@After("@SecondTag")
    public void afterSecond(){
        System.out.println("This will run only after the Second Scenario");  
    }
 
@After("@ThirdTag")
     public void afterThird(){
        System.out.println("This will run only after the Third Scenario");  
    }

@After("@FourthTag")
public void afterFourth(){
   System.out.println("This will run only after the Fourth Scenario");  
}





}
