package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.driverfactory.WebDriverFactory;
import com.utils.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private WebDriver driver;
	private WebDriverFactory driverFactory;
	private ConfigReader configRead;
	
	@Before(order = 0)
	public void setConfigProp() {
		configRead = new ConfigReader();
	}
	
	@Before(order = 1)
	public void launchBrowser() {
		String browser = configRead.getProperty("browser");
		driverFactory = new WebDriverFactory();
		driver = driverFactory.initDriver(browser);
	}
	
	@After(order = 0)
	public void quitBrowser() {
		driver.quit();
	}
	
	@After(order = 1)
	public void tearDown(Scenario scenario) {
		if(scenario.isFailed()) {
			String screenShot = scenario.getId();
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenShot);
		}
	}

}
