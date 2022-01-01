package com.methodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement rememberMe = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		
		
		// check for Email field
		
		boolean s1 = emailId.isEnabled();
		if (s1==true) {
			System.out.println("Email field is enabled");
			
		}
		else {
			System.out.println("Email field is disabled");
		}
		
		
		// check for Password field
		
		boolean s2 = password.isEnabled();
		if (s2==true) {
			System.out.println("Password field is enabled");
			
		}
		else {
			System.out.println("Password field is disabled");
		}
		
		
		
		// check for remember me checkbox
		boolean s3 = rememberMe.isEnabled();
		if (s3==true) {
			System.out.println("Remember Me checkbox is enabled");
			
		}
		else {
			System.out.println("Remember Me checkbox is disabled");
		}
		
		
		
		
		// check for login button
		
		boolean s4 = loginButton.isEnabled();
		if (s4==true) {
			System.out.println("login button is enabled");
			
		}
		else {
			System.out.println("login button is disabled");
		}
		
		driver.quit();


	}

}
