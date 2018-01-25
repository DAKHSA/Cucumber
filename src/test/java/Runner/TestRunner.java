package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/Feature/TagsFeatureOptionTesting.feature",
					glue = {"stepDefination"},
					dryRun = false,
					format= {"pretty","html:test_output/test.html","json:JSON_OUTPUT/cucumber.JSON","junit:junit_xml/cucumber.xml"},
					strict = false,
					monochrome = true
					)

public class TestRunner {
	
	public void testRunner() {
		
	}

}
