package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class UmrahPackagePage {
	
	WebDriver driver;
	
	public UmrahPackagePage(WebDriver driver) {
		
		this.driver = driver;
		
		PageFactory.initElements(driver,this);
		
	}

	
	@FindBy(xpath="//span[@class='highlight']")
	private WebElement UmrahText;
	
	public boolean verifyDisplayOfUmrahText() {
		
		return UmrahText.isDisplayed();
		
	}

	
}