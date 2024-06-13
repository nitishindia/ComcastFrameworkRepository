package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class FlipCart extends BaseClass{
	
	@Test
	public void flipcart() {
		driver.get("https://www.flipkart.com/");
		driver.quit();
	}

}
