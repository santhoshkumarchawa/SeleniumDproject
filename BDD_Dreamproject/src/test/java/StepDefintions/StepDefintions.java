package StepDefintions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import Google_PageFactory.GoogleHomePageFactory;
import Google_PageObject.GoogleHomePage;
//import Google_PageObject.GoogleHomePage;

public class StepDefintions {
	
	//static ExtentTest test;
	//static ExtentReports report;
	
	WebDriver driver=null;

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent ;
	ExtentTest logger;
		
	@When("User Enters Hello World")
	public void user_enters_hello_world() {
		System.out.println("Hello Teja");
	}

	@Then("It should print Hello World")
	public void it_should_print_hello_world() {
		System.out.println("Hello Teja Printed");		
	}
	@When("I Open the Chrome Browser and Navigate to Google")
	public void i_open_the_chrome_browser_and_navigate_to_google() {

		logger = extent.createTest("To verify Google Title");
	    // Write code here that turns the phrase above into concrete actions		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\Dreamproject\\BDD_Dreamproject\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
		Assert.assertEquals(driver.getTitle(),"Google");
		
		//test.log(LogStatus.PASS, "Navigated to the specified URL");
	    
	}

	
	@Before
	public void startReport() {
		htmlReporter = new ExtentHtmlReporter("C:\\Users\\santh\\Dreamproject\\BDD_Dreamproject\\testoutput\\ExtentReport.html");
        	// Create an object of Extent Reports
		extent = new ExtentReports();  
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host Name", "SoftwareTestingMaterial");
        	extent.setSystemInfo("Environment", "Production");
		extent.setSystemInfo("User Name", "Rajkumar SM");
		htmlReporter.loadConfig("C:\\Users\\santh\\Dreamproject\\BDD_Dreamproject\\extent-config.xml");
		htmlReporter.config().setDocumentTitle("Title of the Report Comes here "); 
                // Name of the report
		htmlReporter.config().setReportName("Name of the Report Comes here "); 
                // Dark Theme
		htmlReporter.config().setTheme(Theme.STANDARD);			
	}
	
	
	//@Before
	/*public void Invoke_Browser() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santh\\Dreamproject\\BDD_Dreamproject\\src\\test\\resources\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.google.co.in");
		driver.manage().window().maximize();
	}*/
	
	
	@Then("I Enter the Value in Google Search")
	public void Enter_Value_GoogleSearch() {
		GoogleHomePage GSearch=new GoogleHomePage(driver);
		//GoogleHomePageFactory GSearch_PF=new GoogleHomePageFactory(driver);
		//GSearch_PF.GoogleSearch_PageFactory();
		GSearch.GoogleSearch();
	}
}
