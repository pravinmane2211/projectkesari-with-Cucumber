package com.app.cucu.Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrangehrmHomeLocators {
	
	@FindBy(xpath="//input[@id='txtUsername']")
	public WebElement SendTousername;
	
	@FindBy(xpath = "//input[@id='txtPassword']")
	public WebElement SendTopassword;
	
	@FindBy(id = "btnLogin")
	public WebElement clickbutton;
	
	@FindBy(xpath= "//a[@id='welcome']")
	public WebElement welcome;
	
	@FindBy(xpath= "//*[@id=\"welcome-menu\"]/ul/li[2]/a")
	public WebElement logoutbutton;
	
	
}
