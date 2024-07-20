package com.crm.Generic.BaseUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.bidi.module.Browser;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlTest;

import com.beust.jcommander.Parameter;

public class BaseClass {
	
	public WebDriver driver;
	public static WebDriver sdriver = null;
	
	
	@BeforeSuite //(groups = {"Regration", "Smoke"})
	public void configBS() {
		System.out.println("===Connect to DB , Report Config===");
	}

	
	
//	@BeforeClass //(groups = {"Regration", "Smoke"})
//	public void configBC() {
//		System.out.println("Launch the Browser");
//		driver = new ChromeDriver();
//	}
	
//	@Parameters("BROWSER")
	
	
//	@BeforeClass
//	public void configBC(String browser) {
//		System.out.println("Launch the Browser");
//	  
//		String BROWSER = browser;
//		
//		if(browser.equals("chrome")) {
//		 driver = new ChromeDriver();
//		}
//		else if(browser.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}
//		else if(browser.equals("edge")){
//			driver=new EdgeDriver();	
//		}
//		else {
//			driver=new ChromeDriver();
//		}
//		sdriver = driver;
//	} 

	@BeforeClass
	public void configBC() {
		System.out.println("Launch the Browser");
	  
		driver=new ChromeDriver();
	sdriver = driver;
		
//		if(driver.equals("chrome")) {
//		 driver = new ChromeDriver();
//		}
//		else if(driver.equals("firefox")) {
//			driver=new FirefoxDriver();
//		}
//		else if(driver.equals("edge")){
//			driver=new EdgeDriver();	
//		}
//		else {
//			driver=new ChromeDriver();
//		}
//		sdriver = driver;
	} 
	
	
	@BeforeMethod //(groups = {"Regration", "Smoke"})
	public void configBM() {
		
		System.out.println("login ");
		
	} 
	
	
	@AfterMethod //(groups = {"Regration", "Smoke"})
	public void configAM() {
		System.out.println("logout");
	} 
	
	
	@AfterClass //(groups = {"Regration", "Smoke"})
	public void configAC() {
		System.out.println("close the Browser");
		driver.quit();
	} 
	
	
	@AfterSuite //(groups = {"Regration", "Smoke"})
	public void configAS() {
		System.out.println("===Close DB, Report backup===");
	}

}
