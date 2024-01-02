package com.phase2.learning.bdd.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import io.cucumber.datatable.DataTable;

public class staticResetLoginForm {
	
String driverPath="C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\drivers\\windows\\geckodriver.exe";
	
	String siteUrl="file:///C:/Users/Dell/eclipse-workspace/phase2.learning.bdd.cucumber.27-12-2023/src/main/resource/static/LoginSample.html";
	
	WebDriver driver;
	
	
	@Given("^Open the Chrome and launch the application$")
	public void open_the_chrome_and_launch_the_application() {
		 System.setProperty("webdriver.gecko.driver", driverPath);
		    driver = new FirefoxDriver();
		    driver.get(siteUrl);
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@Given("Maximize the Chrome browser window")
	public void maximize_the_chrome_browser_window() {
		driver.manage().window().maximize();
	}

	@When("Enter the Username and Password")
	public void enter_the_username_and_password(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		
		System.out.println("Login Credentials has been Entered to the form");
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		
		for(Map<String, String> user: data) {
			
			String userID= user.get("username");
			String pass=user.get("password");
			
			driver.findElement(By.id("email")).sendKeys(userID);
			driver.findElement(By.id("password")).sendKeys(pass);
			Thread.sleep(1000);
			driver.findElement(By.name("Reset")).click();
			
			
		}
		
	}

	@Then("Reset the credentials")
	public void reset_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
