package com.murali.selenium.automation.tests;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Hooks {
	//Scenario Hooks
	
	@Before
	public void beforeHook() {
		System.out.println("Before Hooks");
	}
	
	//scenario parameter optional
	
	@After
	public void afterHook() {
		System.out.println("After Hooks");
	}
	
	//Step Hooks
	@BeforeStep
	public void beforeStep() {
		System.out.println(" Before Step ");
	}

	@AfterStep
	public void afterStep() {
		System.out.println(" After Step ");
	}
	
	//Global Hooks
	@BeforeAll
	public static void beforeAll() {
		System.out.println(" Before All");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println(" After All ");
	}
	
	
}
