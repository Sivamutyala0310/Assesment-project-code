package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperInsightBlogPage;
import com.atmecs.atmecswebsite.reports.ExtentReport;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class InsightBlog extends TestBase {
	LogReports log = new LogReports();
	ExtentReport report = new ExtentReport();
	
	@BeforeTest
	public void startReports() {
		report.startReport();                    // ExtentReports
	}
	@Test
	public void insightBlog() throws Exception
	{
		ExtentReport.logger = extent.startTest("insightBlog");
		log.info("....SECOND SCENARIO STARTED...");
		
		HelperInsightBlogPage.insightBlog();                         // performing second scenario
		
		log.info("..SECOND SCENARIO SUCCESSFULLY COMPLETED..");
		
	}

}
