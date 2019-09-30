package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperContextMenuPage;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.GridTestBase;
import com.atmecs.atmecswebsite.testbase.TestBase;

@Test
public class ServicesContextMenu extends GridTestBase
{
	LogReports log = new LogReports();
	
	public void verifyServicesMenu() throws Exception
	{
	 log.info("second test case started: veryifing Service menu fields");
		
	 HelperContextMenuPage.validateMenuFields();
	
	 log.info("second test case completed");
	}
	
	
	
	
}
