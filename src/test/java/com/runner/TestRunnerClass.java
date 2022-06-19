package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reporting.Reporting;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources", glue = { "com.stepdefinition" }, monochrome = true, plugin = {
		"pretty",
		"json:C:\\Users\\pc\\eclipse-workspace\\CucumberClass\\src\\test\\resources\\Reports\\output.json" }, dryRun = false, snippets = SnippetType.CAMELCASE, strict = true)
public class TestRunnerClass {
	@AfterClass
	public static void afterClass() {
		Reporting.generateJvmReport(System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\output.json");

	}
}
