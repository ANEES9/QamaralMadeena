package com.qa.testSCripts;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.qa.pages.HomePages;

public class TC_HomePage extends TestBase {

	public WebDriver driver;
	SoftAssert softAssert = new SoftAssert();

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
		softAssert.assertEquals(driver.getCurrentUrl(),prop.getProperty("visaURL"), "failed to laod");

		// 3. click on Umrah page and assert
		homePages.ClickOnUmrahPackage();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("umrahURL"), "failed to laod");

		// 4. click on Business page and assert
		homePages.ClickOnBusinessSetup();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("businessURL"),
				"failed to laod");

		// 5. click on Blog page and assert
		homePages.ClickOnBlog();
		softAssert.assertEquals(driver.getCurrentUrl(),prop.getProperty("blogURL"),
				"failed to laod");

		// 6. click on Contact page and assert
		homePages.ClickOnContact();
		softAssert.assertEquals(driver.getCurrentUrl(),prop.getProperty("contactURL"), "failed to laod");

		// Navigate back to Home Page
		homePages.ClickOnHome();
	}

	@Test(priority = 2)
	public void verifyHer0WidgetMenue() {

		// Verify heading and tile

		WebElement Title = driver.findElement(By.xpath("//*[text()='Package']"));
		Assert.assertEquals(Title.getText(), "PACKAGE", "failed to laod");
		// div[@class='content active']//h1[1]

		// verify contact us button
	}

	@Test(priority = 3)
	public void verifyGrowExponentiallyMenue() {

		// verify grow exponentially section

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
}
