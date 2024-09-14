package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindows {

	static WebDriver  driver;
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://cars.hotels.com/en-us/?clientID=541572#/searchcars");   
			
	WebElement GrpMeet = driver.findElement(By.xpath("//a[text()='Groups & Meetings']"));
	
	GrpMeet.click();	
	
	Thread.sleep(7000);
	
	//we have to choose get windows handles for using multiple windows altogether
	//difference between list(list allows duplicate values) and set(set doesn't allow duplicate values)
	//duplicate values is not allow in web handling
	
	for (String windowHandle :  driver.getWindowHandles()) {         //switch to method use for window handle,i frame
		driver.switchTo().window(windowHandle);
		}
	
	
	WebElement Destination = driver.findElement(By.xpath("//input[@name='Destination1Text']"));
	
	Destination.sendKeys("Dhaka");
	
	
	
	
	
	}

}
