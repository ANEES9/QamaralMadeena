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

		// 1. Check user landed on the home page
		softAssert.assertEquals(driver.getTitle(), "QamarAlMadeena", "failed to laod");

		// 2. click on Visa page and assert
		driver.findElement(By.xpath("//*[@class='navegation-items']//a[2]")).click();
		softAssert.assertEquals(driver.getCurrentUrl(), "https://qamaralmadeena.netlify.app/visa", "failed to laod");

		// 3. click on Umrah page and assert
		driver.findElement(By.xpath("//*[@class='navegation-items']//a[3]")).click();
		softAssert.assertEquals(driver.getCurrentUrl(), "https://qamaralmadeena.netlify.app/umrah", "failed to laod");

		// 4. click on Business page and assert
		driver.findElement(By.xpath("//*[@class='navegation-items']//a[4]")).click();
		softAssert.assertEquals(driver.getCurrentUrl(), "https://qamaralmadeena.netlify.app/business", "failed to laod");

		// 5. click on Blog page and assert
		driver.findElement(By.xpath("//*[@class='navegation-items']//a[5]")).click();
		softAssert.assertEquals(driver.getCurrentUrl(), "https://qamaralmadeena.netlify.app/business#", "failed to laod");

		// 6. click on Contact page and assert
		driver.findElement(By.xpath("//*[@class='navegation-items']//a[6]")).click();
		softAssert.assertEquals(driver.getCurrentUrl(), "https://qamaralmadeena.netlify.app/contact", "failed to laod");

		//Navigate back to Home Page
		driver.findElement(By.xpath("//*[@class='navegation-items']//a[1]")).click();
	}

	@Test(priority = 2)
	public void verifyHer0WidgetMenue() {

		//Verify heading and tile
		
		WebElement Title = driver.findElement(By.xpath("//*[text()='Package']"));
		Assert.assertEquals(Title.getText(), "PACKAGE", "failed to laod");
		//div[@class='content active']//h1[1]
		
		//verify contact us button
	}
	
	@Test(priority = 3)
	public void verifyGrowExponentiallyMenue() {

		//verify grow exponentially section
	}
	
	@Test(priority = 4)
	public void verifyChooseYourPlaceMenue() {

		//Verify heading and tile
		
		//verify clicking on two Places
	}
	
	
	@Test(priority = 5)
	public void verifyUmrahToursMenue() {

		//Verify heading and tile
		
		//verify clicking on three offer packages
	}
	
	
	@Test(priority = 6)
	public void verifyBusinessEssentialsMenue() {
		
		//Verify heading and tile
		
		//verify clicking on three Business services
	}
	
	@Test(priority = 7)
	public void verifyVisaServicesMenue() {

	}
	
	@Test(priority = 8)
	public void verifyFooterMenue() {
		//Verify links
	}
}
