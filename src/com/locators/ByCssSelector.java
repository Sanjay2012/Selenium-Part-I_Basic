package com.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByCssSelector {

	public static void main(String[] args) throws InterruptedException {

				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");

		        WebDriver driver= new ChromeDriver() ;

		        driver.manage().window().maximize();

		       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		        driver.get("https://accounts.lambdatest.com/login");
		        
		        // email id
		        WebElement email_field=driver.findElement(By.cssSelector("#email"));
		        email_field.sendKeys("madeeasyctc@gmail.com");
		        
		        // password
		        WebElement password_field=driver.findElement(By.cssSelector("#password"));
		        password_field.sendKeys("Test@123");
		        
		        //login button
		        WebElement login_button=driver.findElement(By.cssSelector("#login-button"));
		        login_button.click();
		        
		       //Clicking on the Settings option
		        driver.findElement(By.cssSelector("#profile__dropdown")).click();
		        Thread.sleep(3500);
		        driver.findElement(By.cssSelector("#profile__dropdown__parent > div > a:nth-child(2)")).click();
		        
		        //locating profile name from page and print it
		        String profileName = driver.findElement(By.xpath("//h2[contains(text(),'Shiv Kapoor')]")).getText();
		        System.out.println(profileName);

		        
		        driver.quit();

	}

}
