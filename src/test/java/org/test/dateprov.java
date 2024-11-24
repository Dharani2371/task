package org.test;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dateprov extends baseclass {
	
	@Test(dataProvider = "data")
	private void tc1(String email,String pass) {
		browserlaunch("https://www.facebook.com/");
		maximize();
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		
	}
	
	@DataProvider(name="data")
	public Object[][] login() {
		Object[][] data = new Object[2][2];
		data[0][0]= "welcome";
		data[0][1]="12345";
		
		data[1][0]="hello";
		data[1][1]="345567";
		return data;
		
	}
	
	
}
