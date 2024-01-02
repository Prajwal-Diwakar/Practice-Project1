package phase2.practiceProject5.testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Dell\\eclipse-workspace\\phase2.practiceProject5.CucumberAmazonApp\\src\\test\\resource\\features\\amazonApp.feature", 
				glue= {"com\\phase2\\practiceProject5\\StepDefination"},
				plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:target/html/ExtentReport.html"})


public class amazonAppTestRunner {

}
