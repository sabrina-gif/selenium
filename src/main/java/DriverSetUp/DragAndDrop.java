package DriverSetUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
  static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");	//first step is to link the device web driver with java class

		driver=new ChromeDriver();//web driver is the boss of every driver//web driver is static variable
	
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");  
		///chrome driver is class under this chrome driver is also method
		

	Actions act = new Actions(driver); //for action methods first we have to create obj for action class
	
	WebElement source = driver.findElement(By.xpath("//div[text()='Washington'][2]"));
	
	WebElement target = driver.findElement(By.xpath("//div[text()='United States']"));
	
	act.dragAndDrop(source, target);
	
	act.perform();
	
	
	
	}

}
