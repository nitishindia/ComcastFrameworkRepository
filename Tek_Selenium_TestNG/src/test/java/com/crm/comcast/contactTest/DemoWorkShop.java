package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class DemoWorkShop extends BaseClass {
	
	@Test (groups = {"Smoke"})
	public void demo() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}

}
