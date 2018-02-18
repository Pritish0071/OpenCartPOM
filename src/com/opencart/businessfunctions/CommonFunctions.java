package com.opencart.businessfunctions;


import com.opencart.helper.SeleniumHelper;

public class CommonFunctions extends SeleniumHelper {
	public void launchBrowser(String browser){
		launch(browser);		
	}
	public void openURL(String URL){		
		navigate(URL);
	}

}
