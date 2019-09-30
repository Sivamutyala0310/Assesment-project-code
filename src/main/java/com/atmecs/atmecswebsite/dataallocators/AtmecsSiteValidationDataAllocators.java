package com.atmecs.atmecswebsite.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecswebsite.constants.ConstantFilePaths;
import com.atmecs.atmecswebsite.utils.ReadLocatorsFile;

public class AtmecsSiteValidationDataAllocators
{
	String footerTextDimension;
	String footerTextLength;
	String ExpectedblogTitle;
	String ExpectedDate;
	String breadcrumbXpath;
	String ExpectedError;
	String ExpectedBlogContent;
	String expectedServicesMenu;
	String DigitalLifeMenuItems;
	String InfrastructureServicesMenu;
	Properties properties;

	public void getData() throws IOException {
		properties = ReadLocatorsFile
				.loadProperty(ConstantFilePaths.ValidationTESTDATA_FILE);
		setFooterTextDimension();
		setFooterTextLength();
		setExpectedblogTitle();
		setExpectedError();
		setBreadcrumbXpath();
		setExpectedDate();
		setExpectedBlogContent();
		setExpectedServicesMenu();
		setDigitalLifeMenuItems();
		setInfrastructureServicesMenu();
	}

	public String getFooterTextDimension() {
		return footerTextDimension;
	}

	public void setFooterTextDimension() {
		footerTextDimension = properties.getProperty("footerTextDimension");
	}

	public String getFooterTextLength() {
		return footerTextLength;
	}

	public void setFooterTextLength() {
		footerTextLength = properties.getProperty("footerTextLength");
	}
	public String getExpectedblogTitle() {
		return ExpectedblogTitle;
	}

	public void setExpectedblogTitle() {
		ExpectedblogTitle = properties.getProperty("ExpectedblogTitle");
	}
	public String getExpectedError() {
		return ExpectedError;
	}

	public void setExpectedError() {
		ExpectedError =properties.getProperty("ExpectedError");
	}
	public String getBreadcrumbXpath() {
		return breadcrumbXpath;
	}

	public void setBreadcrumbXpath() {
		this.breadcrumbXpath = properties.getProperty("ExpectedBreadCrumb");;
	}
	public String getExpectedDate() {
		return ExpectedDate;
	}

	public void setExpectedDate() {
		ExpectedDate =properties.getProperty("ExpectedDate");
	}
	public String getExpectedBlogContent() {
		return ExpectedBlogContent;
	}

	public void setExpectedBlogContent() {
		ExpectedBlogContent = properties.getProperty("ExpectedBlogContent");
	}
	public String getExpectedServicesMenu() {
		return expectedServicesMenu;
	}

	public void setExpectedServicesMenu() {
		expectedServicesMenu = properties.getProperty("expectedServicesMenu");
	}
	
	public String getInfrastructureServicesMenu() {
		return InfrastructureServicesMenu;
	}

	public void setInfrastructureServicesMenu() {
		InfrastructureServicesMenu = properties.getProperty("infrastructureServicesMenu");
	}
	public String getDigitalLifeMenuItems() {
		return DigitalLifeMenuItems;
	}

	public void setDigitalLifeMenuItems() {
		DigitalLifeMenuItems =  properties.getProperty("digitalLifeMenuItems");
	}
	public static void main(String[] args) throws IOException {
		AtmecsSiteXpathAllocators keys = new AtmecsSiteXpathAllocators();
		keys.getData();
	}
}