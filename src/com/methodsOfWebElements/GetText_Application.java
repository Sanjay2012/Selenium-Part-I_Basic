package com.methodsOfWebElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_Application {
	
	public static void main(String[] args) {
		
		// script to obtain all links present in webpage
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Drivers/chromedriver.exe");
		WebDriver wd = new ChromeDriver();

		wd.get("https://www.rediff.com/");
		wd.manage().window().maximize();
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> lst = wd.findElements(By.xpath("//a"));
		int lsize = lst.size();
		System.out.println("The no of links present on webpage are:  "+ lsize);
		
		// print using for loop
		
		for (int i = 0; i < lsize; i++) {
			WebElement ele = lst.get(i);
			String str = ele.getText();
			System.out.println(str);
		}
		
		// print using for each loop
		
		for (WebElement webEle : lst) {
			String el = webEle.getText();
			System.out.println(el);
			
		}
		
		
		wd.close();
		wd.quit();
		
		
		
	


	}

}
