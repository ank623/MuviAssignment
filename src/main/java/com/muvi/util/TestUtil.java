package com.muvi.util;




import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.muvi.base.TestBase;

public class TestUtil extends TestBase
{
	

	
	public static void Wait()
	{
	
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(text(),'Manage M')]")));
	}
	public static void Wait1()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://cms.muvi.com/template' and text()='Next ']")));
	}
	public static void Wait2()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://cms.muvi.com/monetization/settings' and text()='Next ']")));
	}
	public static void Wait3()
	{
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='quick_button' and text()='Ok, Got It ']")));
	}
}

