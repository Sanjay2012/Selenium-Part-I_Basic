package com.locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByName {

	public static void main(String[] args) throws InterruptedException {
		
		
		 //Setting up chrome using chromedriver by setting its property
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		
        //Opening browser
        WebDriver driver= new ChromeDriver() ;
        
        //Opening window tab in maximize mode
        driver.manage().window().maximize();
        
        // wait till webelements are loaded
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        //Opening application
        driver.get("https://accounts.lambdatest.com/login");
        
        //Locating the email field element via Name tag and storing it in the webelement
        WebElement email_field=driver.findElement(By.name("email"));
        
        //Entering text into the email field
        email_field.sendKeys("madeeasyctc@gmail.com");
        
        //Locating the password field element via Name tag and storing it in the webelement
        WebElement password_field=driver.findElement(By.name("password"));
                
        //Entering text into the password field
        password_field.sendKeys("Test@123");
        
        //Clicking on the login button to login to the application
        WebElement login_button=driver.findElement(By.xpath("//button[text()='Login']"));
        
        //Clicking on the 'login' button
        login_button.click();
        
       //Clicking on the Settings option
        driver.findElement(By.xpath("//a[@id='profile__dropdown']")).click();
        
        //Waiting for the profile option to appear
        Thread.sleep(3500);
        
        //Clicking on the profile link
        driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();
        
        //locating profile name from page and print it
        String profileName = driver.findElement(By.xpath("//h2[contains(text(),'Shiv Kapoor')]")).getText();
        System.out.println(profileName);
   
        
        driver.quit();

	}
}

