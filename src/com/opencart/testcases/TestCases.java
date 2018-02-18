package com.opencart.testcases;


import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import com.opencart.businessfunctions.CommonFunctions;
import com.opencart.businessfunctions.*;
import com.opencart.helper.SeleniumHelper;

@RunWith(Parameterized.class)
public class TestCases   {
	HomePage homepage;
	CommonFunctions commonFunctions;
	RegisterAccount registeraccount;
	public String fname,lname,email,phone,company,comAdd,city,postcode,country,state,password;
    public Object[][] arrayPara=null;
    public static  int row=0;
    public static  int col=0;
    TestCases(String fname,String lname,String email,String phone,String company,String comAdd,String city,String postcode,String country,String state,String password){
    	this.fname=fname;
        this.lname=lname;
        this.email=email;
        this.phone=phone;
        this.company=company;
        this.comAdd=comAdd;
        this.city=city;
        this.postcode=postcode;
        this.country=country;
        this.state=state;
        this.password=password;
        homepage=new HomePage(SeleniumHelper.driver);
		registeraccount=new RegisterAccount(SeleniumHelper.driver);
		commonFunctions=new CommonFunctions();
    	}
	/*TestCases(){
		homepage=new HomePage(SeleniumHelper.driver);
		registeraccount=new RegisterAccount(SeleniumHelper.driver);
		commonFunctions=new CommonFunctions();
	}*/
	@Test
	public void TC01_RegisterAndAddToCart() throws InterruptedException{
		TestCases testcases=new TestCases(fname, lname, email, phone, company, comAdd, postcode, city, state, country, password);
		commonFunctions.launchBrowser("Chrome");
		commonFunctions.openURL("http://10.207.182.108:81/opencart/");
		homepage.clickCreateNewAccount();
		System.out.println(fname);//From here it is not working. In next line I am trying to call method with values, but its not happening
		registeraccount.enterPersonalDetails(fname,testcases.lname,testcases.email,testcases.phone,testcases.company,testcases.comAdd,testcases.city,testcases.postcode,testcases.country,testcases.state,testcases.password);
		commonFunctions.quitDriver();		
	}
	@Parameterized.Parameters
   	public static Collection<Object[]> createData() throws BiffException, IOException
    {
                    File file=new File(System.getProperty("user.dir")+"\\src\\com.opencart.testdata\\RegistrationDetails.xls");
                    Workbook workbook=Workbook.getWorkbook(file);
                    Sheet sheet=workbook.getSheet(0);
                    
                    row=sheet.getRows();
                    col=sheet.getColumns();
                    
                    Object[][] arrayPara=new Object[row][col];
                    
                    int i=0,j=0;
                    for(i=0;i<row;i++)
                    {
                                    for(j=0;j<col;j++)
                                    {
                                                    Cell c1=sheet.getCell(j,i);
                                                    arrayPara[i][j]=c1.getContents();
                                                    System.out.println(c1.getContents());
                                    }
                    }
                    
                    return Arrays.asList(arrayPara);
    }



}
