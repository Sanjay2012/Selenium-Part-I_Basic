package com.methodsOfWebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
	

System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement rememberMe = driver.findElement(By.xpath("//input[@id='RememberMe']"));
		
		Thread.sleep(5000);
		
		
		
		boolean Status = rememberMe.isSelected();
		if (Status==true) {
			System.out.println("checkbox selected");
			
		}
		else {
			System.out.println("checkbox not selected");
		}
		
		Thread.sleep(5000);
		
		rememberMe.click();
		
		boolean Status1 = rememberMe.isSelected();
		if (Status1==true) {
			System.out.println("checkbox selected");
			
		}
		else {
			System.out.println("checkbox not elected");
		}
		
		
		Thread.sleep(5000);
		
		
		driver.quit();

	}

}
