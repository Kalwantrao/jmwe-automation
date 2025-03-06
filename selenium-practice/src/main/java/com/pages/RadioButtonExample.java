package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RadioButtonExample {
	
	WebDriver driver;
	
	public RadioButtonExample(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value='radio1']")
	WebElement radioButton1;
	
	@FindBy(xpath="//input[@value=\"radio1\"]")
	WebElement radioButton2;

	@FindBy(xpath="//input[@value=\"radio1\"]")
	WebElement radioButton3;

	public void clickRadioButton1() throws InterruptedException {
		radioButton1.click();
		Thread.sleep(2000);
		if(radioButton1.isSelected()) {
			System.out.println("Radio button1 is selected");
		} else {
			throw new RuntimeException("Error: Radio button 1 is NOT selected!");
		}
	}
	public void clickRadioButton2() throws InterruptedException {
		radioButton2.click();
		Thread.sleep(2000);
		if(radioButton2.isSelected()) {
			System.out.println("Radio button 2 is selected");
		} else {
			throw new RuntimeException("Error: Radio button2 is NOT selected!");
		}
	}
	public void clickRadioButton3() throws InterruptedException {
		radioButton3.click();
		Thread.sleep(2000);
		if(radioButton3.isSelected()) {
			System.out.println("Radio button 3 is selected");
		} else {
			throw new RuntimeException("Error: Radio button3 is NOT selected!");
		}
	}
}
