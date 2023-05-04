package com.murali.selenium.automation.pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage {
	WebDriver driver;
	
	public SearchResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyItemDescription() {
		String value = driver.findElement(By.xpath("//*[contains(text(),'Z6 II Mirrorless Camera Z 24-70mm Lens with Additional Battery, Optical Zoom, Black')]")).getText();
		Assertions.assertEquals(value, "Nikon Z6 II Mirrorless Camera Z 24-70mm Lens with Additional Battery, Optical Zoom, Black");
	}

}
