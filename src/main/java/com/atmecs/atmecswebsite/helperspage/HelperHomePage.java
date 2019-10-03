package com.atmecs.atmecswebsite.helperspage;

import org.openqa.selenium.Dimension;

import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.pageactions.PageActionsScrollDown;
import com.atmecs.atmecswebsite.reports.LogReports;
import com.atmecs.atmecswebsite.testbase.TestBase;

public class HelperHomePage extends TestBase {

	static AtmecsSiteXpathAllocators data = new AtmecsSiteXpathAllocators();
	static LogReports log = new LogReports();

	public static void verifyFooterDimension() throws Exception
	{		
		data.getData();
		
		PageActionsScrollDown.scrollDownToBottom(driver);
		
		Dimension homeFooterSize = PageActions.fetchAttributeSize(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnAboutUsXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		Dimension aboutusFooterSize = PageActions.fetchAttributeSize(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnServicesXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		Dimension 	servicesFooterSize = PageActions.fetchAttributeSize(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnPartnersXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		Dimension	PartnersFooterSize = PageActions.fetchAttributeSize(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnCarrersXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		Dimension carrersFooterSize = PageActions.fetchAttributeSize(driver, data.getFooterXpath());
		
		if(homeFooterSize.equals(aboutusFooterSize)&& homeFooterSize.equals(servicesFooterSize)&&homeFooterSize.equals(PartnersFooterSize)&& homeFooterSize.equals(carrersFooterSize) )
		{
			log.info("Footer size of all the pages are verfied: All the pages contain same Footer values:"+" "+homeFooterSize);
		}
		else
		{
			log.info("Footer size of all the pages are verfied: All the pages contain same Footer values");
		}
	}

	  public static void verifyFooterText()
	{
		PageActions.clickElement(driver, data.getClickOnMenuXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		String homeData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnAboutUsXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		String aboutUsData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnServicesXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		String servicesData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnPartnersXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		String partnersData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		
		PageActions.clickElement(driver, data.getClickOnCarrersXpath());
		PageActionsScrollDown.scrollDownToBottom(driver);
		String carrersData = PageActions.fetchAttributeText(driver, data.getFooterXpath());
		
		if(homeData.contentEquals(aboutUsData)&&homeData.contentEquals(servicesData)&&homeData.contentEquals(partnersData)&&homeData.contentEquals(carrersData))
		{
			log.info("Footer text of all the pages are validated: All the pages contain same Footer values:"+" "+homeData);
		}
		else
		{
			log.info("Footer of all the pages are validated: All the pages contain different Footer values" );
			
		}
	}
}
