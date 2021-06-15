package com.qa.examples.cucumber_base.step_definitions;

import static org.junit.Assert.assertEquals;

import com.qa.examples.cucumber_base.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CanCalculateMultiplicationandDivision {
	
	private Calculator Calculator;
	private double actualResult;
	
	
	@Given("a New Calculator")
	public void aNewCalculator() {
		Calculator = new Calculator();
		
	}
	
	@When("Can the Calculator multiply {int} by {int}")
	public void canTheCalculatorMultiplyBy(Integer num1, Integer num2) {
		this.actualResult = Calculator.multiply(num1, num2);
		
	}
	
	@When("the Calculator divides {int} by {int}")
	public void theCalculatorDividesBy(Integer num1, Integer num2) {
		this.actualResult = Calculator.divide(num1, num2);
		
	}

	@Then("the answer should be {int}")
	public void theanswerShouldBe(Integer expectedResult) {
	    assertEquals(expectedResult.doubleValue(), actualResult, 2);
	 
	}
}
