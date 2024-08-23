package runnerfile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="src/test/resources/feature",
		glue="stepdefinitions",
		dryRun=true
		
		
		)


public class Runner {

}
