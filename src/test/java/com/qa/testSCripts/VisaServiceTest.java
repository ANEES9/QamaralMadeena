package com.qa.testSCripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;
import com.qa.pages.VisaServicePage;

import Base.TestBase;

public class VisaServiceTest extends TestBase {

	@BeforeClass
	public void setup() throws IOException {
		driver = initializeBrowser();
		driver.get(prop.getProperty("url"));

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
		softAssert.assertAll();
	}
	
	//=============================verify Title and desc================================

	@Test(priority = 1)
	public void verifyVisaPageTitle(){

		// Click on the VisaService link on Header menue
		homePages.ClickOnVisaServices();

		// check for the visit card Page Landings
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("visaURl"), "failed to Visa Services");
		Reporter.log("User clicked on the Visa Services");

		// Title verification
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("visaURl"), "failed to Visa Services");

	}
	
	//=============================verify Visit Visa================================

	@Test(priority = 2)
	public void verifyVisitVisa(){

		// check for the visit card description
		softAssert.assertEquals(VisaServicePage.retrieve_Description_From_VisitVisa_Section(),
				prop.getProperty("Expected_Desc_for_VisitVisa"), "failed to verifyVisitVisaCard services");

		// click on the contact US button in visit visa card.
		VisaServicePage.Click_ContactUs_Button_in_VisitVisa_Section();

		// Close the Pop Up
		VisaServicePage.ClickOnclosePopUpButton();
	}

	//=============================Visa Change By Air================================
	
	@Test(priority = 3)
	public void verifyVisaChangeByAir() {

		// check for the visit card description
		softAssert.assertEquals(VisaServicePage.retrieve_Description_From_in_VisaChangeByAir_Section(),
				prop.getProperty("Expected_Desc_for_VisaChangeByAir"), "failed to verifyVisaChangeByAir services");

		// click on the contact US button in visit visa card.
		VisaServicePage.Click_ContactUs_Button_in_VisaChangeByAir_Section();

		// Close the Pop Up
		VisaServicePage.ClickOnclosePopUpButton();
	}
	
	//=============================Family Visa================================

	@Test(priority = 4)
	public void verifyFamilyVisa(){

		// check for the visit card description
		softAssert.assertEquals(VisaServicePage.retrieve_Description_From_FamilVisa_Section(),
				prop.getProperty("Expected_Desc_for_FamilVisa"), "failed to Family visa services");

		// click on the contact US button in visit visa card.
		VisaServicePage.Click_ContactUs_Button_in_VisaChangeByAir_Section();

		// Close the Pop Up
		VisaServicePage.ClickOnclosePopUpButton();
	}
	
	//=============================Visa Change By Bus Section================================

	@Test(priority = 5)
	public void verifyVisaChangeByBus(){

		// check for the visit card description
		softAssert.assertEquals(VisaServicePage.retrieve_Description_From_VisaChangeByBus_Section(),
				prop.getProperty("Expected_Desc_for_VisaChangeByBus"), "failed to VisaChangeByBus services");

		// click on the contact US button in visit visa card.
		VisaServicePage.Click_ContactUs_Button_in_VisaChangeByAir_Section();

		// Close the Pop Up
		VisaServicePage.ClickOnclosePopUpButton();
	}

}
