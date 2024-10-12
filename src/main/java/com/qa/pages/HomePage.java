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

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {

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

	@FindBy(xpath = "(//a[normalize-space()='Contact Us'])[1]")
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

	@FindBy(xpath = "//*[contains(text(),'Growing')]")
	private static WebElement titleOfGrowExpSection;

	public String getTitleOfGrowExpSection() {
		return titleOfGrowExpSection.getText();
	}

	@FindBy(xpath = "//*[contains(text(),'Exponentially')]")
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



	// -------------- additional methods for Choose Your place section----------//

	//title
	@FindBy(xpath = "//*[contains(text(),'Destinations')]")
	private static WebElement titleOfDestination_ChooseYourPlace;

	public String get_TitleOfDestination_ChooseYourPlace() {
		return titleOfDestination_ChooseYourPlace.getText();
	}

	//sub title
	@FindBy(xpath = "//*[contains(text(),'Choose Your Place')]")
	private WebElement SubTitleOfDestination_ChooseYourPlace;

	public String Get_SubTitleOfDestination_ChooseYourPlace() {
		return SubTitleOfDestination_ChooseYourPlace.getText();
	}

	//Listing paragraph tag
	@FindBy(xpath = "//p[@class='card-subtitle']")
	private List<WebElement> listOfTwoElelementInCYP;

	public List<WebElement> Get_listOfTwoElelementInCYP() {
		return listOfTwoElelementInCYP;
	}


	// -------------- END of  Choose Your place section----------//


	// -------------- additional methods for Choose Your place section----------//

	//title
	@FindBy(xpath = "//*[contains(text(),'Business Esssential')]")
	private static WebElement TitleOfBusiness_Esssential;

	public String get_TitleOfBusiness_Esssential() {
		return TitleOfBusiness_Esssential.getText();
	}

	//sub title
	@FindBy(xpath = "//*[contains(text(),'For Any Business Needs')]")
	private WebElement SubTitleOfBusiness_Esssential;

	public String Get_SubTitleOfBusiness_Esssential() {
		return SubTitleOfBusiness_Esssential.getText();

	}



	//private void VerifyClickingonSectionOneUnderBusiness() {
		// TODO Auto-generated method stub
		@FindBy(xpath = "//*[contains(text(),'New Business Setup')]")
		private WebElement NewBusinessSetup;

		public void ClickOnNewBusinessSetup() {
			NewBusinessSetup.click();}


			@FindBy(xpath = "//a[normalize-space()='Translation Service']")
			private WebElement TranslationService;

			public void ClickOnTranslationService() {
				TranslationService.click();}


				@FindBy(xpath = "//a[normalize-space()='Attestation']")
				private WebElement Attestation;

				public void ClickOnAttestation() {
					Attestation.click();

	}

	// -------------- END OF Choose Your place section----------//













	public void performAction2() {
		// action class for moving down the page
		Actions builder = new Actions(driver);

		WebElement ele2 = driver.findElement(By.xpath("//*[contains(text(),'Our Services')]"));
		Action scrolldownTo = builder.moveToElement(ele2).click().sendKeys(Keys.PAGE_DOWN).build();
		scrolldownTo.perform();

	}

	public void performAction3() {
		// action class for moving down the page
		Actions builder = new Actions(driver);

		WebElement ele3 = driver.findElement(By.xpath("//*[@class='slide ']/following::h1"));
		Action scrolldownTo = builder.moveToElement(ele3).click().sendKeys(Keys.PAGE_DOWN).build();
		scrolldownTo.perform();

	}

	public void performAction4() {
		// action class for moving down the page
		Actions builder = new Actions(driver);

		WebElement ele4 = driver.findElement(By.xpath("//*[contains(text(),'Contact Us')][1]"));
		Action scrolldownTo = builder.moveToElement(ele4).click().sendKeys(Keys.PAGE_DOWN).build();
		scrolldownTo.perform();
	}

		public void performAction5() {
			// action class for moving down the page
			Actions builder = new Actions(driver);

			WebElement ele5 = driver.findElement(By.xpath("//*[text()='MavRick']"));
			Action scrolldownTo = builder.moveToElement(ele5).click().sendKeys(Keys.PAGE_DOWN).build();
			scrolldownTo.perform();

	}
}
