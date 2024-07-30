package com.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	private WebDriver driver;
	
	@FindBy(css = "#email")
	private WebElement inptEmail;
	
	@FindBy(xpath = "//button[text() = 'Continue']")
	private WebElement btnContinue;
	
	@FindBy(css = "#password")
	private WebElement inptPassword;
	
	@FindBy(xpath = "//button[text() = 'Log In']")
	private WebElement btnLogin;
	
	@FindBy(xpath = "//a[@data-testid = 'continue-button']")
	private WebElement btnContinueWithoutSubscription;
	
	public LoginPage(WebDriver driverReceived) {
		this.driver = driverReceived;
		PageFactory.initElements(driver, this);
	}
	
	public void enterEmail(String emailId) {
		inptEmail.clear();
		inptEmail.sendKeys(emailId);
	}
	
	public void clickContinue() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnContinue));
		btnContinue.click();
	}
	
	public void enterPassword(String password) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#password")));
		inptPassword.clear();
		inptPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnLogin));
		btnLogin.click();
	}
	
	public void clickContinueWIthoutSubscription() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(btnContinueWithoutSubscription));
		btnContinueWithoutSubscription.click();
	}
	
	public void doLogin(String emailId, String password) {
		enterEmail(emailId);
		clickContinue();
		enterPassword(password);
		clickLogin();
		clickContinueWIthoutSubscription();
	}

}
