package com.methodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		
		
		
		Thread.sleep(5000);
		
		emailId.clear();
		Thread.sleep(3000);
		emailId.sendKeys("admin@yourstore.com");
		Thread.sleep(3000);
		
		password.clear();
		Thread.sleep(3000);
		password.sendKeys("admin");
		Thread.sleep(3000);
		
		// perform click operation on login button
		
		loginButton.click();
		Thread.sleep(2000);
		
		String pageTitle = driver.getTitle();
		System.out.println("Page title is: "+ pageTitle);
		
		
		
		driver.quit();

	}

}
