package com.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassName {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");

		        WebDriver driver= new ChromeDriver() ;

		        driver.manage().window().maximize();

		       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		        driver.get("https://accounts.lambdatest.com/login");
		        
		        // email id
		        WebElement email_field=driver.findElement(By.className("form-control"));
		        email_field.sendKeys("madeeasyctc@gmail.com");
		        
		        // password
		        WebElement password_field=driver.findElement(By.name("password"));
		        password_field.sendKeys("Test@123");
		        
		        //login button
		        WebElement login_button=driver.findElement(By.xpath("//button[text()='Login']"));
		        login_button.click();
		        
		      //Clicking on the Settings option
		        driver.findElement(By.xpath("//a[@id='profile__dropdown']")).click();
		        Thread.sleep(3500);
		        driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
		        
		        //locating profile name from page and print it
		        String profileName = driver.findElement(By.xpath("//h2[contains(text(),'Shiv Kapoor')]")).getText();
		        System.out.println(profileName);


		        
		        driver.quit();

	}

}
