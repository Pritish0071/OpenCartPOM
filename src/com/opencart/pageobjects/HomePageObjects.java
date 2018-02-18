package com.opencart.pageobjects;


import org.openqa.selenium.By;

import com.opencart.helper.SeleniumHelper;

public class HomePageObjects extends SeleniumHelper{
	protected By createNewAccountLink=By.xpath("html/body/div/div/div[4]/a[2]");
	protected By loginLink=By.xpath("html/body/div/div/div[4]/a[1]");
	protected By desktoptabLink=By.xpath("/html/body/div/div[2]/ul/li[1]/a");
	protected By laptopsandnotebookstabLink=By.xpath("/html/body/div/div[2]/ul/li[2]/a");
	protected By componenttabLink=By.xpath("/html/body/div/div[2]/ul/li[3]/a");
	protected By tablettabLink=By.xpath("/html/body/div/div[2]/ul/li[4]/a");
	
}
