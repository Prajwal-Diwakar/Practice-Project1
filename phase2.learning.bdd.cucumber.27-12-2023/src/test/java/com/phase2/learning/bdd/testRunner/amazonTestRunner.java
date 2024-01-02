package com.phase2.learning.bdd.testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\phase2.learning.bdd.cucumber.27-12-2023\\src\\test\\resource\\Features\\staticAmazonProductSearch.feature", 
	glue = {"com/phase2/learning/bdd/stepdefinitions"},
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/html/ExtentReport.html"})

public class amazonTestRunner {

}
