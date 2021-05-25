package com.cucumberpom.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cucumberpom.base.BaseTest;

public class LandingPage extends BaseTest{

	@FindBy(xpath = "//a[@title='register on freecrm.com']")
	WebElement signupBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Log In')]/parent::a")
	WebElement loginBtn;
	
	public LandingPage() {
		PageFactory.initElements(driver, this);
	}
	public String getTitle(){
		return driver.getTitle();
	}
	
	public SignUpPage gotoSignUp() {
		signupBtn.click();
		return new SignUpPage();
	}
	
	public LoginPage gotoLogin() {
		loginBtn.click();
		return new LoginPage();
	}
}
