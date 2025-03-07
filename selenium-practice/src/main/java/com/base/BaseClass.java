package com.base;

import java.util.logging.Logger;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static String url = "https://rahulshettyacademy.com/AutomationPractice/";
	public static WebDriver driver = new ChromeDriver();
	public static final Logger logger = Logger.getLogger(BaseClass.class.getName());
	public void openUrlBrowser() {
		WebDriverManager.chromedriver().setup();
    	driver.get(url);
    	logger.info("Url open in browser : " + url);
    	driver.manage().window().maximize();
    	Dimension size = driver.manage().window().getSize();
    	logger.info("size of the window is : " + size);
    }
}
