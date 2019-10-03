package com.atmecs.atmecswebsite.dataallocators;

import java.io.IOException;
import java.util.Properties;

import com.atmecs.atmecswebsite.constants.ConstantFilePaths;
import com.atmecs.atmecswebsite.utils.ReadLocatorsFile;

public class HomePageValidationData 
{
String validatingAR;
String validatingARBreadCrumb ;
String validatingAI ;
String validatingAIBreadCrumb ;
String validatingExploreNow;
String validatingExploreNowBreadCrumb;
String validatingIOTBreadCrumb;
String validatingIOT;
String validatingRPABreadCrumb ;
String  validatingRPA;
String validatingBlockChainBreadCrumb;
String validatingBlockChain;
Properties properties;
public void getData() throws IOException 
{
	properties = ReadLocatorsFile.loadProperty(ConstantFilePaths.ValidationHOMETESTDATA_FILE);
	setValidatingAR() ;
	setValidatingARBreadCrumb();
	setValidatingAI() ;
	setValidatingAIBreadCrumb();
	setValidatingExploreNow() ;
	setValidatingExploreNowBreadCrumb();
	setValidatingIOTBreadCrumb();
	setValidatingIOT();
	setValidatingRPABreadCrumb();
	setValidatingRPA() ;
	setValidatingBlockChainBreadCrumb() ;
	setValidatingBlockChain() ;
}

public String getValidatingAR() {
	return validatingAR;
}
public void setValidatingAR() {
	validatingAR = properties.getProperty("validatingAR");
}
public String getValidatingARBreadCrumb() {
	return validatingARBreadCrumb;
}
public void setValidatingARBreadCrumb() {
	validatingARBreadCrumb =properties.getProperty("validatingARBreadCrumb") ;
}
public String getValidatingAI() {
	return validatingAI;
}
public void setValidatingAI() {
	validatingAI =properties.getProperty("validatingAI") ;
}
public String getValidatingAIBreadCrumb() {
	return validatingAIBreadCrumb;
}
public void setValidatingAIBreadCrumb() {
	validatingAIBreadCrumb =properties.getProperty("validatingAIBreadCrumb") ;
}
public String getValidatingExploreNow() {
	return validatingExploreNow;
}
public void setValidatingExploreNow() {
	validatingExploreNow =properties.getProperty("validatingExploreNow") ;
}
public String getValidatingExploreNowBreadCrumb() {
	return validatingExploreNowBreadCrumb;
}
public void setValidatingExploreNowBreadCrumb() {
	validatingExploreNowBreadCrumb = properties.getProperty("validatingExploreNowBreadCrumb");
}
public String getValidatingIOTBreadCrumb() {
	return validatingIOTBreadCrumb;
}
public void setValidatingIOTBreadCrumb() {
	validatingIOTBreadCrumb = properties.getProperty("validatingIOTBreadCrumb");
}
public String getValidatingIOT() {
	return validatingIOT;
}
public void setValidatingIOT() {
	validatingIOT =properties.getProperty("validatingIOT") ;
}
public String getValidatingRPABreadCrumb() {
	return validatingRPABreadCrumb;
}
public void setValidatingRPABreadCrumb() {
	validatingRPABreadCrumb =properties.getProperty("validatingRPABreadCrumb") ;
}
public String getValidatingRPA() {
	return validatingRPA;
}
public void setValidatingRPA() {
	validatingRPA = properties.getProperty("validatingRPA");
}
public String getValidatingBlockChainBreadCrumb() {
	return validatingBlockChainBreadCrumb;
}
public void setValidatingBlockChainBreadCrumb() {
	validatingBlockChainBreadCrumb = properties.getProperty("validatingBlockChainBreadCrumb");
}

public String getValidatingBlockChain() {
	return validatingBlockChain;
}

public void setValidatingBlockChain() {
	validatingBlockChain =properties.getProperty("validatingBlockChain") ;
}
public static void main(String[] args) throws IOException {
	HomePageValidationData keys = new HomePageValidationData();
	keys.getData();
}


}
