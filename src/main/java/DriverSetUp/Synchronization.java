package DriverSetUp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	static WebDriver  driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	
	
	
		//implicit wait(global)it works with global variables and all over the driver it works thats why it's not use mostly
		//driver.manage().timeouts.implicitlywait(20, timeout.Seconds);
		
		//explicit wait(conditional)(web driver wait)
		//WebdriverWait explicitWait = new webdriverWait(driver,10);
		//explicotWait.until(Expectedconditions.elementToBeClickable(WebElement));
		//we can apply it for one and only one webelement
		//FluentWait(intermittent)
		//FlentWait fluentWait = new fluentWait(driver);
		//fluentWait.withTimeout(10,TimeUnit,Seconds);//how long it will wait
		//fluentWait.pollingEvery(2,Timeout.Seconds);
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");

		driver = new ChromeDriver();
			
		driver.get("https://accounts.google.com/signup");
	
	
	//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);//implicit wait 
	
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstName']"));
		
		FirstName.sendKeys("Sabrina");
		
		
		WebDriverWait exWait = new WebDriverWait(driver,Duration.ofSeconds(3));//explicit wait
		By LastName = (By.xpath("//input[@aria-label='Last name (optional)']"));
		
		exWait.until(ExpectedConditions.presenceOfElementLocated(LastName));
				   // ExpectedConditions.elementToBeClickable(LastName);
				//ExpectedConditions.presenceOfElementLocated(LastName);
		WebElement text =driver.findElement(LastName);
		text.sendKeys("Mithila");

	
	
	
	
	}

}
