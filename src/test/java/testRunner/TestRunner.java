package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
	(
	features=".//Features/Login.feature",
	glue="stepDefinitions", //step definition package to be specified
	dryRun=false, // when its true it will once run a test to check whether steps and methods are in line
	monochrome=true, //clear cut output will be shown by removing all unnecessary 
	plugin= {"pretty","html:CucumberReports/cucumberreport1.html" ,
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"} //the reports to be stored
			
	)

	public class TestRunner {

	}
