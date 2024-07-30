package com.driverfactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {
		
	public static ThreadLocal<WebDriver> tLocal = new ThreadLocal<WebDriver>();
	
	/**
	 * 
	 * @param browserName
	 * @return WebDriver
	 */
	public WebDriver initDriver(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			tLocal.set(new ChromeDriver());
		} 
		else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			tLocal.set(new FirefoxDriver());
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			WebDriverManager.safaridriver().setup();
			tLocal.set(new SafariDriver());
		}else if(browserName.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			tLocal.set(new EdgeDriver());
		}
		
		else System.out.println("Please enter a valid browser name");
		
		getDriver().manage().window().maximize();		
		return getDriver();
		
	}
	
	public static synchronized WebDriver getDriver() {
		return tLocal.get();
	}

}
