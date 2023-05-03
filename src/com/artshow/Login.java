package com.artshow;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	private ArrayList<Testcase> testCasesList;

	public Login(ArrayList<Testcase> testCasesList) {
		this.testCasesList = testCasesList;
	}

	WebDriver login(String email, String pass) throws InterruptedException {
		WebDriver driver = new WebDrivers().driver;
		driver.manage().window().maximize();
		driver.get(Constant.URL_Login);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[5]")).click();
		return driver;
	}

//	 Method to check login with validcredentail	
	void validCredential() throws InterruptedException {

		WebDriver currentDriver = this.login(Constant.Cred_validEmail, Constant.Cred_validPass);
		String testCaseName = "Valid Credenatials";

		// Explicit wait for page load
		WebDriverWait wait = new WebDriverWait(currentDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.urlToBe(Constant.URL_Marketplace));

		String CurrentURL = currentDriver.getCurrentUrl();
		if (CurrentURL.equals(Constant.URL_Welcome) || CurrentURL.equals(Constant.URL_Marketplace)) {
			testCasesList.add(new Testcase(testCaseName, Constant.PASS));
		} else {
			testCasesList.add(new Testcase(testCaseName, Constant.FAIL));
		}
		Thread.sleep(2000L);
		currentDriver.quit();

	}

// Method to check login with inValidCredentail
	void invalidCredential() throws InterruptedException {

		WebDriver currentDriver = this.login(Constant.Cred_invalidEmail, Constant.Cred_invalidPass);
		String testCaseName = "Invalid Credenatials";

		// Wait for alert to be displayed
		WebDriverWait wait = new WebDriverWait(currentDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='alert-container']")));

		// get alert text
		String driver = currentDriver.findElement(By.xpath("//div[@id='alert-container']")).getText();

		if (driver.contentEquals(Constant.POP_inValidCred)) {
			testCasesList.add(new Testcase(testCaseName, Constant.PASS));
		} else {
			testCasesList.add(new Testcase(testCaseName, Constant.FAIL));
		}
		
		Thread.sleep(2000L);

		currentDriver.quit();

	}

//	Method to check login without credential
	void blankCredential() throws InterruptedException {

		WebDriver currentDriver = this.login("", "");
		String testCaseName = "Blank Credenatials";

		// Wait for alert to be displayed
		WebDriverWait wait = new WebDriverWait(currentDriver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='alert-container']")));

		// get alert text
		String driver = currentDriver.findElement(By.xpath("//div[@id='alert-container']")).getText();

		if (driver.contentEquals(Constant.POP_blankCred)) {
			testCasesList.add(new Testcase(testCaseName, Constant.PASS));
			System.out.println("Test Pass for Login with blank credentails");
		} else {
			testCasesList.add(new Testcase(testCaseName, Constant.FAIL));
			System.out.println("Test Fail for Login with blank credentails");
		}
		
		Thread.sleep(1000L);
		
		currentDriver.quit();
	}

}

//	{
//		
//	
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Timeout to load API
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  // Timeout to load API
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		
////		Thread.sleep(5000);
//		
//		//2# Login without email id
//		
//		
//		// For alert meassage
////		Alert alert = driver.switchTo().alert();
//	
//		
//		// Check for VIP Buyer pop-up
//		if(URL.equals(OriginalUrl))
//		{
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); // Timeout to load pop-up
//			driver.findElement(By.xpath("//*[@id=\"react-dom\"]/div/div[2]/div/div[4]/div[2]")).click();
//		}
//		else
//		{
//			System.out.println("Welcome to Marketplace");
//			
//		}
//		
//        
//		
//	}
//
//	public class withoutEmail{
//		
//		
//	}
