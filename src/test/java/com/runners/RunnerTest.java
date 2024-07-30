package com.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@CucumberOptions(features = {"src/test/resources/features/nav.feature"}, glue = {"com.stepdefinitions" , "com.hooks"},
				plugin = {"pretty" , "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, 
				publish = true)
@RunWith(Cucumber.class)
public class RunnerTest {

}
