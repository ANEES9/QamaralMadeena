package com.qa.testSCripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;

public class UmrahPackageTest extends TestBase {
	
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
	public void verifyUmrahByBus() {
		
		/* 
		 * UmrahPackagePage umrahPackagePage = new UmrahPackagePage(driver);
		 * ContactPage contactPage = umrahPackagePage.clickOnContactUsButton();
		 */
	}
	

	@Test(priority = 2)
	public void verifyUmrahByAir() {
		
		/* 
		 * UmrahPackagePage umrahPackagePage = new UmrahPackagePage(driver);
		 * ContactPage contactPage = umrahPackagePage.clickOnContactUsButton();
		 */
	}

	@Test(priority = 3)
	public void verifyUmrahByAirWithLuxuary() {
		
		/* 
		 * UmrahPackagePage umrahPackagePage = new UmrahPackagePage(driver);
		 * ContactPage contactPage = umrahPackagePage.clickOnContactUsButton();
		 */
	}

}

