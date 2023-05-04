package com.murali.selenium.automation.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.murali.selenium.automation.pages.HomePage;
import com.murali.selenium.automation.pages.LoginPage;
import com.murali.selenium.automation.pages.SearchResultsPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinitions {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	SearchResultsPage searchResultsPage;

	@Given("I am on the Home Page")
	public void i_am_on_the_home_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		loginPage = new LoginPage(driver);
		loginPage.navigateToHomePage();
	}

	@And("enter search item {string} in the search box")
	public void enter_search_item_in_the_search_box(String item) {
		homePage = new HomePage(driver);
		homePage.enterSearchItem(item);
	}

	@When("I click on Search Button")
	public void i_click_on_search_button() {
		homePage.clickOnSearchButton();
	}

	@Then("search details page to be displayed with search results")
	public void search_details_page_to_be_displayed_with_search_results() {
		searchResultsPage = new SearchResultsPage(driver);
		searchResultsPage.verifyItemDescription();
	}

	@When("I click on the item in the search result page")
	public void i_click_on_the_item_in_the_search_result_page() {

	}

}
