package com.stepdefinitions;

import java.util.Arrays;
import java.util.List;

import org.testng.Assert;

import com.driverfactory.WebDriverFactory;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.USNewsPage;

import io.cucumber.java.en.*;

public class HomePageSteps {
	
	public HomePage homePage = new HomePage(WebDriverFactory.getDriver());
	public USNewsPage usNewsPage;
	public LoginPage loginPage;
	public String title;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	    WebDriverFactory.getDriver().get("https://www.nytimes.com/");
	}
	
	@Given("User clicks the login button")
	public void user_clicks_the_login_button() {
		homePage.clickLogin();
	}
	
	@Then("^User should verify the page title on Home Page as (.*)$")
	public void user_logins_successfully_and_is_on_home_page(String title) {
	    Assert.assertTrue(homePage.verifyPageTitle(title));
	}
	
	@When("^User logins to the application (.*) and (.*)$")
	public void user_logins_to_the_application(String emailId, String password) {
		loginPage = new LoginPage(WebDriverFactory.getDriver());
		loginPage.doLogin(emailId, password);
	}
	
	@Then("User should be able to verify the Navigation items in Home Screen")
	public void verifyNavItems() {
		List<String> expectedNavItemsLst = Arrays.asList("U.S.","World","Business","Arts","Lifestyle","Opinion","Audio","Games","Cooking","Wirecutter","The Athletic");
		List<String> actualNavItemsLst = homePage.getNavItemsLst();
		Assert.assertTrue(expectedNavItemsLst.equals(actualNavItemsLst));
	}
	
	@Given("User clicks on the search icon present at top left corner")
	public void clickSEarchIcon() {
		homePage.clickSearchBtn();
	}
	
	@Given("^User enters the search item in the search box opened (.*)$")
	public void enterSearchItem(String item) {
		homePage.enterSearchItem(item);
	}
	
	@Given("User mouse hovers on the U.S. Navigation Link")
	public void mouse_hover_US_Nav() {
		homePage.mouseHoverUSNav();
	}
	
	@Then("User clicks the U.S. section news under the U.S. Navigation Link")
	public void click_US_sec_under_US_Nav() {
		homePage.clickUSNavSec();
	}
	
	@Then("^User lands on the U.S. News page (.*)$")
	public void user_lands_on_US_News_Page(String pageTitle) {
		usNewsPage = new USNewsPage(WebDriverFactory.getDriver());
		Assert.assertTrue(usNewsPage.verifyPageTitle(pageTitle));
	}

}
