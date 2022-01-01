package com.methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod2 {

	public static void main(String[] args) {
		
		/*Methods of Webdriver
		 * 1. maximize()
		 * 2. navigate()()
		 * 3. quite()
		 */
		
				// set driver path
		
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
				
				WebDriver driver=new ChromeDriver(); // start chrome session

				driver.get("https://www.facebook.com/");  // open url in browser
				
				//1.  maximize()===> used to maximize the size of browser
				
				driver.manage().window().maximize();
				
				driver.close();
				
				
				
			/*2. naviagate()===> used to open an application
			 * another usage
			 * a. forword() 
			 * b. back()
			 * c. refresh*/
				
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
				
				WebDriver d1=new ChromeDriver(); 

				d1.navigate().to("https://www.facebook.com/"); 
				d1.manage().window().maximize();
				d1.navigate().to("https://www.google.co.in/");
				d1.navigate().back();
				d1.navigate().forward();
				d1.navigate().refresh();
				
				//3. quite()===> method closes all browser windows and ends the WebDriver session
				
				d1.quit();
	}

}
