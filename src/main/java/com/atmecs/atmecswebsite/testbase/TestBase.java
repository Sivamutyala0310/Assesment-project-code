package com.atmecs.atmecswebsite.testbase;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

import com.atmecs.atmecswebsite.constants.ConstantFilePaths;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.utils.ReadLocatorsFile;

public class TestBase
{
	LogReports log = new LogReports();
	Properties baseProperty;
	String url;
	String browser;
	public static WebDriver driver;
	
	@BeforeMethod
	public void initializeBrowser() throws Exception {
		
		baseProperty = ReadLocatorsFile.loadProperty(ConstantFilePaths.CONFIG_FILE);
		url = baseProperty.getProperty("url");
		browser = baseProperty.getProperty("browserType");

		if (browser.equalsIgnoreCase("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", ConstantFilePaths.CHROME_FILE);
			driver = new ChromeDriver();
			log.info("Chrome browser is started...");
		} 
		else if (browser.equalsIgnoreCase("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", ConstantFilePaths.FIREFOX_FILE);
			driver = new FirefoxDriver();
			log.info("Firefox browser is started...");
		} 
		else if (browser.equalsIgnoreCase("IE")) 
		{
			System.setProperty("webdriver.ie.driver", ConstantFilePaths.IE_FILE);
			driver = new InternetExplorerDriver();
			log.info("IE browser is started...");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.MINUTES);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@AfterSuite
	public void endTest() 
	{
		driver.quit();
	}
}
