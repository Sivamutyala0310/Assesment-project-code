package com.atmecs.atmecswebsite.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecswebsite.constants.ConstantFilePaths;

public class AtmecsSiteXpathAllocators {
	String clickOnMenuXpath;
	String footerXpath;
	String clickOnAboutUsXpath;
	String clickOnServicesXpath;
	String clickOnPartnersXpath;
	String clickOnCarrersXpath;
	String clickOnDigitalLifeXpath;
	String goToInsightsXpath;
	String goToBlogs;
	String dateOfBlog;
	String selectBlogXpath;
	String breadcrumbXpath;
	String submit;
	String clickReadMore;
	String expectedError;
	String clickOnBlog;
	String blogTextXpath;
	String digitalLifeMenu;
	String InfrastructureServicesMenu;
	
	Properties properties;

	public void getData() throws IOException {
		properties = com.atmecs.atmecswebsite.utils.ReadLocatorsFile.loadProperty(ConstantFilePaths.LOCATORS_FILE);
		setClickOnMenuXpath();
		setFooterXpath();
		setClickOnAboutUsXpath();
		setClickOnServicesXpath();
		setClickOnPartnersXpath();
		setClickOnCarrersXpath();
		setClickOnDigitalLifeXpath();
		setGoToInsightsXpath();
		setGoToBlogs();
		setClickOnBlog();
		setDateOfBlogs();
		setSelectBlogXpath();
		setBreadcrumbXpath();
		setSubmit();
		setClickReadMore();
		setExpectedError();
		setBlogTextXpath();
		setDigitalLifeMenu();
		setInfrastructureServicesMenu();
	}

	public String getClickOnMenuXpath() {
		return clickOnMenuXpath;
	}

	public void setClickOnMenuXpath() {
		clickOnMenuXpath = properties.getProperty("clickOnMenuXpath");
	}

	public String getFooterXpath() {
		return footerXpath;
	}

	public void setFooterXpath() {
		footerXpath = properties.getProperty("footerXpath");
	}

	public String getClickOnAboutUsXpath() {
		return clickOnAboutUsXpath;
	}

	public void setClickOnAboutUsXpath() {
		clickOnAboutUsXpath = properties.getProperty("clickOnAboutUsXpath");
	}

	public String getClickOnPartnersXpath() {
		return clickOnPartnersXpath;
	}

	public void setClickOnPartnersXpath() {
		clickOnPartnersXpath = properties.getProperty("clickOnPartnersXpath");
	}

	public String getClickOnServicesXpath() {
		return clickOnServicesXpath;
	}

	public void setClickOnServicesXpath() {
		clickOnServicesXpath = properties.getProperty("clickOnServicesXpath");
	}

	public String getClickOnCarrersXpath() {
		return clickOnCarrersXpath;
	}

	public void setClickOnCarrersXpath() {
		clickOnCarrersXpath = properties.getProperty("clickOnCarrersXpath");
	}

	public String getClickOnDigitalLifeXpath() {
		return clickOnDigitalLifeXpath;
	}

	public void setClickOnDigitalLifeXpath() {
		clickOnDigitalLifeXpath = properties.getProperty("clickOnDigitalLife");
	}

	public String getGoToInsightsXpath() {
		return goToInsightsXpath;
	}

	public void setGoToInsightsXpath() {
		goToInsightsXpath = properties.getProperty("goToInsightsXpath");
	}

	public String getGoToBlogs() {
		return goToBlogs;
	}

	public void setGoToBlogs() {
		goToBlogs = properties.getProperty("goToBlogs");

	}

	public String getDateOfBlogs() {
		return dateOfBlog;
	}

	public void setDateOfBlogs() {
		dateOfBlog = properties.getProperty("dateOfBlog");
	}

	public String getSelectBlogXpath() {
		return selectBlogXpath;
	}

	public void setSelectBlogXpath() {
		selectBlogXpath = properties.getProperty("selectBlogXpath");
	}

	public String getBreadcrumbXpath() {
		return breadcrumbXpath;
	}

	public void setBreadcrumbXpath() {
		breadcrumbXpath = properties.getProperty("breadcrumbXpath");
	}

	public String getSubmit() {
		return submit;
	}

	public void setSubmit() {
		submit = properties.getProperty("submit");
	}

	public String getClickReadMore() {
		return clickReadMore;
	}

	public void setClickReadMore() {
		clickReadMore = properties.getProperty("clickReadMore");
	}

	public String getExpectedError() {
		return expectedError;
	}

	public void setExpectedError() {
		expectedError = properties.getProperty("expectedError");
	}
	public String getClickOnBlog() {
		return clickOnBlog;
	}

	public void setClickOnBlog() {
		clickOnBlog =properties.getProperty("clickOnBlog");
	}
	public String getBlogTextXpath() {
		return blogTextXpath;
	}

	public void setBlogTextXpath() {
		this.blogTextXpath = properties.getProperty("blogTextXpath");
	}
	public String getDigitalLifeMenu() {
		return digitalLifeMenu;
	}

	public void setDigitalLifeMenu() {
		digitalLifeMenu =properties.getProperty("digitalLifeMenu") ;
	}
	public String getInfrastructureServicesMenu() {
		return InfrastructureServicesMenu;
	}

	public void setInfrastructureServicesMenu() {
		InfrastructureServicesMenu = properties.getProperty("InfrastructureServicesMenu");
	}
	public static void main(String[] args) throws IOException {
		AtmecsSiteXpathAllocators keys = new AtmecsSiteXpathAllocators();
		keys.getData();
	}
}
