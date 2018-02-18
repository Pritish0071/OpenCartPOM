package com.opencart.businessfunctions;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import com.opencart.pageobjects.HomePageObjects;

public class HomePage extends HomePageObjects {
	
	public HomePage(WebDriver driver){
		
		
		
	}
	public void clickCreateNewAccount(){
		click(createNewAccountLink, "Create An Account");
		//Assert page Title
		assertEquals(getTitle(), "Register Account");		
	}
}
