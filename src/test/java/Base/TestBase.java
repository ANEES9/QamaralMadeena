package Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

import com.qa.pages.HomePage;
import com.qa.pages.VisaServicePage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public Properties prop;

	public WebDriver driver;
	public HomePage homePages ;
	VisaServicePage VisaServicePage;
	public SoftAssert softAssert;
	// WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
	public WebDriverWait wait;


	public WebDriver initializeBrowser() throws IOException {

		prop = new Properties();

		File file = new File("D:\\Workspace-2\\QAMARALMADEENA\\src\\test\\resources\\data.properties");

		FileInputStream fis = new FileInputStream(file);

		prop.load(fis);

		String browser = prop.getProperty("browser");

		if (browser.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();

		}

		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homePages = new HomePage(driver);
		VisaServicePage = new VisaServicePage(driver);
		wait = new WebDriverWait(driver ,100);
		softAssert = new SoftAssert();
		return driver;

	}

	  public String takeScreenshot(String testName, WebDriver driver) throws IOException {
	        File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String screenshotPath = System.getProperty("user.dir") + "/Screenshots/" + testName + "_" + getCurrentDateTime() + ".png";
	        FileUtils.copyFile(srcFile, new File(screenshotPath));
	        return screenshotPath;
	    }

	    private String getCurrentDateTime() {
	        return new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

	}
	    
		public void scrollDownTo(String pageTitle) throws InterruptedException {
			HomePage homePages = new HomePage(driver);
			if (pageTitle.contains("GrowExponentioally")) {
				homePages.performAction();
				Thread.sleep(2000);
			} else if (pageTitle.contains("Our Services")) {
				homePages.performAction2();

			} else if (pageTitle.contains("about")) {
				homePages.performAction3();

			} else if (pageTitle.contains("Visa Page")) {
				homePages.performAction4();

			} else if (pageTitle.contains("QmarAlMadeena")) {
				homePages.performAction5();

			}}
	    


}