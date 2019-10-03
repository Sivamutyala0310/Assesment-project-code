package com.atmecs.atmecswebsite.helperspage;

import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteValidationDataAllocators;
import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.pageactions.PageActionsScrollDown;
import com.atmecs.atmecswebsite.testbase.TestBase;
import com.atmecs.atmecswebsite.validatetest.ValidateBlogDate;
import com.atmecs.atmecswebsite.validatetest.ValidateResult;

public class HelperInsightBlogPage extends TestBase 
{
	static AtmecsSiteXpathAllocators data = new AtmecsSiteXpathAllocators();
	static AtmecsSiteValidationDataAllocators validateData = new AtmecsSiteValidationDataAllocators();

	public static void insightBlog() throws Exception
	{
		data.getData();
		validateData.getData();

		PageActions.findElement(driver, data.getGoToInsightsXpath());

		PageActions.findElement(driver, data.getGoToBlogs());

		PageActions.clickElement(driver, data.getGoToBlogs());

		String blogTitle = PageActions.fetchAttributeText(driver, data.getSelectBlogXpath());
		ValidateResult.validateData(blogTitle, validateData.getExpectedblogTitle(), "validated blog title");  // validating blog tittle
		
		PageActions.clickElement(driver, data.getClickReadMore());
		
		String actualDate = PageActions.fetchAttributeText(driver, data.getDateOfBlogs());    // validating no of days
		Long dateDifference=ValidateBlogDate.differenceOfBlogDate(actualDate);               
		System.out.println("difference of days between blog published date from todays date"+" "+dateDifference);
		
		if(dateDifference>90)
		{
			ValidateResult.validateData(actualDate, validateData.getExpectedDate(), "validated date"); // validating date of blog
			
			String breadcrumb = PageActions.fetchAttributeText(driver, data.getBreadcrumbXpath()); // validating breadcrumb
			ValidateResult.validateData(breadcrumb, validateData.getBreadcrumbXpath(), "validated breadcrumb");
			
			String bodyText = PageActions.fetchAttributeText(driver, data.getBlogTextXpath());// validating text present or not in the blog																			      
			ValidateResult.validateData(bodyText, validateData.getExpectedBlogContent(),"validated blog text present or not");
			
			PageActionsScrollDown.homePageScrollDown(driver);
			PageActions.clickElement(driver, data.getSubmit());
	
			String commentError = PageActions.fetchAttributeValue(driver, data.getExpectedError()); // validating comment field Error
																									
			ValidateResult.validateData(commentError, validateData.getExpectedError(), "validated comment field");
		}
		else
		{
			System.out.println("difference of days between blog published date and todays date is not more than 90 days");
		}

	}
}
