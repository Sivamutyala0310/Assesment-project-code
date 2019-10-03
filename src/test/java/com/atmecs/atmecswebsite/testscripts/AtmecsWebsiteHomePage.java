package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperHomeMoreInfo;
import com.atmecs.atmecswebsite.helperspage.HelperMoreInfoPage;
import com.atmecs.atmecswebsite.reports.ExtentReport;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.InvokeBrowser;

public class AtmecsWebsiteHomePage extends InvokeBrowser 
{
	LogReports log = new LogReports();
	ExtentReport report = new ExtentReport();

	@BeforeTest
	public void startReports() {
		report.startReport();                    // ExtentReports
	}

	@Test
	public void validateHomePage() throws Exception 
	{
		extent.startTest("validateHomePage");
		
		HelperMoreInfoPage.validateExploreNowPage();        // validating ExploreNow page

		HelperMoreInfoPage.validateAIMoreInfoPages();            // validating AI page

		HelperMoreInfoPage.validateARMoreInfoPages();      // validating AR page

		HelperHomeMoreInfo.validateIOTMoreInfo();             // validating IOT page

		HelperHomeMoreInfo.validateRPAMoreInfo();            // validating RPA page

		HelperHomeMoreInfo.validateBlockChainMoreInfo();         // validating BlockChain page

	}
}
