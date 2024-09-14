package DriverSetUp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\USER\\\\Downloads\\\\chromedriver.exe");		
		
		 driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.switchTo().frame(0)	;	//first thing to do work with iframe
		
		
		driver.switchTo().defaultContent();	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
