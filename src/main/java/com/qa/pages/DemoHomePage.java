package com.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoHomePage {

	WebDriver driver;

	public DemoHomePage(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	// -----------------------------Navigation Menue
	// Starts------------------------------------------//

	@FindBy(xpath = "//*[@class='navegation-items']//a[1]")
	private WebElement homeField;

	public void ClickOnHome() {
		homeField.click();

	}

	@FindBy(xpath = "//a[normalize-space()='Visa Service']")
	public WebElement visaField;

	public void clickOnVisaServiceMenu() {
		visaField.click();
		

	}

	@FindBy(xpath = "//div[@class='navegation-items']//a[normalize-space()='Umrah Package']")
	public WebElement UmrahField;

	public UmrahPackagePage clickOnUmrahPackageMenu() {
		UmrahField.click();

		return new UmrahPackagePage(driver);
	}

	@FindBy(xpath = "//*[@class='navegation-items']//a[4]")
	public WebElement BusinessField;

	public BusinessSetupPage clickOnBusinessSetupMenu() {
		BusinessField.click();

		return new BusinessSetupPage(driver);
	}

	@FindBy(xpath = "//*[@class='navegation-items']//a[5]")
	public WebElement blogField;

	public void clickOnBlogMenu() {
		blogField.click();
	}

	@FindBy(xpath = "//*[@class='navegation-items']//a[6]")
	public WebElement contactField;

	public ContactPage clickOnContactMenu() {
		contactField.click();

		return new ContactPage(driver);
	}

	// -----------------------------Navigation Menue ENDS
	// ------------------------------------------//


	// -----------------------------Hero Widget
		// Starts------------------------------------------//

		@FindBy(xpath = "//*[text()='Package']")
		private WebElement heroWidgetTitle;

		public String getHeroWidgetTitle() {
			return heroWidgetTitle.getText();
		}

		@FindBy(xpath = "//*[@class='content active']//a[1]")
		private WebElement contactUsField;

		public WebElement ClickOnContactUs() {
			return contactField;
		}

		// -----------------------------Hero Widget
		// ends------------------------------------------//


		// -------------------------------Growing Exponentially
		// Starts------------------------------------------//

		@FindBy(xpath = "//div[@class='header1']//h4")
		private static WebElement titleOfGrowExpSection;

		public String getTitleOfGrowExpSection() {
			return titleOfGrowExpSection.getText();
		}

		@FindBy(xpath = "//div[@class='header1']//h1")
		private WebElement SubTitleOfGrowExpSection;

		public String getSubTitleOfGrowExpSection() {
			return SubTitleOfGrowExpSection.getText();
		}

		@FindBy(xpath = "//*[@class='counters']//p")
		private List<WebElement> listOfAllCounters;

		public List<WebElement> getlistOfAllCounters() {
			return listOfAllCounters;
		}

		public void performAction() {
			// action class for moving down the page
			Actions builder = new Actions(driver);

			WebElement ele1 = titleOfGrowExpSection;
			Action scrolldownTo = builder.moveToElement(ele1).click().sendKeys(Keys.PAGE_DOWN).build();
			scrolldownTo.perform();

		}

		// -------------------------------Growing Exponentially Ends
		// ------------------------------------------//










		public void performAction2() {
			// action class for moving down the page
			Actions builder = new Actions(driver);

			WebElement ele2 = driver.findElement(By.xpath("//*[text()='Choose Your Place']"));
			Action scrolldownTo = builder.moveToElement(ele2).click().sendKeys(Keys.PAGE_DOWN).build();
			scrolldownTo.perform();

		}

		public void performAction3() {
			// action class for moving down the page
			Actions builder = new Actions(driver);

			WebElement ele3 = driver.findElement(By.xpath("//*[text()='Most Popular Tours']"));
			Action scrolldownTo = builder.moveToElement(ele3).click().sendKeys(Keys.PAGE_DOWN).build();
			scrolldownTo.perform();

		}

		public void performAction4() {
			// action class for moving down the page
			Actions builder = new Actions(driver);

			WebElement ele3 = driver.findElement(By.xpath("//*[contains(text(),'New Business Setup')]"));
			Action scrolldownTo = builder.moveToElement(ele3).click().sendKeys(Keys.PAGE_DOWN).build();
			scrolldownTo.perform();
		}

			public void performAction5() {
				// action class for moving down the page
				Actions builder = new Actions(driver);

				WebElement ele4 = driver.findElement(By.xpath("//*[text()='MavRick']"));
				Action scrolldownTo = builder.moveToElement(ele4).click().sendKeys(Keys.PAGE_DOWN).build();
				scrolldownTo.perform();

		}

}
