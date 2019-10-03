package com.atmecs.atmecswebsite.helperspage;

import com.atmecs.atmecswebsite.dataallocators.HomePageValidationData;
import com.atmecs.atmecswebsite.dataallocators.HomePageXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.testbase.InvokeBrowser;

		public class RedirectingMoreInfoPage extends InvokeBrowser 
		{
			static HomePageXpathAllocators data = new HomePageXpathAllocators();
			static HomePageValidationData validationData = new HomePageValidationData();
			
			
			public static String fetchBreadCrumb() throws Exception
			{
				data.getData();
				
				String  actualBreadCrumb=PageActions.fetchAttributeText(driver, data.getExploreNowBreadCrumb());
				return actualBreadCrumb;
				
			}
			
			public static String pageTitle()
			{
				String pageTitle=PageActions.fetchAttributeText(driver, data.getValidateExploreNow());
				return pageTitle;
				
			}
		}
