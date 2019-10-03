package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperHomePage;
import com.atmecs.atmecswebsite.reports.ExtentReport;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class AtmecsWebsiteVerifyFooter extends TestBase
{
	LogReports log = new LogReports();
	ExtentReport report = new ExtentReport();

	@BeforeTest
	public void startReports() {
		report.startReport();                    // ExtentReports
	}


	@Test
	public void verifyFooter() throws Exception
	{
		ExtentReport.logger = extent.startTest("verifyFooter");
		
		log.info("Navigating to ATMECS website");
		
		log.info("....SCENARIO 1 STARTED....");

		HelperHomePage.verifyFooterDimension();         // validating all pages footer dimension and size
		
		HelperHomePage.verifyFooterText();           // validating all pages footer data
		
		log.info("..Succesfully completed verifying footer size and footer text of all the pages..");
	}
}
