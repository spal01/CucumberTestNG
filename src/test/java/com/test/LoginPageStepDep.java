package com.test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDep {
	@Given("I am on Login Page")
	public void iAmOnLoginPage() {
	System.out.println("I am on Login Page");	
	}
	
	@When("I enter valid username and password")
	public void enterValidUserCredential() {
		System.out.println("I enter valid username and password");		
	}
	@Then("I am able to login successfully")
	public void loginSuccessfully() {
		System.out.println("I am able to login successfully");		
	}
}
