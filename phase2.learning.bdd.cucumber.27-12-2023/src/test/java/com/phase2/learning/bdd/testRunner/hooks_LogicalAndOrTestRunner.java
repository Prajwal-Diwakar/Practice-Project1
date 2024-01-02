package com.phase2.learning.bdd.testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)
@CucumberOptions(
		          features="src/test/resource/Features/hooks_LogicalAndOr.feature", 
                  glue= {"com/phase2/learning/bdd/step_definitions"},
                  
                  
                  //tags = "@basicsearch and @smoke"
                  tags= "@basicsearch or @smoke",
                  plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/html/ExtentReport.html"})
                  

public class hooks_LogicalAndOrTestRunner {

}
