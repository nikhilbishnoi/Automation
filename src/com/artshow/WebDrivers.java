package com.artshow;

import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivers{
	public ChromeDriver driver;
	WebDrivers(){
		System.setProperty("webdriver.chrome.driver","D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	} 
}