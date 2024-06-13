package Assertion;

import java.lang.reflect.Method;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Example {
	
	@Test
	public void homepage(Method mtd) {
		
		Reporter.log(mtd.getName()+"Excecution start", true);
		Reporter.log("step-1", true);
		Reporter.log("step-2", true);
		Reporter.log("step-3", true);
		Reporter.log("step-4", true);
		Reporter.log("Excecution End");
	}
	
	@Test
	public void homepage2(Method mtd) {
		
		
		Reporter.log(mtd.getName()+"Excecution start", true);
		Reporter.log("step-1", true);
		Reporter.log("step-2", true);
		Reporter.log("step-3", true);
		Reporter.log("step-4", true);
		Reporter.log("Excecution End");
	}

}
