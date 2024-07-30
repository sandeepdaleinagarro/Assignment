package com.stepdefinitions;

import org.testng.Assert;

import com.driverfactory.WebDriverFactory;
import com.pages.SearchPage;

import io.cucumber.java.en.*;

public class SearchPageSteps {
	
	public SearchPage searchPage ;
	
	
	@Then("User is on Search Page")
	public void user_is_on_search_page() {
		searchPage = new SearchPage(WebDriverFactory.getDriver());
	}
	
	@Then("^User should verify the search Page Title (.*)$")
	public void verifyPageTitle(String title) {
		Assert.assertTrue(searchPage.verifyPageTitle(title));
	}

}
