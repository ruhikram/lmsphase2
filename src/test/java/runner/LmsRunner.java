package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;


@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
		plugin = {"pretty",
				"html:target/cucumber-report/cucumber.html"}, //reporting purpose
		monochrome=true,  //console output
		//tags = "@GetStarted", //tags from feature file
		features = "src/test/resources/Features", //location of feature files
		glue= {"stepDefinitions","AppHooks"})	

public class LmsRunner {

}
