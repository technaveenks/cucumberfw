package com.murali.selenium.automation.pages;

import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		// PageFactory.initElements(driver, LoginPage.class);
	}

	public void navigateToHomePage() {
		driver.navigate().to("https://www.amazon.in");
	}

}
