$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/cucumber/features/FreeCRMApplication.feature");
formatter.feature({
  "line": 1,
  "name": "Test Free CRM Web Application",
  "description": "",
  "id": "test-free-crm-web-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Verify Application Landing Page",
  "description": "",
  "id": "test-free-crm-web-application;verify-application-landing-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Application Landing Page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "verify user is on Application Landing Page",
  "keyword": "Then "
});
formatter.match({
  "location": "LandingSteps.user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LandingSteps.verify_user_is_on_Application_Landing_Page()"
});
formatter.result({
  "status": "skipped"
});
});