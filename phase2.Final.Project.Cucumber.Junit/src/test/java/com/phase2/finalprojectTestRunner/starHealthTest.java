package com.phase2.finalprojectTestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\phase2.Final.Project\\src\\test\\resource\\features\\starhealth.feature", 
				glue= {"com\\phase2\\finalproject\\stepDefinition"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/html/ExtentReport.html"})


public class starHealthTest {
	
	

}
