package wooliesx.challenge.stepDefinations;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import wooliesx.challenge.core.TestBase;
import wooliesx.challenge.core.utilities.Configuration;

public class Hooks extends TestBase
{
	public Hooks(Configuration configuration) {
		super(configuration);
	}
	
	@Before("@CartTest")
	public void beforeTest(Scenario scenario)
	{
		// Setup Web driver
		setup(scenario);
	}
	
	@After("@CartTest")
	public void afterCartTest(Scenario scenario)
	{
		// Dispose Web Driver
		teardown(scenario, false);
	}
	
	@After("@OrderTest")
	public void afterOrderTest(Scenario scenario)
	{
		// Dispose Web Driver
		teardown(scenario, true);
	}
}
