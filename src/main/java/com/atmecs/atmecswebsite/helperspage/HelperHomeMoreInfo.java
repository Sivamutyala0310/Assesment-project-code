package com.atmecs.atmecswebsite.helperspage;

import com.atmecs.atmecswebsite.dataallocators.HomePageValidationData;
import com.atmecs.atmecswebsite.dataallocators.HomePageXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.pageactions.PageActionsScrollDown;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.InvokeBrowser;
import com.atmecs.atmecswebsite.validatetest.ValidateResult;

public class HelperHomeMoreInfo extends InvokeBrowser {
	static HomePageXpathAllocators data = new HomePageXpathAllocators();
	static HomePageValidationData validationData = new HomePageValidationData();
	static LogReports log = new LogReports();
	static String actualData;

	public static void validateIOTMoreInfo() throws Exception {
		
		data.getData();
		validationData.getData();

		PageActions.clickElement(driver, data.getIOTMoreInfo());

		actualData = RedirectingMoreInfoPage.fetchBreadCrumb();
		ValidateResult.validateData(actualData, validationData.getValidatingIOTBreadCrumb(), "validating IOT page BreadCrumb");

		actualData = RedirectingMoreInfoPage.pageTitle();
		ValidateResult.validateData(actualData, validationData.getValidatingIOT(), "validated IOT page Tittle");
		PageActions.navigateBack(driver);
	}

	public static void validateRPAMoreInfo() throws Exception {
		
		PageActions.clickElement(driver, data.getRPAMoreInfo());

		actualData = RedirectingMoreInfoPage.fetchBreadCrumb();
		ValidateResult.validateData(actualData, validationData.getValidatingRPABreadCrumb(), "validated RPA page BreadCrumb");

		actualData = RedirectingMoreInfoPage.pageTitle();
		ValidateResult.validateData(actualData, validationData.getValidatingRPA(), "validated RPA page Tittle");

		PageActions.navigateBack(driver);
		PageActionsScrollDown.PageScrollDown(driver);
	}

	public static void validateBlockChainMoreInfo() throws Exception {

		PageActions.clickElement(driver, data.getBlockChainMoreInfo());

		actualData = RedirectingMoreInfoPage.fetchBreadCrumb();
		ValidateResult.validateData(actualData, validationData.getValidatingBlockChainBreadCrumb(),"validating BlockChain page BreadCrumb");

		actualData = RedirectingMoreInfoPage.pageTitle();
		ValidateResult.validateData(actualData, validationData.getValidatingBlockChain(), "validated BlockChain page Tittle");
		PageActions.navigateBack(driver);
	}

}
