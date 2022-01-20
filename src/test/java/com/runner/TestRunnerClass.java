package com.runner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Feature/Booking.feature"} ,glue = {"com.stepDefinition"}, dryRun = true,monochrome = true ,plugin = {"pretty","json:src/test/resources/Reports/outputfile.json"})
public class TestRunnerClass {

	
	@AfterClass
	public static void generateJVMReporting() {
		Reporting.generateReporting("C:\\Users\\ADMIN\\eclipse-workspace\\App\\src\\test\\resources\\Reports\\outputfile.json");

	}
}
