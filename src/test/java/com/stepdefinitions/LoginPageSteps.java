package com.stepdefinitions;

import com.driverfactory.WebDriverFactory;
import com.pages.LoginPage;

import io.cucumber.java.en.*;

public class LoginPageSteps {
	
	public LoginPage loginPage;
	
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		loginPage = new LoginPage(WebDriverFactory.getDriver());
	}
	
	@Given("^User enters the email id (.*)$")
	public void user_enters_the_email_id(String emailId) {
		loginPage.enterEmail(emailId);
	}
	
	@Given("User clicks the continue button")
	public void user_clicks_the_continue_button() {
		loginPage.clickContinue();
	}
	
	@Given("^User enters the password (.*)$")
	public void user_enters_the_password_sandeep(String password) {
	    loginPage.enterPassword(password);
	}
	
	@Given("user clicks the login button on Login Page")
	public void user_clicks_the_login_button_on_login_page() {
	    loginPage.clickLogin();
	}
	
	@When("User clicks the continue without subscription button")
	public void user_clicks_the_continue_without_subscription_button() {
		loginPage.clickContinueWIthoutSubscription();
	}

}
