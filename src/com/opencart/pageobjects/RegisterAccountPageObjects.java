package com.opencart.pageobjects;


import org.openqa.selenium.By;

import com.opencart.helper.SeleniumHelper;

public class RegisterAccountPageObjects extends SeleniumHelper{
	protected By firstName_TextBox=By.xpath("//input[@name='firstname']");
	protected By lastname_TextBox=By.xpath("//input[@name='lastname']");
	protected By email_TextBox=By.xpath("//input[@name='email']");
	protected By telephone_TextBox=By.xpath("//input[@name='telephone']");
	protected By fax_TextBox=By.xpath("//input[@name='fax']");
	
	protected By company_TextBox=By.xpath("//input[@name='company']");
	protected By company_id_TextBox=By.xpath("//input[@name='company_id']");
	protected By address_1_TextBox=By.xpath("//input[@name='address_1']");
	protected By address_2_TextBox=By.xpath("//input[@name='address_2']");
	protected By city_TextBox=By.xpath("//input[@name='city']");
	protected By postcode_TextBox=By.xpath("//input[@name='postcode']");
	protected By country_DropDown=By.name("country_id");
	protected By state_DropDown=By.xpath("//select[@name='zone_id']");

	protected By password_TextBox=By.xpath("//input[@name='password']");
	protected By confirmPassword_TextBox=By.xpath("//input[@name='confirm']");
	protected By agree_CheckBox=By.xpath("//input[@name='agree']");
	protected By continue_Button=By.xpath("//input[@value='Continue']");

}

