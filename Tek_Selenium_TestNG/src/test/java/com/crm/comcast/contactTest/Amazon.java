package com.crm.comcast.contactTest;

import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

public class Amazon  extends BaseClass{
	
	@Test (groups = {"Regration"})
	public void amazon() {
		driver.get("https://www.amazon.in/");
		driver.quit();
	}

}
