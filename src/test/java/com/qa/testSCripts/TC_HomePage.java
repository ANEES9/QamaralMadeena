package com.qa.testSCripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.HomePages;

public class TC_HomePage extends TestBase {

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

	@Test(priority = 1)
	public void verifyNavigationMenue() {

		HomePages homePages = new HomePages(driver);
		// 1. Check user landed on the home page
		softAssert.assertEquals(driver.getTitle(), "QamarAlMadeena", "failed to laod");

		// 2. click on Visa page and assert

		homePages.ClickOnVisaServices();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("visaURl"), "failed to Visa Services");

		// 3. click on Umrah page and assert
		homePages.ClickOnUmrahPackage();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("umrahURL"), "failed to laod Umrah services");

		// 4. click on Business page and assert
		homePages.ClickOnBusinessSetup();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("businessURL"), "failed to Business services");

		// 5. click on Blog page and assert
		homePages.ClickOnBlog();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("blogURL"), "failed to Blog services");

		// 6. click on Contact page and assert
		homePages.ClickOnContact();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("contactURL"),
				"failed to laod contact services");

		// Navigate back to Home Page
		homePages.ClickOnHome();
	}

	@Test(priority = 2)
	public void verifyHer0WidgetMenue() {

		// Verify heading and tile
		HomePages homePages = new HomePages(driver);
		Assert.assertEquals(homePages.getHeroWidgetTitle(), "PACKAGE", "failed to laod Package text");

		// verify contact us button
		homePages.ClickOnContactUs();
	}

	@Test(priority = 3)
	public void verifyGrowExponentiallyMenue() throws InterruptedException {

		HomePages homePages = new HomePages(driver);

		// Scroll to the element using JavascriptExecutor
		scrollDownTo("GrowExponentioally");

		// Verify title & subtitle
		Assert.assertEquals(homePages.getTitleOfGrowExpSection(), "Growing", "failed to laod Package text");
		Assert.assertEquals(homePages.getSubTitleOfGrowExpSection(), "Exponentially", "failed to laod Package text");

		// verify all paragraph texts in counters
		verifyAllCounterSection();
	}

	@Test(priority = 4)
	public void verifyChooseYourPlaceMenue() {

		// Verify heading and tile

		// verify clicking on two Places
	}

	@Test(priority = 5)
	public void verifyUmrahToursMenue() {

		// Verify heading and tile

		// verify clicking on three offer packages
	}

	@Test(priority = 6)
	public void verifyBusinessEssentialsMenue() {

		// Verify heading and tile

		// verify clicking on three Business services
	}

	@Test(priority = 7)
	public void verifyVisaServicesMenue() {

	}

	@Test(priority = 8)
	public void verifyFooterMenue() {
		// Verify links
	}

	// ------------------- Extra methodss--------------------------

	public void verifyAllCounterSection() {
		HomePages homePages = new HomePages(driver);
		List<WebElement> counter = homePages.getlistOfAllCounters();
		for (WebElement ListOfCounter : counter) {
			System.out.println(ListOfCounter.getText());
			if (ListOfCounter.getText().equalsIgnoreCase("Business SetUp")) {
				Assert.assertTrue(true);
			} else if (ListOfCounter.getText().equalsIgnoreCase("Umrah Performed")) {
				Assert.assertTrue(true);

			} else if (ListOfCounter.getText().equalsIgnoreCase("Visa Services")) {
				Assert.assertTrue(true);

			} else if (ListOfCounter.getText().equalsIgnoreCase("International Awards")) {
				Assert.assertTrue(true);
			}
		}
	}

	public void scrollDownTo(String pageTitle) throws InterruptedException {
		HomePages homePages = new HomePages(driver);
		if (pageTitle.contains("GrowExponentioally")) {
			homePages.performAction();
			Thread.sleep(2000);
		} else if (pageTitle.contains("Choose Your Place")) {
			homePages.performAction();

		}

	}

}
