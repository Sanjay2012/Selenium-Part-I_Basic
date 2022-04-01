package openBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenMozillaBrowser {

	public static void main(String[] args) {
			System.setProperty("webdriver.gecko.driver", "D:\\Softwares\\geckodriver.exe");
			WebDriver driver=new FirefoxDriver();
			
			driver.get("https://www.facebook.com/");

	}

}
