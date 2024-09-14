package DriverSetUp;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {

	static WebDriver driver;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");	//first step is to link the device web driver with java class

		driver=new ChromeDriver();
	driver.get("https://www.facebook.com/signup");  
		
	TakesScreenshot tc = (TakesScreenshot) driver;//for taking screen shot we have to tell the drive to do it
		
	File source = tc.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("DataFolder/ScreenShot00.png");
	
			FileHandler.copy(source, dest);
			
		
		
	}

}
