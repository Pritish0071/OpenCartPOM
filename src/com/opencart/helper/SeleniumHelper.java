package com.opencart.helper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class SeleniumHelper {
	public static WebDriver driver;
	public void launch(String strBrowser){
		if(strBrowser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium Files\\chromedriver.exe");
			driver=new ChromeDriver();	
			Reporter.log("Browser Launched Successfully");
		}
	}
	public void navigate(String strBaseURL){					
		driver.navigate().to(strBaseURL);			
		Reporter.log("Base URL"+strBaseURL+" Navigated Successfully");
	}
	public void closeDriver(){					
		driver.close();		
		Reporter.log("Driver Closed Successfully");
	}
	public void quitDriver(){					
		driver.quit();			
		Reporter.log("Driver Quit Successfully");
	}
	public void click(By by,String strDesc){					
		driver.findElement(by).click();
		Reporter.log(strDesc+"Clicked Successfully");
	}
	public void enterValue(By by,String strValue,String strDesc){
		driver.findElement(by).sendKeys(strValue);
		Reporter.log(strValue+"Entered Successfully in"+strDesc);
	}
	public void selectByValue(By by,String strValue){					
		Select select=(Select)driver;	
		select.selectByValue(strValue);
		Reporter.log(strValue+"Selected Successfully");
	}
	public void selectByIndex(By by,int iValue){					
		Select select=(Select)driver;	
		select.selectByIndex(iValue);
		Reporter.log(iValue+"Selected Successfully");
	}
	public void SelectByVisibleText(By by,String strValue){	
		Select dropdown=new Select(driver.findElement(by));
		dropdown.selectByVisibleText(strValue);
		Reporter.log(strValue+"Selected Successfully");
	}
	public String getTitle(){					
		String strTitle;
		strTitle=driver.getTitle();	
		Reporter.log(strTitle+"Retrieved Successfully");
		return strTitle;
	}


}
