package Listener_Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryInvoiceTest {
	
	@Test (retryAnalyzer = com.comcast.crm.listenerUtility.RetryListener.class)
	public void createInvoceTest() {
		System.out.println("execute createInvoceTest ");
		Assert.assertEquals("loginURL","");
		
		System.out.println("step-1");
		System.out.println("step-2");
		System.out.println("step-3");
		System.out.println("step-4");
	}

}
