package com.atmecs.atmecswebsite.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecswebsite.constants.ConstantFilePaths;

public class HomePageXpathAllocators
{
	String ExploreNow;
	String exploreNowBreadCrumb;
	String validateExploreNow;
	String AIMoreInfo;
	String VRMoreInfo;
	String IOTMoreInfo;
	String RPAMoreInfo;
	String BlockChainMoreInfo;
	String AIPage;
	String AIPageBreadCrumb;
	Properties properties;
	public void getData() throws IOException 
	{
		properties = com.atmecs.atmecswebsite.utils.ReadLocatorsFile.loadProperty(ConstantFilePaths.LOCATORSHomePage_FILE);
		setExploreNow();
		setExploreNowBreadCrumb();
		setValidateExploreNow();
		setAIMoreInfo() ;
		setVRMoreInfo();
		setIOTMoreInfo() ;
		setRPAMoreInfo();
		setBlockChainMoreInfo();
		setAIPage() ;
		setAIPageBreadCrumb();
	}

	
	public String getExploreNow() {
		return ExploreNow;
	}

	public void setExploreNow() {
		ExploreNow =  properties.getProperty("clickOnExploreNow");
	}
	

	public String getExploreNowBreadCrumb() {
		return exploreNowBreadCrumb;
	}

	public void setExploreNowBreadCrumb() {
		exploreNowBreadCrumb =properties.getProperty("validateExploreNowBreadCrumb"); 
	}



	public String getValidateExploreNow() {
		return validateExploreNow;
	}



	public void setValidateExploreNow() {
		validateExploreNow = properties.getProperty("validateExploreNow");
	}



	public String getAIMoreInfo() {
		return AIMoreInfo;
	}

	public void setAIMoreInfo() {
		AIMoreInfo =  properties.getProperty("clickOnAIMoreInfo");;
	}

	public String getVRMoreInfo() {
		return VRMoreInfo;
	}

	public void setVRMoreInfo() {
		VRMoreInfo = properties.getProperty("clickOnVRMoreInfo"); ;
	}

	public String getIOTMoreInfo() {
		return IOTMoreInfo;
	}

	public void setIOTMoreInfo() {
		IOTMoreInfo = properties.getProperty("clickOnIOTMoreInfo"); ;
	}

	public String getRPAMoreInfo() {
		return RPAMoreInfo;
	}

	public void setRPAMoreInfo() {
		RPAMoreInfo =  properties.getProperty("clickOnRPAMoreInfo");;
	}

	public String getBlockChainMoreInfo() {
		return BlockChainMoreInfo;
	}

	public void setBlockChainMoreInfo() {
		BlockChainMoreInfo =  properties.getProperty("clickOnBlockChainMoreInfo");;
	}

	public String getAIPage() {
		return AIPage;
	}

	public void setAIPage() {
		AIPage =  properties.getProperty("validateAIPage");;
	}

	public String getAIPageBreadCrumb() {
		return AIPageBreadCrumb;
	}

	public void setAIPageBreadCrumb() {
		AIPageBreadCrumb =  properties.getProperty("validateAIPageBreadCrumb");;
	}
	public static void main(String[] args) throws IOException {
		HomePageXpathAllocators keys = new HomePageXpathAllocators();
		keys.getData();
	}

}