package com.atmecs.atmecswebsite.helperspage;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteValidationDataAllocators;
import com.atmecs.atmecswebsite.dataallocators.AtmecsSiteXpathAllocators;
import com.atmecs.atmecswebsite.pageactions.PageActions;
import com.atmecs.atmecswebsite.pageactions.PageActionsScrollDown;
import com.atmecs.atmecswebsite.testbase.GridTestBase;
import com.atmecs.atmecswebsite.testbase.TestBase;
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
		
		String blogTitle=PageActions.fetchAttributeText(driver, data.getSelectBlogXpath());
		ValidateResult.validateData(blogTitle,validateData.getExpectedblogTitle(), "validated blog");   // validating title of the blog
		
		PageActions.clickElement(driver,data.getClickReadMore());
		
				
		String  actualDate =PageActions.fetchAttributeText(driver, data.getDateOfBlogs());
		SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
		LocalDate todayDate = LocalDate.now();                                          // validating date of the blog
		String systemDate=todayDate+"";
		try {
			 Date dateBefore = myFormat.parse(actualDate);
		       Date dateAfter = myFormat.parse(systemDate);
		       long difference = dateAfter.getTime() - dateBefore.getTime();
		       float daysBetween = (difference / (1000*60*60*24));
		       System.out.println("Number of Days between dates: "+daysBetween);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//ValidateResult.validateData(actualDate, validateData.getExpectedDate(),"validated date" );
		
		
		
		String bodyText = PageActions.fetchAttributeText(driver, data.getBlogTextXpath()); // validating text present or not in the blog
		ValidateResult.validateData(bodyText,validateData.getExpectedBlogContent(), "validated blog text present or not");
		
		PageActionsScrollDown.homePageScrollDown(driver);
		
		PageActions.clickElement(driver, data.getSubmit());
		
		String breadcrumb=PageActions.fetchAttributeText(driver, data.getBreadcrumbXpath());    // validating breadcrumb of the blog
		ValidateResult.validateData(breadcrumb,validateData.getBreadcrumbXpath(), "validated breadcrumb");
		
		String commentError=PageActions.fetchAttributeValue(driver, data.getExpectedError());    // validating comment field Error
		ValidateResult.validateData(commentError,validateData.getExpectedError() ,"validated comment field");
			

	}
}
