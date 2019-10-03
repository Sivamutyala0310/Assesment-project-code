package com.atmecs.atmecswebsite.helperspage;

import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteValidationDataAllocators;
import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.validatetest.ValidateResult;

public class HelperContextMenuPage extends TestBase
{
	static AtmecsSiteXpathAllocators data = new AtmecsSiteXpathAllocators();
	static AtmecsSiteValidationDataAllocators validateData = new AtmecsSiteValidationDataAllocators();
	
	public static void validateMenuFields() throws Exception 
	{
		data.getData();
		
		validateData.getData();

		PageActions.findElement(driver, data.getClickOnServicesXpath());                  //  validating services menu    
		String servicesMenuItems=PageActions.fetchAttributeText(driver, data.getClickOnServicesXpath());
		ValidateResult.validateData(servicesMenuItems, validateData.getExpectedServicesMenu(),"validated services menu");
		
		PageActions.findElement(driver, data.getClickOnDigitalLifeXpath());                  // validating DigitalLife menu
		String digitalLifeMenu = PageActions.fetchAttributeText(driver, data.getDigitalLifeMenu());
		ValidateResult.validateData(digitalLifeMenu,validateData.getDigitalLifeMenuItems(),"validated DigitalLife menu");
		
		PageActions.findElement(driver,data.getInfrastructureServicesMenu());         // validating InfrastructureService menu
		String infrastructureServicesMenu = PageActions.fetchAttributeText(driver, data.getInfrastructureServicesMenu());
		ValidateResult.validateData(infrastructureServicesMenu,validateData.getInfrastructureServicesMenu(),"validated infrastructureServicesMenu");
	
	}
}
