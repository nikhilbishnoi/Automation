package com.artshow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	// For testing purpose
//	Login() throws InterruptedException{
//		validCredential();
//		invalidCredential();
//		blankCredential();
//	}

	WebDriver login(String email, String pass) throws InterruptedException {
		WebDriver driver = new WebDrivers().driver;
		driver.get(Constant.URL_Login);
		Thread.sleep(3000); // Timeout to load API
		driver.findElement(By.xpath("//input[@placeholder='Enter your email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(pass);
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[5]")).click();
		Thread.sleep(5000);
		String CurrentURL = driver.getCurrentUrl();
		if (CurrentURL.equals(Constant.URL_Welcome) || CurrentURL.equals(Constant.URL_Marketplace)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Unsuccessfull !!!");
		}
		return driver;
	}

//	 Method to check login with validcredentail	
	void validCredential() throws InterruptedException {

		WebDriver currentDriver = this.login(Constant.Cred_validEmail, Constant.Cred_validPass);
		currentDriver.close();

	}

	void invalidCredential() throws InterruptedException {

		this.login(Constant.Cred_invalidEmail, Constant.Cred_invalidPass);

	}

	void blankCredential() throws InterruptedException{
		
		this.login("","");
		WebDriver driver = new WebDrivers().driver;
        System.out.println(driver.findElement(By.xpath("//div[@id='alert-container']")).getText());
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
