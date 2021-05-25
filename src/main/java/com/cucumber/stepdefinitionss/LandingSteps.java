package com.cucumber.stepdefinitionss;

import org.junit.Assert;

import com.cucumberpom.base.BaseTest;
import com.cucumberpom.pages.LandingPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LandingSteps extends BaseTest {
	LandingPage landingPage = new LandingPage();
	
	@Before
	public void openBrowser() {
		BaseTest.initBrowser();
	}
	
	@After 
	public void tearDown() { 
		driver.close(); 
	}
	 
	@Given("^User is on Application Landing Page$")
	public void user_is_on_Application_Landing_Page() {
		driver.get(prop.getProperty("ApplicationURL"));
		
	}

	@Then("^verify user is on Application Landing Page$")
	public void verify_user_is_on_Application_Landing_Page() {
		
		 String expectedTitle = "#1 Free CRM customer relationship management software cloud";
		 Assert.assertEquals(expectedTitle, landingPage.getTitle());
	}

}
