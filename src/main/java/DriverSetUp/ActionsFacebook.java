package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsFacebook {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");	//first step is to link the device web driver with java class

		driver=new ChromeDriver();//web driver is the boss of every driver//web driver is static variable
	driver.get("https://www.facebook.com/");    ///chrome driver is class under this chrome driver is also method
			
	Actions act = new Actions(driver);
WebElement Language = driver.findElement(By.xpath("//li[text()='English (UK)']"));//is the cursor move or not to check
	
	act.moveToElement(Language);
	act.perform();
	
	WebElement headline = driver.findElement(By.xpath("//h2[text()='Facebook helps you connect and share with the people in your life.']"));
	
  act.doubleClick(headline);
	
	act.perform(); //for running actions class we have to use perform method
	
WebElement textbox = driver.findElement(By.xpath(""));
	
	act.contextClick(textbox);
	act.perform();
	}

}
