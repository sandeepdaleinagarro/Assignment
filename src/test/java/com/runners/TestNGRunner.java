package com.runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features"}, glue = {"com.stepdefinitions" , "com.hooks"},
                 plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
                 publish = true)
public class TestNGRunner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
