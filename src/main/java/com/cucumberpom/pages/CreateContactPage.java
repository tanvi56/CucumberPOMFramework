package com.cucumberpom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberpom.base.BaseTest;

public class CreateContactPage extends BaseTest{
	@FindBy(name="first_name")
	WebElement firstName;

	@FindBy(name="last_name")
	WebElement lastName;
	
	@FindBy(xpath="//div[@name='company']/input")
	WebElement company;
	
	@FindBy(xpath="//div[@name='category' and  @role='listbox']")
	WebElement category;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveContact;
	
	public CreateContactPage(){
		PageFactory.initElements(driver, this);
	}
	
	public void saveContact(){
		firstName.sendKeys("John");
		lastName.sendKeys("Hawkins");
		company.sendKeys("FIS");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		saveContact.click();
	}
}
