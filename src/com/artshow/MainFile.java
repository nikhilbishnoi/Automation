package com.artshow;

import java.util.ArrayList;

public class MainFile {

	public static void main(String[] args) throws InterruptedException {
		
		ArrayList<Testcase> testCasesList = new ArrayList<>();
		
		// Objects
		Login login = new Login(testCasesList);
		forgotPassword reset = new forgotPassword(testCasesList);
		
		
		
		//Login
//		login.validCredential();
//		login.invalidCredential();
//		login.blankCredential();
		
		//Forgot Password
		reset.blankEmail();
		reset.invalidEmail();
		printTestCasesResult(testCasesList);
	}
	public static  void printTestCasesResult(ArrayList<Testcase> testCasesList) {
		int successCount = 0;
		int failureCount = 0;
		for (Testcase testCaseObject : testCasesList) {
			if (testCaseObject.getStatus().equals(Constant.PASS))
				successCount++;
			else
				failureCount++;
			System.out.println(testCaseObject.getName() + ": " + testCaseObject.getStatus());
		}
		System.out.println("Total Test Case Execute: " + testCasesList.size());
		System.out.println("Total Test Case Pass: " + successCount);
		System.out.println("Total Test Case Fail: " + failureCount);

	}

}
