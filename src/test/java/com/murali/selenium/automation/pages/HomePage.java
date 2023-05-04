package com.murali.selenium.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
		//PageFactory.initElements(driver,HomePage.class);
	}
	
	//locator
	@FindBy(id="twotabsearchtextbox")
	private WebElement _txtSearchBox;
	
	//actions / methods
	public void enterSearchItem(String item) {
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(item);
	}
	
	public void clickOnSearchButton() {
		driver.findElement(By.id("nav-search-submit-button")).click();
	}

}
