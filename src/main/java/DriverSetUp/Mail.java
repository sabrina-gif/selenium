package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mail {

	
	static WebDriver driver;
	
	public static void main(String[] args)   {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
	 
	
	driver = new ChromeDriver();
	driver.get("https://login.yahoo.com/account/create"); 
	
	driver.navigate().to("https://login.yahoo.com/account/create");
	
	
	
	WebElement NewAccount= driver.findElement(By.xpath("//button[@name='signup']"));
	
	NewAccount.click();
	
	WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
	
	FirstName.sendKeys("sabrina");
	
	WebElement LastName = driver.findElement(By.xpath("//input[@name='lastName']"));
	LastName.sendKeys("Mithila");
	
	WebElement NewYahooMail = driver.findElement(By.xpath("//input[@name='userId']"));
	NewYahooMail.sendKeys("sabrina146");
	
	WebElement Password = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	
	Password.sendKeys("abcde@*&Ss28403");
	
	
	
	
	}

}
