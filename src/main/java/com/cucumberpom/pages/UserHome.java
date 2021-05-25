package com.cucumberpom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class UserHome extends BaseTest {

	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contact;
	
	public UserHome() {
		PageFactory.initElements(driver, this);
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	
	public ContactsPage gotoContact() {
		contact.click();
		return new ContactsPage();
	}
	
}
