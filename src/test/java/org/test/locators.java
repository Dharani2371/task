package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class locators extends baseclass {
public static void main(String[] args) {
	browserlaunch("");
	maximize();
	
	WebElement user = driver.findElement(By.id("email"));
	user.sendKeys("Welcome");
	
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("1234");
	
	WebElement link = driver.findElement(By.partialLinkText("Forgotten"));
	link.click();
	
	WebElement lnk = driver.findElement(By.linkText("Forgotten password?"));
	lnk.click();

	

	
}
}

