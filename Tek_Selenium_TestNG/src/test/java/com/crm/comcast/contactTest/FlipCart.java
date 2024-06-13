package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class FlipCart extends BaseClass{
	
	@Test (groups = {"Regration"})
	public void flipcart() {
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

}
