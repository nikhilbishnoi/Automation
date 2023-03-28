package com.artshow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	private WebDriver driver;
	Login(){
	    driver = new WebDrivers().driver;
	}

//	 Method to check login with validcredentail
	 void validCredential() throws InterruptedException{
		 
			driver.get(Constant.URL_Login);
			Thread.sleep(7000); // Timeout to load API
			driver.findElement(By.xpath("//*[@id=\"react-dom\"]/div/div/div/div[3]/input")).sendKeys(Constant.Cred_validEmail);
			driver.findElement(By.xpath("//*[@id=\"react-dom\"]/div/div/div/div[4]/input")).sendKeys(Constant.Cred_validPass);
			driver.findElement(By.xpath("/html/body/div/div/div/div/div[5]")).click();
			Thread.sleep(5000);
		    String CurrentURL= driver.getCurrentUrl();
		    
			if(CurrentURL.equals(Constant.URL_Welcome)|| CurrentURL.equals(Constant.URL_Marketplace)) {
				System.out.println("Login Successful");
				driver.close();
			}
			else {
				System.out.println("Not Logged In");
				driver.close();
			}
			
			
	 }
	 void invalidCredential() {
		 
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
	
