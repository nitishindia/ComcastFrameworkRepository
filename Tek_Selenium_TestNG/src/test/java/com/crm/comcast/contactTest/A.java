package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class A extends BaseClass{
	
	@Test //(groups = {"Regration"})
	public void amazon() throws InterruptedException {
		driver.get("https://www.amazon.in/");
//		Thread.sleep(2000);
//		driver.quit();
		
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
