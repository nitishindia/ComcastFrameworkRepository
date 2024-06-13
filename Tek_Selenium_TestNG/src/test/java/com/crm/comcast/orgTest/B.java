package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class B extends BaseClass{
	

	@Test //(groups = {"Regration"})
	public void amazon() {
		driver.get("https://www.amazon.in/");
		
	}
	
	@Test //(groups = {"Smoke"})
	public void demo() {
		driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	@Test //(groups = {"Regration"})
	public void flipcart() {
		driver.get("https://www.flipkart.com/");
		
	}
	
	

}
