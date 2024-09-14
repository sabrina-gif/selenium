package DriverSetUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SetUp {
//system is our class name
	//set property has two arguments
	
	
	
	static WebDriver  driver;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver.exe");	//first step is to link the device web driver with java class

	driver=new ChromeDriver();//web driver is the boss of every driver//web driver is static variable
driver.get("https://www.facebook.com/signup");    ///chrome driver is class under this chrome driver is also method
	//get method is better to use
	driver.navigate().to("https://www.facebook.com/signup");
	
WebElement newaccount = driver.findElement(By.xpath("//button[@type='submit']"));
	
	newaccount.click();//single click 
	//select tag use for drop down list box
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
WebElement fName =driver.findElement(By.xpath("//input[@name='firstname']"));
	fName.clear();  //to clear any blank before entering our own data 

fName.sendKeys("Sabrina");
	//send keys for typing text
WebElement LastName =driver.findElement(By.xpath("//input[@name='lastname']"));	
	
	LastName.sendKeys("Mithila");
	
	WebElement Email =driver.findElement(By.xpath("//input[@name='reg_email__']"));	
	Email.sendKeys("mithila@gmail.com");
WebElement Password = driver.findElement(By.xpath("//input[@data-type='password']"));
	Password.sendKeys("rthngytt67");
	
	//driver.close();//different tab will close    
	//driver.quit();//entire web browser will be quit
	
	//driver.manage().window().maximize();//for maximizing screen	
	//driver.navigate().back();
	//driver.navigate().forward()	;
	//driver.navigate().refresh();	
	WebElement month = driver.findElement(By.xpath("//select[@title='Month']"));
	Select obj = new Select(month);//this is object of select class and for adding argument we add month as variable name
	
	//obj.selectByIndex(1);
	
	obj.selectByVisibleText("Feb");
	//obj.selectByValue("2");
	
	//String t = month.getText();
	//System.out.println(t);
	
	//WebElement date = driver.findElement(By.xpath("//select[@title='Day']"));
	
	//Select obj = new Select(date);
	
	//obj.selectByVisibleText("4");
	//WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
	
	//Select obj = new Select(year);
	
	//obj.selectByVisibleText("2018");
	
	List < WebElement > option =obj.getOptions();
	
	for(WebElement i : option) {
	String s =i.getText();	
	System.out.println(s);//this one use for options	
	}
	
	WebElement gender = driver.findElement(By.xpath("//label[text()='Female']"));
	
	gender.click();
	
	WebElement signup =driver.findElement(By.xpath("//button[text()='Sign Up']"));
	 signup.click();
	
	}

}
