Feature: Test Free CRM Web Application

Scenario: Verify Application Landing Page
	Given User is on Application Landing Page 
	Then verify user is on Application Landing Page
	
Scenario: Application SignUp
	Given User is on Application Landing Page 
	Then Signup FreeCRM Application
	
Scenario: Application Login
	Given User is on Application Landing Page 
	Then Login FreeCRM Application
	Then User is on User Home Page
	
Scenario: Go to Contact Page
	Given User is on Application Landing Page 
	And Login FreeCRM Application
	And User is on User Home Page
	When User clicks on Contact link 
	Then User is on Contact Page 

Scenario: Create new contact
	Given User is on Application Landing Page 
	And Login FreeCRM Application
	And User is on User Home Page
	And User clicks on Contact link 
	When User click on create button 
	Then User Enters data and creates contact 