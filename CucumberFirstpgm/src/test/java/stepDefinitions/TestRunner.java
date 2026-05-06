package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
	features="src/test/java/FeatureFiles/CucumberDataTable.feature",
	glue = {"stepDefinitions"},
	tags= "@table",
	dryRun=false,
	monochrome=false,
	plugin = {"pretty","html:target/HtmlReport/index.html"}
	
		
		
		)





public class TestRunner {
	
	
	
	
	
}
