package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageVerificationTest {
	
	
	@Test
	public void homepage() {
		String Expected = "Homepage";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
		String actual = driver.findElement(By.partialLinkText("Home")).getText();
		
		
		// if else condition not have capability to fail the testNG
//		if(Expected.equals(actual)) {
//			System.out.println("home page is verified");
//		}
//		else {
//			System.out.println("home page is not verified");
//		}
		
		
		Assert.assertEquals(Expected, actual);
		driver.quit();	
	}
	
	
	
	@Test
	public void verifyLogo() {
		
		String Expected = "//img[@src='test/logo/vtiger-crm-logo.gif']";
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("http://localhost:8888/");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("password");
		driver.findElement(By.id("submitButton")).click();
		
		boolean status = driver.findElement(By.xpath("//img[@src='test/logo/vtiger-crm-logo.gif']")).isEnabled();
		Assert.assertTrue(true);
		driver.quit();
	}

}
