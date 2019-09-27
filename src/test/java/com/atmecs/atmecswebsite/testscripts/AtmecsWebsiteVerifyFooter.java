package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperHomePage;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class AtmecsWebsiteVerifyFooter extends TestBase
{
	LogReports log = new LogReports();

	@Test
	public void verifyFooter() throws Exception
	{
		log.info("Navigating to ATMECS website");

		HelperHomePage.verifyFooter();            // validating all pages footer dimension and size
		HelperHomePage.verifyFooterText();   // validating all pages footer data
	}
}
