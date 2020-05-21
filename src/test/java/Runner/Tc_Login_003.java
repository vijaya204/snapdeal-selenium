package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions (
		features="F:\\Parallel Project\\ParallelProject\\Feature\\Login3.feature",
		glue= {"Stepdefinitions"},
		dryRun= false,
		strict=true,
		monochrome=true
		)
public class Tc_Login_003  {
	

}
