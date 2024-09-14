package DriverSetUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {
	
	static WebDriver driver;//webdriver is an interface//

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

System.setProperty("Webdriver.chrome.driver", "C:\\\\Users\\\\USER\\\\Downloads\\\\chromedriver.exe");		
		
		 driver = new ChromeDriver();
		
		driver.get("file:///C:/Users/USER/Downloads/alert1.html");
		
		
	WebElement jquery = driver.findElement(By.xpath("//button[@id='html_alert']"));
		
		jquery.click();

	WebElement cancel = driver.findElement(By.xpath("//button[text()='Close']"));	
		
		cancel.click();
		
	WebElement Jscript = driver.findElement(By.xpath("//button[@id='js_alert']"));	
		Jscript.click();//handling the alert
		Thread.sleep(2000);
	
		Alert alt = driver.switchTo().alert();  //for switching from one to another//first thing to do
		
		alt.accept();  //accepts okay or yes// accept method
		
		alt.dismiss();  //accepts cancel or no // dismiss method		
		
		String st =alt.getText();
		System.out.println(st);
		
		alt.sendKeys("CodeCraftTech");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
