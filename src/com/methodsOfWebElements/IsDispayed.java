package com.methodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDispayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
		
		Thread.sleep(5000);
		
		boolean emailStatus = emailId.isDisplayed();
		if (emailStatus==true) {
			System.out.println("Email field displayed correctly on webpage");
			
		}
		else {
			System.out.println("Email fiels not dosplayed on webpage");
		}
		
		
		boolean passwordStatus = password.isDisplayed();
		if (passwordStatus==true) {
			System.out.println("Password field displayed correctly on webpage");
			
		}
		else {
			System.out.println("Password fiels not dosplayed on webpage");
		}
		
		
		boolean loginButtonStatus = driver.findElement(By.xpath("//button[@type=\"submit\"]")).isDisplayed();
		if (loginButtonStatus==true) {
			System.out.println("Login Button displayed correctly on webpage");
			
		}
		else {
			System.out.println("Login Button not dosplayed on webpage");
		}
		
		driver.quit();
		

	}

}
