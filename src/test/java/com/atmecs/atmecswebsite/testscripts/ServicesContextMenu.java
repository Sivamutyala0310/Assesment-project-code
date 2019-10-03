package com.atmecs.atmecswebsite.testscripts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.atmecs.atmecswebsite.helperspage.HelperContextMenuPage;
import com.atmecs.atmecswebsite.reports.ExtentReport;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class ServicesContextMenu extends TestBase {
	LogReports log = new LogReports();
	ExtentReport report = new ExtentReport();

	@BeforeTest
	public void startReports() {
		report.startReport(); // ExtentReports
	}

	@Test
	public void verifyServicesMenu() throws Exception {
		ExtentReport.logger = extent.startTest("verifyServicesMenu");

		log.info("..Second test case started: veryifing Service menu fields");

		HelperContextMenuPage.validateMenuFields();

		log.info("second test case completed");
	}

}
