package com.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.base.BaseClass;
import com.pages.RadioButtonExample;

public class RadioButtonExampleTests extends BaseClass{
	
	BaseClass test = new BaseClass();
	RadioButtonExample RB = new RadioButtonExample(BaseClass.driver);
	
	@BeforeTest
	public void setUp() {
		test.openUrlBrowser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void CheckRadioButton1() {
		RB.clickRadioButton1();
	}
	
	@Test
	public void CheckRadioButton2() {
		RB.clickRadioButton2();
	}
	
	@Test
	public void CheckRadioButton3() {
		RB.clickRadioButton3();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
