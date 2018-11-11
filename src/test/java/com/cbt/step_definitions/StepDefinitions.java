package com.cbt.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitions {

	@Given("Something")
	public void something() throws InterruptedException {
		//Thread.sleep(1000L);
	    System.out.println("Step 1.1");
	}

	@When("Something happens")
	public void something_happens() throws InterruptedException {
		//Thread.sleep(1000L);
		System.out.println("Step 1.22");
	}

	@Then("Resolt")
	public void resolt() throws InterruptedException {
		//Thread.sleep(1000L);
		System.out.println("Step 1.333");
	}

	@Given("Something else")
	public void something_else() throws InterruptedException {
		//Thread.sleep(1000L);
		System.out.println("Step 2.1");
	}

	@When("Something else happens")
	public void something_else_happens() throws InterruptedException {
		//Thread.sleep(1000L);
		System.out.println("Step 2.22");
	}

	@Then("Different resolt")
	public void different_resolt() throws InterruptedException {
		//Thread.sleep(1000L);
		System.out.println("Step 2.333");
	}

	
}
