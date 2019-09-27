package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperInsightBlogPage;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class InsightBlog extends TestBase {
	LogReports log = new LogReports();

	@Test
	public void insightBlog() throws Exception
	{
		log.info("SECOND SCENARIO STARTED");
		
		HelperInsightBlogPage.insightBlog();                         // performing second scenario
		
		log.info("SECOND SCENARIO SUCCESSFULLY COMPLETED");
		
	}

}
