package com.methodsOfWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenBrowsers {

	public static void main(String[] args) {
		
		
				// Set the driver path
		
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
				WebDriver d1=new ChromeDriver();

				d1.get("https://www.facebook.com/");
				System.out.println("Open url in chrome Browser");
				
				d1.quit();
				
				
				
				
				// // Set the driver path
				
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Drivers/geckodriver.exe");
				WebDriver d2 = new FirefoxDriver();

				d2.get("https://www.facebook.com/");
				System.out.println("Open url in Firefox Browser"); 
				
				d2.quit();
				
				
				// Set the driver path
				
				System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "//Drivers/msedgedriver.exe");
				
				// Start Edge Session
				WebDriver d3 = new EdgeDriver();

				d3.get("https://www.facebook.com/");
				System.out.println("Open url in edge Browser");
				
				d3.quit();
	}

}
