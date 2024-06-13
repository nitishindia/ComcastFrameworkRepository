package com.crm.comcast.contactTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Debug {

	@Test 
	public void actualValue() {
		int a=5;
		System.out.println(a);
		modifiedValue();
	}
	
	@Test
	public void modifiedValue() {
		int c;
		c=5+5;
		WebDriver driver = new ChromeDriver();
		System.out.println("Launched");
		System.out.println(c);
		System.out.println(100);
		System.out.println(500);
	}
}
