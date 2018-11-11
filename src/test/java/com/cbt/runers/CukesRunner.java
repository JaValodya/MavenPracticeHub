package com.cbt.runers;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports", //generates every time we run the cukes runner
				"json:target/cucumber.json",
				"junit:target/cucumber.xml"
		
		},
		
		//tags="@bla",
		features= {"src/test/resources/features"}, 
		glue= {"com/cbt/step_definitions"}
		//,dryRun = true
		)
public class CukesRunner {}
