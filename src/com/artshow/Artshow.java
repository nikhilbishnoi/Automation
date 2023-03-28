package com.artshow;
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.*;

public class Artshow {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nikhi\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();

		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new WebDrivers().driver;
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		String URL;
		URL = driver.getCurrentUrl();
		System.out.println("URL: "+URL);
		driver.close();
		
		

	}

}
