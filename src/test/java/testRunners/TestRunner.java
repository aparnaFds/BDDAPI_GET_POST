package testRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.*;


import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features", 
		glue = {"stepDefinitions"}, 
		plugin= {"pretty","html:test-output/cucumber.html", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		monochrome = true,
		dryRun = false)
	//	tags = {"@REGRESSION"})
public class TestRunner {

}
