package com.atmecs.atmecswebsite.helperspage;

import com.atmecs.atmecswebsite.dataallocators.HomePageValidationData;
import com.atmecs.atmecswebsite.dataallocators.HomePageXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.pageactions.PageActionsScrollDown;
import com.atmecs.atmecswebsite.testbase.InvokeBrowser;
import com.atmecs.atmecswebsite.validatetest.ValidateResult;

public class HelperMoreInfoPage extends InvokeBrowser {

	static HomePageXpathAllocators data = new HomePageXpathAllocators();
	static HomePageValidationData validationData=new HomePageValidationData();
	static String actualData;

	public static void validateExploreNowPage() throws Exception {
		
		data.getData();
		validationData.getData();

		PageActions.clickElement(driver, data.getExploreNow());
		
		actualData = RedirectingMoreInfoPage.fetchBreadCrumb();
		ValidateResult.validateData(actualData,validationData.getValidatingExploreNowBreadCrumb(),"validated ExploreNow BreadCrumb");

		actualData = RedirectingMoreInfoPage.pageTitle();
		ValidateResult.validateData(actualData,validationData.getValidatingExploreNow(),"validated ExploreNow page Title");

		PageActions.navigateBack(driver);
	}

	public static void validateAIMoreInfoPages() throws Exception
	{
		PageActionsScrollDown.homePageScrollDown(driver);
		PageActions.clickElement(driver, data.getAIMoreInfo());
		
		actualData = RedirectingMoreInfoPage.fetchBreadCrumb();
		ValidateResult.validateData(actualData,validationData.getValidatingAIBreadCrumb(), "validated AI page BreadCrumb");
		
		actualData = PageActions.fetchAttributeText(driver, data.getAIPage());
		ValidateResult.validateData(actualData,validationData.getValidatingAI(), "validated AI Page Title");
		
		PageActions.navigateBack(driver);
		PageActionsScrollDown.PageScrollDown(driver);
	}
	
	public static void  validateARMoreInfoPages() throws Exception
	{
		PageActions.clickElement(driver, data.getVRMoreInfo());
		
		actualData = RedirectingMoreInfoPage.fetchBreadCrumb();
		ValidateResult.validateData(actualData,validationData.getValidatingARBreadCrumb(), "validated AR BreadCrumb");
		
		actualData = RedirectingMoreInfoPage.pageTitle();
		ValidateResult.validateData(actualData,validationData.getValidatingAR(), "validated AR Page Title");
		
		PageActions.navigateBack(driver);
		PageActionsScrollDown.PageScrollDown(driver);
	}
	

}
