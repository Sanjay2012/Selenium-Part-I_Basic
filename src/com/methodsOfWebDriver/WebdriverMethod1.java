package com.methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod1 {
	
	/*Methods of Webdriver
	 * 1. get()
	 * 2. getTitle()
	 * 3. getCurentUrl()
	 * 4. close()
	 */
	

	public static void main(String[] args) {
		
		// **Driver instantiation**
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		// 1. get() method to open application

		driver.get("https://www.facebook.com/");
		
		// 2. getTitle() -- method to get a title of webpage. Return type is String
		
		String title = driver.getTitle();
		System.out.println(title);
		
		String exp="Facebook – log in or sign up";
		if (title.equalsIgnoreCase(exp)) {
			System.out.println("Navigated to correct Webpage");
			
		}else {
			System.out.println("Navigated to wrong Webpage");
		}
		
		
		// 3. getCurentUrl()-- Method used to get current url of webpage as an outpur. Return type is String
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		// 4. close()==> used to close the current tab od a browser
		// closes only the current window on which Selenium is running automated tests. 
		// The WebDriver session, however, remains active
		
		driver.close();
		
		


	}

}
