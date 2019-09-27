package com.atmecs.atmecswebsite.helperspage;

import org.openqa.selenium.Dimension;

import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteValidationDataAllocators;
import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.pageactions.PageActionsScrollDown;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.validatetest.ValidateResult;

public class HelperHomePage extends TestBase {
	static String footerText;
	static Dimension footerSize;
	static AtmecsSiteXpathAllocators data = new AtmecsSiteXpathAllocators();
	static LogReports log = new LogReports();
	static AtmecsSiteValidationDataAllocators validateData = new AtmecsSiteValidationDataAllocators();

	public static void verifyFooter() throws Exception {
		
		data.getData();
		
		PageActions.clickElement(driver, data.getClickOnMenuXpath());
		verify();
		PageActions.clickElement(driver, data.getClickOnAboutUsXpath());
		verify();
		PageActions.clickElement(driver, data.getClickOnServicesXpath());
		verify();
		PageActions.clickElement(driver, data.getClickOnPartnersXpath());
		verify();
		PageActions.clickElement(driver, data.getClickOnCarrersXpath());
		verify();}

	public static void verify() throws Exception 
	{
		validateData.getData();
		PageActionsScrollDown.scrollDownToBottom(driver);
		footerText = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		footerSize = PageActions.fetchAttributeSize(driver, data.getFooterXpath());
		ValidateResult.validateDimensionData(footerSize, validateData.getFooterTextDimension(),"validated all pages footer dimension");
		ValidateResult.validateData(footerText.length(), validateData.getFooterTextLength(),"validated all pages footer text size");
	}
	  public static void verifyFooterText()
	{
		PageActions.clickElement(driver, data.getClickOnMenuXpath());
		String homeData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		PageActions.clickElement(driver, data.getClickOnAboutUsXpath());
		String aboutUsData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		PageActions.clickElement(driver, data.getClickOnServicesXpath());
		String servicesData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		PageActions.clickElement(driver, data.getClickOnPartnersXpath());
		String partnersData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		PageActions.clickElement(driver, data.getClickOnCarrersXpath());
		String carrersData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		
		if(homeData.contentEquals(aboutUsData)&&homeData.contentEquals(servicesData)&&homeData.contentEquals(partnersData)&&homeData.contentEquals(carrersData))
		{
			log.info("Footer of all the pages are validated: All the pages contain same Footer values" );
		}
		else
		{
			log.info("Footer of all the pages are validated: All the pages contain different Footer values" );
			
		}
	}
}
