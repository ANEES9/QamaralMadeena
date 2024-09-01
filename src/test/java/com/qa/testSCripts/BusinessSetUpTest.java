package com.qa.testSCripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;

public class BusinessSetUpTest extends TestBase {

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
	public void verifyNewBusinessSetupSection() {

		/*
		 * UmrahPackagePage umrahPackagePage = new UmrahPackagePage(driver);
		 * ContactPage contactPage = umrahPackagePage.clickOnContactUsButton();
		 */
	}


	@Test(priority = 2)
	public void verifyTranslationServiceSection() {

		/*
		 * UmrahPackagePage umrahPackagePage = new UmrahPackagePage(driver);
		 * ContactPage contactPage = umrahPackagePage.clickOnContactUsButton();
		 */
	}

	/**
	 *
	 */
	@Test(priority = 3)
	public void verifyAttestationSection() {

		/*
		 * UmrahPackagePage umrahPackagePage = new UmrahPackagePage(driver);
		 * ContactPage contactPage = umrahPackagePage.clickOnContactUsButton();
		 */
	}

}

