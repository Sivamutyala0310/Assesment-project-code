/*
 * package com.atmecs.atmecswebsite.pageactions;
 * 
 * public class PageActionsClick { public class PageActionClick {
 * 
 * static LogReports report = new LogReports();
 * 
 *//**
	 * The method to click the webElement based on locatorType.
	 * 
	 * @param driver
	 * @param locator
	 * @param locatorValue
	 * @return
	 *//*
		 * public static boolean clickElement(WebDriver driver, LocatorType locator,
		 * String locatorValue) {
		 * 
		 * WebDriverWait wait = new WebDriverWait(driver, TimeOuts.TIME_IN_SECONDS);
		 * boolean isClicked = true;
		 * 
		 * try { switch (locator) { case CLASSNAME:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.className(locatorValue)).click(); break; case
		 * CSSSELECTOR:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.cssSelector(locatorValue)).click(); break; case ID:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.id(locatorValue)).click(); break; case LINKTEXT:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.linkText(locatorValue)).click(); break; case NAME:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.name(locatorValue)).click(); break; case
		 * PARTIALLINKTEXT:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.partialLinkText(locatorValue)).click(); break; case
		 * TAGNAME:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.tagName(locatorValue)).click(); break; case XPATH:
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(locatorValue)));
		 * driver.findElement(By.xpath(locatorValue)).click(); break; default: break; }
		 * } catch (IllegalArgumentException illegalArgumentException) { isClicked =
		 * false; report.info("Locator type doesn't exist" +
		 * illegalArgumentException.getCause()); } catch (NullPointerException
		 * nullPointerException) { isClicked = false;
		 * report.info("Locator type doesn't exist " + nullPointerException.getCause());
		 * } catch (Exception e) { isClicked = false; }
		 * 
		 * return isClicked;
		 * 
		 * }
		 * 
		 * public static void clickOnElement(WebDriver driver, String xpath) {
		 * WebDriverWait wait = new WebDriverWait(driver, TimeOuts.TIME_IN_SECONDS);
		 * wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		 * driver.findElement(By.xpath(xpath)).click(); } }
		 * 
		 * }
		 */