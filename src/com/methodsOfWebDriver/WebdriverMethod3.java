package com.methodsOfWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethod3 {
	
	/*WebDriver Methods
	 * 1. setSize()
	 * 2. setPosition()*/

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		// setSize()==> used to change the size of a browser, which accepts "Dimention" Arguments
		
		Dimension d=new Dimension(50, 80);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		
		//setPosition()==>used to change position of browser window
		// it accepts the "Point" argument
		
		Point p=new Point(600, 600);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		
		driver.quit();
	
		
	
		
		
		
		
		

	}

}
