package com.opencart.businessfunctions;

import com.opencart.pageobjects.RegisterAccountPageObjects;
import org.openqa.selenium.WebDriver;
public class RegisterAccount extends RegisterAccountPageObjects {
	
	public RegisterAccount(WebDriver driver){
		
	}
	
	public void enterPersonalDetails(String fname,String lname,String email,String phone,String company,String comAdd,String city,String postcode,String country,String state,String password){
		System.out.println(fname);/*
		enterValue(firstName_TextBox,fname,"firstname");
		enterValue(lastname_TextBox,lname,"lastname");
		enterValue(email_TextBox,email,"email");
		enterValue(telephone_TextBox,phone,"Phone");
		enterValue(fax_TextBox,"Test1fax","fax");
		
		enterValue(company_TextBox,company,"fax");
		enterValue(company_id_TextBox,company,"fax");
		enterValue(address_1_TextBox,comAdd,"fax");
		enterValue(address_2_TextBox,"Test1fax","fax");
		enterValue(city_TextBox,city,"fax");
		enterValue(postcode_TextBox,postcode,"fax");
		SelectByVisibleText(country_DropDown,country);
		SelectByVisibleText(state_DropDown,state);
		click(agree_CheckBox,"Agreement Checkbox");
		//click(continue_Button,"Continue");*/
		
	}
}
