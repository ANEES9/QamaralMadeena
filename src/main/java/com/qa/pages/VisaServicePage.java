package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VisaServicePage {

	static WebDriver driver;
	static Actions actions;
	static WebDriverWait wait;

	public VisaServicePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// =============================VisitVisa_Section================================

	@FindBy(xpath = "(//div[@class='card-content'])[1]/child::address")
	private static WebElement VisitVisaDescc;

	public static String retrieve_Description_From_VisitVisa_Section() {
		return VisitVisaDescc.getText();
	}

	// -------------------------------------------
	@FindBy(xpath = "(//*[contains(text(),'Contact Us')])[2]")
	private static WebElement ContactUSButton1;

	public static void Click_ContactUs_Button_in_VisitVisa_Section() {
		// action class for moving down the page
		Actions actions = new Actions(driver);
		WebElement cb1 = ContactUSButton1;
		actions.moveToElement(cb1).click().perform();
	}

	// =============================Visa Change By Air
	// Section================================

	@FindBy(xpath = "(//div[@class='card-content'])[2]/child::address")
	private static WebElement VisaChangeByAirDescc;

	public static String retrieve_Description_From_in_VisaChangeByAir_Section() {
		return VisaChangeByAirDescc.getText();
	}

	@FindBy(xpath = "(//*[contains(text(),'Contact Us')])[3]")
	private static WebElement ContactButton2;

	public static void Click_ContactUs_Button_in_VisaChangeByAir_Section() {
		// action class for moving down the page
		Actions actions = new Actions(driver);
		WebElement cb2 = ContactButton2;
		actions.moveToElement(cb2).click().perform();

	}

	// =============================Family Visa================================

	@FindBy(xpath = "(//div[@class='card-content'])[3]/child::address")
	private static WebElement FamilyVisaDescc;

	public static String retrieve_Description_From_FamilVisa_Section() {
		return FamilyVisaDescc.getText();
	}

	@FindBy(xpath = "(//*[contains(text(),'Contact Us')])[4]")
	private static WebElement ContactButton3;

	public static void Click_ContactUs_Button_in_FamilVisa_Section() {
		// action class for moving down the page
		Actions actions = new Actions(driver);
		WebElement cb3 = ContactButton3;
		actions.moveToElement(cb3).click().perform();

	}

	// =============================Visa Change By Bus
	// Section================================

	@FindBy(xpath = "(//div[@class='card-content'])[4]/child::address")
	private static WebElement VisaChangeByBusDescc;

	public static String retrieve_Description_From_VisaChangeByBus_Section() {
		return VisaChangeByBusDescc.getText();
	}

	@FindBy(xpath = "(//*[contains(text(),'Contact Us')])[5]")
	private static WebElement ContactButton4;

	public static void Click_ContactUs_Button_in_VisaChangeByBus_Section() {
		// action class for moving down the page
		Actions actions = new Actions(driver);
		WebElement cb4 = ContactButton4;
		actions.moveToElement(cb4).click().perform();

	}

	// ==============================Common close pop button
	// ===============================

	@FindBy(xpath = "(//*[contains(text(),'Contact Us')])[2]")
	private static WebElement closePopUpButton;

	public static void ClickOnclosePopUpButton() {

		// wait for loading
		wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.elementToBeClickable(VisaServicePage.closePopUpButton));

		// click on "X" Button to close pop up
		actions = new Actions(driver);
		WebElement eleeee3 = closePopUpButton;
		actions.moveToElement(eleeee3).click().perform();

	}

	// =============================================================



}
