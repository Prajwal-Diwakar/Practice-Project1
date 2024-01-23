package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\Phase3.BDD_with_restAssured_using_Cucumber\\src\\test\\resource\\features\\get.feature", 
								glue = {"stepDefination"})
public class getTestRunner {
}
