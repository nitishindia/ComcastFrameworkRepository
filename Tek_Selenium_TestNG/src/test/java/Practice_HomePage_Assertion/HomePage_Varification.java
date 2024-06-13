package Practice_HomePage_Assertion;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HomePage_Varification {
	
	@Test
	public void homepage() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("");
	}
	
	
	@Test
	public void verifyLogoHomePageTest() {
		
	}

}
