package com.qa.testSCripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.log4testng.Logger;

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
	public void verifyNavigationMenue() {

		HomePage homePages = new HomePage(driver);
		// 1. Check user landed on the home page
		softAssert.assertEquals(driver.getTitle(), "QamarAlMadeena", "failed to laod");
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

		// 5. click on Blog page and assert
		homePages.ClickOnBlog();
		softAssert.assertEquals(driver.getCurrentUrl(), prop.getProperty("blogURL"), "failed to Blog services");
		Reporter.log("User clicked on the Blog Services");

		// 6. click on Contact page and assert
		homePages.ClickOnContact();
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
		Assert.assertEquals(homePages.getTitleOfGrowExpSection(), "Growing", "failed to laod Package text");
		Assert.assertEquals(homePages.getSubTitleOfGrowExpSection(), "Exponentially", "failed to laod Package text");
		Reporter.log("User able to see Title and Sub Title ");

		// verify all paragraph texts in counters
		verifyAllCounterSection();
	}

	@Test(priority = 4)
	public void verifyChooseYourPlaceMenue() throws Throwable {

		HomePage homePages = new HomePage(driver);

		// wait & scroll down to Choose your destination section & wait
		Thread.sleep(2000);
		scrollDownTo("Choose Your Place");
		Thread.sleep(6000);

		// Verify heading and tile
		Assert.assertEquals(homePages.get_TitleOfDestination_ChooseYourPlace(), "Destinations",
				"failed to laod Destination title text");
		Assert.assertEquals(homePages.Get_SubTitleOfDestination_ChooseYourPlace(), "Choose Your Place",
				"failed to laod Choose Your Place text");

		// Verify clicking on the two section in place menue
		List<WebElement> ele = homePages.Get_listOfTwoElelementInCYP();
		for (WebElement ele1 : ele) {
			String s = ele1.getText();

			if (s.contains("Makkha")) {
				System.out.println(ele1.getText());
				ele1.click();
				scrollDownTo("Choose Your Place");
				Thread.sleep(6000);
				System.out.println("clicking done for Makkha Image");

			} else if (s.contains("Madina")) {
				System.out.println(ele1.getText());
				ele1.click();
				scrollDownTo("Choose Your Place");
				Thread.sleep(6000);
				System.out.println("clicking done for Madina Image");

			} else {
				System.out.println("failed to find elements");
			}
		}

	}

	@Test(priority = 5)
	public void verifyUmrahToursMenue() throws Throwable {

		 // Define an explicit wait
        WebDriverWait wait = new WebDriverWait(driver, 10);
        JavascriptExecutor js = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		// scroll down to Umrah Tours section
		// Scroll to the element using JavascriptExecutor
		scrollDownTo("Most Popular Tours");

		// Verify heading and tile

		// verify clicking on three offer packages
		
		//*[@class="popular-list"]
		//h3[@class=\"card-title\"]
		Thread.sleep(5000);
		List <WebElement> elements = driver.findElements(By.xpath("//*[@class='popular-list']"));
		 // Iterate over the elements list
    
        	
		
	
		for(WebElement ek : elements) {
		String listname = ek.getText();
		//System.out.println(listname);
		
		if(listname.contains("Umrah By Bus"))
		{
			Thread.sleep(2000);
			ek.click(); Thread.sleep(2000);
			System.out.println("clicked on the umrah");
			driver.navigate().back(); Thread.sleep(5000);
			System.out.println("clicked on the umrah by bus");
			Thread.sleep(5000);
		scrollDownTo("Most Popular Tours");}
			else if(listname.contains("Umrah By Air"))
			{
				scrollDownTo("Entered second loop");
				Thread.sleep(2000);
				ek.click(); Thread.sleep(2000);
				System.out.println("clicked on the umrah by air");
				driver.navigate().back(); Thread.sleep(5000);
				System.out.println("clicked on the umrah by air");
				Thread.sleep(5000);
				scrollDownTo("Most Popular Tours");}
			else if(listname.contains("Umrah By Air, Luxuary Accomodation, Food"))
		{
				Thread.sleep(2000);
				ek.click(); Thread.sleep(2000);
				System.out.println("clicked on the umrah by air & luxuary ");
				driver.navigate().back(); Thread.sleep(5000);
				System.out.println("clicked on the umrah");
				Thread.sleep(5000);
				scrollDownTo("Most Popular Tours");
		} else {
			System.out.println("failed to find elements");
		}
		}
	}

	@Test(priority = 6)
	public void verifyBusinessEssentialsMenue() throws Throwable {

		HomePage homePages = new HomePage(driver);
		Thread.sleep(2000);
		// scroll down
		scrollDownTo("For Any Business Needs");
		Thread.sleep(2000);
		// Verify heading and tile
	
		Assert.assertEquals(homePages.get_TitleOfBusiness_Esssential(), "Business Esssential",
				"failed to laod Destination title text");
		Assert.assertEquals(homePages.Get_SubTitleOfBusiness_Esssential(), "For Any Business Needs",
				"failed to laod Choose Your Place text");

		// verify clicking on three Business services
		
		//driver.findElement(By.xpath("//*[contains(text(),'New Business Setup')]")).click();
		//Thread.sleep(9000);
		
		WebElement element22 = driver.findElement(By.xpath("//*[contains(text(),'New Business Setup')]"));

		Actions actions = new Actions(driver);

		actions.moveToElement(element22).click().perform();
		
		//1. verify clicking on 1st section under Business
		Thread.sleep(2000);
		homePages.ClickOnNewBusinessSetup();
		Thread.sleep(2000);
		scrollDownTo("For Any Business Needs");
		
		//2. verify clicking on 2nd section under Business
		Thread.sleep(2000);
		homePages.ClickOnTranslationService();
		Thread.sleep(2000);
		scrollDownTo("For Any Business Needs");
		
		//3. verify clicking on 3rd section under Business
		Thread.sleep(2000);
		homePages.ClickOnAttestation();
		Thread.sleep(2000);
		scrollDownTo("For Any Business Needs");
	}

	@Test(priority = 7)
	public void verifyVisaServicesMenue() throws InterruptedException {

		// scroll down
		scrollDownTo("For Any Business Needs");

	}

	@Test(priority = 8)
	public void verifyFooterMenue() throws Throwable {

		// scroll down
		scrollDownTo("QmarAlMadeena");
		Thread.sleep(3000);
		// Verify links
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

	public void scrollDownTo(String pageTitle) throws InterruptedException {
		HomePage homePages = new HomePage(driver);
		if (pageTitle.contains("GrowExponentioally")) {
			homePages.performAction();
			Thread.sleep(2000);
		} else if (pageTitle.contains("Choose Your Place")) {
			homePages.performAction2();

		} else if (pageTitle.contains("Most Popular Tours")) {
			homePages.performAction3();

		} else if (pageTitle.contains("For Any Business Needs")) {
			homePages.performAction3();

		} else if (pageTitle.contains("QmarAlMadeena")) {
			homePages.performAction3();

		}

	}

}
