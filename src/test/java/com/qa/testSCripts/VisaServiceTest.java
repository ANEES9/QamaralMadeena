package com.qa.testSCripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

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
	

	@Test(priority = 1)
	public void verifyVisitVisa() {
		
		/* 
		 * VisaServicePage visaServicePage = new VisaServicePage(driver);
		 * ContactPage contactPage = visaServicePage.clickOnContactUsButton();
		 */
	}
	

	@Test(priority = 2)
	public void verifyFamilVisa() {
		
		/* 
		 * VisaServicePage visaServicePage = new VisaServicePage(driver);
		 * ContactPage contactPage = visaServicePage.clickOnContactUsButton();
		 */
	}

	@Test(priority = 3)
	public void verifyVisaChangeByAir() {
		
		/* 
		 * VisaServicePage visaServicePage = new VisaServicePage(driver);
		 * ContactPage contactPage = visaServicePage.clickOnContactUsButton();
		 */
	}


}
