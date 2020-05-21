package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions (
		features="F:\\Parallel Project\\ParallelProject\\Feature\\Register2.feature" ,
		glue= {"Stepdefinitions"},
		dryRun = false,
		monochrome = true
		)
public class Tc_Register_002  {
	}


