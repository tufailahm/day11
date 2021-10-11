package com.selenium.training.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginValidate {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("inside - user_is_on_login_page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside - user_enters_username_and_password");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside - clicks on login button");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside - user_is_navigated_to_the_home_page");

	}
}
