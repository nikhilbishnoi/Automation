package com.artshow;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebDrivers {
	public ChromeDriver driver;

	WebDrivers() {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*"); 
		driver = new ChromeDriver(options);
	}
}