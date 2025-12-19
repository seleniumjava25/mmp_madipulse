package org.iit.healthcare.mmp;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.iit.healthcare.util.FutureDate;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class BaseClass {


	protected WebDriver driver;
	protected Properties prop;
	private String browserType;
	private String environment;
	protected ExtentReports extent;

	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("This is before suite method");
		
		String timeStamp = FutureDate.getFutureDate(0, "dd_MM_yyyy_HH_mm_ss");
		// directory where output is to be printed
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"reports\\mmp_report"+timeStamp+".html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
		
		
		

	}
	//Before will run once for all the tests in the suite
	@BeforeTest
	public void readGlobalConfig() throws IOException
	{
		prop= ConfigReader.loadProperties("mmp_global.properties");
		browserType = prop.getProperty("browser");
		environment = prop.getProperty("environment");
		
		if(environment.equalsIgnoreCase("qa"))
		{
			Properties qaProp = ConfigReader.loadProperties("mmp_qa.properties");
			prop.putAll(qaProp);
		}
		else if(environment.equalsIgnoreCase("dev"))
		{
			Properties devProp = ConfigReader.loadProperties("mmp_dev.properties");
			prop.putAll(devProp);
		}
		else
		{
			System.out.println("No environment is matched");
		}
		 
		

	}
	public void launchApp(String url)
	{
		driver.get(url);
	}
	//Before Class will
	@BeforeClass
	public void setup() throws IOException
	{

		switch(browserType.toLowerCase()) 
		{

		case "chrome":
			ChromeOptions options = new ChromeOptions();
			options.addArguments("incognito");//to open browser in incognito mode
			
			driver = new ChromeDriver(options);
			break;

		case "edge":

			driver = new EdgeDriver();
			break;

		default:
			System.out.println("browser not supported");
			break;

		}

		launchApp(prop.getProperty("baseUrl"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 

	}
	@AfterClass
	public void tearDown()
	{
		if(driver!=null)
		{
			driver.quit();
		}
	}
	@AfterSuite	
	public void afterSuite()
	{
		System.out.println("This is after suite method");
		extent.flush();
	}

}
