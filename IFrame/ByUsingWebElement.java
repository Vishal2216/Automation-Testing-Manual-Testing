package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByUsingWebElement 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//open the browser
		ChromeDriver driver = new ChromeDriver();
		//maximize the browser
		driver.manage().window().maximize();
		//waiting condition
		Thread.sleep(2000);
		//enter into demoworkshop
		driver.get("https://www.dream11.com/");
		Thread.sleep(2000);
		WebElement ID = driver.findElement(By.id("send-sms-iframe"));
		driver.switchTo().frame(ID);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("7721948543");
		
}
}
