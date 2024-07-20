package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class HomePages {

	WebDriver driver;

	public HomePages(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath = "//*[@class='navegation-items']//a[1]")
	private WebElement homeField;

	public void ClickOnHome() {	
		homeField.click();		
	}
	

	@FindBy(xpath = "//*[@class='navegation-items']//a[2]")
	private WebElement visaField;

	public void ClickOnVisaServices() {	
		visaField.click();		
	}
	
	@FindBy(xpath = "//*[@class='navegation-items']//a[3]")
	private WebElement UmrahField;

	public void ClickOnUmrahPackage() {	
		UmrahField.click();		
	}
	
	@FindBy(xpath = "//*[@class='navegation-items']//a[4]")
	private WebElement BusinessField;

	public void ClickOnBusinessSetup() {	
		BusinessField.click();		
	}
	
	@FindBy(xpath = "//*[@class='navegation-items']//a[5]")
	private WebElement blogField;

	public void ClickOnBlog() {	
		blogField.click();		
	}
	
	@FindBy(xpath = "//*[@class='navegation-items']//a[6]")
	private WebElement contactField;

	public void ClickOnContact() {	
		contactField.click();		
	}

}
