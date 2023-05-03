package com.artshow;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class forgotPassword {
//	private WebDriver driver;
	private ArrayList<Testcase> testCaseList;

	public forgotPassword(ArrayList<Testcase> testCaseList) {
//		this.driver = new WebDrivers().driver;
		this.testCaseList = testCaseList;

	}

	WebDriver resetPassword(String email) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Constant.URL_Login);
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts();
		driver.findElement(By.className("forgot-password")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys(email);
		driver.findElement(By.xpath("//div[@class='btn btn-primary']")).click();
		return driver;
	}

	void blankEmail() throws InterruptedException {
		WebDriver currentDriver = resetPassword("");
		String alert = currentDriver.findElement(By.id("alert-container")).getText();
		String testCaseName = "Forgot Password without email";
		if (alert.equals(Constant.POP_emailBlank)) {
			testCaseList.add(new Testcase(testCaseName, Constant.PASS));
		} else {
			testCaseList.add(new Testcase(testCaseName, Constant.FAIL));
		}

		Thread.sleep(1000L);
		currentDriver.close();

	}

	void invalidEmail() throws InterruptedException {
		WebDriver currentDriver = resetPassword(Constant.Cred_invalidEmail);
		String alert = currentDriver.findElement(By.id("alert-container")).getText();
		String testCaseName = "Forgot Password using inValid Email";
		if (alert.equals(Constant.POP_invalidEmail))
			testCaseList.add(new Testcase(testCaseName, Constant.PASS));
		else
			testCaseList.add(new Testcase(testCaseName, Constant.FAIL));

		Thread.sleep(1000L);
//		currentDriver.close();

	}
}
