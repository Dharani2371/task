package org.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class Asserts extends baseclass{
	@Test
	
	private void tc1() {
		browserlaunch("https://www.facebook.com/");
		maximize();
		String aurl= driver.getCurrentUrl();
		
		//hard assert
		Assert.assertEquals(aurl,"https://www.facebook.com/");
		System.out.println("pass");
		
		//softassert
				SoftAssert s= new SoftAssert();
				s.assertEquals(aurl,"https://www.facebook.com/");
				
				System.out.println("passsss");
		

	}
	@Test
	private void tc2() {
		String title = driver.getTitle();
		System.out.println(title);
	}

}
