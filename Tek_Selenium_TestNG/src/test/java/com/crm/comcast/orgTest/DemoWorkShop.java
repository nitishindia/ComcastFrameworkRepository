package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class DemoWorkShop extends BaseClass {
	
	@Test
	public void demo() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.quit();
	}

}
