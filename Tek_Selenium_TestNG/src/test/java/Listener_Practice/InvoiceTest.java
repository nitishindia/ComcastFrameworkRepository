package Listener_Practice;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.Generic.BaseUtility.BaseClass;

//@Listeners(com.comcast.crm.listenerUtility.ListImpClass.class)

public class InvoiceTest extends BaseClass {

	
	
	@Test
	public void createInvoceTest() {
		System.out.println("execute createInvoceTest ");
		 sdriver.get("https://www.flipkart.com/");
		String act=driver.getTitle();
		Assert.assertEquals(act, "loginURL");
		
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
	}
	
	
	
	
	@Test
	public void createInvoicewithContactTest() {
		System.out.println("execute createInvoicewithContactTest");
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
		
	}
}
