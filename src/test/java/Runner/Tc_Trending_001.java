package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="F:\\Parallel Project\\ParallelProject\\Feature\\Search.feature",
		glue= {"Stepdefinitions"},
		dryRun=false,
		strict=true,
		monochrome=true,
		tags= {"@Endtoend","@TC_Trending_001"})
public class Tc_Trending_001 {

}
