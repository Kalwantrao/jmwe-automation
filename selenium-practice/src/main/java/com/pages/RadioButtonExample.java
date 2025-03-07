package com.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RadioButtonExample extends BaseClass{
	
	public RadioButtonExample(WebDriver driver) {
		BaseClass.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@value=\"radio1\"]")
	WebElement radioButton1;
	
	@FindBy(xpath="//input[@value=\"radio2\"]")
	WebElement radioButton2;

	@FindBy(xpath="//input[@value=\"radio3\"]")
	WebElement radioButton3;

	public void clickRadioButton1() {
		radioButton1.click();
		if(radioButton1.isSelected()) {
			System.out.println("Radio button1 is selected");
		} else {
			throw new RuntimeException("Error: Radio button 1 is NOT selected!");
		}
	}
	
	public void clickRadioButton2()  {
		radioButton2.click();
		if(radioButton2.isSelected()) {
			System.out.println("Radio button 2 is selected");
		} else {
			throw new RuntimeException("Error: Radio button2 is NOT selected!");
		}
	}
	
	public void clickRadioButton3() {
		radioButton3.click();
		if(radioButton3.isSelected()) {
			System.out.println("Radio button 3 is selected");
		} else {
			throw new RuntimeException("Error: Radio button3 is NOT selected!");
		}
	}
}
