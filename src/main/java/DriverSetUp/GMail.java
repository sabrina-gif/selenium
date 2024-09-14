package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GMail {

	
	static WebDriver  driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");

driver = new ChromeDriver();
	
driver.get("https://accounts.google.com/signup");
	
driver.navigate().to("https://accounts.google.com/signup");
	
	WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
	
	FirstName.sendKeys("Sabrina");
	
	WebElement LastName =driver.findElement(By.xpath("//input[@aria-label='Last name (optional)']"));
	LastName.sendKeys("Mithila");
	
	
	
	}

}
