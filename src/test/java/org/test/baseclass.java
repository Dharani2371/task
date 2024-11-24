package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class baseclass {
	public static WebDriver driver;
	
	public static void browserlaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get(url);
		
	}
	public static void maximize()
	{
		driver.manage().window().maximize();

	}

}
