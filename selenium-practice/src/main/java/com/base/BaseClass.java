package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	WebDriver driver;
	
	public void openUrlBrowser() throws InterruptedException {
		driver = new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
    	driver.manage().window().maximize();
    	Thread.sleep(3000);
    	driver.close();
    }
}
