package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperHomePage;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.GridTestBase;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class AtmecsWebsiteVerifyFooter extends GridTestBase
{
	LogReports log = new LogReports();

	@Test
	public void verifyFooter() throws Exception
	{
		log.info("Navigating to ATMECS website");
		
		log.info("....SCENARIO 1 STARTED....");

		HelperHomePage.verifyFooterDimension();         // validating all pages footer dimension and size
		
		HelperHomePage.verifyFooterText();           // validating all pages footer data
		
		log.info("Succesfully completed verifying footer size and footer text of all the pages");
	}
}
