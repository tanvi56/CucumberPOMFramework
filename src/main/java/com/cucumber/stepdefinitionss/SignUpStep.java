package com.cucumber.stepdefinitionss;

import com.cucumberpom.base.BaseTest;
import com.cucumberpom.pages.LandingPage;
import com.cucumberpom.pages.SignUpPage;

import cucumber.api.java.en.Then;

public class SignUpStep extends BaseTest{

	LandingPage landingPage = new LandingPage();
	SignUpPage signUpPage = new SignUpPage();
	
	@Then("^Signup FreeCRM Application$")
	public void signup_FreeCRM_Application() {
		landingPage.gotoSignUp();
		signUpPage.signUpintoAccount();
	}
}
