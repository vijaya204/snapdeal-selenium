package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions (
		features="F:\\Parallel Project\\ParallelProject\\Feature\\Login1.feature",
		glue= {"Stepdefinitions"},
		dryRun=false,
		strict=true,
		monochrome=true,
		tags= {"@Login","@Tc_Login_002"}
		)
public class Tc_Login_002  {
	

}
