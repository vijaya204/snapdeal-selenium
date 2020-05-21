package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
		features="F:\\Parallel Project\\ParallelProject\\Feature\\Login1.feature",
		glue= {"Stepdefinitions"},
		dryRun=false,
		strict=true,
		monochrome=true
		)
public class Tc_Login_001   {
	

}
