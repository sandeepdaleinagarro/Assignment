package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class USNewsPage {
	
	private WebDriver driver;
	String title;
	
	
	public USNewsPage(WebDriver driverReceived) {
		this.driver = driverReceived;
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifyPageTitle(String title) {
		return driver.getTitle().trim().equals(title.trim());
	}

}
