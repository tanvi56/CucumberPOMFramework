package com.cucumber.stepdefinitionss;

import com.cucumberpom.base.BaseTest;
import com.cucumberpom.pages.ContactsPage;
import com.cucumberpom.pages.CreateContactPage;
import com.cucumberpom.pages.UserHome;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class HomePageSteps extends BaseTest {
	
	UserHome home = new UserHome();
	ContactsPage page = new ContactsPage();
	
	@When("^User clicks on Contact link$")
	public void user_clicks_on_Contact_link() {
		home.gotoContact();
	}

	@Then("^User is on Contact Page$")
	public void user_is_on_Contact_Page() {
		String title = home.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}

}
