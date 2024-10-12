package com.qa.testSCripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qa.pages.HomePage;

import Base.TestBase;

public class TC_HomePage extends TestBase {

	JavascriptExecutor jse = (JavascriptExecutor) driver;

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
	public void verifyNavigationMenue() throws Throwable {

		HomePage homePages = new HomePage(driver);
		// 1. Check user landed on the home page
		softAssert.assertEquals(driver.getTitle(), "Business Setup Services, Umrah Packages & Visa Services | Qamar Al Madeena", "failed to laod");
		Reporter.log("User landed On Home Page");

		// 2. click on Visa page and assert

		homePages.ClickOnVisaServices();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("visaURl"), "failed to Visa Services");
		Reporter.log("User clicked on the Visa Services");

		// 3. click on Umrah page and assert
		homePages.ClickOnUmrahPackage();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("umrahURL"), "failed to laod Umrah services");
		Reporter.log("User clicked on the Visa Services");

		// 4. click on Business page and assert
		homePages.ClickOnBusinessSetup();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("businessURL"), "failed to Business services");
		Reporter.log("User clicked on the Business Services");

		/*// 5. click on Blog page and assert
		homePages.ClickOnBlog();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("blogURL"), "failed to Blog services");
		Reporter.log("User clicked on the Blog Services");*/

		// 6. click on Contact page and assert
		homePages.ClickOnContact();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[@class='close']")).click();
		Thread.sleep(5000);
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("contactURL"),
				"failed to laod contact services");
		Reporter.log("User clicked on the Contact Services");

		// Navigate back to Home Page
		homePages.ClickOnHome();
		Reporter.log("User landed back to Home Page");

	}

	@Test(priority = 2)
	public void verifyHeroWidgetMenue() {

		// Verify heading and tile
		HomePage homePages = new HomePage(driver);
		Assert.assertEquals(homePages.getHeroWidgetTitle(), "PACKAGE", "failed to laod Package text");
		Reporter.log("User able to see Umrah package Title and Sub Title");

		// verify contact us button
		homePages.ClickOnContactUs();
		Reporter.log("User clicked on Contact us button in hero widget module");
	}

	@Test(priority = 3)
	public void verifyGrowExponentiallyMenue() throws InterruptedException {

		HomePage homePages = new HomePage(driver);

		// Scroll to the element using JavascriptExecutor
		scrollDownTo("GrowExponentioally");

		// Verify title & subtitle
		Assert.assertEquals(homePages.getTitleOfGrowExpSection(), "Growing", "failed to laod the text Growing");
		Assert.assertEquals(homePages.getSubTitleOfGrowExpSection(), "Exponentially", "failed to laod the text Exponentially");
		Reporter.log("User able to see Title and Sub Title ");

		// verify all paragraph texts in counters
		verifyAllCounterSection();
	}

	@Test(priority = 4)
	public void verifyOurServices() throws Throwable {

		Thread.sleep(2000);
		scrollDownTo("Our Services");

		//Verify first card Title , description & View details Button
		String s = driver.findElement(By.xpath("//*[contains(text(),'Umrah Packages')][1]")).getText();
		System.out.println(s);
		System.out.println("ssss");
		//Assert.assertTrue(s, "Umr	ah Packages");

		//Verify Second card Title , description & View details Button

		//Verify Third card Title , description & View details Button

		// scroll down


		// find umrah package card width and length
	        WebElement image = driver.findElement(By.xpath("//*[@src='images/kabha3.jpg']"));

	        // Get the width and height of the image
	        Dimension dimensions = image.getSize();
	        int width = dimensions.getWidth();
	        Integer height = dimensions.getHeight();

	        Assert.assertEquals(String.valueOf(width),"353","kabha width failed");
	        Assert.assertEquals( String.valueOf(height),"353", "kabha height failed");
	        
	        
	     // click on know more and navigate back
	       WebElement ssss = driver.findElement(By.xpath("//*[contains(text(),'Know More')]/parent::a[@href='Umrah.html']"));
	    // Cast WebDriver to JavascriptExecutor
	        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

	        // Click the element using JavaScript
	        jsExecutor.executeScript("arguments[0].click();", ssss);
	        Assert.assertEquals(driver.getCurrentUrl(), "https://www.qamaralmadeena.ae/Umrah.html","user failed to land on Umrah page");
	        Thread.sleep(5000);
	        driver.navigate().back();
	        System.out.println("navigated back to home page");
	        Thread.sleep(5000);

	}

	@Test(priority = 5)
	public void verifyAboutSection() throws Throwable {
		HomePage homePages = new HomePage(driver);

		
	scrollDownTo("about");
		Thread.sleep(3000);
		
		String sm = driver.findElement(By.xpath("//span[@class='typing ']")).getText();
System.out.println(sm);

	}



	@Test(priority = 6)
	public void verifyFooterMenue() throws Throwable {

		// scroll down
		scrollDownTo("about");
		Thread.sleep(3000);
		// Verify links
		
		
		List<WebElement> web = driver.findElements(By.xpath("//*[@class='footer-list '][4]"));
	
        // Iterate over the list of links using a for-each loop
        for (WebElement link : web) {
            // Print the text of each link
            System.out.println("Link Text: " + link.getText());
            
            if (link.getText().equalsIgnoreCase("link")) {
				Assert.assertTrue(true);
			} else if (link.getText().equalsIgnoreCase("Visa service")) {
				Assert.assertTrue(true);

			} else if (link.getText().equalsIgnoreCase("Umrah Package")) {
				Assert.assertTrue(true);

			} else if (link.getText().equalsIgnoreCase("Business Setup")) {
				Assert.assertTrue(true);
			}  else if (link.getText().equalsIgnoreCase("Blog")) {
				Assert.assertTrue(true);
			}  else if (link.getText().equalsIgnoreCase("Term & Conditions")) {
				Assert.assertTrue(true); }
			         

        }
	}

	// ------------------- Extra methodss--------------------------

	public void verifyAllCounterSection() {
		HomePage homePages = new HomePage(driver);
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


}

