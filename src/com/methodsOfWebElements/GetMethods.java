package com.methodsOfWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		/*Methods:
		 * 1. getLocation();
		 * 2. getText();
		 * 3. getTagName();
		 * 5. getAttribute();
		 * 7. getSize();
		 * */
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement loginButton = driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
		
		
		// getLocation()
		
		Point point = emailId.getLocation();
		System.out.println("The email filed location is"+" "+ "X cordinate : " + point.x +" "+ "Y cordinate: " + point.y);
		
		
		//getText()
		
		String text = emailId.getText();
		System.out.println("The text present in Email field is"+ text);
		
		
		//getTagName();
		
		String tagName = emailId.getTagName();
		System.out.println("Tag name of email field is"+tagName);
		
		
		//getAttribute()
		
		//@class='button-1 login-button']" ===> class attribute for login button
		
		
		String attribute = loginButton.getAttribute("class");
		System.out.println("The value of class attribute for login button is"+attribute);
		
		
		//getSize();
		
		Dimension dimensions = loginButton.getSize();
		System.out.println("The size of login button"+ " "+"Height :" + dimensions.height +" "+ "Width :"+ dimensions.width);


		
		driver.quit();
	}

}
