package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
	features=".//Features/Login.feature",
	glue="stepDefinitions", //step definition package to be specified
	dryRun=false, // when its true it will once run a test to check whether steps and methods are in line
	monochrome=true, //clear cut output will be shown by removing all unnecessary 
	plugin= {"pretty","html:CucumberReports"}
			
	)

	public class TestRunner {

	}
