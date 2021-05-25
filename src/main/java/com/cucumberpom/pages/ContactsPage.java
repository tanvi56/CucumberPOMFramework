package com.cucumberpom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class ContactsPage extends BaseTest{
	
	@FindBy(xpath = "//a[@href='/contacts/new']")
	WebElement createContactBtn;
	
	public ContactsPage() {
		PageFactory.initElements(driver, this);
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	
	public CreateContactPage createNewContact() {
		createContactBtn.click();
		return new CreateContactPage();
	}
}
