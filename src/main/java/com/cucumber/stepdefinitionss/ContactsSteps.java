package com.cucumber.stepdefinitionss;

import com.cucumberpom.base.BaseTest;
import com.cucumberpom.pages.ContactsPage;
import com.cucumberpom.pages.CreateContactPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactsSteps extends BaseTest {
	
	ContactsPage page = new ContactsPage();
	CreateContactPage createContact = new CreateContactPage();

	@When("^User click on create button$")
	public void user_click_on_create_button() {
		page.createNewContact();
	}

	@Then("^User Enters data and creates contact$")
	public void user_Enters_data_and_creates_contact() {
		createContact.saveContact();
	}
}
