package com.cucumber.stepdefinitionss;

import com.cucumberpom.base.BaseTest;
import com.cucumberpom.pages.LandingPage;
import com.cucumberpom.pages.LoginPage;
import com.cucumberpom.pages.UserHome;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class LoginSteps extends BaseTest {
	
	
	LoginPage loginPage= new LoginPage();
	UserHome userHome = new UserHome();
	LandingPage landingPage = new LandingPage();
	
	@Then("^Login FreeCRM Application$")
	public void login_FreeCRM_Application() {
		landingPage.gotoLogin();
		
	}

	@SuppressWarnings("deprecation")
	@Then("^User is on User Home Page$")
	public void user_is_on_User_Home_Page() {
		loginPage.doLogin();
		String title = loginPage.getTitle();
		Assert.assertEquals(title, "Cogmento CRM");
	}
	
}
