package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\Parallel Project\\ParallelProject\\Feature\\Reviews.feature",
		glue= {"Stepdefinitions"},
		dryRun=false,
		strict=true,
		monochrome=true,
		plugin= {"pretty","html:test-output"},
		tags= {"@Tc_Reviews_001"})
public class Tc_Reviews_001 {

}
