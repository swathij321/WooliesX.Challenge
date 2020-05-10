package wooliesx.challenge.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/wooliesx/challenge/features",
		glue = "wooliesx.challenge.stepDefinations", tags = {"@ApiTest"},
		dryRun = false,
		plugin = { "pretty", "html:target/cucumber",
					"json:target/cucumber.json" }
)
public class Runner {

}
