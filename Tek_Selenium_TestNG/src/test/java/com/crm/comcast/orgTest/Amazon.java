package com.crm.comcast.orgTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class Amazon  extends BaseClass{
	
	@Test
	public void amazon() {
		driver.get("https://www.amazon.in/");
		driver.quit();
	}

}
