package com.pages;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//span[text() = 'Log in']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//nav[@data-testid = 'desktop-nested-nav']/ul/li/a")
	private List<WebElement> lstNavItems;
	
	@FindBy(xpath = "//button[@data-testid = 'search-button']")
	private WebElement btnSearch;
	
	@FindBy(xpath = "//input[@data-testid = 'search-input']")
	private WebElement inptSearchBox;
	
	@FindBy(xpath = "(//li[@data-testid = 'nav-item-U.S.']/a)[2]")
	private WebElement lnkUSNav;
	
	@FindBy(xpath = "(//ul[@aria-labelledby = 'U.S.-links-column-header']/li/a[text() = 'U.S.'])[2]")
	private WebElement lnkUSSec;
	
	public HomePage(WebDriver driverReceived) {
		this.driver = driverReceived;
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		btnLogin.click();
	}
	
	public boolean verifyPageTitle(String title) {
		return driver.getTitle().trim().equals(title.trim());
	}
	
	public List<String> getNavItemsLst() {
		List<String> actualNavItemsLst = new ArrayList<String>();
		for (WebElement ele : lstNavItems) {
			actualNavItemsLst.add(ele.getText());
		}
		
		return actualNavItemsLst;
	}
	
	public void clickSearchBtn() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnSearch));
		btnSearch.click();
	}
	
	public void enterSearchItem(String item) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@data-testid = 'search-input']")));
		inptSearchBox.clear();
		inptSearchBox.sendKeys(item,Keys.ENTER);
	}
	
	public void mouseHoverUSNav() {
		Actions action = new Actions(driver);
		action.moveToElement(lnkUSNav).perform();
	}
	
	public void clickUSNavSec() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(lnkUSSec));
		lnkUSSec.click();
	}

}
