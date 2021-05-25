package com.cucumberpom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class SignUpPage extends BaseTest {

	@FindBy(id = "email")
	WebElement email;
	
	@FindBy(id = "phone_number")
	WebElement phone;
	
	@FindBy(id = "terms")
	WebElement terms;
	
	@FindBy(name="action")
	WebElement singnUpBtn;
	
	@FindBy(partialLinkText = "Got an account? Log in here")
	WebElement logInHere;
	
	public SignUpPage() {
		PageFactory.initElements(driver, this);
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	public LoginPage signUpintoAccount() {
		
		email.sendKeys("tanvilonikar5@gmal.com");
		phone.sendKeys("978975357");
		terms.click();
		logInHere.click();
		
		return new LoginPage();
	}
	
}
