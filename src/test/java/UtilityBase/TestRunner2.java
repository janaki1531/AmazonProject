package UtilityBase;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(
		features ="C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\amazonProject\\src\\test\\java\\FeatureFiles"
		,glue={"StepDefinitions"}
	
		)
 
public class TestRunner2 {
 
}
