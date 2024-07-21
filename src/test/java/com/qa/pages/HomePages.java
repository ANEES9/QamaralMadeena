package com.qa.pages;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {

	WebDriver driver;

	public HomePages(WebDriver driver) {

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

	@FindBy(xpath = "//*[@class='navegation-items']//a[2]")
	private WebElement visaField;

	public void ClickOnVisaServices() {
		visaField.click();
	}

	@FindBy(xpath = "//*[@class='navegation-items']//a[3]")
	private WebElement UmrahField;

	public void ClickOnUmrahPackage() {
		UmrahField.click();
	}

	@FindBy(xpath = "//*[@class='navegation-items']//a[4]")
	private WebElement BusinessField;

	public void ClickOnBusinessSetup() {
		BusinessField.click();
	}

	@FindBy(xpath = "//*[@class='navegation-items']//a[5]")
	private WebElement blogField;

	public void ClickOnBlog() {
		blogField.click();
	}

	@FindBy(xpath = "//*[@class='navegation-items']//a[6]")
	private WebElement contactField;

	public void ClickOnContact() {
		contactField.click();
	}
	// -----------------------------Navigation Widget
	// ends------------------------------------------//

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
}
