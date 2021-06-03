package com.online.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.online.qa.base.Base;

public class homepage extends Base{

	public homepage()
	{
	 PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(.//button[contains(text(),'ADD TO CART')])[1]")
	WebElement brocolliAdd;
	
	public void clickbrockoli() throws InterruptedException
	{
	 brocolliAdd.click();
	
	}
	public String verifycolor()
	{
		String color= brocolliAdd.getCssValue("background-color").trim();
		return color;
	}
}
