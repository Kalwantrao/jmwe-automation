package com.testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.RadioButtonExample;

public class RadioButtonExampleTests extends BaseClass {
	
	WebDriver driver;
	BaseClass test = new BaseClass();
	RadioButtonExample RB = new RadioButtonExample(driver);
	
	@Test
	public void ValidateRadioButton1() throws InterruptedException {
		test.openUrlBrowser();
		RB.clickRadioButton1();
    	Thread.sleep(3000);
	}
	
	@Test
	public void ValidateRadioButton2() throws InterruptedException {
		test.openUrlBrowser();
		RB.clickRadioButton2();
	}
	
	@Test
	public void ValidateRadioButton3() throws InterruptedException {
		test.openUrlBrowser();
		RB.clickRadioButton3();
	}
	
}
